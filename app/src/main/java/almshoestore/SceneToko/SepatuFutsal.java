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

public class SepatuFutsal extends Scene {

    public SepatuFutsal(Parent root, double width, double height) {
        super(root(), width, height);
        
    }

    private static Parent root() {
        VBox root = new VBox();
        root.setPadding(new Insets(10));
        root.setSpacing(10);

        Button backButton = new Button("BACK");
        backButton.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #000000; -fx-font-size : 16px");
        root.getChildren().add(backButton);

        /* Shoes 1 */
        HBox hbox1 = new HBox();
        hbox1.setSpacing(10);

        VBox vbox1 = new VBox();
        vbox1.setSpacing(10);

        ImageView shoeImage1 =  CreateImageView("images/scenetoko/ShoeFutsal/Futsal1.jpg");
        hbox1.getChildren().add(shoeImage1);

        Button label1 = new Button("MILLS Sepatu Futsal Herzone IN JR Red / Navy / Cyan 9800101");
        label1.setStyle("-fx-text-fill: #000000; -fx-font-size: 20px; -fx-font-family: 'Cambria'; -fx-background-color: transparent");
        vbox1.getChildren().add(label1);

        Label description1 = new Label("Mills Aeromesh adalah teknologi upper yang menggunakan material mesh berbahan dasar polyester yang dikomputerisasi dengan tingkat gramasi yang sudah disesuaikan sehingga menciptkan material yang ringan, kuat dan memiliki sirkulasi udara yang sangat baik.");
        description1.setStyle("-fx-text-fill : #808080; -fx-font-size : 14px");
        description1.setWrapText(true);
        VBox.setMargin(description1, new Insets(0, 0, 0, 15));
        vbox1.getChildren().add(description1);

        Label price1 = new Label("IDR 329.000");
        price1.setStyle("-fx-text-fill : #008000; -fx-font-size : 16px");
        VBox.setMargin(price1, new Insets(0, 0, 0, 15));
        vbox1.getChildren().add(price1);

        hbox1.getChildren().add(vbox1);
        root.getChildren().add(hbox1);

        /* Shoes 2 */
        HBox hbox2 = new HBox();
        hbox2.setSpacing(10);

        VBox vbox2 = new VBox();
        vbox2.setSpacing(10);

        ImageView shoeImage2 = CreateImageView("images/scenetoko/ShoeFutsal/Futsal2.jpg");
        hbox2.getChildren().add(shoeImage2);

        Button label2 = new Button("MILLS Sepatu Futsal Herzone IN JR Yellow / Orange / Navy 9800102");
        label2.setStyle("-fx-text-fill : #000000; -fx-font-size : 20px; -fx-font-family : 'Cambria'; -fx-background-color : transparent");
        vbox2.getChildren().add(label2);

        Label description2 = new Label("MILLS HDT-R / High Density Traction Rubber adalah teknologi outsole berbahan campuran karet murni dan bahan kimia sehingga menghasilkan outsole yang dapat mencengram dengan, memiliki abrasi yang baik dan non marking / tidak meninggalkan bekas.");
        description2.setStyle("-fx-text-fill : #808080; -fx-font-size : 14px");
        description2.setWrapText(true);
        VBox.setMargin(description2, new Insets(0, 0, 0, 15));
        vbox2.getChildren().add(description2);

        Label price2 = new Label("IDR 329.000");
        price2.setStyle("-fx-text-fill : #008000; -fx-font-size : 16px");
        VBox.setMargin(price2, new Insets(0, 0, 0, 15));
        vbox2.getChildren().add(price2);

        hbox2.getChildren().add(vbox2);
        root.getChildren().add(hbox2);


        /* Scroll Pane */
        ScrollPane scroll = new ScrollPane(root);
        scroll.setFitToWidth(true);
        scroll.setFitToHeight(true);

        return scroll;

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


