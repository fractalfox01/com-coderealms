package networktoolkit;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.LinkedList;
import java.util.List;


public class
NetworkAppWindowTemplate {
//import javafx.scene.layout.BorderPane

    /**
     * Setting up the objects that I'll be using for the testing phase.
     */
    private BorderPane mainFrame;
    private Button button1;
    private Button button2;
    private VBox header;
    private VBox verticalBody;
    private BorderPane body;
    private Label lblHeader;
    private Scene scene;

    public NetworkAppWindowTemplate(Stage primaryStage) {

        // Testing... this should probably be removed?
        // Creates a basic window.
        mainFrame = new BorderPane();
        header = new VBox();
        header.setPadding(new Insets(0, 75, 0, 75));
        body = new BorderPane();
        body.setPadding(new Insets(0, 75, 0, 75));
        mainFrame.getChildren().addAll(header, body);
        Scene scene = new Scene(mainFrame, 800, 800);
        primaryStage.setTitle("Testing window");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public NetworkAppWindowTemplate(Stage primaryStage, String title) {
        // this gets called by NetworkAppMain.
        // This should point to the Converter class someday.

        if (title.equalsIgnoreCase("CONVERTER")) {
            mainFrame = new BorderPane();
            mainFrame.setPadding(new Insets(0, 75, 0, 75));
            lblHeader = new Label();
            lblHeader.setText(title);
            header = new VBox(10);
            header.getChildren().addAll(lblHeader);
            header.setAlignment(Pos.CENTER);
            body = new BorderPane();
            mainFrame.setTop(header);
            mainFrame.setCenter(body);
            scene = new Scene(mainFrame, 500, 500);
            primaryStage.setTitle("CodeRealms - Network Converter");
            primaryStage.setScene(scene);
            primaryStage.show();

        }
        // This should be the Creator class someday.
        else if (title.equalsIgnoreCase("CREATOR")) {
            mainFrame = new BorderPane();
            mainFrame.setPadding(new Insets(0, 75, 0, 75));
            lblHeader = new Label();
            lblHeader.setText(title);
            header = new VBox(10);
            header.getChildren().addAll(lblHeader);
            header.setAlignment(Pos.CENTER);
            body = new BorderPane();
            mainFrame.setTop(header);
            mainFrame.setCenter(body);
            scene = new Scene(mainFrame, 500, 500);
            primaryStage.setTitle("CodeRealms - Network Creator");
            primaryStage.setScene(scene);
            primaryStage.show();
        }

        // This should point to the NetworkStart class.
        else if (title.equalsIgnoreCase("START")) {
            mainFrame = new BorderPane();
            mainFrame.setPadding(new Insets(0, 25, 0, 25));
            lblHeader = new Label();
            lblHeader.setText("Code Realms Network ToolKit");
            lblHeader.setTextFill(Color.LAVENDERBLUSH);
            lblHeader.setFont(Font.font(28));

            button1 = new Button();
            button1.setText("Converter");
            button1.setPrefSize(100, 20);
            button2 = new Button();
            button2.setText("Creator");
            button2.setPrefSize(100, 20);

            header = new VBox(10);
            header.getChildren().add(lblHeader);
            header.setAlignment(Pos.CENTER);

            verticalBody = new VBox(25);
            verticalBody.setPadding(new Insets(0, 10, 0, 10));
            verticalBody.getChildren().addAll(button1, button2);
            verticalBody.setAlignment(Pos.CENTER);

            mainFrame.setTop(header);
            mainFrame.setCenter(verticalBody);
            mainFrame.setBackground(new Background(new BackgroundFill(Color.LIGHTSEAGREEN, CornerRadii.EMPTY, Insets.EMPTY)));


            Scene scene = new Scene(mainFrame, 500, 500);
            primaryStage.setTitle("CodeRealms - Network Application");
            primaryStage.setScene(scene);
            primaryStage.show();

        }

    }

    public BorderPane getBody() {
        return body;
    }

    public BorderPane getMainFrame() {
        return mainFrame;
    }

    public Button getButton1() {
        return button1;
    }

    public Button getButton2() {
        return button2;
    }

    public Label getLblHeader() {
        return lblHeader;
    }

    public Scene getScene() {
        return scene;
    }

    public VBox getHeader() {
        return header;
    }

    public VBox getVerticalBody() {
        return verticalBody;
    }

    public void setBody(BorderPane body) {
        body = new BorderPane();

    }

    public void setButton1(Button button1) {
        button1 = new Button();
        button1.setText("Converter");

    }

    public void setButton2(Button button2) {
        this.button2 = button2;
    }

    public void setMainFrame(BorderPane mainFrame) {
        this.mainFrame = mainFrame;
    }

    public void setHeader(VBox header) {
        this.header = header;
    }

    public void setVerticalBody(VBox verticalBody) {
        this.verticalBody = verticalBody;
    }

    public void setLblHeader(Label lblHeader) {
        this.lblHeader = lblHeader;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
}