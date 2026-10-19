package com.mycompany.edadpersona;
 
import java.time.LocalDate; //da la fecha del sistema
import javafx.fxml.FXML;
import javafx.scene.control.Label; 
import javafx.scene.control.TextField;
 
public class PrimaryController {
 
    // Cada atributo se enlaza con el fx:id que tiene en el archivo FXML
    @FXML
    private Label lblResultado;
    @FXML
    private TextField txtFechaNacimiento;
 
    // Botón "Calcular": calcula la edad con base en la fecha de nacimiento ingresada
    @FXML
    private void calcular() {
        String fecha = txtFechaNacimiento.getText();
        
        // Separamos la fecha que viene en formato dd/mm/aaaa
        String[] partes = fecha.split("/"); 
 
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int anio = Integer.parseInt(partes[2]);
 
        // Traemos la fecha exacta del día de hoy
        LocalDate hoy = LocalDate.now(); 
 
        int diaActual = hoy.getDayOfMonth();
        int mesActual = hoy.getMonthValue();
        int anioActual = hoy.getYear();
 
        int anios = anioActual - anio;
        int meses = mesActual - mes;
 
        // Si aún no llega el día del mes, significa que este mes no se ha completado
        if (diaActual < dia) {
            meses--;
        }
 
        // Si los meses quedan negativos, es porque aún no se cumple el año
        if (meses < 0) {
            anios--;
            meses += 12;
        }
 
        lblResultado.setText("Tiene " + anios + " años con " + meses + " meses");
    }
 
    // Botón "Limpiar": borra la fecha capturada y el resultado anterior
    @FXML
    private void limpiar() {
        txtFechaNacimiento.setText("");
        lblResultado.setText("Ingrese su fecha de nacimiento dd/mm/aaaa");
    }
}