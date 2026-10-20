package herenciapersona;
 
public class Alumno extends Persona {
 
    public Alumno() {
        // Se llama primero al constructor de Persona (super()) de forma implícita
        System.out.println("Se crea Alumno...");
    }
 
    @Override
    public String toString() {
        return "Un alumno llamado: " + nombre;
    }
}
