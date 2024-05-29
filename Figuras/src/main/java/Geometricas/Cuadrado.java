package Geometricas;

import javax.swing.JOptionPane;

public class Cuadrado {

    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Ingrese el Area del Cuadrado");
        double a = Double.parseDouble(texto);
        double area = AreaCuadrado(a);
        JOptionPane.showMessageDialog(null, "El Area del Cuadrado es: " + area);

    }

    public static double AreaCuadrado(double num) {

        return Math.pow(num, 2);
    }

}
