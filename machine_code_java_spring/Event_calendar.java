//GOOGLE CALENDAR 
public class Calendar{
    private List<Event> event_list;
    private TimeZone time_zone;
    private String[] shared_to;


}
public class Event{
    private LocalDateTime timestamp;
    private String month;
    private String day;
    private int date;
    private LocalDateTime time_stamp_start;
    private LocalDateTimetime_stamp_end;
    private float event_duration;//in min
    private String event_owner;
    private String event_participant;
    private boolean notify_status;



}
-------
@RestController
@RequestMapping("/eventcal/api/")
public class EventController
{
    @GetMapping("/getevtdetails")
    public List<Event> getEventdetails()
}