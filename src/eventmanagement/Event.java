package eventmanagement;

public class Event {
    private String eventname;
    private String date;
    private String location;

    public Event(String name, String date, String location) {
        this.eventname = name;
        this.date = date;
        this.location = location;
    }

    public String getEventName() {
        return eventname;
    }

    public String getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }
    public void setName(String name) {
        this.eventname = name;
    }
}