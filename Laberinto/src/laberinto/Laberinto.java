/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laberinto;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.animation.FillTransition; 
import javafx.animation.Timeline; 
import javafx.animation.ParallelTransition; 
import javafx.animation.RotateTransition; 
import javafx.animation.ScaleTransition; 
import javafx.animation.TranslateTransition; 
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.util.Duration;

/**
 *
 * @author administrador
 */
public class Laberinto extends Application {
    
    Image img, img2, fuego;
    int code,  x=115, y=110;
    String dato="";
    int vel=5;
    
    @Override
    public void start(Stage stage) {
       Group root = new Group();
       Scene scene = new Scene(root, 450, 500, Color.DARKCYAN);
       
        //Creamos  el panel que tiene lo botones
        GridPane panel=new GridPane();
       
        //contenido del laberinto
        Rectangle r = new Rectangle (50,50,50,450);
        Rectangle r2 = new Rectangle (100,50,150,50);
        Rectangle r3 = new Rectangle (200,100,50,100);
        Rectangle r4 = new Rectangle (150,150,50,50);
        Rectangle r5 = new Rectangle (150,250,50,300);
        Rectangle r6 = new Rectangle (300,0,50,200);
        Rectangle r7 = new Rectangle (200,250,150,50);    
        Rectangle r8 = new Rectangle (200,450,150,50);
        Rectangle r9 = new Rectangle (250,350,50,50);
        Rectangle r10 = new Rectangle (300,300,50,100);
        Rectangle r15 = new Rectangle (400,0,50,450);
        
        Rectangle r11 = new Rectangle (10,470,30,30);
        
        
        
        //Agregamos todo a la pantalla
        root.getChildren().add(r);
        root.getChildren().add(r2); 
        root.getChildren().add(r3); 
        root.getChildren().add(r4); 
        root.getChildren().add(r5); 
        root.getChildren().add(r6);
        root.getChildren().add(r7);
        root.getChildren().add(r8);
        root.getChildren().add(r9);
        root.getChildren().add(r10);
        root.getChildren().add(r11);
        root.getChildren().add(r15);
        
        //color rectangulos
        r.setFill(Color.GREENYELLOW);
        r3.setFill(Color.GREENYELLOW);
        r7.setFill(Color.GREENYELLOW);
        r8.setFill(Color.GREENYELLOW);
        r9.setFill(Color.GREENYELLOW);
                    
       stage.setTitle("JavaFX Laberinto");
       stage.setScene(scene);
       stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        Laberinto p=new Laberinto();
        p.initcomponents();
    }
    
    //metodo captura el teclado
    void initcomponents(){  
        System.out.println("Entro al metodo");
        addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent evt){
                formKeyPressed(evt);
            }            
        });                
    }
    
    public void formKeyPressed(KeyEvent evt){
        code=evt.getKeyCode(); //obtiene codigo de la tecla presionada
        dato=evt.getKeyText(code); //obtiene el nombre de la tecla presionada
        System.out.println(dato);
        mover(dato);
    }
    
        public void mover(String dato) {
        if(dato.equalsIgnoreCase("Derecha")){
            x+=5;  
            y+=0;
        }
        if(dato.equalsIgnoreCase("Izquierda")){
            x-=5; 
            y+=0;
        }
        if(dato.equalsIgnoreCase("Arriba")){
            x-=0; 
            y-=5;
        }
        if(dato.equalsIgnoreCase("Inactivo")){
            x-=0; 
            y+=5;
        }
              
        //repaint();   
    }
    
}
