package com.example.wordle;

import com.example.wordle.DAO.ConexionBD;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

public class WordleController implements Initializable {

    private TextField[][] posiciones;
    @FXML
    private Label chivato;
    @FXML
    private Button btnvalidar;
    @FXML
    private Button cerrar;
    @FXML
    private Button otra;
    @FXML
    private TextField fillpalabra;


    @FXML
    private TextField f1c1, f1c2, f1c3, f1c4, f1c5;
    @FXML
    private TextField f2c1, f2c2, f2c3, f2c4, f2c5;
    @FXML
    private TextField f3c1, f3c2, f3c3, f3c4, f3c5;
    @FXML
    private TextField f4c1, f4c2, f4c3, f4c4, f4c5;
    @FXML
    private TextField f5c1, f5c2, f5c3, f5c4, f5c5;
    @FXML
    private TextField f6c1, f6c2, f6c3, f6c4, f6c5;

    @FXML
    private Label turno;
    private Connection conn = null;


    private String palabraDia;
    private int intentos = 0;
    private List<String> listaPalabralDia = new ArrayList<String>();

    private int idAleatorio() {
        return (int) ((Math.random() * 800) + 1);
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        conn = ConexionBD.getConnection();
        intentos = 0;
        this.posiciones = new TextField[][]{{f1c1, f1c2, f1c3, f1c4, f1c5},
                {f2c1, f2c2, f2c3, f2c4, f2c5},
                {f3c1, f3c2, f3c3, f3c4, f3c5},
                {f4c1, f4c2, f4c3, f4c4, f4c5},
                {f5c1, f5c2, f5c3, f5c4, f5c5},
                {f6c1, f6c2, f6c3, f6c4, f6c5}};
        nuevaPalabra();
        jugar();
        chivato.setText(palabraDia);

//        String sql = "select * from wordle where id=?";
//
//
//        try {
//            PreparedStatement stat = conn.prepareStatement(sql);
//            stat.setInt(1, idAleatorio());
//
//            ResultSet result = stat.executeQuery();
//
//            if (result.next()) {
//                palabraDia = result.getString(2).toUpperCase();
//                palabraDia = "aacvc".toUpperCase();
//                System.out.println(palabraDia);
//                chivato.setText(palabraDia);
//                for (int i = 0; i < palabraDia.length(); i++) {
//
//                    listaPalabralDia.add(palabraDia.charAt(i) + "".toUpperCase());
//
//                }
//            }
//
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }

    public static String eliminarAcentos(String input) {
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(normalized).replaceAll("");
    }

    private void nuevaPalabra() {
        listaPalabralDia = new ArrayList<String>();
        String sql = "select * from wordle where id=?";


        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, idAleatorio());

            ResultSet result = stat.executeQuery();

            if (result.next()) {
                palabraDia = result.getString(2).toUpperCase();
                palabraDia = eliminarAcentos(palabraDia);
                //palabraDia = "tasas".toUpperCase();
                System.out.println(palabraDia);
                chivato.setText(palabraDia);
                for (int i = 0; i < palabraDia.length(); i++) {

                    listaPalabralDia.add(palabraDia.charAt(i) + "".toUpperCase());

                }
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    private void jugar() {
        turno.setText(String.valueOf(intentos + 1));
        boolean existe = false;
        boolean letra = true;
        boolean ganador = false;

        if (fillpalabra.getText().length() == 5) {
            if (intentos < 6) {

                List<String> listaPalabraIntroducida = new ArrayList<String>();
                String palabraJugada = fillpalabra.getText().toUpperCase();
                for (int i = 0; i < palabraJugada.length(); i++) {

                    listaPalabraIntroducida.add(palabraJugada.charAt(i) + "".toUpperCase());
                    if (!Character.isAlphabetic(listaPalabraIntroducida.get(i).charAt(0))) {
                        letra = false;
                    }
                }

                String sql = "SELECT * FROM wordle WHERE palabra=?";

                try {
                    PreparedStatement stat = conn.prepareStatement(sql);
                    stat.setString(1, palabraJugada);
                    ResultSet result = stat.executeQuery();
                    if (result.next()) {
                        existe = true;
                    }
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }


                if (letra && existe) {
                    int contadorLetras;
                    int contadorColor;


                    for (int i = 0; i < 5; i++) {

                        if (listaPalabralDia.contains(listaPalabraIntroducida.get(i)) &&
                                Objects.equals(listaPalabraIntroducida.get(i), listaPalabralDia.get(i))) {
                            contadorLetras = 0;
                            contadorColor = 0;


                            posiciones[intentos][i].setText(listaPalabraIntroducida.get(i));
                            for (int j = 0; j < palabraJugada.length(); j++) {
                                if (listaPalabraIntroducida.get(i).equals(listaPalabralDia.get(j))) {
                                    contadorLetras++;

                                }
                                if ((posiciones[intentos][j].getStyle().equals("-fx-background-color: #629677") ||
                                        posiciones[intentos][j].getStyle().equals("-fx-background-color: #F3DE8A")) &&
                                        posiciones[intentos][j].getText().equals(listaPalabraIntroducida.get(i))) {
                                    System.out.println(posiciones[intentos][i].getStyle());
                                    contadorColor++;
                                }
                            }
                            posiciones[intentos][i].setStyle("-fx-background-color: #629677");


                            int contador2 = 0;

                            for (int j = 0; j < palabraJugada.length(); j++) {

                                if (Objects.equals(posiciones[intentos][j].getText(), listaPalabralDia.get(i)) && (posiciones[intentos][j].getStyle().equals("-fx-background-color: #629677") ||
                                        posiciones[intentos][j].getStyle().equals("-fx-background-color: #F3DE8A"))) {

                                    contador2++;

                                }

                            }

                            if (contador2 > contadorColor) {
                                boolean cambiado = false;
                                for (int j = 0; j < palabraJugada.length(); j++) {

                                    if (posiciones[intentos][j].getStyle().equals("-fx-background-color: #F3DE8A") && !cambiado && posiciones[intentos][j].getText().equals(listaPalabraIntroducida.get(i))) {

                                        posiciones[intentos][j].setStyle("-fx-background-color: #EB9486");
                                        cambiado = true;

                                    }

                                }


                            }

                            listaPalabraIntroducida.set(i, "7asdfa5468fvrqae");


                        } else if (listaPalabralDia.contains(listaPalabraIntroducida.get(i)) &&
                                !(listaPalabraIntroducida.get(i).equals(listaPalabralDia.get(i)))) {
                            contadorLetras = 0;
                            contadorColor = 0;
                            posiciones[intentos][i].setText(listaPalabraIntroducida.get(i));


                            for (int j = 0; j < palabraJugada.length(); j++) {
                                if (listaPalabraIntroducida.get(i).equals(listaPalabralDia.get(j))) {
                                    contadorLetras++;

                                }


                                if ((posiciones[intentos][j].getStyle().equals("-fx-background-color: #629677") ||
                                        posiciones[intentos][j].getStyle().equals("-fx-background-color: #F3DE8A")) &&
                                        posiciones[intentos][j].getText().equals(listaPalabraIntroducida.get(i))) {
                                    System.out.println(posiciones[intentos][i].getStyle());
                                    contadorColor++;
                                }
                            }


                            if (contadorColor < contadorLetras) {

                                posiciones[intentos][i].setStyle("-fx-background-color: #F3DE8A");

                            } else {

                                posiciones[intentos][i].setStyle("-fx-background-color: #EB9486");
                            }

                            int contador2 = 0;

                            for (int j = 0; j < palabraJugada.length(); j++) {

                                if (Objects.equals(posiciones[intentos][j].getText(), listaPalabralDia.get(i)) && (posiciones[intentos][j].getStyle().equals("-fx-background-color: #629677") ||
                                        posiciones[intentos][j].getStyle().equals("-fx-background-color: #F3DE8A"))) {

                                    contador2++;

                                }

                            }

                            if (contador2 > contadorLetras) {
                                boolean cambiado = false;
                                for (int j = 0; j < palabraJugada.length(); j++) {

                                    if (posiciones[intentos][j].getStyle().equals("-fx-background-color: #F3DE8A") && !cambiado) {

                                        posiciones[intentos][j].setStyle("-fx-background-color: #EB9486");
                                        cambiado = true;

                                    }

                                }


                            }

                            listaPalabraIntroducida.set(i, "7asdfa5468fvrqae");

                        } else if (!listaPalabralDia.contains(listaPalabraIntroducida.get(i))) {

                            posiciones[intentos][i].setText(listaPalabraIntroducida.get(i));
                            posiciones[intentos][i].setStyle("-fx-background-color: #EB9486");
                            listaPalabraIntroducida.set(i, "7asdfa5468fvrqae");
                        }
                        System.out.println(posiciones[intentos][i].getStyle());


                    }

                    if (palabraJugada.equalsIgnoreCase(palabraDia)) {

                        chivato.setText("Exacto esa era la palabra escondida!!!");
                        ganador = true;
                        finPartida();
                    }
                    intentos++;
                } else if (!letra) {

                    chivato.setText("Solo se admiten letras --> " + palabraDia);

                } else {
                    chivato.setText("Esa palabra no existe en el diccionario --> " + palabraDia);
                }


                if (intentos >= 6 && !ganador) {
                    chivato.setText("Has perdido D=");
                    finPartida();
                }

            }


        } else {
            System.out.println("hola");

            chivato.setText("Solo 5 caracteres de largo --> " + palabraDia);
        }

        fillpalabra.setText("");
    }

    private void finPartida() {

        fillpalabra.visibleProperty().set(false);
        fillpalabra.disableProperty().set(true);
        btnvalidar.visibleProperty().set(false);
        btnvalidar.disableProperty().set(true);
        cerrar.visibleProperty().set(true);
        cerrar.disableProperty().set(false);
        otra.visibleProperty().set(true);
        otra.disableProperty().set(false);
    }

    @FXML
    private void iniciarPartida() {
        nuevaPalabra();
        jugar();
        chivato.setText(palabraDia);
        intentos = 0;
        for (int i = 0; i < posiciones.length; i++) {
            for (int j = 0; j < posiciones[i].length; j++) {
                posiciones[i][j].setStyle("-fx-background-color: white");
                posiciones[i][j].setText("");
            }
        }
        fillpalabra.visibleProperty().set(true);
        fillpalabra.disableProperty().set(false);
        btnvalidar.visibleProperty().set(true);
        btnvalidar.disableProperty().set(false);
        cerrar.visibleProperty().set(false);
        cerrar.disableProperty().set(true);
        otra.visibleProperty().set(false);
        otra.disableProperty().set(true);

    }

    @FXML
    public void cerrar() {
        ConexionBD.closeConnection();


        Stage stage = (Stage) cerrar.getScene().getWindow();
        stage.close();
    }

}
