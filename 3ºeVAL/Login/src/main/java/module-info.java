module org.example.login {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.sql;
    requires java.desktop;

    opens org.example.login to javafx.fxml;
    exports org.example.login;
    exports org.example.login.DAO;
    opens org.example.login.DAO to javafx.fxml;
    exports org.example.login.DTO;
    opens org.example.login.DTO to javafx.fxml;
}