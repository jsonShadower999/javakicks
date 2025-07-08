// ------

// @Service 
// public class EventService{
//     @Autowired
//     private EventRepo evtrepo;
//     public EventService(){
//         this.evtrepo=evtrepo;

//     }
//     public List<Event> getAllEvents(){
//         List<Event> evt_list=evtrepo.findAll();
//         return evt_list;
//     }
//     public String addEvt(Event evt){
//         evtrepo.add(evt);
//         return "added in events";
//     }
//     public Event getEvtByTitle(String title){
//         Event evt_needed=evtrepo.findByTitle(title);
//         if(evt_needed){
//             return evt_needed;
//         }
//         else{
//             Event newev=new Event(null);
//             return newev;

//         }
//     }
// }


@Service
public class EventService {

    private final EventRepo eventRepo;

    @Autowired
    public EventService(EventRepo eventRepo) {
        this.eventRepo = eventRepo;
    }

    public List<Event> getAllEvents() {
        return eventRepo.findAll();
    }

    public void addEvent(Event evt) {
        eventRepo.save(evt);
    }

    public Event getEventByTitle(String title) {
        return eventRepo.findByTitle(title).orElse(null);
    }

    public boolean updateEvent(String title, Event updatedEvent) {
        Optional<Event> existingEventOpt = eventRepo.findByTitle(title);
        if (existingEventOpt.isPresent()) {
            Event existingEvent = existingEventOpt.get();

            // Example: update relevant fields
            existingEvent.setTitle(updatedEvent.getTitle());
            existingEvent.setStartTime(updatedEvent.getStartTime());
            existingEvent.setEndTime(updatedEvent.getEndTime());
            existingEvent.setParticipants(updatedEvent.getParticipants());
            existingEvent.setNotifyStatus(updatedEvent.isNotifyStatus());

            eventRepo.save(existingEvent);
            return true;
        } else {
            return false;
        }
    }
   public boolean updateEventsInParallel(List<EventUpdateRequest> updates) {
    ExecutorService executor = Executors.newFixedThreadPool(5); // Adjust pool size as needed
    List<Future<Boolean>> results = new ArrayList<>();

    for (EventUpdateRequest req : updates) {
        results.add(executor.submit(() -> {
            return updateEventThreadSafe(req.getTitle(), req.getUpdatedEvent());
        }));
    }

    boolean allSuccess = true;

    for (Future<Boolean> future : results) {
        try {
            if (!future.get()) {
                allSuccess = false;
            }
        } catch (Exception e) {
            allSuccess = false;
            e.printStackTrace();
        }
    }

    executor.shutdown();
    return allSuccess;
}

@Transactional
public synchronized boolean updateEventThreadSafe(String title, Event updatedEvent) {
    Optional<Event> optionalEvent = eventRepo.findByTitle(title);
    if (optionalEvent.isPresent()) {
        Event existing = optionalEvent.get();
        existing.setStartTime(updatedEvent.getStartTime());
        existing.setEndTime(updatedEvent.getEndTime());
        existing.setNotifyStatus(updatedEvent.isNotifyStatus());
        existing.setParticipants(updatedEvent.getParticipants());
        eventRepo.save(existing);
        return true;
    }
    return false;
}

