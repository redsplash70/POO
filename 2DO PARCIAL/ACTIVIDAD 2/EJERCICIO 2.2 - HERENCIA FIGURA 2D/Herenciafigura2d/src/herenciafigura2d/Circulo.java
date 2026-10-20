package herenciafigura2d;

import java.util.Locale;

public class Circulo extends FiguraCircular {

    public Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String imprimeFigura() {
        return super.imprimeFigura() + "\n"
                + "Se imprime un Circulo con radio: " + radio
                + ", area: " + String.format(Locale.US, "%.2f", calcularArea())
                + ", perimetro: " + String.format(Locale.US, "%.2f", calcularPerimetro());
    }
}
