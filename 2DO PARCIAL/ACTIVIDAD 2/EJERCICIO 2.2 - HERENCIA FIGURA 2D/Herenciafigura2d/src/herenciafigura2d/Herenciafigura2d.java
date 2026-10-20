package herenciafigura2d;

public class Herenciafigura2d {

    public static void main(String[] args) {
        Figura2D f = new TrianguloRect(3, 4);
        System.out.println(f.imprimeFigura());
        f = new Circulo(3);
        System.out.println(f.imprimeFigura());
    }
}