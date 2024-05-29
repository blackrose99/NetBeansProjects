package Geometricas;

import javax.swing.JOptionPane;

public class Pentagono {

    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Ingrese la Altura del Pentagono");
        double a = Double.parseDouble(texto);
        String Texto = JOptionPane.showInputDialog("Ingrese la Base del Pentagono");
        double b = Double.parseDouble(texto);
        double pentagono = AreaPentagono(a, b);
        JOptionPane.showMessageDialog(null, "El Area del Pentagono es: " + pentagono);

    }

    public static double AreaPentagono(double a, double b) {
        return ((5 * b * a) / 2);
    }

}
