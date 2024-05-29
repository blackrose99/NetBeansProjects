package CALCULADORA_MAICOL_GEO;

import javax.swing.JLabel;
public class CIRCULO extends ABSTRACTA {

    private double PI = 3.141592;
    double radio;
    String resultado;
   JLabel total;
   
    public CIRCULO(double radio) {
        this.radio = radio;

    }
    @Override
    public void calcularArea(JLabel total) {
        resultado = Double.toString(PI * Math.pow(radio, 2));
        total.setText(""+resultado);
        
    }

    @Override
    public void calcularPerimetro(JLabel total) {
        resultado = Double.toString(2 * PI * radio);
        total.setText(""+resultado);

    }

    public void calcularDiametroCirculo(JLabel total) {
       resultado = Double.toString(radio * 2);
       total.setText(""+resultado);
       
    }
}
