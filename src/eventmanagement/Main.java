package eventmanagement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EventManager manager = new EventManager();

        Event event1 = new Event("OOP lesson", "18.12.2025", "AITU");
        Event event2 = new Event("New Year Festival", "26.12.2025", "AITU");

        manager.addEvent(event1);
        manager.addEvent(event2);

        manager.showEvents();

        System.out.print("Enter participant name ");
        String name = scanner.nextLine();

        System.out.print("Enter participant age ");
        int age = scanner.nextInt();

        Participant participant = new Participant(name, age);
        manager.registerParticipant(event1, participant);

        Person person = participant;
        System.out.println("Role " + person.getRole());

        System.out.println("Search result ");
        System.out.println(manager.searchByName("OOP lesson"));

        manager.sortByName();
        System.out.println("Sorted events ");
        manager.showEvents();
    }
}
