package networktoolkit;

import javafx.application.*;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;

import java.util.Scanner;

public class NetworkAppMain extends Application {

    public static void main(String[] args) {
        launch(args);
        System.out.println("hello");
    }


    public NetworkAppMain() {
        System.out.println(this.getClass().getSimpleName() + " instance is null\n");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        NetworkAppWindowTemplate newWindow = new NetworkAppWindowTemplate(primaryStage, "Does it work?");
    }


    @Override
    public String toString() {
        String replace = this.getClass().getTypeName().replace("." + this.getClass().getSimpleName(), "");
        String modifiedToString = "Package: com.coderealms." + replace + "\nClass: --> " + this.getClass().getSimpleName() + "\n";
        return modifiedToString;
    }
}
