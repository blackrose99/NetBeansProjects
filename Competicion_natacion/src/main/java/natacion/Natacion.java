
package natacion;

import java.util.Scanner;
public class Natacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menor , pocisionCompetidor = 1;
        System.out.println("Cuantos competidores son: ");
        int competidor = sc.nextInt();
        int competidores[] = new int[competidor];
        
        for (int i = 0; i < competidores.length; i++) { 
            System.out.println("ingrese el tiempo del " + (i+1) + " competidor");
            competidores[i] = sc.nextInt();
            
            

        }
       menor = competidores[0];
        for (int i = 0; i < competidores.length; i++) {
            if(competidores[i] < menor ){
                menor = competidores[i];
                pocisionCompetidor = (i+1);
            }
        }
        

        System.out.println("el menor tiempo es de " + menor + " del competidor #"+pocisionCompetidor);
    }
}
