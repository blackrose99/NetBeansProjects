package Geometricas;

import javax.swing.JOptionPane;

public class Hexagono {

    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Ingrese la Altura del Hexagono");
        double a = Double.parseDouble(texto);
        String Texto = JOptionPane.showInputDialog("Ingrese la Base del Hexagono");
        double b = Double.parseDouble(texto);
        double pentagono = AreaHexagono(a, b);
        JOptionPane.showMessageDialog(null, "El Area del Hexagono es: " + pentagono);

    }

    public static double AreaHexagono(double a, double b) {
        return ((6 * b * a) / 2);
    }

}
 