package org.example.calculadoracompleja;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.stage.Stage;
import javafx.util.converter.IntegerStringConverter;

import java.io.IOException;

import static javafx.application.Application.launch;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Calculadora");
        stage.setScene(scene);
        stage.show();
        TextField textField = new TextField();

        TextFormatter<Integer> formatter = new TextFormatter<>(new IntegerStringConverter(), null, c -> {
            if (c.getControlNewText().matches("\\d*")) {
                return c;
            } else {
                return null;
            }
        });

        textField.setTextFormatter(formatter);

    }


    public static void main(String[] args) {
        launch();
    }
}