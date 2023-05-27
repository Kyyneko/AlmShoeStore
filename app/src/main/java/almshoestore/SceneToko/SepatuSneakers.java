package almshoestore.SceneToko;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class SepatuSneakers extends Scene {

    public SepatuSneakers(Parent root, double width, double height) {
        super(root, width, height);
        displayShoeImages((GridPane) root);
    }

    private void displayShoeImages(GridPane gridPane) {
        // Mengatur padding dan jarak antara gambar
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Membuat ImageView dan menambahkannya ke GridPane
        ImageView shoeImage1 = createShoeImageView("images/scenetoko/Sneakers/Sneakers1.jpg");
        gridPane.add(shoeImage1, 0, 0);

        ImageView shoeImage2 = createShoeImageView("images/scenetoko/Sneakers/Sneakers2.jpg");
        gridPane.add(shoeImage2, 1, 0);

        ImageView shoeImage3 = createShoeImageView("images/scenetoko/Sneakers/Sneakers3.jpg");
        gridPane.add(shoeImage3, 2, 0);

        ImageView shoeImage4 = createShoeImageView("images/scenetoko/Sneakers/Sneakers4.jpg");
        gridPane.add(shoeImage4, 0, 1);

        ImageView shoeImage5 = createShoeImageView("images/scenetoko/Sneakers/Sneakers5.jpg");
        gridPane.add(shoeImage5, 1, 1);
    }

    private ImageView createShoeImageView(String imagePath) {
        // Membuat ImageView dengan gambar sepatu
        Image image = new Image(imagePath);
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(200); // Mengatur lebar gambar
        imageView.setPreserveRatio(true); // Menjaga rasio aspek gambar

        return imageView;
    }
}
