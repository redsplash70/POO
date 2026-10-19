package com.mycompany.tablamultiplicar;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    // Cada atributo se enlaza con el fx:id definido en el FXML
    @FXML
    private TextField txtNumero;
    @FXML
    private TextArea txtTabla;

    // Botón "Limpiar": deja el campo y la tabla en blanco
    @FXML
    private void limpiar() {
        txtNumero.clear();
        txtTabla.clear();
    }

    // Botón "Calcular": genera las 10 multiplicaciones del número capturado
    @FXML
    private void calcular() {
        int numero = Integer.parseInt(txtNumero.getText());
        String resultado = "";

        // Una línea por cada multiplicador del 1 al 10, con el formato 5x1 = 5
        for (int i = 1; i <= 10; i++) {
            resultado = resultado + numero + "x" + i + " = " + (numero * i) + "\n";
        }

        txtTabla.setText(resultado);
    }

}
