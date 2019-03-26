/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author Francisco de Asís Domínguez Iceta <toteskuu@gmail.com>
 */
public class FXMLDocumentController implements Initializable {

    private Label label;
    @FXML
    private Button btnCalcular;
    @FXML
    private ImageView ivPlanta;

    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }

    @FXML
    private void calcular(ActionEvent event) {
        System.out.println(ivPlanta.getX());
        System.out.println(ivPlanta.getY());
        ivPlanta.setLayoutX(300);
        ivPlanta.setLayoutY(200);

    }

    @FXML
    private void mover(KeyEvent event) {
        KeyCode kc = event.getCode();
        if (kc == kc.W) {
            ivPlanta.setLayoutY(ivPlanta.getLayoutY() - 10);
                    
        } else if (kc == kc.S) {
            ivPlanta.setLayoutY(ivPlanta.getLayoutY() + 10);
        } else if (kc == kc.A) {
            ivPlanta.setLayoutX(ivPlanta.getLayoutX() - 10);
        } else if (kc == kc.D) {
            ivPlanta.setLayoutX(ivPlanta.getLayoutX() + 10);
        } else {
            String letra = kc.getName();
            System.out.println("La letra es: " + letra);
        }
    }

}
