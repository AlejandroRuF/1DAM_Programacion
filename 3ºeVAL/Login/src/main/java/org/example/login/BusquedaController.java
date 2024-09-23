package org.example.login;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.cell.PropertyValueFactory;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import org.example.login.DAO.ConexionBD;
import org.example.login.DTO.Usuario;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class BusquedaController implements Initializable {

    @FXML
    private TableView tablaUsuario;

    @FXML
    private TableColumn id;
    @FXML
    private TableColumn nombre;
    @FXML
    private TableColumn apellidos;
    @FXML
    private TableColumn username;
    @FXML
    private TableColumn pass;

    @FXML
    private Button cerrar;


    ObservableList<Usuario> usuarios = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        try {
            Connection conn = ConexionBD.getConnection();
            if (conn != null){
                System.out.println("Conexion establecida");
            }
            String sql = "select id, Nombre, Apellidos, username, password from cuentausuario";
            Statement stat = conn.createStatement();
            ResultSet result = stat.executeQuery(sql);

            while (result.next()) {

                Integer idresult = result.getInt("id");
                String nombreresult = result.getString("Nombre");
                String apellidresresult = result.getString("Apellidos");
                String usernameresult = result.getString("username");
                String passwordresult = result.getString("password");

                usuarios.add(new Usuario(idresult,nombreresult,apellidresresult,usernameresult,passwordresult));
            }

            id.setCellValueFactory(new PropertyValueFactory<Usuario,Integer>("id"));
            nombre.setCellValueFactory(new PropertyValueFactory<Usuario,String>("nombre"));
            apellidos.setCellValueFactory(new PropertyValueFactory<Usuario,String>("apellidos"));
            username.setCellValueFactory(new PropertyValueFactory<Usuario,String>("usuerName"));
            pass.setCellValueFactory(new PropertyValueFactory<Usuario,String>("pass"));

            tablaUsuario.setItems(usuarios);

        }catch (Exception e){

            System.out.println(e.getMessage());

        }


    }

    @FXML
    private void cerrar(){

        Stage stage = (Stage) cerrar.getScene().getWindow();
        stage.close();

    }

}
