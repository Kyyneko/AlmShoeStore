package almshoestore.Database.DatabaseRegist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseManager {
    public static void createTable() {
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:app/userdata.db")) {
            String createTableSQL = "CREATE TABLE IF NOT EXISTS tb_account (Username VARCHAR(255), Password VARCHAR(255))";
            try (PreparedStatement statement = connection.prepareStatement(createTableSQL)) {
                statement.execute();
                System.out.println("Success To Add Table");
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
                System.out.println("Success To Add Data");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteAllData() {
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:app/userdata.db")) {
            String deleteAllDataSQL = "DELETE FROM tb_account";
            try (PreparedStatement statement = connection.prepareStatement(deleteAllDataSQL)) {
                int rowsDeleted = statement.executeUpdate();
                System.out.println(rowsDeleted + " rows deleted.");
                System.out.println("Success To Delete All Data");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void seeData() {
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:app/userdata.db")) {
            String selectDataSQL = "SELECT * FROM tb_account";
            try (PreparedStatement statement = connection.prepareStatement(selectDataSQL)) {
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    String username = resultSet.getString("Username");
                    String password = resultSet.getString("Password");
                    System.out.println("Username : " + username +" | " + "Password : " + password);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static boolean checkUsername(String username) {
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:userdata.db")) {
            String checkUsernameSQL = "SELECT COUNT(*) FROM tb_account WHERE Username = ?";
            try (PreparedStatement statement = connection.prepareStatement(checkUsernameSQL)) {
                statement.setString(1, username);
                ResultSet resultSet = statement.executeQuery();
                if (resultSet.next()) {
                    int count = resultSet.getInt(1);
                    return count > 0; // Mengembalikan true jika username ditemukan, false jika tidak ditemukan
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; // Mengembalikan false jika terjadi kesalahan atau exception
    }

    public static void deleteAllTable() {
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:userdata.db")) {
            String deleteTableSQL = "DROP TABLE IF EXISTS tb_account";
            try (PreparedStatement statement = connection.prepareStatement(deleteTableSQL)) {
                statement.execute();
                System.out.println("Success To Delete Table");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

