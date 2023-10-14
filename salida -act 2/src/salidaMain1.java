/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Administrator
 */
public class salidaMain1 extends Application {
    
     
    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Line line = new Line();
        line.setStroke(Color.YELLOW);
        line.setStartX(100.0);
        line.setStartY(150.0);
        line.setEndX(500.0);
        line.setEndY(150.0);
        root.getChildren().add(line);
        
        Rectangle rect = new Rectangle(100,100);
        rect.setStroke(Color.BLUE);
         rect.setFill(Color.BLUE);
        rect.setLayoutX(250);
        rect.setLayoutY(50);
        rect.getStyleClass().add("my react");
        primaryStage.setTitle("ITP 133");
        Scene scene = new Scene (root, 600, 300);
        ((Group)scene.getRoot()).getChildren().add(rect);
        
        Circle c = new Circle();
        c.setStroke(Color.RED);
        c.setFill(Color.YELLOW);
        c.setCenterX(300);
        c.setCenterY(40);
        c.setRadius(40);
        ((Group)scene.getRoot()).getChildren().add(c);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
