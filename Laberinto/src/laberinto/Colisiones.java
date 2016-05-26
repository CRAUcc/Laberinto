/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laberinto;

import java.util.ArrayList;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

/**
 *
 * @author RubenP
 */
public class Colisiones {
    double EjeX;
    double EjeY;
    static final int KEYBOARD_MOVEMENT_DELTA = 50;
    
    Ganador win=new Ganador();
    public void validar (String dato,final Circle circle,ArrayList<Rectangle> rectangleArrayList){
         EjeX=circle.getCenterX();
         EjeY=circle.getCenterY();
         win.win(EjeX,EjeY);

         try {
            for (int i=0;i<=35;i++){

            Rectangle rec;
            rec = rectangleArrayList.get(i);
            Shape inter = Shape.intersect(circle ,rec);
            if(inter.getLayoutBounds().getHeight()<=0 || inter.getLayoutBounds().getWidth()<=0) {
            }
            else {
                switch (dato) {
                    case "UP":  {

                        circle.setCenterY(circle.getCenterY() + KEYBOARD_MOVEMENT_DELTA);
                        
                        
                    }break;
                    case "RIGHT":{

                        circle.setCenterX(circle.getCenterX() - KEYBOARD_MOVEMENT_DELTA);
                        
                    }break;
                    case "DOWN": {

                        circle.setCenterY(circle.getCenterY() - KEYBOARD_MOVEMENT_DELTA);
                        
                    }break;
                    case "LEFT": {

                        circle.setCenterX(circle.getCenterX() + KEYBOARD_MOVEMENT_DELTA);
                        
                    }break;
                }
                
            break;
            }
            
            }
            
             
         } catch (Exception e) {
         }
         
}
}
