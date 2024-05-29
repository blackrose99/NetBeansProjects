
package punto;


public class Cono extends Circulo{
    int generatriz;
    
    double altura;
 
public  Cono(){ 
}
    public Cono(int generatriz, double radio, int valorX, int valorY) {
        super(radio, valorX, valorY);
        this.generatriz = generatriz;
    }
    public  double areadelcono(){
        return Math.PI*super.radio*(generatriz+super.radio);
    }

  public  double altura(){
     return (Math.sqrt(Math.pow(generatriz,2) -  Math.pow(super.radio,2)));
    }

  
  
  
  
  
  public double volumen(){
        return (Math.PI*Math.pow(super.radio,2)*altura())/3;
    }

  
  
   
}
