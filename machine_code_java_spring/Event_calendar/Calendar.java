public class Calendar {
    private List<Event> eventList;
    private TimeZone timeZone;
    private List<String> sharedTo;

    public Calendar() {
        this.eventList = new ArrayList<>();
        this.sharedTo = new ArrayList<>();
        this.timeZone = TimeZone.getDefault();
    }

    // Getters and Setters
}
