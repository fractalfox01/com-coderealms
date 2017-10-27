package networktoolkit;

import javafx.application.*;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;

import java.util.Scanner;

/**
 * This is the Main Entry point for all Classes contained within networktoolkit
 * Basically, what's going on here is:
 *      right now, this is in an extreme testing phase. If instantiating NetworkAppWindowTemplate through TWO parameters
 *      the environment of the application (i.e. layout) if decided through if...else... statements.
 *      these need to eventually point to their specific classes ( maybe, idk yet... bad design? ).
 *      Future: --> An Interface still needs to be written for NetworkAppWindowTemplate to implement.
 */
public class NetworkAppMain extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Acceptable Titles are ( "Start" , "Converter", "Creator" ).

        NetworkAppWindowTemplate firstTest = new NetworkAppWindowTemplate(primaryStage, "Start");
    }


    @Override
    public String toString() {
        String replace = this.getClass().getTypeName().replace("." + this.getClass().getSimpleName(), "");
        String modifiedToString = "Package: com.coderealms." + replace + "\nClass: --> " + this.getClass().getSimpleName() + "\n";
        return modifiedToString;
    }
}
