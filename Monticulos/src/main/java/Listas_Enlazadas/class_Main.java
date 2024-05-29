
package Listas_Enlazadas;

import java.util.Random;
import java.util.Scanner;


public class class_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r;
       
        int k,i;
        r = new Random();
      Listas_Enlazadas   lista = new Listas_Enlazadas();
        k = Math.abs(r.nextInt() % 13);


        for(i=0;i < k; i++){
//            d = r.nextInt() % 99;
             System.out.println("Ingrese su nombre: ");
             String  name = sc.nextLine();
            lista.InsertarCabezaLista(name);
        }
        
        System.out.println("Elemento al azar son: ");
        lista.visualizar();
        
        
        System.out.println("\n La lista esta vacia: " + lista.estaVacia());
        
        System.out.println("Ingrese un indice a buscar");
        int indice;
        indice = sc.nextInt();
        
        System.out.println(" " + lista.obtener(indice));
    }
}
