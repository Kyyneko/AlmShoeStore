        package almshoestore.SceneToko;

        import almshoestore.App;
        import javafx.geometry.Insets;
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

                for (int i = 1; i <= 4; i++) {
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
                // Implementasi pembayaran untuk sepatu 1
        }

        private static void Pembayaran2() {
                // Implementasi pembayaran untuk sepatu 2
        }

        private static void Pembayaran3() {
                // Implementasi pembayaran untuk sepatu 3
        }

        private static void Pembayaran4() {
                // Implementasi pembayaran untuk sepatu 4
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
