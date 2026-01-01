package eventmanagement;
import java.util.ArrayList;

public class EventManager implements Manageable {
    private ArrayList<Event> events = new ArrayList<>();

    @Override
    public void addEvent(Event event) {
        events.add(event);
    }
    @Override
    public void showEvents() {
        for (Event e : events) {
            System.out.println(e);
        }
    }

    public Event searchByName(String name) {
        for (Event e : events) {
            if (e.getEventName().equals(name)) {
                return e;
            }
        }
        return null;
    }

    public ArrayList<Event> filterByLocation(String location) {
        ArrayList<Event> result = new ArrayList<>();
        for (Event e : events) {
            if (e.getLocation().equals(location)) {
                result.add(e);
            }
        }
        return result;
    }

    public void sortByName() {
        for (int i = 0; i < events.size(); i++) {
            for (int j = i + 1; j < events.size(); j++) {
                if (events.get(i).getEventName()
                        .compareTo(events.get(j).getEventName()) > 0) {

                    Event temp = events.get(i);
                    events.set(i, events.get(j));
                    events.set(j, temp);
                }
            }
        }
    }

    public void registerParticipant(Event event, Participant participant) {
        System.out.println(
                participant.getName() +
                " is registered for event: " +
                event.getEventName());
    }
}
