package almshoestore.SceneToko;

import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import almshoestore.App;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;

public class SepatuLari extends Scene {

    public SepatuLari(Parent root, double width, double height) {
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

        /* ============================================================ SHOES 1 ============================================================ */
        HBox hbox1 = new HBox();
        hbox1.setSpacing(10);

        VBox vbox1 = new VBox();
        vbox1.setSpacing(10);

        ImageView shoeImage1 = CreateImageView("images/scenetoko/ShoeRun/Lari1.jpg");
        hbox1.getChildren().add(shoeImage1);

        Button label1 = new Button("Hoka One One Kawana");
        label1.setStyle("-fx-text-fill: #000000; -fx-font-size: 20px; -fx-font-family: 'Cambria'; -fx-background-color: transparent");
        vbox1.getChildren().add(label1);

        Label description1 = new Label("Detail | Colorway : Lunar Rock | Article : (HKE1123163BL) | Brand New in Box (BNIB) / Tag (BNWT) | Material : Pushing The Boundaries On The Traditional Hoka Geometries, The Hoka Kawana Helps Runners Break New Ground. This Neutral Running Shoe Features A Modified Crash Pad With Swallowtail™ Geometry To Provide Smooth Heel Strikes.");
        description1.setStyle("-fx-text-fill : #808080; -fx-font-size : 14px");
        description1.setWrapText(true);
        VBox.setMargin(description1, new Insets(0, 0, 0, 15));
        vbox1.getChildren().add(description1);

        Label price1 = new Label("IDR 2.099.000");
        price1.setStyle("-fx-text-fill : #008000; -fx-font-size : 16px");
        VBox.setMargin(price1, new Insets(0, 0, 0, 15));
        vbox1.getChildren().add(price1);

        hbox1.getChildren().add(vbox1);
        root.getChildren().add(hbox1);

        /* ============================================================ SHOES 2 ============================================================ */
        HBox hbox2 = new HBox();
        hbox2.setSpacing(10);

        VBox vbox2 = new VBox();
        vbox2.setSpacing(10);

        ImageView shoeImage2 = CreateImageView("images/scenetoko/ShoeRun/Lari2.jpg");
        shoeImage2.setStyle("-fx-background-color : transparent");
        hbox2.getChildren().add(shoeImage2);

        Button label2 = new Button("Adidas Ultraboost Light");
        label2.setStyle("-fx-text-fill : #000000; -fx-font-size : 20px; -fx-font-family : 'Cambria'; -fx-background-color : transparent");
        vbox2.getChildren().add(label2);

        Label description2 = new Label("Detail | Colorway : Cloud White | Article : (HQ6352) | Brand New in Box (BNIB) / Tag (BNWT) | Material : Experience Epic Energy With The New Ultraboost Light, Our Lightest Ultraboost Ever. The Magic Lies In The Light Boost Midsole, A New Generation Of Adidas Boost. Its Unique Molecule Design Achieves The Lightest Boost Foam To Date.");
        description2.setStyle("-fx-text-fill : #808080; -fx-font-size : 14px");
        description2.setWrapText(true);
        VBox.setMargin(description2, new Insets(0, 0, 0, 15));
        vbox2.getChildren().add(description2);

        Label price2 = new Label("IDR 2.799.000");
        price2.setStyle("-fx-text-fill : #008000; -fx-font-size : 16px");
        VBox.setMargin(price2, new Insets(0, 0, 0, 15));
        vbox2.getChildren().add(price2);

        hbox2.getChildren().add(vbox2);
        root.getChildren().add(hbox2);

        /* ============================================================ SHOES 3 ============================================================ */
        HBox hbox3 = new HBox();
        hbox3.setSpacing(10);

        VBox vbox3 = new VBox();
        vbox3.setSpacing(10);

        ImageView shoeImage3 = CreateImageView("images/scenetoko/ShoeRun/Lari3.jpg");
        hbox3.getChildren().add(shoeImage3);

        Button label3 = new Button("Nike Zoomx Streakfly Prm");
        label3.setStyle("-fx-text-fill : #000000; -fx-font-size : 20px; -fx-background-color : transparent");
        vbox3.getChildren().add(label3);

        Label description3 = new Label("Detail | Colorway : White | Article : (DX1626-100) | Brand New in Box (BNIB) / Tag (BNWT) | Material : When Pitted Against The Clock, You Want Shoes That Feel Like Butterflies On Your Feet. The Streakfly Is Our Lightest Racing Shoe, Allowing It To Essentially Disappear On Your Foot. We Left Out All The Unnecessary Frills And Weight");
        description3.setStyle("-fx-text-fill : #808080; -fx-font-size : 14px");
        description3.setWrapText(true);
        VBox.setMargin(description3, new Insets(0, 0, 0, 15));
        vbox3.getChildren().add(description3);

        Label price3 = new Label("IDR 2.799.000");
        price3.setStyle("-fx-text-fill : #008000; -fx-font-size : 16px");
        VBox.setMargin(price3, new Insets(0, 0, 0, 15));
        vbox3.getChildren().add(price3);

        hbox3.getChildren().add(vbox3);
        root.getChildren().add(hbox3);

        /* ============================================================ SHOES 4 ============================================================ */
        HBox hbox4 = new HBox();
        hbox4.setSpacing(10);

        VBox vbox4 = new VBox();
        vbox4.setSpacing(10);

        ImageView shoeImage4 = CreateImageView("images/scenetoko/ShoeRun/Lari4.jpg");
        hbox4.getChildren().add(shoeImage4);


        Button label4 = new Button("Adidas Ultraboost 22");
        label4.setStyle("-fx-text-fill : #000000; -fx-font-size : 20px; -fx-background-color : transparent");
        vbox4.getChildren().add(label4);

        Label description4 = new Label("Detail | Colorway : Lucid Blue | Article : (HQ8593) | Brand New in Box (BNIB) / Tag (BNWT) | Material : Yarn In Upper Contains At Least 50% Parley Ocean Plastic  and 50% Recycled Polyester, Regular Fit, Lace Closure, Soft Heel Fit, and Boost Midsole");
        description4.setStyle("-fx-text-fill : #808080; -fx-font-size : 14px");
        description4.setWrapText(true);
        VBox.setMargin(description4, new Insets(0, 0, 0, 15));
        vbox4.getChildren().add(description4);

        Label price4 = new Label("IDR 3.300.000");
        price4.setStyle("-fx-text-fill : #008000; -fx-font-size : 16px");
        VBox.setMargin(price4, new Insets(0, 0, 0, 15));
        vbox4.getChildren().add(price4);

        hbox4.getChildren().add(vbox4);
        root.getChildren().add(hbox4);

        /* ============================================================ SCROLL PANE ============================================================ */
        ScrollPane scroll = new ScrollPane(root);
        scroll.setFitToWidth(true);
        scroll.setFitToHeight(true);

        return scroll;
    }

    /* ============================================================ IMAGE VIEW ============================================================ */
    private static ImageView CreateImageView(String ImagePath) {
        Image image = new Image(ImagePath);
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(200);
        imageView.setFitHeight(200);
        imageView.setPreserveRatio(true);
        imageView.imageProperty().addListener((observable, oldValue, newValue) -> {
            if(newValue == null) {
                System.out.println("Gagal memuat gambar: " + ImagePath);
            }
        });
        return imageView;
    }
}
