------

@Service 
public class EventService{
    @Autowired
    private EventRepo evtrepo;
    public EventService(){
        this.evtrepo=evtrepo;

    }
    public List<Event> getAllEvents(){
        List<Event> evt_list=evtrepo.findAll();
        return evt_list;
    }
    public String addEvt(Event evt){
        evtrepo.add(evt);
        return "added in events";
    }
    public Event getEvtByTitle(String title){
        Event evt_needed=evtrepo.findByTitle(title);
        if(evt_needed){
            return evt_needed;
        }
        else{
            Event newev=new Event(null);
            return newev;

        }
    }
}