package almshoestore.Database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Main {
    public static void main(String[] args) {
        try (Connection connection = MyConfig.getConnection();
            Statement statement = connection.createStatement()) {
            String query = "SELECT * FROM `tb_account`";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                // Ambil nilai kolom
                String Username = resultSet.getString("Username");
                String Password = resultSet.getString("Password");

                // Lakukan operasi lain sesuai kebutuhan
                System.out.println("User : " + Username + " Password : " + Password);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
