
package Fig_Geo;

import javax.swing.JOptionPane;
public class Rectangulo extends Abstract_Class{
    double Areafigura;
    double PerimetroFigura;
    
        @Override
    public void calcularArea(double ladoA) {
    }
    @Override
    public void calcularArea(double Base, double Altura) {
        Areafigura = Base * Altura;
          JOptionPane.showMessageDialog(null, "El area del Rectangulo es de: " + String.format( "%.2f " , Areafigura));
    }

    @Override
    public void calcularPerimetro(double ladoA) {
    }

    @Override
    public void calcularPerimetro(double ladoA, double ladoB) {
        PerimetroFigura=2*(ladoA+ladoB);
          JOptionPane.showMessageDialog(null, "El Perimetro del Rectangulo es de: " + String.format("%.2f " , PerimetroFigura));
    }
    public void calcularDiagonal(double ladoA, double ladoB){
        double almacenar = Math.sqrt(Math.pow(ladoA, 2)+ Math.pow(ladoB, 2));
        JOptionPane.showMessageDialog(null, "El Diagonal del Cuadrado es de: " + String.format("%.2f " , almacenar));
    }
    
}
