module com.mycompany.desglosedinero {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.desglosedinero to javafx.fxml;
    exports com.mycompany.desglosedinero;
}
