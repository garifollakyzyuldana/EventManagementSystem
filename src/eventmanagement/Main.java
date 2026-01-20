package eventmanagement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

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


        try (Connection conn = DatabaseConnection.getConnection();
             Statement st = conn.createStatement()) {

            st.executeUpdate("INSERT INTO events VALUES ('OOP Lesson', '18.12.2025', 'AITU')");
            st.executeUpdate("INSERT INTO events VALUES ('New Year Festival', '26.12.2025', 'AITU')");

            ResultSet rs = st.executeQuery("SELECT * FROM events");
            System.out.println("Events from database:");
            while (rs.next()) {
                System.out.println(
                        rs.getString("eventname") + " " +
                                rs.getString("date") + " " +
                                rs.getString("location")
                );
            }

            st.executeUpdate("UPDATE events SET location='Astana' WHERE eventname='New Year Festival'");
            st.executeUpdate("DELETE FROM events WHERE eventname='OOP Lesson'");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}