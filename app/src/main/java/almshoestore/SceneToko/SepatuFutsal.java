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
            label.setText("Nike Mercurial Superfly 8 Club Tf");
            description.setText("Detail | Colorway : Black | Article : (CV0955-004) | Brand New in Box (BNIB) / Tag (BNWT) | Material The Nike Mercurial Superfly 8 Club Tf Combines Breathable And Flexible Materials For A Perfect Fit. The Rubber Outsole Provides Optimal Grip On Synthetic Surfaces.");
            price.setText("IDR 899.000");
            label.setOnAction(event -> {
                Pembayaran1();
            });
        } else if (i == 2) {
            label.setText("Nike Phantom Gt2 Academy Ic Indoor");
            description.setText("Detail | Colorway : Blue | Article : (DC0765-407) | Brand New in Box (BNIB) / Tag (BNWT) | Material Smooth Surface: Off-center Lacing Creates A Larger Sweet Spot For Powerful Strikes. Durable Design: Synthetic Leather Is Durable And Easy To Clean.");
            price.setText("IDR 1.199.000");
            label.setOnAction(event -> {
                Pembayaran2();
            });
        } else if (i == 3) {
            label.setText("Nike Phantom Gt2 Academy Tf");
            description.setText("Detail | Colorway : Black | Article : (DC0803-001) | Brand New in Box (BNIB) / Tag (BNWT) | Material | For Use On Shorter, Synthetic Surfaces | Non-marking Sole");
            price.setText("IDR 999.000");
            label.setOnAction(event -> {
                Pembayaran3();
            });
        } else if (i == 4) {
            label.setText("Nike Zoom Vapor 15 Academy Kylian Mbappe Tf");
            description.setText("Detail | Colorway : Dark Red | Article : (DV0708-694) | Brand New in Box (BNIB) / Tag (BNWT) | Material | Kylian Mbappé's Explosiveness, Plus His Twitchy Change Of Direction, Puts Him Firmly In The World Class Of Finishers. With Nods To His Heritage, This Cleat Is Made To Help You Play Just Like Km—with Blinding Pace And Purpose.");
            price.setText("IDR 1.299.000");
            label.setOnAction(event -> {
                Pembayaran4();
            });
        }
    }

    private static void Pembayaran4() {
        // Implementasi pembayaran untuk sepatu 4
    }

    private static void Pembayaran3() {
        // Implementasi pembayaran untuk sepatu 3
    }

    private static void Pembayaran2() {
        // Implementasi pembayaran untuk sepatu 2
    }

    private static void Pembayaran1() {
        // Implementasi pembayaran untuk sepatu 1
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
