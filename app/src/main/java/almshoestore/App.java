
package almshoestore;

import javafx.animation.KeyFrame;
import javafx.animation.PauseTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

public class App extends Application {
    private Stage stage;
    public void start(Stage primaryStage) throws Exception{
        
        stage = primaryStage;      
        SceneAwal();
        stage.show();
    }


    private void SceneAwal(){
        Label label = new Label("  Welcome To");
        label.setStyle("-fx-font-family: 'Berlin Sans FB'; -fx-font-size: 25px; -fx-text-fill: white;");
        Label label2 = new Label("AlmShoeStore");
        label2.setStyle("-fx-font-family: 'Berlin Sans FB'; -fx-font-size: 35px; -fx-text-fill: white;");

        VBox vbox1 =new VBox(label,label2);
        vbox1.setAlignment(Pos.TOP_CENTER);
        
        Label label3 = new Label("Login Member");
        label3.setStyle("-fx-padding: 5px 25px;-fx-font-size: 30px; -fx-font-family: 'Times New Roman'; -fx-text-fill: BLACK;-fx-background-color: #348ca7; -fx-border-color: WHITE; -fx-border-width: 1px; -fx-border-radius: 5;");
        Label label4= new Label();
        VBox vbox2 = new VBox(10,label4,label3);
        vbox2.setAlignment(Pos.TOP_CENTER);

        TextField usernameField = new TextField();
        usernameField.setStyle("-fx-padding: 1px 32px;-fx-text-fill:BLACK;-fx-font-size: 15px;-fx-background-color: #777777; -fx-border-color: black; -fx-border-width: 1px; -fx-border-radius: 3;");
        usernameField.setPromptText("Username...");

        TextField passwordField = new TextField();
        passwordField.setStyle("-fx-padding: 1px 32px;-fx-text-fill:BLACK;-fx-font-size: 15px;-fx-background-color: #777777; -fx-border-color: black; -fx-border-width: 1px; -fx-border-radius: 3;");
        passwordField.setPromptText("Password...");

        HBox hbox1 = new HBox(usernameField);
        hbox1.setAlignment(Pos.CENTER);
        
        HBox hbox2 = new HBox(passwordField);
        hbox2.setAlignment(Pos.CENTER);

        Button button1 = new Button("SIGN IN");
        button1.setStyle("-fx-font-family: 'Berlin Sans FB';-fx-padding: 10px 95px;-fx-text-fill:BLACK;-fx-font-size: 15px;-fx-background-color: GREEN; -fx-border-color: black; -fx-border-width: 1px; -fx-border-radius: 2;");


        Label label5 = new Label("Not Have Account?");
        label5.setStyle("-fx-font-size: 10px; -fx-font-family: 'Times New Roman'; -fx-text-fill: BLACK;");

        Button button2 = new Button("REGISTER");
        button2.setStyle("-fx-font-family: 'Berlin Sans FB';-fx-text-fill:BLACK;-fx-font-size: 15px;-fx-background-color: BLUE; -fx-border-color: black; -fx-border-width: 1px; -fx-border-radius: 2;");

        Button button3 = new Button("EXIT");
        button3.setStyle("-fx-font-family: 'Berlin Sans FB';-fx-text-fill:BLACK;-fx-font-size: 15px;-fx-background-color: RED; -fx-border-color: black; -fx-border-width: 1px; -fx-border-radius: 2;");

        HBox hbox3 = new HBox(5,button2,button3);
        hbox3.setAlignment(Pos.CENTER);

        VBox asli = new VBox(10,vbox1,vbox2,hbox1,hbox2,button1,label5,hbox3);
        asli.setAlignment(Pos.CENTER);
        asli.setStyle("-fx-background-color:#0f6049;");
        // asli.getChildren().addAll(vbox1,vbox2,vbox3);
        
        Scene scene1 = new Scene(asli,500,500);
        stage.setTitle("AlmShoeStore");
        stage.setScene(scene1);

        passwordField.setOnAction(event -> button1.fire());

        button1.setOnAction(a->{SceneToko();});
        button2.setOnAction(a->{SceneRegister();});
        button3.setOnAction(a->{SceneExit();});
    }

    public void SceneKedua(){}

    private void SceneRegister() {
        Label registerLabel = new Label("REGISTER");
        registerLabel.setStyle("-fx-font-size: 30px; -fx-font-family: 'Times New Roman'; -fx-text-fill: BLACK;");
    
        TextField usernameField = new TextField();
        usernameField.setStyle("-fx-padding: 1px 32px;-fx-text-fill:BLACK;-fx-font-size: 15px;-fx-background-color: #777777; -fx-border-color: black; -fx-border-width: 1px; -fx-border-radius: 3;");
        usernameField.setPromptText("Username...");
    
        TextField passwordField = new TextField();
        passwordField.setStyle("-fx-padding: 1px 32px;-fx-text-fill:BLACK;-fx-font-size: 15px;-fx-background-color: #777777; -fx-border-color: black; -fx-border-width: 1px; -fx-border-radius: 3;");
        passwordField.setPromptText("Password...");
    
        Button registerButton = new Button("REGISTER");
        registerButton.setStyle("-fx-font-family: 'Berlin Sans FB';-fx-text-fill:BLACK;-fx-font-size: 15px;-fx-background-color: BLUE; -fx-border-color: black; -fx-border-width: 1px; -fx-border-radius: 2;");
    
        Button backButton = new Button("BACK");
        backButton.setStyle("-fx-font-family: 'Berlin Sans FB';-fx-text-fill:BLACK;-fx-font-size: 15px;-fx-background-color: RED; -fx-border-color: black; -fx-border-width: 1px; -fx-border-radius: 2;");
    
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.add(registerLabel, 0, 0, 2, 1);
        gridPane.add(usernameField, 0, 1);
        gridPane.add(passwordField, 0, 2);
        gridPane.add(registerButton, 0, 3);
        gridPane.add(backButton, 1, 3);

        registerButton.setOnAction(a -> {
            String username = usernameField.getText();
            String password = passwordField.getText();
        
            if (!username.isEmpty() && !password.isEmpty()) {
                if (password.matches("^(?=.*[a-zA-Z])(?=.*\\d).{8}$")) {
                    // Password memenuhi persyaratan
        
                    // Simpan logika untuk register di sini
        
                    // Tampilkan pesan register berhasil
                    Label successLabel = new Label("Registration Successful!");
                    successLabel.setStyle("-fx-font-size: 20px; -fx-text-fill: GREEN;");
                    gridPane.add(successLabel, 0, 4, 2, 1);
        
                    // Kembali ke scene awal setelah beberapa waktu
                    PauseTransition pause = new PauseTransition(Duration.seconds(2));
                    pause.setOnFinished(event -> SceneAwal());
                    pause.play();
                } else {
                    // Password tidak memenuhi persyaratan
                    Label errorLabel = new Label("Password must contain at least 1 letter, 1 digit, and have a length of 8 characters!");
                    errorLabel.setStyle("-fx-font-size: 15px; -fx-text-fill: RED;");
                    gridPane.add(errorLabel, 0, 4, 2, 1);
        
                    // Hilangkan pesan error setelah 5 detik
                    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(5), event -> {
                        gridPane.getChildren().remove(errorLabel);
                    }));
                    timeline.play();
                }
            } else {
                // Tampilkan pesan kesalahan jika username atau password kosong
                Label errorLabel = new Label("Please fill in both Username and Password fields!");
                errorLabel.setStyle("-fx-font-size: 15px; -fx-text-fill: RED;");
                gridPane.add(errorLabel, 0, 4, 2, 1);
        
                // Hilangkan pesan error setelah 5 detik
                Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(5), event -> {
                    gridPane.getChildren().remove(errorLabel);
                }));
                timeline.play();
            }
        });
        
        
    
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(gridPane);
        borderPane.setStyle("-fx-background-color:#0f6049;");
    
        Scene registerScene = new Scene(borderPane, 500, 500);
        stage.setScene(registerScene);

        passwordField.setOnAction(event -> registerButton.fire());
    
        backButton.setOnAction(a -> {
            SceneAwal();
        });
    }
    
    
    
    
    private void SceneExit(){
        stage.close();
    }

    private void SceneToko() {
        Label titleLabel = new Label("AlmShoeStore");
        titleLabel.setStyle("-fx-font-size: 30px; -fx-font-family: 'Times New Roman'; -fx-text-fill: BLACK;");

        ImageView sepatu1ImageView = new ImageView(new Image("Sepatu2.jpeg")); 
        sepatu1ImageView.setFitHeight(200);
        sepatu1ImageView.setFitWidth(250);
        Label sepatu1Label = new Label("Sepatu 1");
        sepatu1Label.setStyle("-fx-font-size: 15px; -fx-text-fill: BLACK;");

        ImageView sepatu2ImageView = new ImageView(new Image("Sepatu1.jpeg")); 
        sepatu2ImageView.setFitWidth(250);
        sepatu2ImageView.setFitHeight(200);
        Label sepatu2Label = new Label("Sepatu 2");
        sepatu2Label.setStyle("-fx-font-size: 15px; -fx-text-fill: BLACK;");

        // Tambahkan ImageView dan Label untuk sepatu lainnya sesuai kebutuhan

        Button keranjangButton = new Button("Keranjang");
        keranjangButton.setStyle("-fx-font-family: 'Berlin Sans FB'; -fx-text-fill: BLACK; -fx-font-size: 15px; -fx-background-color: YELLOW; -fx-border-color: black; -fx-border-width: 1px; -fx-border-radius: 2;");

        Button backButton = new Button("BACK");
        backButton.setStyle("-fx-font-family: 'Berlin Sans FB'; -fx-text-fill: BLACK; -fx-font-size: 15px; -fx-background-color: RED; -fx-border-color: black; -fx-border-width: 1px; -fx-border-radius: 2;");

        VBox sepatu1VBox = new VBox(10, sepatu1ImageView, sepatu1Label);
        sepatu1VBox.setAlignment(Pos.CENTER);

        VBox sepatu2VBox = new VBox(10, sepatu2ImageView, sepatu2Label);
        sepatu2VBox.setAlignment(Pos.CENTER);

        // Tambahkan VBox untuk sepatu lainnya sesuai kebutuhan

        VBox centerVBox = new VBox(20, titleLabel, sepatu1VBox, sepatu2VBox); // Tambahkan VBox untuk sepatu lainnya sesuai kebutuhan
        centerVBox.setAlignment(Pos.CENTER);

        HBox bottomHBox = new HBox(10, keranjangButton, backButton);
        bottomHBox.setAlignment(Pos.CENTER);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(titleLabel);
        borderPane.setCenter(centerVBox);
        borderPane.setBottom(bottomHBox);
        borderPane.setStyle("-fx-background-color:#0f6049;");

        Scene tokoScene = new Scene(borderPane, 500, 500);
        stage.setScene(tokoScene);

        backButton.setOnAction(a -> {
            SceneAwal();
        });
}

}