
package paquete;

import javax.swing.JLabel;


public class Triangulo extends Poligonos{
    double area,perimetro,numero1,numero2,numero3,hipotenusa;

    public Triangulo(double numero1, double numero2, double numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }
   

  
  

    @Override
    public void CalcularArea() {
        area= numero1*numero2;
       
    }

    @Override
    public void CalcularPerimetro() {
        perimetro= numero1+numero2+numero3;
       
    }
     public void CalcularHipotenusa(){
       this.hipotenusa= Math.sqrt(Math.pow(this.numero1, 2) + Math.pow(this.numero2, 2));
       hipotenusa= Math.round(hipotenusa);
  
    }
     void PresentarArea(JLabel total1){
          total1.setText(""+area);
       
    }
    void PresentarPerimetro(JLabel total1){
        
        total1.setText(""+perimetro);
        
    }
    void PresentarHipo(JLabel total1){
        
        total1.setText(""+hipotenusa);
        
    }
    
}
