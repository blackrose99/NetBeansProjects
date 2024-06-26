
package CALCULADORA_MAICOL_GEO;

import javax.swing.JLabel;
public class CUADRADO extends ABSTRACTA{
     double lado1, lado2;
     String resultado;
    JLabel total;
    public CUADRADO(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    @Override
    public void calcularArea(JLabel total) {
     resultado = Double.toString(lado1 * lado2);
     total.setText(""+resultado);
    }

    @Override
    public void calcularPerimetro(JLabel total) {
     resultado = Double.toString(lado1*2+lado2*2);
     total.setText(""+resultado);   
    }
    
    public void calcularDiagonalCuadrado(JLabel total){
        resultado = Double.toString(Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2)));
     total.setText(""+resultado);   
    }
     
    
    
}
