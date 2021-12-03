module com.essohpee.hotelmanagementsystemjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.essohpee.hotelmanagementsystemjavafx to javafx.fxml;
    exports com.essohpee.hotelmanagementsystemjavafx;
}