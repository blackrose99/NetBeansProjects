package Geometricas;

import javax.swing.JOptionPane;

public class Romboide {

    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Ingrese la Base del Romboide");
        double b = Double.parseDouble(texto);
        String Texto = JOptionPane.showInputDialog("Ingrese la Altura del Romboide");
        double a = Double.parseDouble(texto);
        double romboide = AreaRomboide(b, a);
        JOptionPane.showMessageDialog(null, "El Area del Romboide es: " + romboide);

    }

    public static double AreaRomboide(double b, double a) {
        return b * a;
    }

}
