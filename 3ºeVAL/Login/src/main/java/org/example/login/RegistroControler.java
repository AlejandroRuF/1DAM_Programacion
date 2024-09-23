package org.example.login;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.example.login.DAO.ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RegistroControler {

    @FXML
    private TextField name;
    @FXML
    private TextField surname;
    @FXML
    private TextField uuser;
    @FXML
    private TextField pass;
    @FXML
    private TextField cpass;
    @FXML
    private Label advertencia;
    @FXML
    private Button Cerrar;
    private Connection conn = ConexionBD.getConnection();
    private LoginController login;
    private Stage registrarStage;

    public void setLogin(LoginController login) {
        this.login = login;
    }

    @FXML
    private void registrar(){

        boolean nombreOK = false;
        boolean apellidosOK = false;
        boolean usuarioOK = false;
        boolean contraOK = false;
        String nombre = "";
        String apellido = "";
        String usuario = "";
        String contrasenya = "";
        if (name.getText().isEmpty() || name.getText() == null){
            advertencia.setText("Rellena todos los campos");
        }else {
            nombre = name.getText();
            nombreOK = true;

        }
        if (surname.getText().isEmpty() || surname.getText() == null){
            advertencia.setText("Rellena todos los campos");
        }else {
            apellido = surname.getText();
            apellidosOK = true;
        }
        if (uuser.getText().isEmpty() || uuser.getText() == null){
            advertencia.setText("Rellena todos los campos");
        }else {
            usuario = uuser.getText();
            usuarioOK = true;
        }
        if (pass.getText().isEmpty() || pass.getText() == null){
            advertencia.setText("Rellena todos los campos");
        }else{
            if(pass.getText().equals(cpass.getText())){
                contrasenya = pass.getText();
                contraOK = true;
            }else {
                advertencia.setText("Las contraseñas deben coincidir");
            }
        }

        if (contraOK && nombreOK && apellidosOK && usuarioOK){
            try {
                boolean usuarioExiste = false;
                String sql = "Select username from cuentausuario";
                PreparedStatement stat = conn.prepareStatement(sql);
                ResultSet result = stat.executeQuery();

                while (result.next()){

                    if (result.getString(1).equals(usuario)){
                        usuarioExiste = true;
                    }

                }

                if (!usuarioExiste) {
                    String sql2 = "insert into cuentausuario (Nombre, Apellidos, username, password) values(?,?,?,?)";
                    stat = conn.prepareStatement(sql2);

                    stat.setString(1, nombre);
                    stat.setString(2, apellido);
                    stat.setString(3, usuario);
                    stat.setString(4, contrasenya);

                    int filasInsertadas = stat.executeUpdate();
                    if (filasInsertadas > 0) {
                        advertencia.setText("Registro agregado exitosamente");
                    } else {
                        advertencia.setText("Error al registrar");
                    }
                }else {
                    advertencia.setText("Usuario ya existente");
                }


            }catch (Exception e){
                System.out.println(e);
            }
        }
    }

    @FXML
    private void busqueda(){

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(LoginApplication.class.getResource("Busqueda.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Registro");
            stage.setScene(scene);
            stage.show();
        }catch (Exception e){
            System.out.println(e);
        }

    }

    @FXML
    private void cancelar(){
        registrarStage = LoginController.getRegistroStage();
        registrarStage.close();
        LoginController.setRegistroStage();
        if (login != null){

            login.cambiaCerrado();

        }


    }

}