package almshoestore.Database.DatabaseBarang.DB_Sneakers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

    public class myConfigSneakers {


        private static final String DB_URL = "jdbc:mysql://localhost:3306/db_stoksepatu";
        private static final String DB_USER = "root";
        private static final String DB_PASS = "";

        private static Connection connect; // Database
        private static Statement statement; // Jembatan
        private static ResultSet resultSet; // Hasil

        public static void connection() {
            try {
                connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
                System.out.println("Connected");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        /* Create */
        public static void getDatabase() {
            connection();
            System.out.println();
            try { String query = "SELECT * FROM `tb_sepatusneakers`";
                statement = connect.createStatement();
                resultSet = statement.executeQuery(query);
                
                while (resultSet.next()) {
                    System.out.println("ID Barang       > " + resultSet.getInt("ID"));
                    System.out.println("NAMA Barang     > " + resultSet.getString("NAMA"));
                    System.out.println("HARGA Barang    > " + resultSet.getInt("HARGA"));
                    System.out.println("STOK Barang     > " + resultSet.getInt("STOK"));
                    System.out.println();
                }
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        /* DELETE */
        public static void deleteData() {
            connection();
            try {
                String query = "DELETE FROM `tb_sepatusneakers`";
                statement = connect.createStatement();
                statement.executeUpdate(query);
                
                System.out.println("Data berhasil dihapus.");
                
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        /* ADD DATA */
        public static void addData(Integer idBarang, String namaBarang, Integer hargaBarang, Integer stok) {
            connection();
            try {
                String query = "INSERT INTO tb_sepatusneakers (ID, NAMA, HARGA, STOK) VALUES (?, ?, ?, ?)";
                PreparedStatement statement = connect.prepareStatement(query);
                statement.setInt(1, idBarang);
                statement.setString(2, namaBarang);
                statement.setInt(3, hargaBarang);
                statement.setInt(4, stok);
                statement.executeUpdate();
                System.out.println("Data barang berhasil ditambahkan.");
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        
    }


