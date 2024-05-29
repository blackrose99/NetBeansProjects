/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fig_geometrica;

abstract class Fig_Geometrica{
Punto p1;
final float PI=(float)3.1416;
public Fig_Geometrica() {
    p1= new Punto();
}
    
public Fig_Geometrica(int x1, int y1) {
    p1= new Punto(x1, y1);
}
public Fig_Geometrica(Punto p) {
    p1= new Punto(p.x, p.y);
}
//Metodos abstractos
public abstract double perimetro();
public abstract double area();

public String imprimir(){
    return "(" + p1.x + "," + p1.y + ")"; 

}
}
