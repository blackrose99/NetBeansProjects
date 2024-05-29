package Quicksort;

import java.util.Arrays;

public class main_quicksort {

    public static void main(String[] args) {

        Compañia_Refrescos od[] = {new Compañia_Refrescos(9, "Carlos peres", 120.000, 20), new Compañia_Refrescos(12, "Marcos Peres", 302.104, 3), new Compañia_Refrescos(1, "Ana Rodriguez", 150.000, 5)
        ,new Compañia_Refrescos(-3, "Teresa Sandobal", 120.654, 2),new Compañia_Refrescos(0, "Brandom Gomez", 220.654, 10)};

        
       
        
        
        System.out.println("Lista por nombres de empleados Desordenada: " + "\n" + Arrays.toString(od));
        Metodo_Quicksort algorithm = new Metodo_Quicksort();
        algorithm.ordenarQuicksort(od, 0, od.length-1);

        System.out.println("Lista por nombres empleados Ordenada: " + "\n" + Arrays.toString(od));

//  int a[]  = new int[10];
//        for (int i = 0; i <=9; i++) {
//            a[i] = (int)(Math.random()*15*1);
//            
//            System.out.println(a[i]);
//        }
//  
  


    }
}
