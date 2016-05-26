/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laberinto;

import javafx.scene.control.Alert;

/**
 *
 * @author administrador
 */
public class Ganador {
    public void win(double EjeX, double EjeY){
         System.out.println("x"+EjeX);
         System.out.println("y"+EjeY);
     if (EjeX==925.0 && EjeY==570.0){
            System.out.println("Usted Gano");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("congratulations");
            alert.setHeaderText(null);
            alert.setContentText("Usted es el Ganador!!!!");
            alert.showAndWait();

            
         }
     }
}
