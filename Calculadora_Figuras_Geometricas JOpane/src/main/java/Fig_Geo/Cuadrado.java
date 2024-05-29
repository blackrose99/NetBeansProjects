
package Fig_Geo;
import javax.swing.JOptionPane;

public class Cuadrado extends Abstract_Class {
    double Areafigura;
    double PerimetroFigura;

    @Override
    public void calcularArea(double ladoA) {
        Areafigura = (int) Math.pow(ladoA, 2);
        JOptionPane.showMessageDialog(null, "El area del Cuadrado es: " + String.format("%.2f " , Areafigura));
    }

    @Override
    public void calcularArea(double ladoA, double ladoB) {
        Areafigura = ladoA * ladoB;
        JOptionPane.showMessageDialog(null, "El area del Cuadrado es: " + String.format("%.2f " , Areafigura));
    }

    @Override
    public void calcularPerimetro(double ladoA) {
        PerimetroFigura = ladoA*4;
        JOptionPane.showMessageDialog(null, "El Perimetro del Cuadrado es: " + String.format("%.2f " , PerimetroFigura));
    }

    @Override
    public void calcularPerimetro(double ladoA, double ladoB) {
        
    }   
}
