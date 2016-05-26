/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laberinto;

import java.util.ArrayList;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

/**
 *
 * @author administrador
 */
public class Movimiento {
        static final int      KEYBOARD_MOVEMENT_DELTA = 50;
        static final Duration TRANSLATE_DURATION      = Duration.seconds(0.25);
        Colisiones p=new Colisiones();
    
    public TranslateTransition createTranslateTransition(final Circle circle) {
        TranslateTransition transition = new TranslateTransition(TRANSLATE_DURATION, circle);
        transition.setOnFinished(new EventHandler<ActionEvent>() {
        @Override public void handle(ActionEvent t) {
            circle.setCenterX(circle.getTranslateX() + circle.getCenterX());
            circle.setCenterY(circle.getTranslateY() + circle.getCenterY());
            circle.setTranslateX(0);
            circle.setTranslateY(0);
        }
        });
        return transition;
    }
    public void moveCircleOnKeyPress(Scene scene, final Circle circle, ArrayList<Rectangle> rectangleArrayList) {

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override public void handle(KeyEvent event) {
                //se hace un switch para validar que tecla se oprimio y haga el movimiento

                switch (event.getCode()) {
                    case UP:  {
                        String dato="UP";
                        
                        circle.setCenterY(circle.getCenterY() - KEYBOARD_MOVEMENT_DELTA);
                        p.validar(dato,circle,rectangleArrayList);
                        
                    }break;
                    case RIGHT:{
                        String dato="RIGHT";
                        circle.setCenterX(circle.getCenterX() + KEYBOARD_MOVEMENT_DELTA);
                        p.validar(dato,circle,rectangleArrayList);
                        
                    }break;
                    case DOWN: {
                        String dato="DOWN";
                        circle.setCenterY(circle.getCenterY() + KEYBOARD_MOVEMENT_DELTA);
                        p.validar(dato,circle,rectangleArrayList);
                        
                    }break;
                    case LEFT: {
                        String dato="LEFT";
                        circle.setCenterX(circle.getCenterX() - KEYBOARD_MOVEMENT_DELTA);
                        p.validar(dato,circle,rectangleArrayList);
                        
                    }break;
                    
                    
                    }
                }
        });
    }
    
}
