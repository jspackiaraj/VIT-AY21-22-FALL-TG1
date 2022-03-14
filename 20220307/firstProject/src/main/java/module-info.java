module com.firstproject.firstproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires eu.hansolo.tilesfx;

    opens com.firstproject.firstproject to javafx.fxml;
    exports com.firstproject.firstproject;
}