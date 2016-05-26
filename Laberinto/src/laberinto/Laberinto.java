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
import javafx.scene.shape.Rectangle;
import javafx.animation.TranslateTransition; 
import javafx.scene.shape.Circle;


/**
 *
 * @author administrador
 */
public class Laberinto extends Application {
    
    Circle circle;
    ArrayList<Rectangle> rectangleArrayList;
    Movimiento mov=new Movimiento();
    TranslateTransition transition = mov.createTranslateTransition(circle);
    
    @Override
    public void start(Stage stage) {
       circle = createCircle();
       rectangleArrayList=createRecta();
       Group group = new Group(circle);

            //pintamos el arreglo de rectangulos en el panel
            group.getChildren().addAll(rectangleArrayList);
            //Creamos el scene el cual contiene la scena
            
            Scene scene = new Scene(group, 1000, 600, Color.DARKCYAN);
            mov.moveCircleOnKeyPress(scene, circle,rectangleArrayList);

        stage.setTitle("JavaFX Laberinto");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    public Circle createCircle() {
        circle = new Circle(25, 470, 15, Color.GREENYELLOW);
        circle.setOpacity(0.7);
        return circle;
    }
    public ArrayList<Rectangle> createRecta(){
        rectangleArrayList = new ArrayList<>();
        
            rectangleArrayList.add(new Rectangle (-50,0,50,600));
            rectangleArrayList.add(new Rectangle (0,-50,1000,50));
            rectangleArrayList.add(new Rectangle (950,0,50,600));
            rectangleArrayList.add(new Rectangle (0,550,900,50));
            
            
            rectangleArrayList.add(new Rectangle (50,50,50,450));
            rectangleArrayList.add(new Rectangle (100,50,150,50));
            rectangleArrayList.add(new Rectangle (200,100,50,100));
            rectangleArrayList.add(new Rectangle (150,150,50,50));
            rectangleArrayList.add(new Rectangle (150,250,50,300));
            rectangleArrayList.add(new Rectangle (300,0,50,200));
            rectangleArrayList.add(new Rectangle (200,250,150,50));
            rectangleArrayList.add(new Rectangle (200,450,150,50));
            rectangleArrayList.add(new Rectangle (250,350,50,50));
            rectangleArrayList.add(new Rectangle (300,300,50,100));
            rectangleArrayList.add(new Rectangle (400,0,50,450));
            rectangleArrayList.add(new Rectangle (400,500,50,50));
            
            
            rectangleArrayList.add(new Rectangle (500,300,50,300));
            rectangleArrayList.add(new Rectangle (450,50,200,50));
            rectangleArrayList.add(new Rectangle (600,100,50,100));
            rectangleArrayList.add(new Rectangle (450,150,100,50));
            rectangleArrayList.add(new Rectangle (500,200,50,50));
            
            rectangleArrayList.add(new Rectangle (550,300,100,50));
            rectangleArrayList.add(new Rectangle (600,250,50,50));
            rectangleArrayList.add(new Rectangle (600,350,50,50));
            rectangleArrayList.add(new Rectangle (550,450,100,50));
            
            rectangleArrayList.add(new Rectangle (650,250,100,50));
            rectangleArrayList.add(new Rectangle (650,150,50,50));
            rectangleArrayList.add(new Rectangle (650,350,50,50));
            
            rectangleArrayList.add(new Rectangle (750,100,50,100));
            rectangleArrayList.add(new Rectangle (750,250,50,100));
            rectangleArrayList.add(new Rectangle (750,350,50,50));
            
            rectangleArrayList.add(new Rectangle (750,250,50,100));
            
            rectangleArrayList.add(new Rectangle (850,0,50,400));
            rectangleArrayList.add(new Rectangle (700,50,200,50));
            rectangleArrayList.add(new Rectangle (700,450,250,50));
        
        return rectangleArrayList;
    }
    

   
    
}
