package herenciapersona;

public class Persona {

    // Alumno y Profesor pueden acceder a ellos
    protected String nombre;
    protected int edad;

    // Valores predeterminados si no se asigna nada
    public Persona() {
        nombre = "Sin nombre";
        edad = 0;
    }
}