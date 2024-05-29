
package Fig_Geo;
import javax.swing.JOptionPane;

public class Circulo extends Abstract_Class{
    double Areafigura;
    double PerimetroFigura;

    @Override
    public void calcularArea(double radio) {
        Areafigura=(double) (Math.PI * Math.pow(radio, 2));
        JOptionPane.showMessageDialog(null,"El Area del Circulo es de: " + String.format("%.2f " , Areafigura));
    }

    @Override
    public void calcularArea(double ladoA, double ladoB) {  
    }

    @Override
    public void calcularPerimetro(double radio) {
        PerimetroFigura =(double) (2*Math.PI*radio);
        JOptionPane.showMessageDialog(null,"El Perimetro del Circulo es de: " +String.format("%.2f " , PerimetroFigura));
    }

    @Override
    public void calcularPerimetro(double ladoA, double ladoB) {    
    }
    
    public void calcularDiametro(double perimetro){
       double almacenar = perimetro/Math.PI;
       JOptionPane.showMessageDialog(null,"El Diametro del Circulo es de: " +String.format("%.2f " , almacenar));
    }

    
    
}
