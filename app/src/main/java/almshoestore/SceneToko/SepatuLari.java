package almshoestore.SceneToko;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import almshoestore.App;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SepatuLari extends Scene {

    public SepatuLari(Parent root, double width, double height) {
        super(root(), width, height);
    }

    private static Parent root() {
        VBox root = new VBox();
        root.setPadding(new Insets(10));
        root.setSpacing(10);

        Button backButton = createBackButton();
        root.getChildren().add(backButton);

        for (int i = 1; i <= 4; i++) {
            HBox hbox = new HBox();
            hbox.setSpacing(10);

            VBox vbox = new VBox();
            vbox.setSpacing(10);

            ImageView shoeImage = CreateImageView("images/scenetoko/ShoeRun/Lari" + i + ".jpg");
            hbox.getChildren().add(shoeImage);

            Button label = new Button();
            Label description = new Label();
            Label price = new Label();

            setShoeDetails(i, label, description, price);

            label.setStyle("-fx-text-fill: #000000; -fx-font-size: 20px; -fx-background-color: transparent");
            description.setStyle("-fx-text-fill: #808080; -fx-font-size: 14px");
            description.setWrapText(true);
            VBox.setMargin(description, new Insets(0, 0, 0, 15));
            price.setStyle("-fx-text-fill: #008000; -fx-font-size: 16px");
            VBox.setMargin(price, new Insets(0, 0, 0, 15));

            vbox.getChildren().addAll(label, description, price);
            hbox.getChildren().add(vbox);
            hbox.setStyle("-fx-background-color: #FFFFFF; -fx-border-color: #000000; -fx-border-width: 1px; -fx-padding: 10px;");
            root.getChildren().add(hbox);

            final int index = i;
            label.setOnAction(event -> {
                handlePayment(index);
            });
        }

        ScrollPane scroll = new ScrollPane(root);
        scroll.setFitToWidth(true);
        scroll.setFitToHeight(true);

        return scroll;
    }

    private static Button createBackButton() {
        Button backButton = new Button("BACK");
        backButton.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #000000; -fx-font-size: 16px");
        backButton.setOnAction(e -> {
            Stage stage = (Stage) backButton.getScene().getWindow();
            App app = new App();
            Scene sceneTokoAwal = app.SceneTokoAwal();
            stage.setScene(sceneTokoAwal);
        });
        backButton.setOnMouseEntered(event -> {
            backButton.setCursor(Cursor.HAND);
        });
        backButton.setOnMouseExited(event -> {
            backButton.setCursor(Cursor.DEFAULT);
        });

        return backButton;
    }

    private static void setShoeDetails(int i, Button label, Label description, Label price) {
        if (i == 1) {
            label.setText("Hoka One One Kawana");
            description.setText("Detail | Colorway : Lunar Rock | Article : (HKE1123163BL) | Brand New in Box (BNIB) / Tag (BNWT) | Material : Pushing The Boundaries On The Traditional Hoka Geometries, The Hoka Kawana Helps Runners Break New Ground. This Neutral Running Shoe Features A Modified Crash Pad With Swallowtail™ Geometry To Provide Smooth Heel Strikes.");
            price.setText("IDR 2.099.000");
        } else if (i == 2) {
            label.setText("Adidas Ultraboost Light");
            description.setText("Detail | Colorway : Cloud White | Article : (HQ6352) | Brand New in Box (BNIB) / Tag (BNWT) | Material : Experience Epic Energy With The New Ultraboost Light, Our Lightest Ultraboost Ever. The Magic Lies In The Light Boost Midsole, A New Generation Of Adidas Boost. Its Unique Molecule Design Achieves The Lightest Boost Foam To Date.");
            price.setText("IDR 2.799.000");
        } else if (i == 3) {
            label.setText("Nike Zoomx Streakfly Prm");
            description.setText("Detail | Colorway : White | Article : (DX1626-100) | Brand New in Box (BNIB) / Tag (BNWT) | Material : When Pitted Against The Clock, You Want Shoes That Feel Like Butterflies On Your Feet. The Streakfly Is Our Lightest Racing Shoe, Allowing It To Essentially Disappear On Your Foot. We Left Out All The Unnecessary Frills And Weight");
            price.setText("IDR 2.799.000");
        } else if (i == 4) {
            label.setText("Adidas Ultraboost 22");
            description.setText("Detail | Colorway : Lucid Blue | Article : (HQ8593) | Brand New in Box (BNIB) / Tag (BNWT) | Material : Yarn In Upper Contains At Least 50% Parley Ocean Plastic  and 50% Recycled Polyester, Regular Fit, Lace Closure, Soft Heel Fit, and Boost Midsole");
            price.setText("IDR 3.300.000");
        }
    }

    private static void handlePayment(int i) {
        // Implementasi pembayaran untuk sepatu yang dipilih
        switch (i) {
            case 1:
                Pembayaran1();
                break;
            case 2:
                Pembayaran2();
                break;
            case 3:
                Pembayaran3();
                break;
            case 4:
                Pembayaran4();
                break;
            default:
                break;
        }
    }

    private static void Pembayaran1() {
        Stage stage = new Stage();
        VBox root = new VBox();
        root.setPadding(new Insets(10));
        root.setSpacing(10);

        
        Label titleLabel = new Label("Pembayaran - Hoka One One Kawana");
        titleLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold");
        root.getChildren().add(titleLabel);
        
        Label descriptionLabel = new Label("Deskripsi sepatu:");
        descriptionLabel.setStyle("-fx-font-size: 14px");
        root.getChildren().add(descriptionLabel);

        Label description = new Label("Detail | Colorway : Lucid Blue | Article : (HQ8593) | Brand New in Box (BNIB) / Tag (BNWT) | Material : Yarn In Upper Contains At Least 50% Parley Ocean Plastic  and 50% Recycled Polyester, Regular Fit, Lace Closure, Soft Heel Fit, and Boost Midsole");
        description.setStyle("-fx-font-size: 14px");
        description.setWrapText(true);
        root.getChildren().add(description);
        
        Label priceLabel = new Label("Harga sepatu:");
        priceLabel.setStyle("-fx-font-size: 14px");
        root.getChildren().add(priceLabel);
        
        Label price = new Label("IDR 2.099.000");
        price.setStyle("-fx-font-size: 14px; -fx-font-weight: bold");
        root.getChildren().add(price);
        
        Label paymentLabel = new Label("Pilih metode pembayaran:");
        paymentLabel.setStyle("-fx-font-size: 14px");
        root.getChildren().add(paymentLabel);
        
        ChoiceBox<String> paymentOptions = new ChoiceBox<>();
        paymentOptions.getItems().addAll("Balance");
        root.getChildren().add(paymentOptions);
        
        // Tambahkan komponen-komponen lain yang diperlukan untuk pembayaran sepatu 4
        
        Scene scene = new Scene(root, 620, 620);
        stage.setScene(scene);
        stage.setTitle("Pembayaran");
        stage.show();
    }

    private static void Pembayaran2() {
        Stage stage = new Stage();
        VBox root = new VBox();
        root.setPadding(new Insets(10));
        root.setSpacing(10);

        
        Label titleLabel = new Label("Pembayaran - Adidas Ultraboost Light");
        titleLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold");
        root.getChildren().add(titleLabel);
        
        Label descriptionLabel = new Label("Deskripsi sepatu:");
        descriptionLabel.setStyle("-fx-font-size: 14px");
        root.getChildren().add(descriptionLabel);

        Label description = new Label("Detail | Colorway : Cloud White | Article : (HQ6352) | Brand New in Box (BNIB) / Tag (BNWT) | Material : Experience Epic Energy With The New Ultraboost Light, Our Lightest Ultraboost Ever. The Magic Lies In The Light Boost Midsole, A New Generation Of Adidas Boost. Its Unique Molecule Design Achieves The Lightest Boost Foam To Date.");
        description.setStyle("-fx-font-size: 14px");
        description.setWrapText(true);
        root.getChildren().add(description);
        
        Label priceLabel = new Label("Harga sepatu:");
        priceLabel.setStyle("-fx-font-size: 14px");
        root.getChildren().add(priceLabel);
        
        Label price = new Label("IDR 2.799.000");
        price.setStyle("-fx-font-size: 14px; -fx-font-weight: bold");
        root.getChildren().add(price);
        
        Label paymentLabel = new Label("Pilih metode pembayaran:");
        paymentLabel.setStyle("-fx-font-size: 14px");
        root.getChildren().add(paymentLabel);
        
        ChoiceBox<String> paymentOptions = new ChoiceBox<>();
        paymentOptions.getItems().addAll("Balance");
        root.getChildren().add(paymentOptions);
        
        // Tambahkan komponen-komponen lain yang diperlukan untuk pembayaran sepatu 4
        
        Scene scene = new Scene(root, 620, 620);
        stage.setScene(scene);
        stage.setTitle("Pembayaran");
        stage.show();
    }

    private static void Pembayaran3() {
        Stage stage = new Stage();
        VBox root = new VBox();
        root.setPadding(new Insets(10));
        root.setSpacing(10);

        
        Label titleLabel = new Label("Pembayaran - Nike Zoomx Streakfly Prm");
        titleLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold");
        root.getChildren().add(titleLabel);
        
        Label descriptionLabel = new Label("Deskripsi sepatu:");
        descriptionLabel.setStyle("-fx-font-size: 14px");
        root.getChildren().add(descriptionLabel);

        Label description = new Label("Detail | Colorway : White | Article : (DX1626-100) | Brand New in Box (BNIB) / Tag (BNWT) | Material : When Pitted Against The Clock, You Want Shoes That Feel Like Butterflies On Your Feet. The Streakfly Is Our Lightest Racing Shoe, Allowing It To Essentially Disappear On Your Foot. We Left Out All The Unnecessary Frills And Weight");
        description.setStyle("-fx-font-size: 14px");
        description.setWrapText(true);
        root.getChildren().add(description);
        
        Label priceLabel = new Label("Harga sepatu:");
        priceLabel.setStyle("-fx-font-size: 14px");
        root.getChildren().add(priceLabel);
        
        Label price = new Label("IDR 2.799.000");
        price.setStyle("-fx-font-size: 14px; -fx-font-weight: bold");
        root.getChildren().add(price);
        
        Label paymentLabel = new Label("Pilih metode pembayaran:");
        paymentLabel.setStyle("-fx-font-size: 14px");
        root.getChildren().add(paymentLabel);
        
        ChoiceBox<String> paymentOptions = new ChoiceBox<>();
        paymentOptions.getItems().addAll("Balance");
        root.getChildren().add(paymentOptions);
        
        // Tambahkan komponen-komponen lain yang diperlukan untuk pembayaran sepatu 4
        
        Scene scene = new Scene(root, 620, 620);
        stage.setScene(scene);
        stage.setTitle("Pembayaran");
        stage.show();
    }

    private static void Pembayaran4() {
        Stage stage = new Stage();
        VBox root = new VBox();
        root.setPadding(new Insets(10));
        root.setSpacing(10);

        
        Label titleLabel = new Label("Pembayaran - Nike Zoom Vapor 15 Academy Kylian Mbappe Tf");
        titleLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold");
        root.getChildren().add(titleLabel);
        
        Label descriptionLabel = new Label("Deskripsi sepatu:");
        descriptionLabel.setStyle("-fx-font-size: 14px");
        root.getChildren().add(descriptionLabel);

        Label description = new Label("Detail | Colorway : Dark Red | Article : (DV0708-694) | Brand New in Box (BNIB) / Tag (BNWT) | Material | Kylian Mbappé's Explosiveness, Plus His Twitchy Change Of Direction, Puts Him Firmly In The World Class Of Finishers. With Nods To His Heritage, This Cleat Is Made To Help You Play Just Like Km—with Blinding Pace And Purpose.");
        description.setStyle("-fx-font-size: 14px");
        description.setWrapText(true);
        root.getChildren().add(description);
        
        Label priceLabel = new Label("Harga sepatu:");
        priceLabel.setStyle("-fx-font-size: 14px");
        root.getChildren().add(priceLabel);
        
        Label price = new Label("IDR 3.300.000");
        price.setStyle("-fx-font-size: 14px; -fx-font-weight: bold");
        root.getChildren().add(price);
        
        Label paymentLabel = new Label("Pilih metode pembayaran:");
        paymentLabel.setStyle("-fx-font-size: 14px");
        root.getChildren().add(paymentLabel);
        
        ChoiceBox<String> paymentOptions = new ChoiceBox<>();
        paymentOptions.getItems().addAll("Balance");
        root.getChildren().add(paymentOptions);
        
        Button buyButton = new Button("Beli");
        buyButton.setOnAction(e -> {
        String selectedPaymentOption = paymentOptions.getValue();
        if (selectedPaymentOption != null) {
            // Lakukan pengecekan saldo dan proses pembelian
            double priceValue = 20.000000;
            double currentBalance = getBalanceFromDatabase(); // Dapatkan saldo pengguna dari database
            
            if (currentBalance >= priceValue) {
                // Saldo cukup, lakukan pembelian
                double newBalance = currentBalance - priceValue;
                updateBalanceInDatabase(newBalance); // Perbarui saldo pengguna dalam database
                
                // Tampilkan pesan berhasil membeli
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Pembelian Berhasil");
                alert.setHeaderText(null);
                alert.setContentText("Pembelian berhasil. Saldo baru: " + newBalance);
                alert.showAndWait();
                
                // Tutup jendela pembayaran
                stage.close();
            } else {
                // Saldo tidak cukup, tampilkan pesan kesalahan
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Kesalahan");
                alert.setHeaderText(null);
                alert.setContentText("Saldo tidak mencukupi.");
                alert.showAndWait();
            }
        }
    });
    
    root.getChildren().add(buyButton);
        
        Scene scene = new Scene(root, 620, 620);
        stage.setScene(scene);
        stage.setTitle("Pembayaran");
        stage.show();
    }

    public static double getBalanceFromDatabase() {
        double currentBalance = 0.0;
        
        // Koneksi ke database SQLite
        try (Connection connection = DriverManager.getConnection("jdbc:D:\\AlmShoeStore\\app\\src\\main\\java\\almshoestore\\Database\\Manager/userdata.db")) {
            // Membuat pernyataan SQL untuk mengambil saldo pengguna
            String sql = "SELECT Balance FROM tb_account WHERE Username = ?";
            
            // Mengganti 'username_column' dengan nama kolom yang menyimpan username dalam tabel 'user'
            String username = "MahendraKiranaMB";
            
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, username);
                
                // Menjalankan pernyataan SQL
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        currentBalance = resultSet.getDouble("Balance");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return currentBalance;
    }

    public static void updateBalanceInDatabase(double newBalance) {
        // Mengganti 'username_column' dengan nama kolom yang menyimpan username dalam tabel 'user'
        String username = "MahendraKiranaMB";
        
        // Koneksi ke database SQLite
        try (Connection connection = DriverManager.getConnection("jdbc:D:\\AlmShoeStore\\app\\src\\main\\java\\almshoestore\\Database\\Manager/userdata.db")) {
            // Membuat pernyataan SQL untuk memperbarui saldo pengguna
            String sql = "UPDATE tb_account SET Balance = ? WHERE Username = ?";
            
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setDouble(1, newBalance);
                statement.setString(2, username);
                
                // Menjalankan pernyataan SQL
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    

    private static ImageView CreateImageView(String ImagePath) {
        Image image = new Image(ImagePath);
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(200);
        imageView.setFitHeight(200);
        imageView.setPreserveRatio(true);
        imageView.imageProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue == null) {
                System.out.println("Gagal memuat gambar: " + ImagePath);
            }
        });

        return imageView;
    }
}
