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

public class SepatuFutsal extends Scene {

    public SepatuFutsal(Parent root, double width, double height) {
        super(root(), width, height);
        
    }

    private static Parent root() {
        VBox root = new VBox();
        root.setPadding(new Insets(10));
        root.setSpacing(10);

        /* ============================================================ BACK BUTTON ============================================================ */
        Button backButton = new Button("BACK");
        backButton.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #000000; -fx-font-size : 16px");
        backButton.setOnAction(e -> {
            Stage stage = (Stage) backButton.getScene().getWindow();
            App app = new App(); // Buat objek dari kelas App
            Scene sceneTokoAwal = app.SceneTokoAwal(); // Panggil metode createSceneTokoAwal() dari objek App
            stage.setScene(sceneTokoAwal);
        });
        backButton.setOnMouseEntered(event -> {
            backButton.setCursor(Cursor.HAND);
        });
        backButton.setOnMouseExited(event -> {
            backButton.setCursor(Cursor.DEFAULT);
        });
        
        root.getChildren().add(backButton);

        /* ============================================================ Shoes 1 ============================================================ */
        HBox hbox1 = new HBox();
        hbox1.setSpacing(10);

        VBox vbox1 = new VBox();
        vbox1.setSpacing(10);

        ImageView shoeImage1 =  CreateImageView("images/scenetoko/ShoeFutsal/Futsal1.jpg");
        hbox1.getChildren().add(shoeImage1);

        Button label1 = new Button("Nike Mercurial Superfly 8 Club Tf");
        label1.setStyle("-fx-text-fill: #000000; -fx-font-size: 20px; -fx-font-family: 'Cambria'; -fx-background-color: transparent");

        Label description1 = new Label("Detail | Colorway : Black | Article : (CV0955-004) | Brand New in Box (BNIB) / Tag (BNWT) | Material The Nike Mercurial Superfly 8 Club Tf Combines Breathable And Flexible Materials For A Perfect Fit. The Rubber Outsole Provides Optimal Grip On Synthetic Surfaces.");
        description1.setStyle("-fx-text-fill : #808080; -fx-font-size : 14px");
        description1.setWrapText(true);
        VBox.setMargin(description1, new Insets(0, 0, 0, 15));

        Label price1 = new Label("IDR 899.000");
        price1.setStyle("-fx-text-fill : #008000; -fx-font-size : 16px");
        VBox.setMargin(price1, new Insets(0, 0, 0, 15));

        vbox1.getChildren().addAll(label1, description1, price1);
        hbox1.getChildren().add(vbox1);
        root.getChildren().add(hbox1);

        /* ============================================================ Shoes 2 ============================================================ */
        HBox hbox2 = new HBox();
        hbox2.setSpacing(10);

        VBox vbox2 = new VBox();
        vbox2.setSpacing(10);

        ImageView shoeImage2 = CreateImageView("images/scenetoko/ShoeFutsal/Futsal2.jpg");
        shoeImage2.setStyle("-fx-background-color : transparent");
        hbox2.getChildren().add(shoeImage2);

        Button label2 = new Button("Nike Phantom Gt2 Academy Ic Indoor");
        label2.setStyle("-fx-text-fill : #000000; -fx-font-size : 20px; -fx-font-family : 'Cambria'; -fx-background-color : transparent");

        Label description2 = new Label("Detail | Colorway : Blue | Article : (DC0765-407) | Brand New in Box (BNIB) / Tag (BNWT) | Material Smooth Surface: Off-center Lacing Creates A Larger Sweet Spot For Powerful Strikes. Durable Design: Synthetic Leather Is Durable And Easy To Clean.");
        description2.setStyle("-fx-text-fill : #808080; -fx-font-size : 14px");
        description2.setWrapText(true);
        VBox.setMargin(description2, new Insets(0, 0, 0, 15));

        Label price2 = new Label("IDR 1.199.000");
        price2.setStyle("-fx-text-fill : #008000; -fx-font-size : 16px");
        VBox.setMargin(price2, new Insets(0, 0, 0, 15));

        vbox2.getChildren().addAll(label2, description2, price2);
        hbox2.getChildren().add(vbox2);
        root.getChildren().add(hbox2);

        /* ============================================================ Shoes 3 ============================================================ */
        HBox hbox3 = new HBox();
        hbox3.setSpacing(10);
        
        VBox vbox3 = new VBox();
        vbox3.setSpacing(10);

        ImageView shoeImage3 = CreateImageView("images/scenetoko/ShoeFutsal/Futsal3.jpg");
        hbox3.getChildren().add(shoeImage3);

        Button label3 = new Button("Nike Phantom Gt2 Academy Tf");
        label3.setStyle("-fx-text-fill : #000000; -fx-font-size : 20px; -fx-background-color : transparent");

        Label description3 = new Label("Detail | Colorway : Black | Article : (DC0803-001) | Brand New in Box (BNIB) / Tag (BNWT) | Material | For Use On Shorter, Synthetic Surfaces | Non-marking Sole");
        description3.setStyle("-fx-text-fill : #808080; -fx-font-size : 14px");
        description3.setWrapText(true);
        VBox.setMargin(description3, new Insets(0, 0, 0, 15));

        Label price3 = new Label("IDR 999.000");
        price3.setStyle("-fx-text-fill : #008000; -fx-font-size : 16px");
        VBox.setMargin(price3, new Insets(0, 0, 0, 15));

        vbox3.getChildren().addAll(label3, description3, price3);
        hbox3.getChildren().add(vbox3);
        root.getChildren().add(hbox3);

        /* ============================================================ Shoes 4 ============================================================ */
        HBox hbox4 = new HBox();
        hbox4.setSpacing(10);

        VBox vBox4 = new VBox();
        vBox4.setSpacing(10);

        ImageView shoeImage4 = CreateImageView("images/scenetoko/ShoeFutsal/Futsal4.jpg");
        hbox4.getChildren().add(shoeImage4);

        Button label4 = new Button("Nike Zoom Vapor 15 Academy Kylian Mbappe Tf");
        label4.setStyle("-fx-text-fill : #000000; -fx-font-size : 20px; -fx-background-color : transparent");

        Label description4 = new Label("Detail | Colorway : Dark Red | Article : (DV0708-694) | Brand New in Box (BNIB) / Tag (BNWT) | Material | Kylian Mbappé's Explosiveness, Plus His Twitchy Change Of Direction, Puts Him Firmly In The World Class Of Finishers. With Nods To His Heritage, This Cleat Is Made To Help You Play Just Like Km—with Blinding Pace And Purpose.");
        description4.setStyle("-fx-text-fill : #808080; -fx-fot-size : 14px");
        description4.setWrapText(true);
        VBox.setMargin(description4, new Insets(0, 0, 0, 15));

        Label price4 = new Label("IDR 1.299.000");
        price4.setStyle("-fx-text-fill : #008000; -fx-font-size : 16px");
        VBox.setMargin(price4, new Insets(0, 0, 0, 15));

        vBox4.getChildren().addAll(label4, description4, price4);
        hbox4.getChildren().add(vBox4);
        root.getChildren().add(hbox4);

        /* ============================================================ Button Payment ============================================================ */
        label1.setOnAction(event -> {
            Pembayaran1();
        });

        label2.setOnAction(event -> {
            Pembayaran2();
        });

        label3.setOnAction(event -> {
            Pembayaran3();
        });

        label4.setOnAction(event -> {
            Pembayaran4();
        });
        
        /* ============================================================ Scroll Pane ============================================================ */
        ScrollPane scroll = new ScrollPane(root);
        scroll.setFitToWidth(true);
        scroll.setFitToHeight(true);

        return scroll;

        }

    /* ============================================================ Scene Pembayaran ============================================================ */

        private static void Pembayaran4() {
    }

        private static void Pembayaran3() {
    }

        private static void Pembayaran2() {
    }

        private static void Pembayaran1() {
    }

        /* ============================================================ Image View ============================================================ */
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


