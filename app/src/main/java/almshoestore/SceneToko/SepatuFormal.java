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

public class SepatuFormal extends Scene {

    public SepatuFormal(Parent root, double width, double height) {
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

            ImageView shoeImage = CreateImageView("images/scenetoko/ShoeFormal/Formal" + i + ".jpeg");
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
            label.setText("Allander BLACK - Black");
            description.setText("Dressports2 Allander adalah anggota terlaris dari koleksi Heritage kami. Teruji maraton. Rapat bisnis disetujui. Rockport's Allander memiliki berat kurang dari rata-rata sepatu lari dan mereka telah diuji di dua New York City Marathon untuk membuktikan kenyamanan dan daya tahan sepatu tersebut. Kulit full-grain tidak hanya terlihat profesional, tetapi juga mudah dibersihkan untuk pemakaian jangka panjang. Di sisi performa, DressSports 2 memungkinkan Anda bergerak dalam kenyamanan modern. Lapisan jala membantu Anda tetap sejuk sementara alas kaki PU membantu mengurangi tekanan dari kaki Anda, EVA midsole memberikan peredam kejut yang ringan, dan rubber outsole memberikan cengkeraman di hampir semua permukaan. Fitur kenyamanan tambahan termasuk lidah dan kerah yang empuk untuk membantu melindungi dari gesekan yang berlebihan dan mencegah lecet. Kami telah mendefinisikan kembali seperti apa sepatu formal: lebih ringan dari sepatu lari, serbaguna seperti cross-trainer, disesuaikan untuk maraton harian Anda.");
            price.setText("IDR 1.999.000");
            } else if (i == 2) {
            label.setText("CLARKS Tilden Plain (M) Black Leather - Black");
            description.setText("Garis-garis ramping dan desain klasik menjadikan sepatu lace-up pria ini tampak abadi dan modern sekaligus. Bagian dari Koleksi Clarks, sepatu ini dibuat dengan kulit hitam yang kaya dan alas kaki OrthoLite® untuk kenyamanan menyeluruh. Sol karet yang tahan lama memiliki sifat menyerap goncangan dan memberikan traksi untuk meningkatkan stabilitas. Cocok untuk segala hal, mulai dari jas dan celana panjang hingga denim dan tali.");
            price.setText("IDR 1.399.000");
            } else if (i == 3) {
            label.setText("DSP Cap Toe - Tan");
            description.setText("Anda percaya diri dan tenang saat mengenakan sepatu top-of-the-line, karena Anda tahu itu akan bertahan selama bertahun-tahun yang akan datang. Dengan koleksi DressSport Premium, Anda telah menemukan kecocokan Anda. Teknologi canggih, pengerjaan premium, dan bagian atas yang tampak tajam menjadikannya pilihan kerja hingga akhir pekan yang sempurna.");
            price.setText("IDR 1.439.400");
            } else if (i == 4) {
            label.setText("DSH Plain Toe Dark Brown - Dark Brown");
            description.setText("Kami menggali arsip kami untuk membuat DressSport Heritage, sepatu berkualitas premium yang menggunakan teknik pembuatan sepatu tradisional. Sol luar Vibram yang ringan menawarkan bantalan kenyal, dan bagian atas yang tampak tajam menonjolkan pakaian apa pun. Sepatu ini membuat berjalan ke kantor atau berdiri di acara terasa mudah.");
            price.setText("IDR 1.149.500");
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
        // Implementasi pembayaran untuk sepatu 1
        Stage stage = new Stage();
        VBox root = new VBox();
        root.setPadding(new Insets(10));
        root.setSpacing(10);

        Label titleLabel = new Label("Pembayaran - Allander BLACK - Black");
        titleLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold");
        titleLabel.setWrapText(true);
        root.getChildren().add(titleLabel);

        Image sepatuImage = new Image("images/scenetoko/ShoeFormal/Formal1.jpeg");
        ImageView sepatuImageView = new ImageView(sepatuImage);
        root.getChildren().add(sepatuImageView);
        root.setAlignment(Pos.CENTER);

        Label descriptionLabel = new Label("Deskripsi sepatu:");
        descriptionLabel.setStyle("-fx-font-size: 14px");
        root.getChildren().add(descriptionLabel);

        Label description = new Label("Dressports2 Allander adalah anggota terlaris dari koleksi Heritage kami. Teruji maraton. Rapat bisnis disetujui. Rockport's Allander memiliki berat kurang dari rata-rata sepatu lari dan mereka telah diuji di dua New York City Marathon untuk membuktikan kenyamanan dan daya tahan sepatu tersebut. Kulit full-grain tidak hanya terlihat profesional, tetapi juga mudah dibersihkan untuk pemakaian jangka panjang. Di sisi performa, DressSports 2 memungkinkan Anda bergerak dalam kenyamanan modern. Lapisan jala membantu Anda tetap sejuk sementara alas kaki PU membantu mengurangi tekanan dari kaki Anda, EVA midsole memberikan peredam kejut yang ringan, dan rubber outsole memberikan cengkeraman di hampir semua permukaan. Fitur kenyamanan tambahan termasuk lidah dan kerah yang empuk untuk membantu melindungi dari gesekan yang berlebihan dan mencegah lecet. Kami telah mendefinisikan kembali seperti apa sepatu formal: lebih ringan dari sepatu lari, serbaguna seperti cross-trainer, disesuaikan untuk maraton harian Anda.");
        description.setStyle("-fx-font-size: 14px");
        description.setWrapText(true);
        root.getChildren().add(description);

        Label priceLabel = new Label("Harga sepatu:");
        priceLabel.setStyle("-fx-font-size: 14px");
        root.getChildren().add(priceLabel);

        Label price = new Label("IDR 1.999.000");
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
                Label successLabel = new Label("Berhasil Membeli");
                successLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: green");
                App.balance = App.balance - 1_999_000;
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
        // Implementasi pembayaran untuk sepatu 2
        Stage stage = new Stage();
        VBox root = new VBox();
        root.setPadding(new Insets(10));
        root.setSpacing(10);

        Label titleLabel = new Label("Pembayaran - CLARKS Tilden Plain (M) Black Leather - Black");
        titleLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold");
        titleLabel.setWrapText(true);
        root.getChildren().add(titleLabel);

        Image sepatuImage = new Image("images/scenetoko/ShoeFormal/Formal2.jpeg");
        ImageView sepatuImageView = new ImageView(sepatuImage);
        root.getChildren().add(sepatuImageView);
        root.setAlignment(Pos.CENTER);

        Label descriptionLabel = new Label("Deskripsi sepatu:");
        descriptionLabel.setStyle("-fx-font-size: 14px");
        root.getChildren().add(descriptionLabel);

        Label description = new Label("Garis-garis ramping dan desain klasik menjadikan sepatu lace-up pria ini tampak abadi dan modern sekaligus. Bagian dari Koleksi Clarks, sepatu ini dibuat dengan kulit hitam yang kaya dan alas kaki OrthoLite® untuk kenyamanan menyeluruh. Sol karet yang tahan lama memiliki sifat menyerap goncangan dan memberikan traksi untuk meningkatkan stabilitas. Cocok untuk segala hal, mulai dari jas dan celana panjang hingga denim dan tali.");
        description.setStyle("-fx-font-size: 14px");
        description.setWrapText(true);
        root.getChildren().add(description);

        Label priceLabel = new Label("Harga sepatu:");
        priceLabel.setStyle("-fx-font-size: 14px");
        root.getChildren().add(priceLabel);

        Label price = new Label("IDR 1.399.000");
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
                Label successLabel = new Label("Berhasil Membeli");
                successLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: green");
                App.balance = App.balance - 1_399_000;
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
        // Implementasi pembayaran untuk sepatu 3
        Stage stage = new Stage();
        VBox root = new VBox();
        root.setPadding(new Insets(10));
        root.setSpacing(10);

        Label titleLabel = new Label("Pembayaran - DSP Cap Toe - Tan");
        titleLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold");
        titleLabel.setWrapText(true);
        root.getChildren().add(titleLabel);

        Image sepatuImage = new Image("images/scenetoko/ShoeFormal/Formal3.jpeg");
        ImageView sepatuImageView = new ImageView(sepatuImage);
        root.getChildren().add(sepatuImageView);
        root.setAlignment(Pos.CENTER);

        Label descriptionLabel = new Label("Deskripsi sepatu:");
        descriptionLabel.setStyle("-fx-font-size: 14px");
        root.getChildren().add(descriptionLabel);

        Label description = new Label("Anda percaya diri dan tenang saat mengenakan sepatu top-of-the-line, karena Anda tahu itu akan bertahan selama bertahun-tahun yang akan datang. Dengan koleksi DressSport Premium, Anda telah menemukan kecocokan Anda. Teknologi canggih, pengerjaan premium, dan bagian atas yang tampak tajam menjadikannya pilihan kerja hingga akhir pekan yang sempurna.");
        description.setStyle("-fx-font-size: 14px");
        description.setWrapText(true);
        root.getChildren().add(description);

        Label priceLabel = new Label("Harga sepatu:");
        priceLabel.setStyle("-fx-font-size: 14px");
        root.getChildren().add(priceLabel);

        Label price = new Label("IDR 1.439.400");
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
                Label successLabel = new Label("Berhasil Membeli");
                successLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: green");
                App.balance = App.balance - 1_439_000;
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
        // Implementasi pembayaran untuk sepatu 4
        Stage stage = new Stage();
        VBox root = new VBox();
        root.setPadding(new Insets(10));
        root.setSpacing(10);

        Label titleLabel = new Label("Pembayaran - DSH Plain Toe Dark Brown - Dark Brown");
        titleLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold");
        titleLabel.setWrapText(true);
        root.getChildren().add(titleLabel);

        Image sepatuImage = new Image("images/scenetoko/ShoeFormal/Formal4.jpeg");
        ImageView sepatuImageView = new ImageView(sepatuImage);
        root.getChildren().add(sepatuImageView);
        root.setAlignment(Pos.CENTER);

        Label descriptionLabel = new Label("Deskripsi sepatu:");
        descriptionLabel.setStyle("-fx-font-size: 14px");
        root.getChildren().add(descriptionLabel);

        Label description = new Label("Kami menggali arsip kami untuk membuat DressSport Heritage, sepatu berkualitas premium yang menggunakan teknik pembuatan sepatu tradisional. Sol luar Vibram yang ringan menawarkan bantalan kenyal, dan bagian atas yang tampak tajam menonjolkan pakaian apa pun. Sepatu ini membuat berjalan ke kantor atau berdiri di acara terasa mudah.");
        description.setStyle("-fx-font-size: 14px");
        description.setWrapText(true);
        root.getChildren().add(description);

        Label priceLabel = new Label("Harga sepatu:");
        priceLabel.setStyle("-fx-font-size: 14px");
        root.getChildren().add(priceLabel);

        Label price = new Label("IDR 1.149.500");
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
                Label successLabel = new Label("Berhasil Membeli");
                successLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: green");
                App.balance = App.balance - 1_149_500;
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
