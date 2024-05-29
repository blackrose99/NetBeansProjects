package Geometricas;

import javax.swing.JOptionPane;

public class Triangulo {

    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Ingrese la Base del Triangulo");
        double a = Double.parseDouble(texto);
        String Texto = JOptionPane.showInputDialog("Ingrese la Altura del Triangulo");
        double h = Double.parseDouble(texto);
        double triangulo = AreaTriangulo(a, h);
        JOptionPane.showMessageDialog(null, "El Area del Triangulo es: " + triangulo);

    }

    public static double AreaTriangulo(double base, double altura) {
        return base * altura / 2;
    }

}
