package herenciafigura2d;

// Clase abstracta: no se puede instanciar, sirve para que las clases hijas definan los metodos
public abstract class Figura2D implements FiguraPlana {

    // Mensaje común a todas las figuras, las clases hijas lo completan con sus datos
    protected String imprimeFigura() {
        return "Se imprime una FiguraPlana...";
    }
}
