
package polinomio;

import java.util.Scanner;

public class classMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        classMetodos met = new classMetodos();
        int opcion = 0;
        int coeficiente, exponente;
 
        do {
            System.out.println("\n Menu \n 1. Ingresar Polinomio \n 2. Ver tabla de Resulados Polinomiales \n 3. Salir");
            opcion = sc.nextInt();
            switch (opcion) {

                case 1:
                    System.out.println("Ingrese el coeficiente para este monimio");
                    coeficiente = sc.nextInt();
                    System.out.println("Ingrese el exponente para este monimio");
                    exponente = sc.nextInt();
                    met.insertarCoeExp(new classObjeto(coeficiente, exponente));
                    met.verTodoElPolinimio();
               
                   
                    break;
                case 2:
                met.mostrarTablaDeValores();
           
                    break;

            }
        } while (opcion != 3);
    }
}
