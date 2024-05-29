

package paquete;

import javax.swing.JLabel;


public class Rectangulo {
     String opcion1;
    double nu1,nu2,area,perimetro,diagonal;

    public Rectangulo(double nu1, double nu2) {
        this.nu1 = nu1;
        this.nu2 = nu2;
    }

   
    void CalcularArea(){
       
                 this.area = this.nu1 * this.nu2;
                 
         
    }
       void CalcularPerimetro(){

       perimetro= nu1*2+nu2*2;
      }
       public void CalcularDiagonal() {
        this.diagonal = Math.sqrt(Math.pow(this.nu1, 2) + Math.pow(this.nu2, 2));
        diagonal= Math.round(diagonal);
      
    }
       

    
    void PresentarArea(JLabel total1){
        
        total1.setText(""+area);
        
    }
    
    void PresentarPerimetro(JLabel total1){
        
        total1.setText(""+perimetro);
  
    }
    void PresentarDiag(JLabel total1){
        
        total1.setText(""+diagonal);
  
    }

}
