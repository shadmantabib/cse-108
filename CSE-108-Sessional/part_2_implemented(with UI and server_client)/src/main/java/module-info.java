module com.example.demo3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires javafx.web;

    opens com.example.demo3 to javafx.fxml;
    exports com.example.demo3;
    exports Movie;
}