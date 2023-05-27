package almshoestore.SceneToko;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class SepatuSneakers extends Scene {

    public SepatuSneakers(Parent root, double width, double height) {
        super(createMainPane(), width, height);
    }

    private static Parent createMainPane() {
        VBox sneakersPane = new VBox();
        sneakersPane.setPadding(new Insets(10));
        sneakersPane.setSpacing(10);

        Button backButton = new Button("BACK");
        backButton.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #000000; -fx-font-size: 16px;");
        sneakersPane.getChildren().add(backButton);

//////////////////////////////////////////////////////////////////////////////////////////////////////////

        // Membuat HBox untuk menampilkan label, deskripsi, dan harga secara horizontal
        HBox hbox1 = new HBox();
        hbox1.setSpacing(10);

        // Menambahkan gambar sepatu ke HBox
        ImageView shoeImage1 = createShoeImageView("images/scenetoko/Sneakers/Sneakers1.jpg");
        hbox1.getChildren().add(shoeImage1);

        // Membuat VBox untuk menyimpan deskripsi dan harga
        VBox vbox1 = new VBox();
        vbox1.setSpacing(5);

        Button label1 = new Button("Converse Star Player 76 Premium Canvas Men's Sneakers - Black");
        label1.setStyle("-fx-text-fill: #000000; -fx-font-size: 20px; -fx-font-family: 'Cambria'; -fx-background-color: transparent");
        vbox1.getChildren().add(label1);

        Label description1 = new Label("Terinspirasi oleh energi pemuda, Converse Chuck Taylor All Flux Flux Sneaker menggunakan prinsip-prinsip desain dinamis untuk menangkap sikap pemuda yang selalu berubah. Detail yang terinspirasi oleh Sport seperti kulit imitasi dan jala atas, outsole Eva yang ringan, dan klip tumit karet membawa getaran atletik. Pita gore elastis di lidah memudahkan dan mematikan, sementara sockliner busa memori membantu tetap nyaman bagi mereka yang sedang bepergian.Sepatu tengah dengan mesh dan bagian atas sintetis Bootie internal untuk pas snugger Tarik loop pada tumit dan lidah agar mudah dan mati Sol outsol karet cetakan injeksi menawarkan traksi yang tahan lama Bantalan ortolit untuk kenyamanan");
        VBox.setMargin(description1, new Insets(0, 0, 0, 15));
        description1.setStyle("-fx-text-fill: #808080; -fx-font-size: 14px;");
        description1.setWrapText(true);
        vbox1.getChildren().add(description1);

        Label price1 = new Label("$99.99");
        VBox.setMargin(price1, new Insets(0, 0, 0, 15));
        price1.setStyle("-fx-text-fill: #008000; -fx-font-size: 16px;");
        vbox1.getChildren().add(price1);

        // Menambahkan vbox1 ke hbox1
        hbox1.getChildren().add(vbox1);

        // Menambahkan hbox1 ke sneakersPane
        sneakersPane.getChildren().add(hbox1);

//////////////////////////////////////////////////////////////////////////////////////////////////////////

        // Menambahkan gambar sepatu ke sneakersPane
        // Membuat HBox untuk menampilkan image2, label2, description2, dan price2 secara horizontal
        HBox hbox2 = new HBox();
        hbox2.setSpacing(10);

        // Menambahkan gambar sepatu ke HBox
        ImageView shoeImage2 = createShoeImageView("images/scenetoko/Sneakers/Sneakers2.jpg");
        hbox2.getChildren().add(shoeImage2);

        // Membuat VBox untuk menyimpan label2, description2, dan price2
        VBox vbox2 = new VBox();
        vbox2.setSpacing(5);

        Button label2 = new Button("Converse Low Top Chucks - Black");
        label2.setStyle("-fx-text-fill: #000000; -fx-font-size: 20px; -fx-font-family: 'Cambria';-fx-background-color: transparent");
        vbox2.getChildren().add(label2);

        Label description2 = new Label("Started when we cut the material for the original High Top Chucks, turning it into low-top basketball shoes. Then this sneaker moved from the court to the streets, cementing its status as an everyday icon. What happens next with the Low Top Chucks? It's up to you. This shoe is versatile, classic, and entirely yours wherever you go, whatever you want, and whenever. We just make the shoes. You make the story.");
        VBox.setMargin(description2, new Insets(0, 0, 0, 15));
        description2.setWrapText(true);
        description2.setStyle("-fx-text-fill: #808080; -fx-font-size: 14px;");
        vbox2.getChildren().add(description2);

        Label price2 = new Label("$99.99");
        VBox.setMargin(price2, new Insets(0, 0, 0, 15));
        price2.setStyle("-fx-text-fill: #008000; -fx-font-size: 16px;");
        vbox2.getChildren().add(price2);

        // Menambahkan vbox2 ke hbox2
        hbox2.getChildren().add(vbox2);

        // Menambahkan hbox2 ke sneakersPane
        sneakersPane.getChildren().add(hbox2);

//////////////////////////////////////////////////////////////////////////////////////////////////////////

        HBox hbox3 = new HBox();
        hbox3.setSpacing(10);

        // Menambahkan gambar sepatu ke sneakersPane
        ImageView shoeImage3 = createShoeImageView("images/scenetoko/Sneakers/Sneakers3.jpg");
        hbox3.getChildren().add(shoeImage3);

        // Membuat VBox untuk menyimpan label3, description3, dan price3
        VBox vbox3 = new VBox();
        vbox3.setSpacing(5);

        Button label3 = new Button("Converse Star Player 76 Premium Canvas Men's Sneakers - White");
        label3.setStyle("-fx-text-fill: #000000; -fx-font-size: 20px; -fx-font-family: 'Cambria';-fx-background-color: transparent");
        vbox3.getChildren().add(label3);

        Label description3 = new Label("Terinspirasi oleh energi pemuda, Converse Chuck Taylor All Flux Flux Sneaker menggunakan prinsip-prinsip desain dinamis untuk menangkap sikap pemuda yang selalu berubah. Detail yang terinspirasi oleh Sport seperti kulit imitasi dan jala atas, outsole Eva yang ringan, dan klip tumit karet membawa getaran atletik. Pita gore elastis di lidah memudahkan dan mematikan, sementara sockliner busa memori membantu tetap nyaman bagi mereka yang sedang bepergian.Sepatu tengah dengan mesh dan bagian atas sintetis Bootie internal untuk pas snugger Tarik loop pada tumit dan lidah agar mudah dan mati Sol outsol karet cetakan injeksi menawarkan traksi yang tahan lama Bantalan ortolit untuk kenyamanan");
        VBox.setMargin(description3, new Insets(0, 0, 0, 15));
        description3.setWrapText(true);
        description3.setStyle("-fx-text-fill: #808080; -fx-font-size: 14px;");
        vbox3.getChildren().add(description3);

        Label price3 = new Label("$99.99");
        VBox.setMargin(price3, new Insets(0, 0, 0, 15));
        price3.setStyle("-fx-text-fill: #008000; -fx-font-size: 16px;");
        vbox3.getChildren().add(price3);

        // Menambahkan vbox3 ke hbox3
        hbox3.getChildren().add(vbox3);

        // Menambahkan hbox3 ke sneakersPane
        sneakersPane.getChildren().add(hbox3);

//////////////////////////////////////////////////////////////////////////////////////////////////////////

        HBox hbox4 = new HBox();
        hbox4.setSpacing(10);

        // Menambahkan gambar sepatu ke hbox4
        ImageView shoeImage4 = createShoeImageView("images/scenetoko/Sneakers/Sneakers4.jpg");
        hbox4.getChildren().add(shoeImage4);

        VBox vbox4 = new VBox();
        vbox4.setSpacing(5);

        Button label4 = new Button("Converse Chuck 70 Spring Color Unisex Sneakers - Green");
        label4.setStyle("-fx-text-fill: #000000; -fx-font-size: 20px; -fx-font-family: 'Cambria';-fx-background-color: transparent");
        vbox4.getChildren().add(label4);

        Label description4 = new Label("Musim kanvas Chuck 70 merayakan warisan itu dengan menyatukan detail yang terinspirasi arsip dengan pembaruan kenyamanan modern. Versi ini diperbarui dalam warna musim semi tren pada kanvas poli daur ulang premium. Bantalan insole eko-ortolit yang diperbarui yang terbuat dari sekitar 20% konten daur ulang memberi Anda dukungan sepanjang hari yang dapat Anda rasakan. Sebuah patch pergelangan kaki yang mengkilap, midsole dan star vintage mengeluarkan gaya ikon sepatu.Sepatu tengah dengan mesh dan bagian atas sintetis Bootie internal untuk pas snugger Tarik loop pada tumit dan lidah agar mudah dan mati Sol outsol karet cetakan injeksi menawarkan traksi yang tahan lama Bantalan ortolit untuk kenyamanan");
        VBox.setMargin(description4, new Insets(0, 0, 0, 15));
        description4.setWrapText(true);
        description4.setStyle("-fx-text-fill: #808080; -fx-font-size: 14px;");
        vbox4.getChildren().add(description4);

        Label price4 = new Label("$99.99");
        VBox.setMargin(price4, new Insets(0, 0, 0, 15));
        price4.setStyle("-fx-text-fill: #008000; -fx-font-size: 16px;");
        vbox4.getChildren().add(price4);

        // Menambahkan vbox4 ke hbox4
        hbox4.getChildren().add(vbox4);

        // Menambahkan hbox4 ke sneakersPane
        sneakersPane.getChildren().add(hbox4);

//////////////////////////////////////////////////////////////////////////////////////////////////////////

        // Menambahkan gambar sepatu ke sneakersPane
        ImageView shoeImage5 = createShoeImageView("images/scenetoko/Sneakers/Sneakers5.jpg");
        sneakersPane.getChildren().add(shoeImage5);

        // Membungkus VBox di dalam ScrollPane
        ScrollPane scrollPane = new ScrollPane(sneakersPane);
        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);

        return scrollPane;
    }

    private static ImageView createShoeImageView(String imagePath) {
        // Membuat ImageView dengan gambar sepatu
        Image image = new Image(imagePath);
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(200); // Mengatur lebar gambar
        imageView.setPreserveRatio(true); // Menjaga rasio aspek gambar

        return imageView;
    }
}
