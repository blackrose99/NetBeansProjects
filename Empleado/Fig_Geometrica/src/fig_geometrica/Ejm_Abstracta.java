/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fig_geometrica;


public class Ejm_Abstracta {
    public static void main(String args[]){
        Rectangulo r =new Rectangulo(3,3,6,6);
        System.out.println("\n El largo del rectangulo es: " + r.largo());
        System.out.println("\n El ancho del rectangulo es: " + r.ancho());
        System.out.println("\n El area del rectangulo es: " + r.area());
        System.out.println("\n El perimetro del rectangulo es: " + r.perimetro()); 
        System.out.println("\n La diagonal del rectangulo es: " + r.diagonal());
}
}