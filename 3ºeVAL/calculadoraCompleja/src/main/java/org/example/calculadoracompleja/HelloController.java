package org.example.calculadoracompleja;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.lang.reflect.Method;
import java.net.URL;
import java.util.*;

public class HelloController implements Initializable {
    @FXML
    private Label pantalla;
    @FXML
    private Label pant3;
    @FXML
    private Label pant2;
    private boolean opera = false;
    private boolean hayPunto = false;
    private boolean esResultado = false;
    private String op1;
    private String op2;
    private String operador;
    private double resultado;
    private Operaciones operaciones = new Operaciones();
    @FXML
    Alert alert = new Alert(Alert.AlertType.ERROR);
    private void seteoNum(String num){


        if (pantalla.getText().equals("0") || esResultado || pantalla.getText().equals("-0")) {
            if (pantalla.getText().equals("-0")) {
                pantalla.setText("-"+num);
            }else {
                pantalla.setText(num);
            }
            esResultado = false;
        }else {
            pantalla.setText(pantalla.getText() + num);
        }

    }
    private void resetPunto(){
        hayPunto = false;
    }

    @FXML
    private void uno() {
        seteoNum("1");

    }
    private void seteoPant3(){
        pant3.setText(op1);
    }
    @FXML
    private void dos(){
     seteoNum("2");
    }
    @FXML
    private void tres(){
     seteoNum("3");
    }
    @FXML
    private void cuatro(){
     seteoNum("4");
    }
    @FXML
    private void cinco(){
       seteoNum("5");
    }
    @FXML
    private void seis(){
        seteoNum("6");
    }
    @FXML
    private void siete(){
       seteoNum("7");
    }
    @FXML
    private void ocho(){
       seteoNum("8");
    }
    @FXML
    private void nueve(){
    seteoNum("9");
    }
    @FXML
    private void cero(){
        seteoNum("0");

    }
    @FXML
    private void AC(){
        inicioApp();
        op1="";
        operador="";
        op2="";
        pant2.setText("");
        pant3.setText("");
        hayPunto = false;
    }
    @FXML
    private void posONeg() {
        if (!(pantalla.getText().charAt(0) + "").equals("-")) {
            pantalla.setText(("-" + pantalla.getText()));

        }else {
            pantalla.setText(pantalla.getText().replaceFirst("-",""));
        }
    }
    @FXML
    private void resto(){

        try {
            resetPunto();
            if (!opera){
                op1 = pantalla.getText();
            }
            inicioApp();
            operador = "resto";
            opera =true;
            pant2.setText("%");
            seteoPant3();
        }catch (Exception e){
            error();
        }
    }
    @FXML
    private void igual(){

        try {
            opera = false;
            resetPunto();
            if (operador == null || op1 == null || op1.equals("") || operador.equals("")) {
                alert.setTitle("Error");
                alert.setHeaderText("Venga Crack Vuelve a intentarlo");
                alert.setContentText("Selecciona un operador otra vez");

                alert.showAndWait();
            } else {

                if (esResultado){
                    op1 = pantalla.getText();
                }
                if (!esResultado){
                    op2 = pantalla.getText();
                }
                esResultado = true;
                Method metodo = Operaciones.class.getMethod(operador, double.class, double.class);
                try {
                    resultado = (double) metodo.invoke(operaciones, Double.parseDouble(op1), Double.parseDouble(op2));
                    pantalla.setText(String.valueOf(resultado));
                    pant3.setText(String.valueOf(resultado));
                }catch (Exception e){
                    error();
                }

            }

            }catch(Exception e){
                e.printStackTrace();
            }

    };
    @FXML
    private void punto(){
        if(!hayPunto) {
            if (pantalla.getText().equals("0") || esResultado) {
                pantalla.setText("0.");
                hayPunto = true;
            } else {
                pantalla.setText(pantalla.getText() + ".");
                hayPunto = true;
            }
        }
    }

    @FXML
    private void inicioApp() {
        //while (!pantalla.getText().equals("0") || !Objects.equals(pantalla.getText(), "")) {
            pantalla.setText("0");
            esResultado = false;

    }


    @FXML
    protected void error(){
        alert.setTitle("Error");
        alert.setHeaderText("Venga Crack Vuelve a intentarlo");
        alert.setContentText("");

        alert.showAndWait();
        AC();
    }

    @FXML
    protected void suma() {

        try {
                resetPunto();
                if (!opera){
                op1 = pantalla.getText();
                }
                inicioApp();
                operador = "suma";
                opera =true;
                pant2.setText("+");
                seteoPant3();
        }catch (Exception e){
            error();
        }
    }

    @FXML
    protected void resta() {

        try {
                resetPunto();
                if (!opera){
                op1 = pantalla.getText();
                }
                inicioApp();
                operador = "resta";
                opera =true;
                pant2.setText("-");
               seteoPant3();

        }catch (Exception e){
            error();
        }
    }

    @FXML
    protected void multiplicar() {

        try {
                resetPunto();
                if (!opera){
                    op1 = pantalla.getText();
                }
                inicioApp();
                    operador = "multiplica";
                opera =true;
                pant2.setText("X");
               seteoPant3();
        }catch (Exception e){
            error();
        }
    }

    @FXML
    protected void dividir() {

        try {
                resetPunto();
                if (!opera){
                    op1 = pantalla.getText();
                }
                inicioApp();
                operador = "divide";
                opera =true;
                pant2.setText("/");
             seteoPant3();

        }catch (Exception e){
            error();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        inicioApp();

    }
}