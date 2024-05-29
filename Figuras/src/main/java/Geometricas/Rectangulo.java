package Geometricas;

import javax.swing.JOptionPane;

public class Rectangulo {

    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Ingrese el lado A del Rectangulo");
        double a = Double.parseDouble(texto);
        String Texto = JOptionPane.showInputDialog("Ingrese el lado B del Rectangulo");
        double b = Double.parseDouble(texto);
        double rectangulo = AreaRectangulo(a, b);
        JOptionPane.showMessageDialog(null, "El Area del Rectangulo es: " + rectangulo);

    }

    public static double AreaRectangulo(double a, double b) {
        return a * b;
    }

}
