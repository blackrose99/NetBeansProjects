


package Fig_Geo;
import javax.swing.JOptionPane;
public class Triangulo extends Abstract_Class{
    double Areafigura;
    double PerimetroFigura;

    @Override
    public void calcularArea(double ladoA) {
    }

    @Override
    public void calcularArea(double Base, double Altura) {
        Areafigura = Base * Altura / 2;
          JOptionPane.showMessageDialog(null, "El area del Triangulo es de: " + String.format("%.2f " , Areafigura));
    }

    @Override
    public void calcularPerimetro(double ladoA) {
    }

    @Override
    public void calcularPerimetro(double ladoA, double ladoB) {
        PerimetroFigura=ladoB+ladoA*2;
          JOptionPane.showMessageDialog(null, "El Perimetro del Triangulo es de: " + String.format("%.2f " , PerimetroFigura));
    }
    
}
