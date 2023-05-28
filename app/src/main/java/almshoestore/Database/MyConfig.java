package almshoestore.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyConfig {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/db_accountmember";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";

    private static Connection connect; // Database
    private static Statement statement; // Jembatan
    private static ResultSet resultSet; // Hasil

    public static void connection() {
        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            System.out.println("Connect Anjayy Awww");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /* Create */
    public static void getDatabase() {
        connection();
        try { String query = "SELECT * FROM `tb_account`";
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                System.out.println("Nama Akun > " + resultSet.getString("Username"));
                System.out.println("Pass Akun > " + resultSet.getString("Password"));
                System.out.println();
            }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
