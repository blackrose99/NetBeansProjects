/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fig_geometrica;

/**
 *
 * @author HP
 */
public class Rectangulo extends Fig_Geometrica{
    Punto p2;
    public Rectangulo(){
        p2 =new Punto();
    }
    
    public Rectangulo(int x1, int y1, int x2, int y2){
        super(x1,y1);
        p2=new Punto(x2,y2);
    }
    
    public Rectangulo(Punto a, Punto b){
        super(a);
        p2=new Punto(b.x, b.y);
    }
    public double largo(){           
        return Math.abs(p1.x-p2.x);
    }
    public double ancho(){
        return Math.abs(p1.y-p2.y);
    }
    public double perimetro() {
        return (ancho()+largo())*2;
    }
    public double area(){
        return ancho()*largo();
    }
    public double diagonal() {
        return p1.distancia(p2);
    }
}
