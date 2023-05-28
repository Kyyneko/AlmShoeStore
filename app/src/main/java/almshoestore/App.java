
package almshoestore;

import almshoestore.SceneToko.SepatuFormal;
import almshoestore.SceneToko.SepatuFutsal;
import almshoestore.SceneToko.SepatuLari;
import almshoestore.SceneToko.SepatuSneakers;
import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App extends Application {


    
    private static Stage stage;
    public void start(Stage primaryStage) throws Exception{
        
        stage = primaryStage;     
        SceneAwal();
        stage.show();
        stage.getIcons().add(new Image("images/LogoAlm.png"));
    }
    private void SceneAwal(){
        Label label = new Label("  Welcome To");
        label.setStyle("-fx-font-family: 'Cambria'; -fx-font-size: 25px; -fx-text-color: #000000;");
        Label label2 = new Label("AlmShoeStore");
        label2.setStyle("-fx-font-family: 'Cambria'; -fx-font-size: 35px; -fx-text-color: #000000;");

        VBox vbox1 =new VBox(label,label2);
        vbox1.setAlignment(Pos.TOP_CENTER);

        ImageView fotoikon = new ImageView();
        String foto3 = "images/LogoAlm.png";
        Image image3 = new Image(foto3);
        fotoikon.setImage(image3);
        fotoikon.setFitHeight(150);
        fotoikon.setFitWidth(150);

        VBox foto = new VBox(0,fotoikon);
        foto.setAlignment(Pos.CENTER);
        
        Label label3 = new Label("Login Member");
        label3.setStyle("-fx-padding: 5px 25px;-fx-font-size: 30px; -fx-font-family: 'Times New Roman'; -fx-text-fill: BLACK;-fx-background-color: #FAEBD7; -fx-border-color: WHITE; -fx-border-width: 1px; -fx-border-radius: 5;");
        Label label4= new Label();
        VBox vbox2 = new VBox(10,label4,label3);
        vbox2.setAlignment(Pos.TOP_CENTER);

        TextField usernameField = new TextField();
        usernameField.setStyle("-fx-padding: 1px 32px;-fx-text-fill:#000000;-fx-font-size: 15px;-fx-background-color: WHITE; -fx-border-color: #000000; -fx-border-width: 1px; -fx-border-radius: 3;");
        usernameField.setPromptText("Username...");
        usernameField.setAlignment(Pos.CENTER);

        PasswordField passwordField = new PasswordField();
        passwordField.setStyle("-fx-padding: 1px 32px;-fx-text-fill:#000000;-fx-font-size: 15px;-fx-background-color: WHITE; -fx-border-color: #000000; -fx-border-width: 1px; -fx-border-radius: 3;");
        passwordField.setPromptText("Password...");
        passwordField.setAlignment(Pos.CENTER);

        HBox hbox1 = new HBox(usernameField);
        hbox1.setAlignment(Pos.CENTER);
        
        HBox hbox2 = new HBox(passwordField);
        hbox2.setAlignment(Pos.CENTER);

        Button button1 = new Button("SIGN IN");
        button1.setStyle("-fx-font-family: 'Cambria';-fx-padding: 10px 95px;-fx-text-fill:#FAEBD7;-fx-font-size: 15px;-fx-background-color: #006400; -fx-border-color: WHITE; -fx-border-width: 1px; -fx-border-radius: 2;");


        Button button4 = new Button("Not Have Account?");
        button4.setStyle("-fx-font-size: 10px; -fx-font-family: 'Times New Roman'; -fx-text-fill: BLACK;-fx-background-color: transparent");

        Button button2 = new Button("REGISTER");
        button2.setStyle("-fx-font-family: 'Cambria';-fx-text-fill:BLACK;-fx-font-size: 15px;-fx-background-color: #FAEBD7; -fx-border-color: #FAEBD7; -fx-border-width: 1px; -fx-border-radius: 2;");

        Button button3 = new Button("EXIT");
        button3.setStyle("-fx-font-family: 'Cambria';-fx-text-fill:RED;-fx-font-size: 15px;-fx-background-color: #FAEBD7; -fx-border-color: #FAEBD7; -fx-border-width: 1px; -fx-border-radius: 2;");

        HBox hbox3 = new HBox(5,button2,button3);
        hbox3.setAlignment(Pos.CENTER);

        VBox asli = new VBox(10,vbox1,foto,vbox2,hbox1,hbox2,button1,button4,hbox3);
        asli.setAlignment(Pos.CENTER);
        asli.setStyle("-fx-background-color:#DCDCDC;");
        // asli.getChildren().addAll(vbox1,vbox2,vbox3);
        
        Scene scene1 = new Scene(asli,620,620);
        stage.setTitle("AlmShoeStore");
        stage.setScene(scene1);

        passwordField.setOnAction(event -> button1.fire());

        button1.setOnAction(a->{SceneTokoAwal();});
        button2.setOnAction(a->{SceneRegister();});
        button3.setOnAction(a->{SceneExit();});
        button4.setOnAction(a->{SceneRegister();});
    }

    public void SceneKedua(){}

    private void SceneRegister() {
        Label registerLabel = new Label("REGISTER");
        registerLabel.setStyle("-fx-font-size: 30px; -fx-font-family: 'Times New Roman'; -fx-text-fill: BLACK;");

        Label kosong = new Label("");
        kosong.setAlignment(Pos.CENTER);
        
        HBox hbox = new HBox(registerLabel);
        hbox.setAlignment(Pos.CENTER);

        TextField usernameField = new TextField();
        usernameField.setStyle("-fx-padding: 1px 32px;-fx-text-fill:#000000;-fx-font-size: 15px;-fx-background-color: WHITE; -fx-border-color: #000000; -fx-border-width: 1px; -fx-border-radius: 3;");
        usernameField.setPromptText("Username...");
        usernameField.setAlignment(Pos.CENTER);
    
        PasswordField passwordField = new PasswordField();
        passwordField.setStyle("-fx-padding: 1px 32px;-fx-text-fill:#000000;-fx-font-size: 15px;-fx-background-color: WHITE; -fx-border-color: #000000; -fx-border-width: 1px; -fx-border-radius: 3;");
        passwordField.setPromptText("Password...");
        passwordField.setAlignment(Pos.CENTER);

        HBox hbox5 = new HBox(5,usernameField);
        hbox5.setAlignment(Pos.CENTER);

        HBox hbox6 = new HBox(5,passwordField);
        hbox6.setAlignment(Pos.CENTER);
    
        Button registerButton = new Button("REGISTER");
        registerButton.setStyle("-fx-font-family: 'Cambria';-fx-text-fill:WHITE;-fx-font-size: 15px;-fx-background-color: #006400; -fx-border-color: WHITE; -fx-border-width: 1px; -fx-border-radius: 2;");
    
        Button backButton = new Button("BACK");
        backButton.setStyle("-fx-font-family: 'Cambria';-fx-text-fill:RED;-fx-font-size: 15px;-fx-background-color: #FAEBD7; -fx-border-color: WHITE; -fx-border-width: 1px; -fx-border-radius: 2;");
    
        Label labelerror= new Label("");
        labelerror.setStyle("-fx-font-size: 10px; -fx-text-fill: RED;-fx-font-family: 'Berlin Sans FB';");
        labelerror.setAlignment(Pos.CENTER);

        HBox hbox2 = new HBox(5, registerButton,backButton);
        hbox2.setAlignment(Pos.CENTER);

        VBox vboxasli = new VBox(5,hbox,kosong,hbox5,hbox6,labelerror,hbox2);
        vboxasli.setAlignment(Pos.CENTER);
        vboxasli.setStyle("-fx-background-color:#DCDCDC;");
        
        registerButton.setOnAction(a -> {
            String username = usernameField.getText();
            String password = passwordField.getText();
        
                if (!username.isEmpty() && !password.isEmpty()) {
                    // ...
        
                    try {
                        // Buat koneksi ke database MySQL
                        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_accountmember", "root", "");
        
                        // Buat pernyataan SQL untuk menyimpan data ke database
                        String sql = "INSERT INTO tb_account (username, password) VALUES (?, ?)";
                        PreparedStatement statement = connection.prepareStatement(sql);
                        statement.setString(1, username);
                        statement.setString(2, password);
        
                        // Jalankan pernyataan SQL untuk menyimpan data ke database
                        int rowsInserted = statement.executeUpdate();
        
                        if (rowsInserted > 0) {
                            // Tampilkan pesan register berhasil
                            labelerror.setText("Registration Successful!");
        
                            // Kembali ke scene awal setelah beberapa waktu
                            PauseTransition pause = new PauseTransition(Duration.seconds(2));
                            pause.setOnFinished(event -> SceneAwal());
                            pause.play();
                        }
        
                        // Tutup koneksi dan statement
                        statement.close();
                        connection.close();
                    } catch (SQLException e) {
                        // Tangani exception jika terjadi kesalahan koneksi atau eksekusi SQL
                        e.printStackTrace();
                        labelerror.setText("Error: Failed to save data to database.");
                    }
                } else {
                    // ...
                }
            });
        
        
        
    
        Scene registerScene = new Scene(vboxasli, 620, 620);
        stage.setScene(registerScene);

        passwordField.setOnAction(event -> registerButton.fire());
    
        backButton.setOnAction(a -> {
            SceneAwal();
        });
    }
    
    private void SceneExit(){
        stage.close();
    }

    public Scene SceneTokoAwal() {
        Label judul = new Label("What Type Of Shoes Are You Looking For ?");
        judul.setStyle("-fx-font-size: 20px; -fx-font-family: 'CAMBRIA'; -fx-text-fill: BLACK; -fx-background-color : #0000");
        VBox vboxjudul = new VBox(0, judul);
        vboxjudul.setAlignment(Pos.CENTER);

        /* ============================================================ SEPATU SNEAKERS ============================================================ */
        Label label1 = new Label("Sepatu Sneakers");
        label1.setStyle("-fx-padding: 5px 25px;-fx-font-size: 20px; -fx-font-family: 'Times New Roman'; -fx-text-fill: BLACK;-fx-background-color: #23c7f0; -fx-border-color: WHITE; -fx-border-width: 1px; -fx-border-radius: 5;");
        
        ImageView sepatu1ImageView = new ImageView(new Image("images/scenetoko/Sneakers.jpg")); 
        sepatu1ImageView.setFitHeight(140);
        sepatu1ImageView.setFitWidth(175);

        Label label11 = new Label("Sepatu yang nyaman digunakan sehari-hari\nmemiliki desain yang sporty dan kasual");
        label11.setStyle("-fx-font-size: 12px; -fx-font-family: 'Times New Roman'; -fx-text-fill: BLACK;");

        Button button1 = new Button("CHECK");
        button1.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Cambria';-fx-text-fill:BLACK;-fx-font-size: 10px;-fx-background-color: #f89a0c; -fx-border-color: #FAEBD7; -fx-border-width: 1px; -fx-border-radius: 2;");

        VBox vbox1 = new VBox(5,label1,sepatu1ImageView,label11,button1);
        vbox1.setAlignment(Pos.CENTER);
        vbox1.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 10px 10px;");

        /* ============================================================ SEPATU FORMAL ============================================================ */
        Label label2 = new Label("  Sepatu Formal  ");
        label2.setStyle("-fx-padding: 5px 20px;-fx-font-size: 20px; -fx-font-family: 'Times New Roman'; -fx-text-fill: BLACK;-fx-background-color: #23c7f0; -fx-border-color: WHITE; -fx-border-width: 2px; -fx-border-radius: 5;");
        
        ImageView sepatu2ImageView = new ImageView(new Image("images/scenetoko/Formal.jpg")); 
        sepatu2ImageView.setFitHeight(140);
        sepatu2ImageView.setFitWidth(175);    Label label12 = new Label("Sepatu yang dipakai dalam acara-acara formal\nterbuat dari bahan kulit dengan desain elegan");
        label12.setStyle("-fx-font-size: 12px; -fx-font-family: 'Times New Roman'; -fx-text-fill: BLACK;");

        Button button2 = new Button("CHECK");
        button2.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Cambria';-fx-text-fill:BLACK;-fx-font-size: 10px;-fx-background-color: #f89a0c; -fx-border-color: #FAEBD7; -fx-border-width: 1px; -fx-border-radius: 2;");

        VBox vbox2 = new VBox(5,label2,sepatu2ImageView,label12,button2);
        vbox2.setAlignment(Pos.CENTER);
        vbox2.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 10px 10px;");

        /* ============================================================ SEPATU LARI ============================================================ */
        Label label3 = new Label("   Sepatu Lari   ");
        label3.setStyle("-fx-padding: 5px 25px;-fx-font-size: 20px; -fx-font-family: 'Times New Roman'; -fx-text-fill: BLACK;-fx-background-color: #23c7f0; -fx-border-color: WHITE; -fx-border-width: 2px; -fx-border-radius: 5;");
        
        ImageView sepatu3ImageView = new ImageView(new Image("images/scenetoko/Lari1.jpg")); 
        sepatu3ImageView.setFitHeight(140);
        sepatu3ImageView.setFitWidth(175);

        Label label13 = new Label("Dirancang khusus untuk aktivitas lari\nmemiliki desain ringan dan fleksibel");
        label13.setStyle("-fx-font-size: 12px; -fx-font-family: 'Times New Roman'; -fx-text-fill: BLACK;");

        Button button3 = new Button("CHECK");
        button3.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Cambria';-fx-text-fill:BLACK;-fx-font-size: 10px;-fx-background-color: #f89a0c; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 2;");

        VBox vbox3 = new VBox(5,label3,sepatu3ImageView,label13,button3);
        vbox3.setAlignment(Pos.CENTER);
        vbox3.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 10px 10px;");

        /* ============================================================ SEPATU FUTSAL ============================================================ */
        Label label4 = new Label("   Sepatu Futsal   ");
        label4.setStyle("-fx-padding: 5px 25px;-fx-font-size: 20px; -fx-font-family: 'Times New Roman'; -fx-text-fill: BLACK;-fx-background-color: #23c7f0; -fx-border-color: WHITE; -fx-border-width: 2px; -fx-border-radius: 5;");
        
        ImageView sepatu4ImageView = new ImageView(new Image("images/scenetoko/Futsal.jpg")); 
        sepatu4ImageView.setFitHeight(140);
        sepatu4ImageView.setFitWidth(175);

        Label label14 = new Label("Sepatu khusus untuk bermain futsal\nmemiliki sol yang datar dan tipis");
        label14.setStyle("-fx-font-size: 12px; -fx-font-family: 'Times New Roman'; -fx-text-fill: BLACK;");

        Button button4 = new Button("CHECK");
        button4.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Cambria';-fx-text-fill:BLACK;-fx-font-size: 10px;-fx-background-color: #f89a0c; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 2;");

        VBox vbox4 = new VBox(5,label4,sepatu4ImageView,label14,button4);
        vbox4.setAlignment(Pos.CENTER);
        vbox4.setStyle("-fx-background-color: #dcdcdca5;-fx-padding: 10px 10px;");

        /* ============================================================ LAYOUT ============================================================ */
        VBox vbox5 = new VBox();
        vbox5.setAlignment(Pos.CENTER);

        Button button5 = new Button("EXIT");
        button5.setStyle("-fx-padding: 3px 25px;-fx-font-family: 'Cambria';-fx-text-fill:RED;-fx-font-size: 10px;-fx-background-color: #f89a0c; -fx-border-color: #FAEBD7; -fx-border-width: 2px; -fx-border-radius: 2;");
        vbox5.getChildren().add(button5);
        VBox.setMargin(button5, new Insets(0, 10, 0, 0));
        
        HBox hbox1 = new HBox(15, vbox1,vbox2);
        hbox1.setAlignment(Pos.CENTER);
        
        HBox hbox2 = new HBox(15, vbox3,vbox4);
        hbox2.setAlignment(Pos.CENTER);

        VBox utama = new VBox(10, vboxjudul,hbox1,hbox2,vbox5);
        // utama.setStyle("-fx-background-color:#DCDCDC;");
        
        Scene tokoScene = new Scene(utama, 620, 620);
        stage.setScene(tokoScene);

    
    /* ============================================================ BUTTON ACTION ============================================================ */
    button1.setOnAction(event -> {
        SepatuSneakers sceneSepatuSneakers = new SepatuSneakers(utama, 620, 620);
        Stage stage = (Stage) button1.getScene().getWindow(); 
        stage.setScene(sceneSepatuSneakers); 
    });
    button1.setOnMouseEntered(event -> {
        stage.getScene().setCursor(Cursor.HAND);
    });
    
    button1.setOnMouseExited(event -> {
        stage.getScene().setCursor(Cursor.DEFAULT);
    });

    button2.setOnAction(event -> {
        SepatuFormal sceneSepatuFormal = new SepatuFormal(utama, 620, 620);
        Stage stage = (Stage) button2.getScene().getWindow(); 
        stage.setScene(sceneSepatuFormal); 
    });
    button2.setOnMouseEntered(event -> {
        stage.getScene().setCursor(Cursor.HAND);
    });
    
    button2.setOnMouseExited(event -> {
        stage.getScene().setCursor(Cursor.DEFAULT);
    });

    button3.setOnAction(event -> {
        SepatuLari scenSepatuLari = new SepatuLari(utama, 620, 620);
        Stage stage = (Stage) button3.getScene().getWindow();
        stage.setScene(scenSepatuLari);
    });
    button3.setOnMouseEntered(event -> {
        stage.getScene().setCursor(Cursor.HAND);
    });
    
    button3.setOnMouseExited(event -> {
        stage.getScene().setCursor(Cursor.DEFAULT);
    });

    button4.setOnAction(event -> {
        SepatuFutsal sceneSepatuFutsal = new SepatuFutsal(utama, 620, 620);
        Stage stage = (Stage) button4.getScene().getWindow(); 
        stage.setScene(sceneSepatuFutsal); 
    });
    button4.setOnMouseEntered(event -> {
        stage.getScene().setCursor(Cursor.HAND);
    });
    
    button4.setOnMouseExited(event -> {
        stage.getScene().setCursor(Cursor.DEFAULT);
    });

    button5.setOnAction(event -> {
        stage.close();
    });
    button5.setOnMouseEntered(event -> {
        stage.getScene().setCursor(Cursor.HAND);
    });
    
    button5.setOnMouseExited(event -> {
        stage.getScene().setCursor(Cursor.DEFAULT);
    });

    return tokoScene;  
}
}

/*Label titleLabel = new Label("AlmShoeStore");
titleLabel.setAlignment(Pos.TOP_CENTER);
titleLabel.setStyle("-fx-font-size: 25px; -fx-font-family: 'CAMBRIA'; -fx-text-fill: BLACK; -fx-background-color : #0000");

ImageView sepatu1ImageView = new ImageView(new Image("images/Sepatu2.jpeg")); 
sepatu1ImageView.setFitHeight(140);
sepatu1ImageView.setFitWidth(175);
Label sepatu1Label = new Label("Sepatu 1");
sepatu1Label.setStyle("-fx-font-size: 15px; -fx-text-fill: BLACK;");

ImageView sepatu2ImageView = new ImageView(new Image("images/Sepatu1.jpeg")); 
sepatu2ImageView.setFitWidth(200);
sepatu2ImageView.setFitHeight(200);
Label sepatu2Label = new Label("Sepatu 2");
sepatu2Label.setStyle("-fx-font-size: 15px; -fx-text-fill: BLACK;");

// Tambahkan ImageView dan Label untuk sepatu lainnya sesuai kebutuhan

Button keranjangButton = new Button("Keranjang");
keranjangButton.setStyle("-fx-font-family: 'Berlin Sans FB'; -fx-text-fill: BLACK; -fx-font-size: 15px; -fx-background-color: YELLOW; -fx-border-color: black; -fx-border-width: 1px; -fx-border-radius: 2;");

Button backButton = new Button("BACK");
backButton.setStyle("-fx-font-family: 'Berlin Sans FB'; -fx-text-fill: BLACK; -fx-font-size: 15px; -fx-background-color: RED; -fx-border-color: black; -fx-border-width: 1px; -fx-border-radius: 2;");

HBox titleHBox = new HBox(titleLabel);
titleHBox.setAlignment(Pos.TOP_CENTER);

HBox sepatu1HBox = new HBox(10, sepatu1ImageView, sepatu1Label);
sepatu1HBox.setAlignment(Pos.CENTER_LEFT);

HBox sepatu2HBox = new HBox(10, sepatu2ImageView, sepatu2Label);
sepatu2HBox.setAlignment(Pos.CENTER_LEFT);


// Tambahkan VBox untuk sepatu lainnya sesuai kebutuhan

VBox centerVBox = new VBox(10, sepatu1HBox, sepatu2HBox); // Tambahkan VBox untuk sepatu lainnya sesuai kebutuhan
centerVBox.setAlignment(Pos.CENTER);

HBox bottomHBox = new HBox(10, keranjangButton, backButton);
bottomHBox.setAlignment(Pos.CENTER);

BorderPane borderPane = new BorderPane();
borderPane.setTop(titleHBox);
borderPane.setCenter(centerVBox);
borderPane.setBottom(bottomHBox);
borderPane.setStyle("-fx-background-color:#DCDCDC ;");

Scene tokoScene = new Scene(borderPane, 620, 620);
stage.setScene(tokoScene);

backButton.setOnAction(a -> {
    SceneAwal();
});*/