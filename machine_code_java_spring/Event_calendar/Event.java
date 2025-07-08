import java.time.LocalDateTime;

public class Event {
    private String title;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private float durationMinutes;
    private String owner;
    private List<String> participants;
    private boolean notifyStatus;
    private boolean isRecurring;

    public Event(String title, LocalDateTime startTime, LocalDateTime endTime, String owner) {
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
        this.durationMinutes = calculateDuration(startTime, endTime);
        this.owner = owner;
        this.participants = new ArrayList<>();
        this.notifyStatus = false;
        this.isRecurring = false;
    }

    private float calculateDuration(LocalDateTime start, LocalDateTime end) {
        return java.time.Duration.between(start, end).toMinutes();
    }

    // Getters and Setters
}
