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

        public class SepatuSneakers extends Scene {

        public SepatuSneakers(Parent root, double width, double height) {
                super(root(), width, height);
        }

        private static Parent root() {
                VBox root = new VBox();
                root.setPadding(new Insets(10));
                root.setSpacing(10);

                Button backButton = createBackButton();
                root.getChildren().add(backButton);

                for (int i = 1; i <= 5; i++) {
                HBox hbox = new HBox();
                hbox.setSpacing(10);

                VBox vbox = new VBox();
                vbox.setSpacing(10);

                ImageView shoeImage = CreateImageView("images/scenetoko/Sneakers/Sneakers" + i + ".jpg");
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
                label.setText("Converse Chuck Taylor All Star Low Top Unisex Sneakers - Black");
                description.setText("Dimulai saat kami memotong material untuk High Top Chucks orisinal, mengubahnya menjadi sepatu basket low top. Lalu sneaker ini beralih dari lapangan ke jalanan, memperkuat statusnya sebagai ikon sehari-hari. Apa yang selanjutnya terjadi dengan Low Top Chucks? Terserah Anda. Sepatu ini serbaguna, klasik, dan sepenuhnya milik Anda ke mana pun Anda pergi, apa pun yang Anda inginkan, dan kapan pun. Kami hanya membuat sepatu. Anda membuat ceritanya. | Mengenai Ukuran Selisih 1-2 cm mungkin terjadi dikarenakan proses pengembangan dan produksi. | Mengenai Warna sesungguhnya mungkin dapat berbeda. Hal ini dikarenakan setiap layar memiliki kemampuan yang berbeda-beda untuk menampilkan warna, kami tidak dapat menjamin bahwa warna yang Anda lihat adalah warna akurat dari produk tersebut.");
                price.setText("IDR 759.000");
                } else if (i == 2) {
                label.setText("Converse Star Player 76 Premium Canvas Men's Sneakers - Black");
                description.setText("Terinspirasi oleh energi pemuda, Converse Chuck Taylor All Flux Flux Sneaker menggunakan prinsip-prinsip desain dinamis untuk menangkap sikap pemuda yang selalu berubah. Detail yang terinspirasi oleh Sport seperti kulit imitasi dan jala atas, outsole Eva yang ringan, dan klip tumit karet membawa getaran atletik. Pita gore elastis di lidah memudahkan dan mematikan, sementara sockliner busa memori membantu tetap nyaman bagi mereka yang sedang bepergian.Sepatu tengah dengan mesh dan bagian atas sintetis Bootie internal untuk pas snugger Tarik loop pada tumit dan lidah agar mudah dan mati Sol outsol karet cetakan injeksi menawarkan traksi yang tahan lama Bantalan ortolit untuk kenyamanan | Mengenai Ukuran: Selisih 1-2 cm mungkin terjadi dikarenakan proses pengembangan dan produksi.| Mengenai Warna: Warna sesungguhnya mungkin dapat berbeda. Hal ini dikarenakan setiap layar memiliki kemampuan yang berbeda-beda untuk menampilkan warna, kami tidak dapat menjamin bahwa warna yang Anda lihat adalah warna akurat dari produk tersebut.");
                price.setText("IDR 1.199.000");
                } else if (i == 3) {
                label.setText("Converse Star Player 76 Premium Canvas Men's Sneakers - White");
                description.setText("Terinspirasi oleh energi pemuda, Converse Chuck Taylor All Flux Flux Sneaker menggunakan prinsip-prinsip desain dinamis untuk menangkap sikap pemuda yang selalu berubah. Detail yang terinspirasi oleh Sport seperti kulit imitasi dan jala atas, outsole Eva yang ringan, dan klip tumit karet membawa getaran atletik. Pita gore elastis di lidah memudahkan dan mematikan, sementara sockliner busa memori membantu tetap nyaman bagi mereka yang sedang bepergian.Sepatu tengah dengan mesh dan bagian atas sintetis Bootie internal untuk pas snugger Tarik loop pada tumit dan lidah agar mudah dan mati Sol outsol karet cetakan injeksi menawarkan traksi yang tahan lama Bantalan ortolit untuk kenyamanan | Mengenai Ukuran: Selisih 1-2 cm mungkin terjadi dikarenakan proses pengembangan dan produksi. | Mengenai Warna: Warna sesungguhnya mungkin dapat berbeda. Hal ini dikarenakan setiap layar memiliki kemampuan yang berbeda-beda untuk menampilkan warna, kami tidak dapat menjamin bahwa warna yang Anda lihat adalah warna akurat dari produk tersebut.");
                price.setText("IDR 1.199.000");
                } else if (i == 4) {
                label.setText("Converse Chuck 70 Spring Color Unisex Sneakers - Green");
                description.setText("Musim kanvas Chuck 70 merayakan warisan itu dengan menyatukan detail yang terinspirasi arsip dengan pembaruan kenyamanan modern. Versi ini diperbarui dalam warna musim semi tren pada kanvas poli daur ulang premium. Bantalan insole eko-ortolit yang diperbarui yang terbuat dari sekitar 20% konten daur ulang memberi Anda dukungan sepanjang hari yang dapat Anda rasakan. Sebuah patch pergelangan kaki yang mengkilap, midsole dan star vintage mengeluarkan gaya ikon sepatu.Sepatu tengah dengan mesh dan bagian atas sintetis Bootie internal untuk pas snugger Tarik loop pada tumit dan lidah agar mudah dan mati Sol outsol karet cetakan injeksi menawarkan traksi yang tahan lama Bantalan ortolit untuk kenyamana | Mengenai Ukuran: Selisih 1-2 cm mungkin terjadi dikarenakan proses pengembangan dan produksi. | Mengenai Warna: Warna sesungguhnya mungkin dapat berbeda. Hal ini dikarenakan setiap layar memiliki kemampuan yang berbeda-beda untuk menampilkan warna, kami tidak dapat menjamin bahwa warna yang Anda lihat adalah warna akurat dari produk tersebut.");
                price.setText("IDR 1.299.000");
                } else if (i == 5) {
                label.setText("Converse Chuck Taylor All Star Seasonal Color Unisex Sneakers - Orange");
                description.setText("Musim kanvas Star Chuck Taylor All terus menata kembali dirinya sendiri, dengan warna musim semi yang tren dan kanvas yang berpikiran maju. Anda sudah tahu detail yang dimulai di lapangan basket - outsole pola berlian dan tambalan pergelangan kaki bintang klasik. Cushioning Eco-Ortolite baru yang terbuat dari sekitar 20% konten daur ulang memberi Anda kenyamanan sepanjang hari yang bisa Anda rasakan. Gaya klasik dilengkapi dengan elemen desain warisan, seperti bumper kaki karet dan patch pergelangan kaki ikonik.Sepatu tengah dengan mesh dan bagian atas sintetis Bootie internal untuk pas snugger Tarik loop pada tumit dan lidah agar mudah dan mati Sol outsol karet cetakan injeksi menawarkan traksi yang tahan lama Bantalan ortolit untuk kenyamanan | Mengenai Ukuran: Selisih 1-2 cm mungkin terjadi dikarenakan proses pengembangan dan produksi. | Mengenai Warna: Warna sesungguhnya mungkin dapat berbeda. Hal ini dikarenakan setiap layar memiliki kemampuan yang berbeda-beda untuk menampilkan warna, kami tidak dapat menjamin bahwa warna yang Anda lihat adalah warna akurat dari produk tersebut.");
                price.setText("IDR 999.000");
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
                case 5:
                        Pembayaran5();
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
        
                
                Label titleLabel = new Label("Pembayaran - Converse Chuck Taylor All Star Low Top Unisex Sneakers - Black");
                titleLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold");
                titleLabel.setWrapText(true);
                root.getChildren().add(titleLabel);

                Image sepatuImage = new Image("images/scenetoko/Sneakers/Sneakers1.jpg");
                ImageView sepatuImageView = new ImageView(sepatuImage);
                root.getChildren().add(sepatuImageView);
                root.setAlignment(Pos.CENTER);
                
                Label descriptionLabel = new Label("Deskripsi sepatu:");
                descriptionLabel.setStyle("-fx-font-size: 14px");
                root.getChildren().add(descriptionLabel);
        
                Label description = new Label("Dimulai saat kami memotong material untuk High Top Chucks orisinal, mengubahnya menjadi sepatu basket low top. Lalu sneaker ini beralih dari lapangan ke jalanan, memperkuat statusnya sebagai ikon sehari-hari. Apa yang selanjutnya terjadi dengan Low Top Chucks? Terserah Anda. Sepatu ini serbaguna, klasik, dan sepenuhnya milik Anda ke mana pun Anda pergi, apa pun yang Anda inginkan, dan kapan pun. Kami hanya membuat sepatu. Anda membuat ceritanya. | Mengenai Ukuran Selisih 1-2 cm mungkin terjadi dikarenakan proses pengembangan dan produksi. | Mengenai Warna sesungguhnya mungkin dapat berbeda. Hal ini dikarenakan setiap layar memiliki kemampuan yang berbeda-beda untuk menampilkan warna, kami tidak dapat menjamin bahwa warna yang Anda lihat adalah warna akurat dari produk tersebut.");
                description.setStyle("-fx-font-size: 14px");
                description.setWrapText(true);
                root.getChildren().add(description);
                
                Label priceLabel = new Label("Harga sepatu:");
                priceLabel.setStyle("-fx-font-size: 14px");
                root.getChildren().add(priceLabel);
                
                Label price = new Label("IDR 759.000");
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

        private static void Pembayaran2() {
                Stage stage = new Stage();
                VBox root = new VBox();
                root.setPadding(new Insets(10));
                root.setSpacing(10);
        
                
                Label titleLabel = new Label("Pembayaran - Converse Star Player 76 Premium Canvas Men's Sneakers - Black");
                titleLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold");
                root.getChildren().add(titleLabel);

                Image sepatuImage = new Image("images/scenetoko/Sneakers/Sneakers2.jpg");
                ImageView sepatuImageView = new ImageView(sepatuImage);
                root.getChildren().add(sepatuImageView);
                root.setAlignment(Pos.CENTER);
                
                Label descriptionLabel = new Label("Deskripsi sepatu:");
                descriptionLabel.setStyle("-fx-font-size: 14px");
                root.getChildren().add(descriptionLabel);

                Label description = new Label("Terinspirasi oleh energi pemuda, Converse Chuck Taylor All Flux Flux Sneaker menggunakan prinsip-prinsip desain dinamis untuk menangkap sikap pemuda yang selalu berubah. Detail yang terinspirasi oleh Sport seperti kulit imitasi dan jala atas, outsole Eva yang ringan, dan klip tumit karet membawa getaran atletik. Pita gore elastis di lidah memudahkan dan mematikan, sementara sockliner busa memori membantu tetap nyaman bagi mereka yang sedang bepergian.Sepatu tengah dengan mesh dan bagian atas sintetis Bootie internal untuk pas snugger Tarik loop pada tumit dan lidah agar mudah dan mati Sol outsol karet cetakan injeksi menawarkan traksi yang tahan lama Bantalan ortolit untuk kenyamanan | Mengenai Ukuran: Selisih 1-2 cm mungkin terjadi dikarenakan proses pengembangan dan produksi.| Mengenai Warna: Warna sesungguhnya mungkin dapat berbeda. Hal ini dikarenakan setiap layar memiliki kemampuan yang berbeda-beda untuk menampilkan warna, kami tidak dapat menjamin bahwa warna yang Anda lihat adalah warna akurat dari produk tersebut.");
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
        
                
                Label titleLabel = new Label("Pembayaran - Converse Star Player 76 Premium Canvas Men's Sneakers - White");
                titleLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold");
                root.getChildren().add(titleLabel);
                
                Image sepatuImage = new Image("images/scenetoko/Sneakers/Sneakers3.jpg");
                ImageView sepatuImageView = new ImageView(sepatuImage);
                root.getChildren().add(sepatuImageView);
                root.setAlignment(Pos.CENTER);

                Label descriptionLabel = new Label("Deskripsi sepatu:");
                descriptionLabel.setStyle("-fx-font-size: 14px");
                root.getChildren().add(descriptionLabel);
        
                Label description = new Label("Terinspirasi oleh energi pemuda, Converse Chuck Taylor All Flux Flux Sneaker menggunakan prinsip-prinsip desain dinamis untuk menangkap sikap pemuda yang selalu berubah. Detail yang terinspirasi oleh Sport seperti kulit imitasi dan jala atas, outsole Eva yang ringan, dan klip tumit karet membawa getaran atletik. Pita gore elastis di lidah memudahkan dan mematikan, sementara sockliner busa memori membantu tetap nyaman bagi mereka yang sedang bepergian.Sepatu tengah dengan mesh dan bagian atas sintetis Bootie internal untuk pas snugger Tarik loop pada tumit dan lidah agar mudah dan mati Sol outsol karet cetakan injeksi menawarkan traksi yang tahan lama Bantalan ortolit untuk kenyamanan | Mengenai Ukuran: Selisih 1-2 cm mungkin terjadi dikarenakan proses pengembangan dan produksi.| Mengenai Warna: Warna sesungguhnya mungkin dapat berbeda. Hal ini dikarenakan setiap layar memiliki kemampuan yang berbeda-beda untuk menampilkan warna, kami tidak dapat menjamin bahwa warna yang Anda lihat adalah warna akurat dari produk tersebut.");
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
                
                Label titleLabel = new Label("Pembayaran - Converse Chuck 70 Spring Color Unisex Sneakers - Green");
                titleLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold");
                root.getChildren().add(titleLabel);

                Image sepatuImage = new Image("images/scenetoko/Sneakers/Sneakers4.jpg");
                ImageView sepatuImageView = new ImageView(sepatuImage);
                root.getChildren().add(sepatuImageView);
                root.setAlignment(Pos.CENTER);
                
                Label descriptionLabel = new Label("Deskripsi sepatu:");
                descriptionLabel.setStyle("-fx-font-size: 14px");
                root.getChildren().add(descriptionLabel);
        
                Label description = new Label("Musim kanvas Chuck 70 merayakan warisan itu dengan menyatukan detail yang terinspirasi arsip dengan pembaruan kenyamanan modern. Versi ini diperbarui dalam warna musim semi tren pada kanvas poli daur ulang premium. Bantalan insole eko-ortolit yang diperbarui yang terbuat dari sekitar 20% konten daur ulang memberi Anda dukungan sepanjang hari yang dapat Anda rasakan. Sebuah patch pergelangan kaki yang mengkilap, midsole dan star vintage mengeluarkan gaya ikon sepatu.Sepatu tengah dengan mesh dan bagian atas sintetis Bootie internal untuk pas snugger Tarik loop pada tumit dan lidah agar mudah dan mati Sol outsol karet cetakan injeksi menawarkan traksi yang tahan lama Bantalan ortolit untuk kenyamana | Mengenai Ukuran: Selisih 1-2 cm mungkin terjadi dikarenakan proses pengembangan dan produksi. | Mengenai Warna: Warna sesungguhnya mungkin dapat berbeda. Hal ini dikarenakan setiap layar memiliki kemampuan yang berbeda-beda untuk menampilkan warna, kami tidak dapat menjamin bahwa warna yang Anda lihat adalah warna akurat dari produk tersebut.");
                description.setStyle("-fx-font-size: 14px");
                description.setWrapText(true);
                root.getChildren().add(description);
        
                Label priceLabel = new Label("Harga sepatu:");
                priceLabel.setStyle("-fx-font-size: 14px");
                root.getChildren().add(priceLabel);
        
                Label price = new Label("IDR 2.199.000");
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

        private static void Pembayaran5() {
                Stage stage = new Stage();
                VBox root = new VBox();
                root.setPadding(new Insets(10));
                root.setSpacing(10);

                Label titleLabel = new Label("Pembayaran - Converse Chuck Taylor All Star Seasonal Color Unisex Sneakers - Orange");
                titleLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold");
                root.getChildren().add(titleLabel);

                Image sepatuImage = new Image("images/scenetoko/Sneakers/Sneakers5.jpg");
                ImageView sepatuImageView = new ImageView(sepatuImage);
                root.getChildren().add(sepatuImageView);
                root.setAlignment(Pos.CENTER);
        
                Label descriptionLabel = new Label("Deskripsi sepatu:");
                descriptionLabel.setStyle("-fx-font-size: 14px");
                root.getChildren().add(descriptionLabel);
        
                Label description = new Label("Musim kanvas Star Chuck Taylor All terus menata kembali dirinya sendiri, dengan warna musim semi yang tren dan kanvas yang berpikiran maju. Anda sudah tahu detail yang dimulai di lapangan basket - outsole pola berlian dan tambalan pergelangan kaki bintang klasik. Cushioning Eco-Ortolite baru yang terbuat dari sekitar 20% konten daur ulang memberi Anda kenyamanan sepanjang hari yang bisa Anda rasakan. Gaya klasik dilengkapi dengan elemen desain warisan, seperti bumper kaki karet dan patch pergelangan kaki ikonik.Sepatu tengah dengan mesh dan bagian atas sintetis Bootie internal untuk pas snugger Tarik loop pada tumit dan lidah agar mudah dan mati Sol outsol karet cetakan injeksi menawarkan traksi yang tahan lama Bantalan ortolit untuk kenyamanan | Mengenai Ukuran: Selisih 1-2 cm mungkin terjadi dikarenakan proses pengembangan dan produksi. | Mengenai Warna: Warna sesungguhnya mungkin dapat berbeda. Hal ini dikarenakan setiap layar memiliki kemampuan yang berbeda-beda untuk menampilkan warna, kami tidak dapat menjamin bahwa warna yang Anda lihat adalah warna akurat dari produk tersebut.");
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

                Button buyButton = new Button("Beli");
                buyButton.setOnAction(e -> {
                        Label successLabel = new Label("Pesan berhasil Membeli");
                        successLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: green");
                        root.getChildren().add(successLabel);
                });
                root.getChildren().add(buyButton);
        
                // Tambahkan komponen-komponen lain yang diperlukan untuk pembayaran sepatu 4
        
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
