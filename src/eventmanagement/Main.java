package eventmanagement;

public class Main {
    public static void main(String[] args) {

        Event event1 = new Event("OOP lesson", "18.12.2025", "AITU");
        Event event2 = new Event("New Year Festival", "26.12.2025", "AITU");

        Participant p1 = new Participant("Uldana", 17);
        Participant p2 = new Participant("Aliya", 18);

        EventManager manager = new EventManager();

        manager.registerParticipant(event1, p1);
        manager.registerParticipant(event2, p2);

        System.out.println(event1.getEventName());
        System.out.println(p1.getName());

        System.out.println(p1.getAge() > p2.getAge());
    }
}
