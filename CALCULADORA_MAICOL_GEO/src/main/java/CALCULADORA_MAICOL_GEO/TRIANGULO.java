package CALCULADORA_MAICOL_GEO;
import javax.swing.JLabel;
public class TRIANGULO extends ABSTRACTA {

    double base, altura;
    String resultado;
    JLabel total;
    public TRIANGULO( double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public void calcularArea(JLabel total) {
        resultado = Double.toString(base * altura / 2);
        total.setText("" +resultado);
    }

    @Override
    public void calcularPerimetro(JLabel total) {
       resultado = Double.toString(base + altura * 2);
        total.setText("" +resultado);
    }
    
    public void calcularHipotenusaTriangulo(JLabel total){
        resultado = Double.toString(Math.sqrt(Math.pow(altura, 2)+ Math.pow(base, 2)));
        total.setText("" +resultado);
    }

}
