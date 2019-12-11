package by.gsu.ms42.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    private static String url = "jdbc:mysql://localhost:3306/idz11?useUnicode=true&serverTimezone=UTC";
    private static String driverName = "com.mysql.cj.jdbc.Driver";
    private static String username = "root";
    private static String password = "root";
    private static Connection con;

    public static Connection getConnection() {
        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                System.out.println("Failed to create the database connection : " + ex);
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver not found: " + ex);
        }
        return con;
    }
}
