package com.mycompany.gastossemanales;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {

    // Cada atributo se enlaza con el fx:id definido en el FXML
    @FXML
    private TextField txtAlimentacion;
    @FXML
    private TextField txtRefrigerios;
    @FXML
    private TextField txtTransporte;
    @FXML
    private TextField txtTelefonia;
    @FXML
    private TextField txtOtros;
    @FXML
    private TextField txtTotalSemanal;
    @FXML
    private TextField txtMayorGasto;

    // Botón "Limpiar": deja todos los campos en blanco
    @FXML
    private void limpiar() {
        txtAlimentacion.clear();
        txtRefrigerios.clear();
        txtTransporte.clear();
        txtTelefonia.clear();
        txtOtros.clear();
        txtTotalSemanal.clear();
        txtMayorGasto.clear();
    }

    // Botón "Calcular estadísticas": obtiene el total y la categoría con más gasto
    @FXML
    private void estadisticas() {
        // Se convierte a número lo que el usuario escribió en cada categoría
        int alimentacion = Integer.parseInt(txtAlimentacion.getText());
        int refrigerios = Integer.parseInt(txtRefrigerios.getText());
        int transporte = Integer.parseInt(txtTransporte.getText());
        int telefonia = Integer.parseInt(txtTelefonia.getText());
        int otros = Integer.parseInt(txtOtros.getText());

        int totalSemanal = alimentacion + refrigerios + transporte + telefonia + otros;

        // Se parte suponiendo que el mayor es el primero y se va comparando con los demás.
        // Se usa ">" (no ">=") para que, si hay empate, se conserve el que aparece primero.
        int mayor = alimentacion;
        String categoriaMayor = "Alimentación";

        if (refrigerios > mayor) {
            mayor = refrigerios;
            categoriaMayor = "Refrigerios";
        }
        if (transporte > mayor) {
            mayor = transporte;
            categoriaMayor = "Transporte";
        }
        if (telefonia > mayor) {
            mayor = telefonia;
            categoriaMayor = "Telefonía";
        }
        if (otros > mayor) {
            mayor = otros;
            categoriaMayor = "Otros";
        }

        txtTotalSemanal.setText("" + totalSemanal);
        txtMayorGasto.setText(categoriaMayor);
    }
}
