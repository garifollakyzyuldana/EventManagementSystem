package eventmanagement;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5434/eventdb",
                    "postgres",
                    "admin"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
