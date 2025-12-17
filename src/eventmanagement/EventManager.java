package eventmanagement;

public class EventManager {
    public void registerParticipant(Event event, Participant participant) {
        System.out.println(
                participant.getName() +
                " is registered for event: " +
                event.getEventName());
    }
}
