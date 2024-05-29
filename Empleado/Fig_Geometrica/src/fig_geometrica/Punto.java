
package fig_geometrica;

public class Punto {
    int x,y;
    public Punto(){ } ;
    public Punto (int x, int y){
    this.x=x;
    this.y=y;
}   
public double distancia (Punto p){
    
 return (Math.sqrt(Math.pow(p.x-x,2) + Math.pow(p.y-y,2)));
 
 }
}
