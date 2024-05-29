
package listass;

import java.util.Scanner;

public class Listass {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Listas lis = new Listas();
       int opcion = 0;
       String palabra;
       
        do {            
            System.out.println("\n 1.Insertar palabra Palindroma \n 2. Mostrar y comprobar si es palindroma  \n 4. Salir");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                      
                  System.out.println("Ingrese la palabra: ");
                  String limpiar = sc.nextLine();
                   palabra = sc.nextLine().replaceAll(" ","").toLowerCase();
                    lis.insertarNodo(palabra);
                    lis.verPalindroma(palabra);
                    break;
                case 2:
                    System.out.println("Mostrando el ultimo caracter");
                    System.out.println(lis.mostrarUltimo());  
                    System.out.println("Mostrar toda la Pila, Palabra");
                    lis.mostrarElementos();
                    break;
                    
            
            }
        } while (opcion != 3);
       
       
    }
}
