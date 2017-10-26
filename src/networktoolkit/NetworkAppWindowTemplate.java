package networktoolkit;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.awt.*;

public class NetworkAppWindowTemplate {
//import javafx.scene.layout.BorderPane

    BorderPane mainFrame;
    HBox header;
    BorderPane body;
    Label lblHeader;

    public NetworkAppWindowTemplate(Stage primaryStage){

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
        mainFrame = new BorderPane();
        mainFrame.setPadding(new Insets (0,75,0,75));
        lblHeader = new Label();
        lblHeader.setText(title);
        header = new HBox(10);
        header.getChildren().addAll(lblHeader);
        header.setAlignment(Pos.CENTER);
        body = new BorderPane();
        mainFrame.setTop(header);
        mainFrame.setCenter(body);

        Scene scene = new Scene(mainFrame,500, 500);

        primaryStage.setTitle("CodeRealms - Network Application");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

}
