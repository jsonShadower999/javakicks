// @RestController
// @RequestMapping("/evtcal/api")
// public class EventController{
//     @Autowired 
//     private EventService evtservice;
//     public EventController(){
//         this.evtservice=evtservice
//     }
//     @GetMapping("/getevtdetails")
//     public List<Event> getevtdetails(){
//         List<Event> evt_list=evtservice.getAllEvents();
//         return evt_list;
//     }
//     @PostMapping("/createvt")
//     public String createEvt(@RequestBody Event evt){
//         if(evt){
//             Event new_evt=new Event(evt);
//             evtservice.addEvt(new_evt);
//             return "event is registerd!!";
//         }
//         else{
//             return " event is ambiguosu";
//         }
//     }
// }
// @GetMapping("/geteventbytitle/{title}")
// public Event getevtbytitle(@RequestParam String title){
//     Event evt_requested=evtservice.getEvtByTitle(title);
//     if(evt_requested!=null){
//         return evt_requested;

//     }
//     else{
//         Event evt=new Event(null);
//         return evt;
//     }
// }
// @PutMapping("/updateEvt/{title}")
// public Event updateEvt(@RequestParam String title, @RequestBody Event evt_details){
//     Event evt_needed=evtservice.getEvtByTitle(title);
//     evtrservice.update(evt_needed,evt_details)

// }
@RestController
@RequestMapping("/evtcal/api")
public class EventController {

    private final EventService evtService;

    @Autowired
    public EventController(EventService evtService) {
        this.evtService = evtService;
    }

    @GetMapping("/getevtdetails")
    public ResponseEntity<List<Event>> getAllEvents() {
        List<Event> events = evtService.getAllEvents();
        return ResponseEntity.ok(events);
    }

    @PostMapping("/createevt")
    public ResponseEntity<String> createEvent(@RequestBody Event evt) {
        if (evt != null) {
            evtService.addEvent(evt);
            return ResponseEntity.ok("Event is registered!");
        } else {
            return ResponseEntity.badRequest().body("Event data is ambiguous.");
        }
    }

    @GetMapping("/geteventbytitle/{title}")
    public ResponseEntity<Event> getEventByTitle(@PathVariable String title) {
        Event evt = evtService.getEventByTitle(title);
        if (evt != null) {
            return ResponseEntity.ok(evt);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @PutMapping("/updateevt/{title}")
    public ResponseEntity<String> updateEvent(@PathVariable String title, @RequestBody Event updatedEvent) {
        boolean result = evtService.updateEvent(title, updatedEvent);
        if (result) {
            return ResponseEntity.ok("Event updated successfully.");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Event not found.");
        }
    }
}
