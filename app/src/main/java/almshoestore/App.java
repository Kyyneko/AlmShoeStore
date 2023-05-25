
package almshoestore;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

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

        TextField textfield = new TextField();
        textfield.setStyle("-fx-padding: 1px 32px;-fx-text-fill:BLACK;-fx-font-size: 15px;-fx-background-color: #777777; -fx-border-color: black; -fx-border-width: 1px; -fx-border-radius: 3;");
        textfield.setPromptText("Username...");

        TextField textfield2 = new TextField();
        textfield2.setStyle("-fx-padding: 1px 32px;-fx-text-fill:BLACK;-fx-font-size: 15px;-fx-background-color: #777777; -fx-border-color: black; -fx-border-width: 1px; -fx-border-radius: 3;");
        textfield2.setPromptText("Password...");

        HBox hbox1 = new HBox(textfield);
        hbox1.setAlignment(Pos.CENTER);
        
        HBox hbox2 = new HBox(textfield2);
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

        button1.setOnAction(a->{SceneToko();});
        button2.setOnAction(a->{SceneRegister();});
        button3.setOnAction(a->{SceneExit();});



  

    }
    public void SceneKedua(){}
    public void SceneRegister(){}
    public void SceneExit(){}
    public void SceneToko(){}
}