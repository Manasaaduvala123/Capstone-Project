package day6_Assessment;
public class PriorityDemo {
    public static void main(String[] args) {
        for (PriorityLevel level : PriorityLevel.values()) {
            System.out.println("Priority: " + level);
            System.out.println("Severity Code: " + level.getSeverity());
            System.out.println("Is Urgent? " + level.isUrgent());
            System.out.println("---------------------------");
        }
    }
}
enum PriorityLevel {
    LOW(1),
    MEDIUM(3),
    HIGH(5),
    CRITICAL(8);
    private final int severity;
    PriorityLevel(int severity) {
        this.severity = severity;
    }
    public int getSeverity() {
        return severity;
    }
    public boolean isUrgent() {
        return severity >= 5;
    }
}

