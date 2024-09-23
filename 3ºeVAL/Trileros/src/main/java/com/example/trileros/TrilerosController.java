package com.example.trileros;

import com.example.trileros.DAO.ConexionBD;
import com.example.trileros.DTO.Usuarios;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class TrilerosController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    private Button boton1;
    @FXML
    private Button boton2;
    @FXML
    private Button boton3;
    @FXML
    private TableView tablaUsuarios;
    @FXML
    private TableColumn usuario;
    @FXML
    private TableColumn aciertos;
    @FXML
    private TableColumn errores;
    @FXML
    private TextField nuevoUsuario1;
    @FXML
    private Label alerta;
    @FXML
    private Button actualiza;

    ObservableList<Usuarios> UsuariosList = FXCollections.observableArrayList();
    private Connection conn;

    private File fileAcierto = new File("src/main/resources/circle64.png");
    private Image transformAcierto = new Image(fileAcierto.toURI().toString());
    private ImageView imgAcierto = new ImageView(transformAcierto);



    public ImageView imagenError(){

        File fileError = new File("src/main/resources/error64.png");
        Image transformError = new Image(fileError.toURI().toString());
        ImageView imgError = new ImageView(transformError);

        return imgError;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        conn = ConexionBD.getConnection();
        asignarBotones();

    }


    public void verTablas(){
        UsuariosList = FXCollections.observableArrayList();
        String sql = "select usuario, aciertos, errores from usuarios";

        try{

            Statement stat = conn.createStatement();
            ResultSet resul = stat.executeQuery(sql);

            while(resul.next()) {

                String getusuario = resul.getString("usuario");
                Integer getaciertos = resul.getInt("aciertos");
                Integer geterrores = resul.getInt("errores");

                UsuariosList.add(new Usuarios(getusuario, getaciertos, geterrores));
            }
                usuario.setCellValueFactory(new PropertyValueFactory<Usuarios, String>("usuario"));
                aciertos.setCellValueFactory(new PropertyValueFactory<Usuarios, Integer>("aciertos"));
                errores.setCellValueFactory(new PropertyValueFactory<Usuarios, Integer>("errores"));

            for(Usuarios usuario : UsuariosList){
                System.out.println(usuario.getUsuario()+ usuario.getAciertos()+ usuario.getErrores());
            }

            tablaUsuarios.setItems(UsuariosList);

            usuario.setSortType(TableColumn.SortType.ASCENDING);
            tablaUsuarios.getSortOrder().add(usuario);

        }catch (Exception e){
            System.out.println(e.getMessage());        }

    }

    public void asignarBotones(){

        int premio = (int) (Math.random()*3);

        boton1.setGraphic(imagenError());
        boton2.setGraphic(imagenError());
        boton3.setGraphic(imagenError());

        if (premio == 0){
            boton1.setGraphic(imgAcierto);
        } else if (premio == 1) {
            boton2.setGraphic(imgAcierto);
        }else {
            boton3.setGraphic(imgAcierto);
        }

        boton1.setOpacity(0.0);
        boton2.setOpacity(0.0);
        boton3.setOpacity(0.0);
        boton2.setDisable(false);
        boton3.setDisable(false);
        boton1.setDisable(false);

    }

    public void acierto(){
        String sqlSelect = "SELECT usuario FROM usuarios WHERE usuario = ?";
        String sqlUpdate = "UPDATE usuarios SET aciertos = aciertos + 1 WHERE usuario = ?";
        String sqlInsert = "INSERT INTO usuarios(usuario, aciertos, errores) VALUES (?, ?, 0)";

        try {
            // Preparar la consulta de selección
            PreparedStatement pstatSelect = conn.prepareStatement(sqlSelect);
            pstatSelect.setString(1, nuevoUsuario1.getText());

            ResultSet resul = pstatSelect.executeQuery();

            if (resul.next()) {
                // El usuario existe, actualizar los aciertos
                PreparedStatement pstatUpdate = conn.prepareStatement(sqlUpdate);
                pstatUpdate.setString(1, nuevoUsuario1.getText());
                pstatUpdate.executeUpdate();
            } else {
                // El usuario no existe, insertar un nuevo registro
                PreparedStatement pstatInsert = conn.prepareStatement(sqlInsert);
                pstatInsert.setString(1, nuevoUsuario1.getText());
                pstatInsert.setInt(2, 1);
                pstatInsert.executeUpdate();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void equivocado(){
        String sqlSelect = "SELECT usuario FROM usuarios WHERE usuario = ?";
        String sqlUpdate = "UPDATE usuarios SET errores = errores + 1 WHERE usuario = ?";
        String sqlInsert = "INSERT INTO usuarios(usuario, aciertos, errores) VALUES (?, 0, ?)";

        try {
            // Preparar la consulta de selección
            PreparedStatement pstatSelect = conn.prepareStatement(sqlSelect);
            pstatSelect.setString(1, nuevoUsuario1.getText());

            ResultSet resul = pstatSelect.executeQuery();

            if (resul.next()) {
                // El usuario existe, actualizar los errores
                PreparedStatement pstatUpdate = conn.prepareStatement(sqlUpdate);
                pstatUpdate.setString(1, nuevoUsuario1.getText());
                pstatUpdate.executeUpdate();
            } else {
                // El usuario no existe, insertar un nuevo registro
                PreparedStatement pstatInsert = conn.prepareStatement(sqlInsert);
                pstatInsert.setString(1, nuevoUsuario1.getText());
                pstatInsert.setInt(2, 1);
                pstatInsert.executeUpdate();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean nombreOK(){
        if (nuevoUsuario1.getText().isEmpty()){
            alerta.setText("Ingrese un nombre antes de jugar");
            return false;
        }else {
            alerta.setText("");
            return true;
        }
    }

    public void pulsaBoton1(){

        if(nombreOK()) {
            boton1.setOpacity(1.0);
            boton2.setDisable(true);
            boton3.setDisable(true);
            boton1.setDisable(true);
            actualiza.setDisable(false);
        }


    }

    public void pulsaBoton2(){

        if(nombreOK()){
        boton2.setOpacity(1.0);
        boton2.setDisable(true);
        boton3.setDisable(true);
        boton1.setDisable(true);
        actualiza.setDisable(false);
        }

    }

    public void pulsaBoton3(){

        if(nombreOK()) {
            boton3.setOpacity(1.0);
            boton2.setDisable(true);
            boton3.setDisable(true);
            boton1.setDisable(true);
            actualiza.setDisable(false);
        }

    }

    public void actualizaEstadisticas(){

        actualiza.setDisable(true);


        if (boton1.getOpacity() == 1 && boton1.getGraphic() == imgAcierto){
            acierto();
        } else if (boton2.getOpacity() == 1 && boton2.getGraphic() == imgAcierto) {
            acierto();
        } else if (boton3.getOpacity() == 1 && boton3.getGraphic() == imgAcierto) {
            acierto();
        }else {
            equivocado();
        }

        asignarBotones();
        verTablas();
    }




}