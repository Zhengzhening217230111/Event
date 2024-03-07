import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Event event = new Event("", "", "", new Date());
        event.addAttendee("");

        System.out.println(event.toString());
        System.out.println("Attendees: " + event.getEvenAttendees());

        event.displayTotalAttendees();
    }
}
