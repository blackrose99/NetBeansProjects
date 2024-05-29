package Areas_4;

import javax.swing.JOptionPane;

public class Circulos extends FigurasGeometricas {

    public static double radio;
    private static double PI = 3.141592;
    public static double diametro;

    public Circulos() {
    }

    public void pedirVariables() {
        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo"));
    }

    @Override
    public void calcularArea() {
        pedirVariables();
        double ra = PI * Math.pow(radio, 2);
        JOptionPane.showMessageDialog(null, "El Area del Circulo es de: " + String.format("%.2f ", ra));
    }

    @Override
    public void calcularPerimetro() {
        perimetro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el diametro del circulo"));
        double peri = 2 * PI * perimetro;
        JOptionPane.showMessageDialog(null, "El Perimetro del Circulo es de: " + String.format("%.2f ", peri));
    }

    public void calcularDiametroCirculo() {
        diametro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el perimetro del circulo"));
        double almacenar = diametro / PI;
        JOptionPane.showMessageDialog(null, "El diamtro del circulo es: " + String.format("%.2f ", almacenar));
    }
}
