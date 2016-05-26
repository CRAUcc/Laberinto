/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laberinto;


import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;


/**
 *
 * @author Rubenp
 */
public class Laberinto extends Application {
    //Declaracion de varibles goblales

    Movimiento mov=new Movimiento();
    Tablero t=new Tablero();
    
    @Override
    public void start(Stage stage) {
       
       Circle circle = t.createCircle();
       ArrayList<Rectangle> rectangleArrayList =t.createRecta();
       Group group = new Group(circle);

            //pintamos el arreglo de rectangulos en el panel
            group.getChildren().addAll(rectangleArrayList);
            //Creamos el scene el cual contiene la scena
            
            Scene scene = new Scene(group, 1000, 600, Color.DARKCYAN);
            //llamamos al metodo que esta en la clase movimiento
            mov.moveCircleOnKeyPress(scene, circle,rectangleArrayList);

        stage.setTitle("JavaFX Laberinto");
        stage.setScene(scene);
        stage.show();
    }

    //Metodo Principal
    public static void main(String[] args) {
        launch(args);
    }

}
