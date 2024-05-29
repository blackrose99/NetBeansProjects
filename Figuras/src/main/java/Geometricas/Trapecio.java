package Geometricas;

import javax.swing.JOptionPane;

public class Trapecio {

    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Ingrese la Base 1 del Trapecio ");
        double b1 = Double.parseDouble(texto);
        String Texto = JOptionPane.showInputDialog("Ingrese la Base 2 del Trapecio");
        double b2 = Double.parseDouble(texto);
        String Text = JOptionPane.showInputDialog("Ingrese la Altura del Trapecio");
        double alt = Double.parseDouble(texto);
        double trapecio = AreaTrapecio(b1, b2, alt);
        JOptionPane.showMessageDialog(null, "El Area del Trapecio es: " + trapecio);

    }

    public static double AreaTrapecio(double base1, double base2, double altura) {
        return (altura * ((base1 + base2) / 2));
    }

}
