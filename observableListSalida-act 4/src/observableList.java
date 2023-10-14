/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Administrator
 */
public class observableList extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
       FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML.fxml"));
       Parent root = loader.load();
       
       Scene scene = new Scene(root);
       primaryStage.setTitle("Observable Listt");
       primaryStage.setScene(scene);
       primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
