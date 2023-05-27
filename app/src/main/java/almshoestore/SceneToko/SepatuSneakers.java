package almshoestore.SceneToko;

import almshoestore.App;
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
import javafx.stage.Stage;

public class SepatuSneakers extends Scene {

        public SepatuSneakers(Parent root, double width, double height) {
                super(createMainPane(), width, height);
        }

        private static Parent createMainPane() {
                VBox root = new VBox();
                root.setPadding(new Insets(10));
                root.setSpacing(10);

                Button backButton = new Button("BACK");
                backButton.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #000000; -fx-font-size: 16px;");
                backButton.setOnAction(e -> {
                        Stage stage = (Stage) backButton.getScene().getWindow();
                        App app = new App(); // Buat objek dari kelas App
                        Scene sceneTokoAwal = app.SceneTokoAwal(); // Panggil metode createSceneTokoAwal() dari objek App
                        stage.setScene(sceneTokoAwal);
                });
                root.getChildren().add(backButton);

                /* Shoes 1 */
                HBox hbox1 = new HBox();
                hbox1.setSpacing(10);

                VBox vbox1 = new VBox();
                vbox1.setSpacing(5);

                ImageView shoeImage1 = createShoeImageView("images/scenetoko/Sneakers/Sneakers1.jpg");
                hbox1.getChildren().add(shoeImage1);

                Button label1 = new Button("Converse Star Player 76 Premium Canvas Men's Sneakers - Black");
                label1.setStyle("-fx-text-fill: #000000; -fx-font-size: 20px; -fx-font-family: 'Cambria'; -fx-background-color: transparent");
                vbox1.getChildren().add(label1);

                Label description1 = new Label("Terinspirasi oleh energi pemuda, Converse Chuck Taylor All Flux Flux Sneaker menggunakan prinsip-prinsip desain dinamis untuk menangkap sikap pemuda yang selalu berubah. Detail yang terinspirasi oleh Sport seperti kulit imitasi dan jala atas, outsole Eva yang ringan, dan klip tumit karet membawa getaran atletik. Pita gore elastis di lidah memudahkan dan mematikan, sementara sockliner busa memori membantu tetap nyaman bagi mereka yang sedang bepergian.Sepatu tengah dengan mesh dan bagian atas sintetis Bootie internal untuk pas snugger Tarik loop pada tumit dan lidah agar mudah dan mati Sol outsol karet cetakan injeksi menawarkan traksi yang tahan lama Bantalan ortolit untuk kenyamanan");
                description1.setStyle("-fx-text-fill: #808080; -fx-font-size: 14px;");
                description1.setWrapText(true);
                VBox.setMargin(description1, new Insets(0, 0, 0, 15));
                vbox1.getChildren().add(description1);

                Label price1 = new Label("$99.99");
                VBox.setMargin(price1, new Insets(0, 0, 0, 15));
                price1.setStyle("-fx-text-fill: #008000; -fx-font-size: 16px;");
                vbox1.getChildren().add(price1);

                hbox1.getChildren().add(vbox1);
                root.getChildren().add(hbox1);

                /* Shoes 2 */
                HBox hbox2 = new HBox();
                hbox2.setSpacing(10);

                VBox vbox2 = new VBox();
                vbox2.setSpacing(5);

                ImageView shoeImage2 = createShoeImageView("images/scenetoko/Sneakers/Sneakers2.jpg");
                hbox2.getChildren().add(shoeImage2);

                Button label2 = new Button("Converse Low Top Chucks - Black");
                label2.setStyle("-fx-text-fill: #000000; -fx-font-size: 20px; -fx-font-family: 'Cambria';-fx-background-color: transparent");
                vbox2.getChildren().add(label2);

                Label description2 = new Label("Started when we cut the material for the original High Top Chucks, turning it into low-top basketball shoes. Then this sneaker moved from the court to the streets, cementing its status as an everyday icon. What happens next with the Low Top Chucks? It's up to you. This shoe is versatile, classic, and entirely yours wherever you go, whatever you want, and whenever. We just make the shoes. You make the story.");
                description2.setWrapText(true);
                description2.setStyle("-fx-text-fill: #808080; -fx-font-size: 14px;");
                VBox.setMargin(description2, new Insets(0, 0, 0, 15));
                vbox2.getChildren().add(description2);

                Label price2 = new Label("$99.99");
                price2.setStyle("-fx-text-fill: #008000; -fx-font-size: 16px;");
                VBox.setMargin(price2, new Insets(0, 0, 0, 15));
                vbox2.getChildren().add(price2);

                hbox2.getChildren().add(vbox2);
                root.getChildren().add(hbox2);

                /* Shoes 3 */
                HBox hbox3 = new HBox();
                hbox3.setSpacing(10);

                VBox vbox3 = new VBox();
                vbox3.setSpacing(5);

                ImageView shoeImage3 = createShoeImageView("images/scenetoko/Sneakers/Sneakers3.jpg");
                hbox3.getChildren().add(shoeImage3);

                Button label3 = new Button("Converse Star Player 76 Premium Canvas Men's Sneakers - White");
                label3.setStyle("-fx-text-fill: #000000; -fx-font-size: 20px; -fx-font-family: 'Cambria';-fx-background-color: transparent");
                vbox3.getChildren().add(label3);

                Label description3 = new Label("Terinspirasi oleh energi pemuda, Converse Chuck Taylor All Flux Flux Sneaker menggunakan prinsip-prinsip desain dinamis untuk menangkap sikap pemuda yang selalu berubah. Detail yang terinspirasi oleh Sport seperti kulit imitasi dan jala atas, outsole Eva yang ringan, dan klip tumit karet membawa getaran atletik. Pita gore elastis di lidah memudahkan dan mematikan, sementara sockliner busa memori membantu tetap nyaman bagi mereka yang sedang bepergian.Sepatu tengah dengan mesh dan bagian atas sintetis Bootie internal untuk pas snugger Tarik loop pada tumit dan lidah agar mudah dan mati Sol outsol karet cetakan injeksi menawarkan traksi yang tahan lama Bantalan ortolit untuk kenyamanan");
                description3.setWrapText(true);
                description3.setStyle("-fx-text-fill: #808080; -fx-font-size: 14px;");
                VBox.setMargin(description3, new Insets(0, 0, 0, 15));
                vbox3.getChildren().add(description3);

                Label price3 = new Label("$99.99");
                VBox.setMargin(price3, new Insets(0, 0, 0, 15));
                price3.setStyle("-fx-text-fill: #008000; -fx-font-size: 16px;");
                vbox3.getChildren().add(price3);

                hbox3.getChildren().add(vbox3);
                root.getChildren().add(hbox3);

                /* Shoes 4 */
                HBox hbox4 = new HBox();
                hbox4.setSpacing(10);

                VBox vbox4 = new VBox();
                vbox4.setSpacing(5);

                ImageView shoeImage4 = createShoeImageView("images/scenetoko/Sneakers/Sneakers4.jpg");
                hbox4.getChildren().add(shoeImage4);

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

                hbox4.getChildren().add(vbox4);
                root.getChildren().add(hbox4);

                label1.setOnAction(event -> {
                        Pembayaran1();
                });
                

                /* Shoes 5 */
                HBox hbox5 = new HBox();
                hbox5.setSpacing(10);

                VBox vbox5 = new VBox();
                vbox5.setSpacing(10);

                ImageView shoeImage5 = createShoeImageView("images/scenetoko/Sneakers/Sneakers5.jpg");
                hbox5.getChildren().add(shoeImage5);

                Button label5 = new Button("Converse Chuck Taylor All Star Seasonal Color Unisex Sneakers - Orange");
                label5.setStyle("-fx-text-fill : #000000; -fx-font-size : 20px; -fx-background-color : transparent");
                vbox5.getChildren().add(label5);

                Label description5 = new Label("Musim kanvas Star Chuck Taylor All terus menata kembali dirinya sendiri, dengan warna musim semi yang tren dan kanvas yang berpikiran maju. Anda sudah tahu detail yang dimulai di lapangan basket - outsole pola berlian dan tambalan pergelangan kaki bintang klasik. Cushioning Eco-Ortolite baru yang terbuat dari sekitar 20% konten daur ulang memberi Anda kenyamanan sepanjang hari yang bisa Anda rasakan. Gaya klasik dilengkapi dengan elemen desain warisan, seperti bumper kaki karet dan patch pergelangan kaki ikonik.Sepatu tengah dengan mesh dan bagian atas sintetis Bootie internal untuk pas snugger Tarik loop pada tumit dan lidah agar mudah dan mati Sol outsol karet cetakan injeksi menawarkan traksi yang tahan lama Bantalan ortolit untuk kenyamanan");
                description5.setStyle("-fx-text-fill : #808080; -fx-font-size : 14px");
                description5.setWrapText(true);
                VBox.setMargin(description5, new Insets(0, 0, 0, 15));
                vbox5.getChildren().add(description5);

                Label price5 = new Label("$99.99");
                price5.setStyle("-fx-text-fill : #008000; -fx-font-size : 16px");
                VBox.setMargin(price5, new Insets(0, 0, 0, 15));
                vbox5.getChildren().add(price5);

                hbox5.getChildren().add(vbox5);
                root.getChildren().add(hbox5);

                // Membungkus VBox di dalam ScrollPane
                ScrollPane scrollPane = new ScrollPane(root);
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

        private static void Pembayaran1() {
                
        }
}
