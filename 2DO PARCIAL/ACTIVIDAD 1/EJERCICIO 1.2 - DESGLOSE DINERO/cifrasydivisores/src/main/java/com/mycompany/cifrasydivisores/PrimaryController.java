package com.mycompany.cifrasydivisores;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    // Cada atributo corresponde al fx:id definido en el FXML
    @FXML
    private TextField txtNumero;
    @FXML
    private TextField txtCanCifras;
    @FXML
    private TextField txtSumaImpares;
    @FXML
    private TextField txtSumaPares;
    @FXML
    private TextField txtSumTotal;
    @FXML
    private TextField txtCifraMay;
    @FXML
    private TextField txtCifraMen;
    @FXML
    private TextArea txtDivisores;

    // Botón "Analizar": obtiene los datos de las cifras y los divisores del número
    @FXML
    private void analizar() {
        int numero = Integer.parseInt(txtNumero.getText());

        // Copia del número para ir quitándole cifras sin perder el original
        int temporal = numero;

        int cantidadCifras = 0;
        int sumaPares = 0;
        int sumaImpares = 0;
        int sumaTotal = 0;
        int cifraMayor = 0;  // arranca en el mínimo posible para que cualquier cifra la supere
        int cifraMenor = 9;  // arranca en el máximo posible para que cualquier cifra sea menor

        // do-while para que el número 0 también se cuente como una cifra
        do {
            // El residuo entre 10 es la última cifra
            int cifra = temporal % 10;
            cantidadCifras++;

            // Se acumula en pares o impares según corresponda
            if (cifra % 2 == 0) {
                sumaPares += cifra;
            } else {
                sumaImpares += cifra;
            }

            sumaTotal += cifra;

            if (cifra > cifraMayor) {
                cifraMayor = cifra;
            }

            if (cifra < cifraMenor) {
                cifraMenor = cifra;
            }

            // Se descarta la última cifra
            temporal = temporal / 10;

        } while (temporal > 0);

        // Un número es divisor si la división entre él no deja residuo
        String divisores = "";
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores += i + "\n";
            }
        }

        // Se muestran todos los resultados en el formulario
        txtCanCifras.setText("" + cantidadCifras);
        txtSumaImpares.setText("" + sumaImpares);
        txtSumaPares.setText("" + sumaPares);
        txtSumTotal.setText("" + sumaTotal);
        txtCifraMay.setText("" + cifraMayor);
        txtCifraMen.setText("" + cifraMenor);
        txtDivisores.setText(divisores);
    }

    // Botón "Limpiar": deja todos los campos en blanco
    @FXML
    private void limpiar() {
        txtNumero.clear();
        txtCanCifras.clear();
        txtSumaImpares.clear();
        txtSumaPares.clear();
        txtSumTotal.clear();
        txtCifraMay.clear();
        txtCifraMen.clear();
        txtDivisores.clear();
    }

}
