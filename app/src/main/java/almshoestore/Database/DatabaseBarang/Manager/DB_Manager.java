package almshoestore.Database.DatabaseBarang.Manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB_Manager {

    private static final String DB_URL = "jdbc:sqlite:D:\\AlmShoeStore\\app\\src\\main\\java\\almshoestore\\Database\\DatabaseBarang\\Manager/db_barang.db";

    /* ======================================================== Create Table Sepatu ======================================================== */
    protected static void createTableFormal() {
        try (Connection connection = DriverManager.getConnection(DB_URL)) {
            String createTableSQL = "CREATE TABLE IF NOT EXISTS tb_formal ( ID INT(11) PRIMARY KEY, Nama VARCHAR(255), Deskripsi VARCHAR(255), Harga INT(11), STOK INT(11) )";
            try (PreparedStatement statement = connection.prepareStatement(createTableSQL)) {
                statement.execute();
                System.out.println("Success To Add Table Formal");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected static void createTableFutsal() {
        try (Connection connection = DriverManager.getConnection(DB_URL)) {
            String createTableSQL = "CREATE TABLE IF NOT EXISTS tb_futsal ( ID INT(11) PRIMARY KEY, Nama VARCHAR(255), Deskripsi VARCHAR(255), Harga INT(11), STOK INT(11) )";
            try (PreparedStatement statement = connection.prepareStatement(createTableSQL)) {
                statement.execute();
                System.out.println("Success To Add Table Futsal");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected static void createTableLari() {
        try (Connection connection = DriverManager.getConnection(DB_URL)) {
            String createTableSQL = "CREATE TABLE IF NOT EXISTS tb_lari ( ID INT(11) PRIMARY KEY, Nama VARCHAR(255), Deskripsi VARCHAR(255), Harga INT(11), STOK INT(11)  )";
            try (PreparedStatement statement = connection.prepareStatement(createTableSQL)) {
                statement.execute();
                System.out.println("Success To Add Table Lari");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected static void createTableSneakers() {
        try (Connection connection = DriverManager.getConnection(DB_URL)) {
            String createTableSQL = "CREATE TABLE IF NOT EXISTS tb_sneakers ( ID INT(11) PRIMARY KEY, Nama VARCHAR(255), Deskripsi VARCHAR(255), Harga INT(11), STOK INT(11) )";
            try (PreparedStatement statement = connection.prepareStatement(createTableSQL)) {
                statement.execute();
                System.out.println("Success To Add Table Sneakers");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    

    /* ======================================================== Insert Data Sepatu ======================================================== */
    public static void insertDataSepatuFormal(Integer ID, String Nama, String Deskripsi, Integer Harga, Integer Stok) {
        try (Connection connection = DriverManager.getConnection(DB_URL)) {
            String insertDataSQL = "INSERT INTO tb_formal (ID, Nama, Deskripsi, Harga, STOK ) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(insertDataSQL)) {
                statement.setInt(1, ID);
                statement.setString(2, Nama);
                statement.setString(3, Deskripsi);
                statement.setInt(4, Harga);
                statement.setInt(5, Stok);
                statement.executeUpdate();
                System.out.println("Success To Add Data Sepatu Formal");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertDataSepatuFutsal(Integer ID, String Nama, String Deskripsi, Integer Harga, Integer Stok) {
        try (Connection connection = DriverManager.getConnection(DB_URL)) {
            String insertDataSQL = "INSERT INTO tb_futsal (ID, Nama, Deskripsi, Harga, STOK ) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(insertDataSQL)) {
                statement.setInt(1, ID);
                statement.setString(2, Nama);
                statement.setString(3, Deskripsi);
                statement.setInt(4, Harga);
                statement.setInt(5, Stok);
                statement.executeUpdate();
                System.out.println("Success To Add Data Sepatu Futsal");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertDataSepatuLari(Integer ID, String Nama, String Deskripsi, Integer Harga, Integer Stok) {
        try (Connection connection = DriverManager.getConnection(DB_URL)) {
            String insertDataSQL = "INSERT INTO tb_lari (ID, Nama, Deskripsi, Harga, STOK ) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(insertDataSQL)) {
                statement.setInt(1, ID);
                statement.setString(2, Nama);
                statement.setString(3, Deskripsi);
                statement.setInt(4, Harga);
                statement.setInt(5, Stok);
                statement.executeUpdate();
                System.out.println("Success To Add Data Sepatu Lari");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertDataSepatuSneakers(Integer ID, String Nama, String Deskripsi, Integer Harga, Integer Stok) {
        try (Connection connection = DriverManager.getConnection(DB_URL)) {
            String insertDataSQL = "INSERT INTO tb_sneakers (ID, Nama, Deskripsi, Harga, STOK ) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(insertDataSQL)) {
                statement.setInt(1, ID);
                statement.setString(2, Nama);
                statement.setString(3, Deskripsi);
                statement.setInt(4, Harga);
                statement.setInt(5, Stok);
                statement.executeUpdate();
                System.out.println("Success To Add Data Sepatu Sneakers");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /* ======================================================== Delete Data Sepatu ======================================================== */
    public static void deleteAllDataFormal() {
        try (Connection connection = DriverManager.getConnection(DB_URL)) {
            String deleteAllDataSQL = "DELETE FROM tb_formal";
            try (PreparedStatement statement = connection.prepareStatement(deleteAllDataSQL)) {
                int rowsDeleted = statement.executeUpdate();
                System.out.println(rowsDeleted + " Baris Dihapus.");
                System.out.println("Berhasi Menghapus Semua Data Sepatu Formal");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteAllDataFutsal() {
        try (Connection connection = DriverManager.getConnection(DB_URL)) {
            String deleteAllDataSQL = "DELETE FROM tb_futsal";
            try (PreparedStatement statement = connection.prepareStatement(deleteAllDataSQL)) {
                int rowsDeleted = statement.executeUpdate();
                System.out.println(rowsDeleted + " Baris Dihapus.");
                System.out.println("Berhasil Menghapus Semua Data Sepatu Futsal");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteAllDataLari() {
        try (Connection connection = DriverManager.getConnection(DB_URL)) {
            String deleteAllDataSQL = "DELETE FROM tb_lari";
            try (PreparedStatement statement = connection.prepareStatement(deleteAllDataSQL)) {
                int rowsDeleted = statement.executeUpdate();
                System.out.println(rowsDeleted + " Baris Dihapus.");
                System.out.println("Berhasil Menghapus Semua Data Sepatu Lari");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteAllDataSneakers() {
        try (Connection connection = DriverManager.getConnection(DB_URL)) {
            String deleteAllDataSQL = "DELETE FROM tb_sneakers";
            try (PreparedStatement statement = connection.prepareStatement(deleteAllDataSQL)) {
                int rowsDeleted = statement.executeUpdate();
                System.out.println(rowsDeleted + " Baris Dihapus.");
                System.out.println("Berhasil Menghapus Semua Data Sepatu Sneakers");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /* ======================================================== SEE DATA ======================================================== */
    public static void seeDataFormal() {
        try (Connection connection = DriverManager.getConnection(DB_URL)) {
            String selectDataSQL = "SELECT * FROM tb_formal";
            try (PreparedStatement statement = connection.prepareStatement(selectDataSQL)) {
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    int id = resultSet.getInt("ID");
                    String nama = resultSet.getString("Nama");
                    String deskripsi = resultSet.getString("Password");
                    int harga = resultSet.getInt("Harga");
                    int stok  = resultSet.getInt("Stok");
                    System.out.println("ID : " + id +" | " + "Nama : " + nama + " | " + "Deskripsi : " + deskripsi + " | " + "Harga : " + harga + " | " + "Stok : " + stok);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void seeDataFutsal() {
        try (Connection connection = DriverManager.getConnection(DB_URL)) {
            String selectDataSQL = "SELECT * FROM tb_futsal";
            try (PreparedStatement statement = connection.prepareStatement(selectDataSQL)) {
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    int id = resultSet.getInt("ID");
                    String nama = resultSet.getString("Nama");
                    String deskripsi = resultSet.getString("Password");
                    int harga = resultSet.getInt("Harga");
                    int stok  = resultSet.getInt("Stok");
                    System.out.println("ID : " + id +" | " + "Nama : " + nama + " | " + "Deskripsi : " + deskripsi + " | " + "Harga : " + harga + " | " + "Stok : " + stok);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void seeDataLari() {
        try (Connection connection = DriverManager.getConnection(DB_URL)) {
            String selectDataSQL = "SELECT * FROM tb_lari";
            try (PreparedStatement statement = connection.prepareStatement(selectDataSQL)) {
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    int id = resultSet.getInt("ID");
                    String nama = resultSet.getString("Nama");
                    String deskripsi = resultSet.getString("Password");
                    int harga = resultSet.getInt("Harga");
                    int stok  = resultSet.getInt("Stok");
                    System.out.println("ID : " + id +" | " + "Nama : " + nama + " | " + "Deskripsi : " + deskripsi + " | " + "Harga : " + harga + " | " + "Stok : " + stok);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void seeDataSneakers() {
        try (Connection connection = DriverManager.getConnection(DB_URL)) {
            String selectDataSQL = "SELECT * FROM tb_sneakers";
            try (PreparedStatement statement = connection.prepareStatement(selectDataSQL)) {
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    int id = resultSet.getInt("ID");
                    String nama = resultSet.getString("Nama");
                    String deskripsi = resultSet.getString("Password");
                    int harga = resultSet.getInt("Harga");
                    int stok  = resultSet.getInt("Stok");
                    System.out.println("ID : " + id +" | " + "Nama : " + nama + " | " + "Deskripsi : " + deskripsi + " | " + "Harga : " + harga + " | " + "Stok : " + stok);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /* ======================================================== Delete All Table ======================================================== */
    public static void deleteAllTable() {
        try (Connection connection = DriverManager.getConnection(DB_URL)) {
            String deleteTableSQL = "DROP TABLE IF EXISTS tb_account";
            try (PreparedStatement statement = connection.prepareStatement(deleteTableSQL)) {
                statement.execute();
                System.out.println("Success To Delete Table");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        /* Create Table */
        // createTableFormal();
        // createTableFutsal();
        // createTableLari();
        // createTableSneakers();

        /* Insert Data To Table */
        // insertDataSepatuFormal(null, DB_URL, DB_URL, null, null);
        // insertDataSepatuFutsal(null, DB_URL, DB_URL, null, null);
        // insertDataSepatuLari(null, DB_URL, DB_URL, null, null);
        // insertDataSepatuSneakers(null, DB_URL, DB_URL, null, null);

        /* Delete Data In Table */
        // deleteAllDataFormal();
        // deleteAllDataFutsal();
        // deleteAllDataLari();
        // deleteAllDataSneakers();

        /* See Data Table */
        // seeDataFormal();
        // seeDataFutsal();
        // seeDataLari();
        // seeDataSneakers();

        // deleteAllTable();
    }
}

