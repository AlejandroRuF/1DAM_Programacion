package org.example.calculadora1;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label sumar;
    private Operaciones operaciones = new Operaciones();
    @FXML
    private TextField op1;
    @FXML
    private TextField op2;
    @FXML
    Alert alert = new Alert(Alert.AlertType.ERROR);

    @FXML
    protected void error(){
        alert.setTitle("Error");
        alert.setHeaderText("Venga Crack Vuelve a intentarlo");
        alert.setContentText("Solo se admiten numeros");

        alert.showAndWait();
    }

    @FXML
    protected void suma() {

        try {
            sumar.setText(operaciones.suma(Double.parseDouble(op1.getText()), Double.parseDouble(op2.getText())) + "");
        }catch (Exception e){
          error();
        }
    }

    @FXML
    protected void resta() {

        try {
            sumar.setText(operaciones.resta(Double.parseDouble(op1.getText()), Double.parseDouble(op2.getText())) + "");
        }catch (Exception e){
           error();
        }
    }

    @FXML
    protected void multiplicar() {

        try {
            sumar.setText(operaciones.multiplica(Double.parseDouble(op1.getText()), Double.parseDouble(op2.getText())) + "");
        }catch (Exception e){
            error();
        }
    }

    @FXML
    protected void dividir() {

        try {
            sumar.setText(operaciones.divide(Double.parseDouble(op1.getText()), Double.parseDouble(op2.getText())) + "");
        }catch (Exception e){
           error();
        }
    }

}