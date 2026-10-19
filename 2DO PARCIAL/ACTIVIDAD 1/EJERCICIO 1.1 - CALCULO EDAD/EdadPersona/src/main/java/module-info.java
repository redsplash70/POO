module com.mycompany.edadpersona {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.edadpersona to javafx.fxml;
    exports com.mycompany.edadpersona;
}
