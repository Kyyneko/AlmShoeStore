package almshoestore.Database.DatabaseRegist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseManager {
    public static void createTable() {
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:userdata.db")) {
            String createTableSQL = "CREATE TABLE IF NOT EXISTS tb_account (Username VARCHAR(255), Password VARCHAR(255))";
            try (PreparedStatement statement = connection.prepareStatement(createTableSQL)) {
                statement.execute();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertData(String username, String password) {
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:userdata.db")) {
            String insertDataSQL = "INSERT INTO tb_account (Username, Password) VALUES (?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(insertDataSQL)) {
                statement.setString(1, username);
                statement.setString(2, password);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
