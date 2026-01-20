package eventmanagement;
import java.util.Objects;

public class Event {
    private String eventname;
    private String date;
    private String location;

    public Event(String name, String date, String location) {
        this.eventname = name;
        this.date = date;
        this.location  = location;
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

    @Override
    public String toString() {
        return "Event:" + eventname + date + location;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Event)) return false;
        Event e = (Event) obj;
        return eventname.equals(e.eventname)
                && date.equals(e.date)
                && location.equals(e.location);
    }
    @Override
    public int hashCode() {
        return eventname.hashCode() + date.hashCode() + location.hashCode();
    }
}