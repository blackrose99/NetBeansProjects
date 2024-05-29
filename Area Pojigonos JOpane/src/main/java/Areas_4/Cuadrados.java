package Areas_4;


import javax.swing.JOptionPane;

public class Cuadrados extends FigurasGeometricas {

    public static double l1;
    public static double l2;
    public static double diagonal;

    public void pedirVariables() {

        l1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado A del Cuadrado"));
        l2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado B del Cuadrado"));

    }

    @Override
    public void calcularArea() {
        pedirVariables();
        double area = l1 * l2;
        JOptionPane.showMessageDialog(null, "El Area del Cuadrado es de: " + String.format("%.2f ", area));
    }

    @Override
    public void calcularPerimetro() {
        l1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de los lados del Cuadrado"));
        double perimetro = l1*4;
        JOptionPane.showMessageDialog(null, "El Area del Cuadrado es de: " + String.format("%.2f ", perimetro));
    }

    public void calcularDiagonalCuadrado() {
        pedirVariables();
        double diag = (Math.sqrt(Math.pow(l1, 2) + Math.pow(l2, 2)));
        JOptionPane.showMessageDialog(null, "El Area del Cuadrado es de: " + String.format("%.2f ", diag));
    }
}
