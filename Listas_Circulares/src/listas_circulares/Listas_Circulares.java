
package listas_circulares;

import java.util.Scanner;
public class Listas_Circulares {


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int opcion = 0;
       Listas_Circularess lis = new Listas_Circularess();
       String clear;
       
        do {         
             System.out.println("\n1. Agregar un dato al principio de la lista Circular\n"
                              + "2. Agregar un dato al final de la lista Circular \n"
                              + "3. Agregar entre dos Nodos en la lista Circular\n"
                              + "4. Editar un Nodo\n"
                              + "5. Buscar un Nodo por su Indice \n"
                              + "6. Eliminar un Nodo\n"
                              + "7. Visualizar todos los datos de la lista\n"
                              + "8. Eliminar toda la lista Circular\n" 
                              + "9. Agregar de forma Ordenada\n"
                              + "10. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el valor para agregar al principio de la lista");
                    clear = sc.nextLine();
                    String dato = sc.nextLine();
                   lis.agregarAlInicio(dato);
                    break;

                case 2:
                    System.out.println("Ingrese el valor para agregar al final de la lista");
                    clear = sc.nextLine();
                    String dato1 = sc.nextLine();
                    lis.agregarAlFinal(dato1);
                    break;

                case 3:
                    System.out.println("Ingrese el valor de Nodo anterior al que quiere agregar uno nuevo ");
                    clear = sc.nextLine();
                    String nodoAnterior = sc.nextLine();
                    System.out.println("Ingrese el valore del nuevo Nodo ");
                    String valor = sc.nextLine();
                    lis.insertarEntreDosPorElValor(valor, nodoAnterior);
                    break;

                case 4:
                    System.out.println("Ingrese el valor al nodo que quiere actualizar");
                    clear = sc.nextLine();
                    String nodoActualizar = sc.nextLine();
                    System.out.println("Ingrese el valor actulizado para este Nodo");
                    String nuevoValor = sc.nextLine();
                    lis.editarNodo(nodoActualizar, nuevoValor);
                    break;

                case 5:
                    System.out.println("Ingrese el indice del nodo a Consultar");
                    int consulta = sc.nextInt();
                    lis.buscarNodo(consulta);
                    break;

                case 6:
                    System.out.println("Ingrese el valor del Nodo que quire Eliminar");
                    clear = sc.nextLine();
                    String eliminacion = sc.nextLine();
                    lis.eliminarNodoPorSuValor(eliminacion);
                    
                    break;
                    
                case 7:
                    lis.mostrarLista();
                    System.out.println();
                    break;
                case 8:
                    lis.eliminarTodaLaLista();
                    System.out.println("Lista Circular Eliminada por Completo!!");
                    break;
                    
                case 9:
                    System.out.println("Ingrese el valor para ir ordenandolo!!");
                    clear = sc.nextLine();
                    String datos = sc.nextLine();
                    lis.ordenarAlMomentoDeInsertar(datos);
                    break;
            }
        } while (opcion != 10);
       
       
       
       
       
       
    }
    
}
