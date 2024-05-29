package Geometricas;

import javax.swing.JOptionPane;

public class Circulo {

    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Ingrese el Radio de la Circunferencia");
        double a = Double.parseDouble(texto);
        double circulo = AreaCirculo(a);
        JOptionPane.showMessageDialog(null, "El Area de la circunferencia es: " + circulo);

    }

    public static double AreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

}
