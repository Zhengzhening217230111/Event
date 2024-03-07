import java.util.ArrayList;
import java.util.Date;

public class Event {
    private String eventID;
    private String eventName;
    private String eventVenue;
    private Date eventDate;
    private ArrayList<String> eventAttendees;

public Event(String eventID, String eventName, String eventVenue, Date eventDate){
    this.eventID=eventID;
    this.eventName=eventName;
    this.eventVenue=eventVenue;
    this.eventDate=eventDate;
    this.eventAttendees = new ArrayList<>();
}
public String getEventID(){
    return eventID;
}
public void setEventID(String eventID){
    this.eventID=eventID;
}
public String getEventname(){
    return eventName;
}
public void setEventName(String eventName){
    this.eventName=eventName;
}
public String getEventVenue(){
    return eventVenue;
}
public void setEventVenue(String eventVenue){
    this.eventVenue=eventVenue;
}
public Date geteventDate(){
    return eventDate;
}
public void seteventDate(Date eventDate){
    this.eventDate=eventDate;
}
public ArrayList<String>getEvenAttendees(){
    return eventAttendees;
}
public void addAttendee(String attendee){
    eventAttendees.add(attendee);
}
public void removeAttendee(String attendee){
    eventAttendees.remove(attendee);
}
public void updateAttendee(String oldAttendee,String newAttendee){
    int index=eventAttendees.indexOf(oldAttendee);
    if(index!=-1){
        eventAttendees.set(index,newAttendee);
    }
}
public String findAttendee(String attendee){
    if(eventAttendees.contains(attendee)){
        return attendee;
    }else{
        return "The Attendee not found";
    }
}
public void displayTotalAttendees(){
    System.out.println("Total number of attendees:"+eventAttendees.size());
}
public String toString(){
    return"Event ID"+eventID+"\nEvent Name"+eventName+ "\nEvent Venue: " + eventVenue + "\nEvent Date: " + eventDate;
}
}
