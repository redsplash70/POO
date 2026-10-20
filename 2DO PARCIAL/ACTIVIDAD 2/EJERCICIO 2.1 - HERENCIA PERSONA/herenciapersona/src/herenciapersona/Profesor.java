package herenciapersona;

public class Profesor extends Persona {

    // Privado: solo se puede consultar desde esta misma clase
    private int numEmpleado;

    public Profesor(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    @Override
    public String toString() {
        return "Un profesor de edad " + edad + ", con clave " + numEmpleado;
    }
}