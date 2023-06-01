package almshoestore.SceneToko;

import almshoestore.App;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
            label.setText("Hoka One One Kawana - Lunar Rock");
            description.setText("Mendobrak Batasan Pada Geometri Hoka Tradisional, Hoka Kawana Membantu Para Pelari Membuat Terobosan Baru. Sepatu Lari Netral Ini Menampilkan Crash Pad Yang Dimodifikasi Dengan Geometri Swallowtail™ Untuk Memberikan Serangan Tumit Yang Halus.");
            price.setText("IDR 2.099.000");
        } else if (i == 2) {
            label.setText("Adidas Ultraboost Light - Cloud White");
            description.setText("Alami Energi Epik Dengan Lampu Ultraboost Baru, Ultraboost Teringan Kami. Keajaiban Terletak Pada Light Boost Midsole, Generasi Baru Adidas Boost. Desain Molekul Uniknya Menghasilkan Busa Pendorong Paling Ringan Hingga Saat Ini.");
            price.setText("IDR 2.799.000");
        } else if (i == 3) {
            label.setText("Nike Zoomx Streakfly Prm - White");
            description.setText("Saat Diadu Dengan Jam, Anda Ingin Sepatu Yang Terasa Seperti Kupu-Kupu Di Kaki Anda. Streakfly Adalah Sepatu Balap Teringan Kami, Memungkinkannya Menghilang Secara Esensial Di Kaki Anda. Kami Meninggalkan Semua Embel-embel Dan Berat Yang Tidak Perlu.");
            price.setText("IDR 2.799.000");
        } else if (i == 4) {
            label.setText("Adidas Ultraboost 22 - Lucid Blue");
            description.setText("Benang Di Bagian Atas Mengandung Setidaknya 50% Parley Ocean Plastic dan 50% Poliester Daur Ulang, Regular Fit, Penutupan Renda, Cocok dengan Tumit Lembut, dan Tingkatkan Sol Tengah.");
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

        Label titleLabel = new Label("Pembayaran - Hoka One One Kawana - Lunar Rock");
        titleLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold");
        root.getChildren().add(titleLabel);

        Image sepatuImage = new Image("images/scenetoko/ShoeRun/Lari1.jpg");
        ImageView sepatuImageView = new ImageView(sepatuImage);
        sepatuImageView.setFitWidth(300);
        sepatuImageView.setFitHeight(300);
        root.getChildren().add(sepatuImageView);
        root.setAlignment(Pos.CENTER);
        
        Label descriptionLabel = new Label("Deskripsi sepatu:");
        descriptionLabel.setStyle("-fx-font-size: 14px");
        root.getChildren().add(descriptionLabel);

        Label description = new Label("Mendobrak Batasan Pada Geometri Hoka Tradisional, Hoka Kawana Membantu Para Pelari Membuat Terobosan Baru. Sepatu Lari Netral Ini Menampilkan Crash Pad Yang Dimodifikasi Dengan Geometri Swallowtail™ Untuk Memberikan Serangan Tumit Yang Halus.");
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
        Button buyButton = new Button("Beli");
        buyButton.setOnAction(e -> {
                Label successLabel = new Label("Pesan berhasil Membeli");
                successLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: green");
                root.getChildren().add(successLabel);
        });
        root.getChildren().add(buyButton);
        
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

        Label titleLabel = new Label("Pembayaran - Adidas Ultraboost Light - Cloud White");
        titleLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold");
        root.getChildren().add(titleLabel);

        Image sepatuImage = new Image("images/scenetoko/ShoeRun/Lari2.jpg");
        ImageView sepatuImageView = new ImageView(sepatuImage);
        sepatuImageView.setFitWidth(300);
        sepatuImageView.setFitHeight(300);
        root.getChildren().add(sepatuImageView);
        root.setAlignment(Pos.CENTER);
        
        Label descriptionLabel = new Label("Deskripsi sepatu:");
        descriptionLabel.setStyle("-fx-font-size: 14px");
        root.getChildren().add(descriptionLabel);

        Label description = new Label("Alami Energi Epik Dengan Lampu Ultraboost Baru, Ultraboost Teringan Kami. Keajaiban Terletak Pada Light Boost Midsole, Generasi Baru Adidas Boost. Desain Molekul Uniknya Menghasilkan Busa Pendorong Paling Ringan Hingga Saat Ini.");
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
        Button buyButton = new Button("Beli");
        buyButton.setOnAction(e -> {
                Label successLabel = new Label("Pesan berhasil Membeli");
                successLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: green");
                root.getChildren().add(successLabel);
        });
        root.getChildren().add(buyButton);
        
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

        
        Label titleLabel = new Label("Pembayaran - Nike Zoomx Streakfly Prm - White");
        titleLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold");
        root.getChildren().add(titleLabel);

        Image sepatuImage = new Image("images/scenetoko/ShoeRun/Lari3.jpg");
        ImageView sepatuImageView = new ImageView(sepatuImage);
        sepatuImageView.setFitWidth(300);
        sepatuImageView.setFitHeight(300);
        root.getChildren().add(sepatuImageView);
        root.setAlignment(Pos.CENTER);
        
        Label descriptionLabel = new Label("Deskripsi sepatu:");
        descriptionLabel.setStyle("-fx-font-size: 14px");
        root.getChildren().add(descriptionLabel);

        Label description = new Label("Saat Diadu Dengan Jam, Anda Ingin Sepatu Yang Terasa Seperti Kupu-Kupu Di Kaki Anda. Streakfly Adalah Sepatu Balap Teringan Kami, Memungkinkannya Menghilang Secara Esensial Di Kaki Anda. Kami Meninggalkan Semua Embel-embel Dan Berat Yang Tidak Perlu.");
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
        Button buyButton = new Button("Beli");
        buyButton.setOnAction(e -> {
                Label successLabel = new Label("Pesan berhasil Membeli");
                successLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: green");
                root.getChildren().add(successLabel);
        });
        root.getChildren().add(buyButton);
        
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

        
        Label titleLabel = new Label("Pembayaran - Adidas Ultraboost 22 - Lucid Blue");
        titleLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold");
        root.getChildren().add(titleLabel);

        Image sepatuImage = new Image("images/scenetoko/ShoeRun/Lari4.jpg");
        ImageView sepatuImageView = new ImageView(sepatuImage);
        sepatuImageView.setFitWidth(300);
        sepatuImageView.setFitHeight(300);
        root.getChildren().add(sepatuImageView);
        root.setAlignment(Pos.CENTER);
        
        Label descriptionLabel = new Label("Deskripsi sepatu:");
        descriptionLabel.setStyle("-fx-font-size: 14px");
        root.getChildren().add(descriptionLabel);

        Label description = new Label("Benang Di Bagian Atas Mengandung Setidaknya 50% Parley Ocean Plastic dan 50% Poliester Daur Ulang, Regular Fit, Penutupan Renda, Cocok dengan Tumit Lembut, dan Tingkatkan Sol Tengah.");
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
                Label successLabel = new Label("Pesan berhasil Membeli");
                successLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: green");
                root.getChildren().add(successLabel);
        });
        root.getChildren().add(buyButton);
        
        Scene scene = new Scene(root, 620, 620);
        stage.setScene(scene);
        stage.setTitle("Pembayaran");
        stage.show();
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
