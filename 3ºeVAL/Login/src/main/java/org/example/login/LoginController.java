package org.example.login;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import org.example.login.DAO.ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginController {

    @FXML
    private ImageView candado;
    @FXML
    private Label succes;
    @FXML
    private TextField user;
    @FXML
    private PasswordField pass;
    @FXML
    private Button cerrar;
    public static boolean registroStatic;
    private static Stage registerStage;

    public static void setRegistroStage(){
        registerStage = null;
    }
    public static Stage getRegistroStage(){
        return registerStage;
    }

    @FXML
    private void logear(){
        String usuario = user.getText();
        String contrasenya = pass.getText();
        succes.setText("Comprobando datos, porfavor espere...");

        try {
            Connection conn = ConexionBD.getConnection();


            String sql = "SELECT username FROM cuentausuario where username=? and password=?";

            PreparedStatement stat = conn.prepareStatement(sql);

            stat.setString(1, usuario);
            stat.setString(2, contrasenya);

            ResultSet result = stat.executeQuery();


            if (result.next()) {
                succes.setText("Se ha logado exitosamente");
                candado.setImage(new Image("file:src/main/resources/lock_open.png"));

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("registro.fxml"));
                Parent pantalla = fxmlLoader.load();
                registerStage = new Stage();
                registerStage.setScene(new Scene(pantalla));
                registerStage.show();
                registroStatic = true;

                //Para que nos reconozca creamos una instancia del registro, si no login no reconocerá esta clase
                RegistroControler registroControlador = fxmlLoader.getController();
                //Con el this cambiamos Login que está creado en la otra clase, por esta.
                registroControlador.setLogin(this);


            }else {
                succes.setText("Usuario invalido. Vuelva a intentarlo");
                candado.setImage(new Image("file:src/main/resources/lock_close.png"));
            }

//
//            if (!result.wasNull()) {
//                result.next();
//            if (result.getString(4).equals(usuario) && result.getString(5).equals(contrasenya)){
//            succes.setText("Login valido, Bienvenido!");
//
//            }else {
//                succes.setText("Login incorrecto, intentalo de nuevo");
//            }
//        }else {
//                succes.setText("Login incorrecto, intentalo de nuevo");
//            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    @FXML
    private void cierra(){

        ConexionBD.closeConnection();


            Stage stage = (Stage) cerrar.getScene().getWindow();
            stage.close();


    }

    public void cambiaCerrado(){

        candado.setImage(new Image("file:src/main/resources/lock_close.png"));

    }



}