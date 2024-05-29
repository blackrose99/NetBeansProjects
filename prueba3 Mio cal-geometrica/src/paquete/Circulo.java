
package paquete;

import javax.swing.JLabel;


public class Circulo extends Poligonos {
     double area,perimetro,  numero1,diametro;
   

    public Circulo(double numero1) {
        this.numero1 = numero1;
    }

    
    

    @Override
    public void CalcularArea() {
        area = Math.PI * (numero1*numero1);
        area= Math.round(area);
    }

    @Override
    public void CalcularPerimetro() {
       perimetro = 2*Math.PI*numero1;
       perimetro= Math.round(perimetro);
    }
       public void CalcularDiam(){
      this.diametro = 2*this.numero1;
      diametro= Math.round(diametro);
        
    }
     void PresentarArea(JLabel total1){
          total1.setText(""+area);
       
    }
    void PresentarPerimetro(JLabel total1){
        total1.setText(""+perimetro);    
    }
     void PresentarDiam(JLabel total1){
        total1.setText(""+diametro);    
    }
}
