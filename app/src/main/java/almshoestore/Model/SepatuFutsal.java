package almshoestore.Model;

import almshoestore.App;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.ChoiceBox;


public class SepatuFutsal extends Scene {

    public SepatuFutsal(Parent root, double width, double height) {
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

            ImageView shoeImage = CreateImageView("images/scenetoko/ShoeFutsal/Futsal" + i + ".jpg");
            hbox.getChildren().add(shoeImage);

            Button label = new Button();
            Label description = new Label();
            Label price = new Label();

            setShoeDetails(i, label, description, price);

            label.setStyle("-fx-text-fill: #000000; -fx-font-size: 20px; -fx-font-family: 'Cambria'; -fx-background-color: transparent");
            description.setStyle("-fx-text-fill: #808080; -fx-font-size: 14px");
            description.setWrapText(true);
            VBox.setMargin(description, new Insets(0, 0, 0, 15));
            price.setStyle("-fx-text-fill: #008000; -fx-font-size: 16px");
            VBox.setMargin(price, new Insets(0, 0, 0, 15));

            vbox.getChildren().addAll(label, description, price);
            hbox.getChildren().add(vbox);
            hbox.setStyle("-fx-background-color: #FFFFFF; -fx-border-color: #000000; -fx-border-width: 1px; -fx-padding: 10px;");
            root.getChildren().add(hbox);
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
            label.setText("Nike Mercurial Superfly 8 Club Tf - Black");
            description.setText("Nike Mercurial Superfly 8 Club Tf Menggabungkan Bahan Bernapas Dan Fleksibel Untuk Pas Yang Sempurna. Sol Luar Karet Memberikan Pegangan Optimal Pada Permukaan Sintetis.");
            price.setText("IDR 899.000");
            label.setOnAction(event -> {
                Pembayaran1();
            });
        } else if (i == 2) {
            label.setText("Nike Phantom Gt2 Academy Ic Indoor - Blue");
            description.setText("Permukaan Halus: Lacing Off-center Menciptakan Sweet Spot Lebih Besar Untuk Pukulan Kuat. Desain Tahan Lama: Kulit Sintetis Tahan Lama Dan Mudah Dibersihkan.");
            price.setText("IDR 1.199.000");
            label.setOnAction(event -> {
                Pembayaran2();
            });
        } else if (i == 3) {
            label.setText("Nike Phantom Gt2 Academy Tf - Black");
            description.setText("Untuk Digunakan Pada Permukaan Sintetis Yang Lebih Pendek, Sol tanpa tanda.");
            price.setText("IDR 999.000");
            label.setOnAction(event -> {
                Pembayaran3();
            });
        } else if (i == 4) {
            label.setText("Nike Zoom Vapor 15 Academy Kylian Mbappe Tf - Dark Red");
            description.setText("Ledakan Kylian Mbappé, Ditambah Perubahan Arahnya yang Twitchy, Menempatkannya Dengan Tegas Di Kelas Dunia Finishers. Dengan Mengacu pada Warisannya, Cleat Ini Dibuat Untuk Membantu Anda Bermain Seperti Km dengan Kecepatan dan Tujuan yang Membutakan.");
            price.setText("IDR 1.299.000");
            label.setOnAction(event -> {
                Pembayaran4();
            });
        }
    }

    private static void Pembayaran1() {
        Stage stage = new Stage();
        VBox root = new VBox();
        root.setPadding(new Insets(10));
        root.setSpacing(10);

        Label titleLabel = new Label("Pembayaran - Nike Mercurial Superfly 8 Club Tf - Black");
        titleLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold");
        titleLabel.setWrapText(true);
        root.getChildren().add(titleLabel);

        Image sepatuImage = new Image("images/scenetoko/ShoeFutsal/Futsal1.jpg");
        ImageView sepatuImageView = new ImageView(sepatuImage);
        sepatuImageView.setFitWidth(300);
        sepatuImageView.setFitHeight(300);
        root.getChildren().add(sepatuImageView);
        root.setAlignment(Pos.CENTER);
        
        Label descriptionLabel = new Label("Deskripsi sepatu:");
        descriptionLabel.setStyle("-fx-font-size: 14px");
        root.getChildren().add(descriptionLabel);

        Label description = new Label("Nike Mercurial Superfly 8 Club Tf Menggabungkan Bahan Bernapas Dan Fleksibel Untuk Pas Yang Sempurna. Sol Luar Karet Memberikan Pegangan Optimal Pada Permukaan Sintetis.");
        description.setStyle("-fx-font-size: 14px");
        description.setWrapText(true);
        root.getChildren().add(description);
        
        Label priceLabel = new Label("Harga sepatu:");
        priceLabel.setStyle("-fx-font-size: 14px");
        root.getChildren().add(priceLabel);
        
        Label price = new Label("IDR 899.000");
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
                Label successLabel = new Label("Berhasil Membeli");
                successLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: green");
                App.balance = App.balance - 899_000;
                Label saldo = new Label("Sisa Saldo Anda Sebanyak Rp." + App.balance);
                saldo.setStyle("-fx-font-size: 14px; -fx-text-fill: BLACK");
                root.getChildren().addAll(successLabel,saldo);
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

        Label titleLabel = new Label("Pembayaran - Nike Phantom Gt2 Academy Ic Indoor - Blue");
        titleLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold");
        root.getChildren().add(titleLabel);

        Image sepatuImage = new Image("images/scenetoko/ShoeFutsal/Futsal2.jpg");
        ImageView sepatuImageView = new ImageView(sepatuImage);
        sepatuImageView.setFitWidth(300);
        sepatuImageView.setFitHeight(300);
        root.getChildren().add(sepatuImageView);
        root.setAlignment(Pos.CENTER);
        
        Label descriptionLabel = new Label("Deskripsi sepatu:");
        descriptionLabel.setStyle("-fx-font-size: 14px");
        root.getChildren().add(descriptionLabel);

        Label description = new Label("Permukaan Halus: Lacing Off-center Menciptakan Sweet Spot Lebih Besar Untuk Pukulan Kuat. Desain Tahan Lama: Kulit Sintetis Tahan Lama Dan Mudah Dibersihkan.");
        description.setStyle("-fx-font-size: 14px");
        description.setWrapText(true);
        root.getChildren().add(description);
        
        Label priceLabel = new Label("Harga sepatu:");
        priceLabel.setStyle("-fx-font-size: 14px");
        root.getChildren().add(priceLabel);
        
        Label price = new Label("IDR 1.199.000");
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
                Label successLabel = new Label("Berhasil Membeli");
                successLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: green");
                App.balance = App.balance - 1_199_000;
                Label saldo = new Label("Sisa Saldo Anda Sebanyak Rp." + App.balance);
                saldo.setStyle("-fx-font-size: 14px; -fx-text-fill: BLACK");
                root.getChildren().addAll(successLabel,saldo);
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

        
        Label titleLabel = new Label("Pembayaran - Nike Phantom Gt2 Academy Tf - Black");
        titleLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold");
        root.getChildren().add(titleLabel);

        Image sepatuImage = new Image("images/scenetoko/ShoeFutsal/Futsal3.jpg");
        ImageView sepatuImageView = new ImageView(sepatuImage);
        sepatuImageView.setFitWidth(300);
        sepatuImageView.setFitHeight(300);
        root.getChildren().add(sepatuImageView);
        root.setAlignment(Pos.CENTER);
        
        Label descriptionLabel = new Label("Deskripsi sepatu:");
        descriptionLabel.setStyle("-fx-font-size: 14px");
        root.getChildren().add(descriptionLabel);

        Label description = new Label("Untuk Digunakan Pada Permukaan Sintetis Yang Lebih Pendek, Sol tanpa tanda.");
        description.setStyle("-fx-font-size: 14px");
        description.setWrapText(true);
        root.getChildren().add(description);
        
        Label priceLabel = new Label("Harga sepatu:");
        priceLabel.setStyle("-fx-font-size: 14px");
        root.getChildren().add(priceLabel);
        
        Label price = new Label("IDR 999.000");
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
                Label successLabel = new Label("Berhasil Membeli");
                successLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: green");
                App.balance = App.balance - 999_000;
                Label saldo = new Label("Sisa Saldo Anda Sebanyak Rp." + App.balance);
                saldo.setStyle("-fx-font-size: 14px; -fx-text-fill: BLACK");
                root.getChildren().addAll(successLabel,saldo);
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

        
        Label titleLabel = new Label("Pembayaran - Nike Zoom Vapor 15 Academy Kylian Mbappe Tf - Dark Red");
        titleLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold");
        root.getChildren().add(titleLabel);

        Image sepatuImage = new Image("images/scenetoko/ShoeFutsal/Futsal4.jpg");
        ImageView sepatuImageView = new ImageView(sepatuImage);
        sepatuImageView.setFitWidth(300);
        sepatuImageView.setFitHeight(300);
        root.getChildren().add(sepatuImageView);
        root.setAlignment(Pos.CENTER);
        
        Label descriptionLabel = new Label("Deskripsi sepatu:");
        descriptionLabel.setStyle("-fx-font-size: 14px");
        root.getChildren().add(descriptionLabel);

        Label description = new Label("Ledakan Kylian Mbappé, Ditambah Perubahan Arahnya yang Twitchy, Menempatkannya Dengan Tegas Di Kelas Dunia Finishers. Dengan Mengacu pada Warisannya, Cleat Ini Dibuat Untuk Membantu Anda Bermain Seperti Km dengan Kecepatan dan Tujuan yang Membutakan.");
        description.setStyle("-fx-font-size: 14px");
        description.setWrapText(true);
        root.getChildren().add(description);
        
        Label priceLabel = new Label("Harga sepatu:");
        priceLabel.setStyle("-fx-font-size: 14px");
        root.getChildren().add(priceLabel);
        
        Label price = new Label("IDR 1.299.000");
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
                Label successLabel = new Label("Berhasil Membeli");
                successLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: green");
                App.balance = App.balance - 1_299_000;
                Label saldo = new Label("Sisa Saldo Anda Sebanyak Rp." + App.balance);
                saldo.setStyle("-fx-font-size: 14px; -fx-text-fill: BLACK");
                root.getChildren().addAll(successLabel,saldo);
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
