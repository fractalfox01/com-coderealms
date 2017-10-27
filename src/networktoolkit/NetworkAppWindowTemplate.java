package networktoolkit;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.Stage;



public class
NetworkAppWindowTemplate {
//import javafx.scene.layout.BorderPane

    /**
     *
     * Setting up the objects that I'll be using for the testing phase.
     *
     */
    BorderPane mainFrame;
    Button button1;
    Button button2;
    HBox header;
    VBox verticalBody;
    BorderPane body;
    Label lblHeader;
    Scene scene;

    public NetworkAppWindowTemplate(Stage primaryStage){

        // Testing... this should probably be removed?
        // Creates a basic window.
        mainFrame = new BorderPane();
        header = new HBox();
        header.setPadding(new Insets(0,75,0,75));
        body = new BorderPane();
        body.setPadding(new Insets(0,75,0,75));
        mainFrame.getChildren().addAll(header,body);
        Scene scene = new Scene(mainFrame, 800,800);
        primaryStage.setTitle("Testing window");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public NetworkAppWindowTemplate(Stage primaryStage, String title){

        // this gets called by NetworkAppMain.
        // This should point to the Converter class someday.
        if (title.equalsIgnoreCase("CONVERTER")) {
            mainFrame = new BorderPane();
            mainFrame.setPadding(new Insets(0, 75, 0, 75));
            lblHeader = new Label();
            lblHeader.setText(title);
            header = new HBox(10);
            header.getChildren().addAll(lblHeader);
            header.setAlignment(Pos.CENTER);
            body = new BorderPane();
            mainFrame.setTop(header);
            mainFrame.setCenter(body);
            scene = new Scene(mainFrame,500, 500);
            primaryStage.setTitle("CodeRealms - Network Converter");
            primaryStage.setScene(scene);
            primaryStage.show();

        }
        // This should be the Creator class someday.
        else if (title.equalsIgnoreCase("CREATOR")){
            mainFrame = new BorderPane();
            mainFrame.setPadding(new Insets(0, 75, 0, 75));
            lblHeader = new Label();
            lblHeader.setText(title);
            header = new HBox(10);
            header.getChildren().addAll(lblHeader);
            header.setAlignment(Pos.CENTER);
            body = new BorderPane();
            mainFrame.setTop(header);
            mainFrame.setCenter(body);
            scene = new Scene(mainFrame,500, 500);
            primaryStage.setTitle("CodeRealms - Network Creator");
            primaryStage.setScene(scene);
            primaryStage.show();
        }

        // This should point to the NetworkStart class.
        else if (title.equalsIgnoreCase("START")){
            mainFrame = new BorderPane();
            mainFrame.setPadding(new Insets(0,100,0,100));
            lblHeader = new Label();
            lblHeader.setText("Code Realms Presents:\nNetwork ToolKit");
            header = new HBox(10);
            header.getChildren().add(lblHeader);
            header.setAlignment(Pos.CENTER);
            button1 = new Button();
            button1.setText("Converter");
            button2 = new Button();
            button2.setText("Creator");
            verticalBody = new VBox(10);
            verticalBody.getChildren().addAll(button1, button2);
            mainFrame.getChildren().addAll(header, verticalBody);

            Scene scene = new Scene(mainFrame,500, 500);
            primaryStage.setTitle("CodeRealms - Network Application");
            primaryStage.setScene(scene);
            primaryStage.show();

        }



    }

}
