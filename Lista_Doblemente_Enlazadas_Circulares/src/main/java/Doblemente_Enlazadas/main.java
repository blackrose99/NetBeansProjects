package Doblemente_Enlazadas;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       ListasCDE lis = new ListasCDE();
       int opcion = 0;
       String clear;
       
        do {         
             System.out.println("\n1. Agregar un dato al principio de la lista Circular Doblemente Enlazada\n" //ya
                              + "2. Agregar un dato al final de la lista Circular Doblemente Enlazada\n" //ya
                              + "3. Agregar entre dos Nodos en la lista Circular Doblemente Enlazada\n" //ya
                              + "4. Editar un Nodo\n"//ya
                              + "5. Buscar un Nodo por su Valor\n"//ya
                              + "6. Eliminar un Nodo\n"//ya
                              + "7. Visualizar todos los datos de inicio a fin\n"//ya
                              + "8. Visualizar todos los datos de fia a inicio\n"//ya
                              + "9. Eliminar toda la lista Circular Doblemente Enlazada\n" //ya
                              + "10. Agregar de forma Ordenda\n"
                              + "11. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el valor para agregar al principio de la lista");
                    clear = sc.nextLine();
                    String dato = sc.nextLine();
                   lis.insertarDatosAlPrincio(dato);
                    break;

                case 2:
                    System.out.println("Ingrese el valor para agregar al final de la lista");
                    clear = sc.nextLine();
                    String dato1 = sc.nextLine();
                    lis.insertarDatosAlFinal(dato1);
                    break;
                case 3:
                    System.out.println("Ingrese el valor de Nodo anterior al que quiere agregar uno nuevo ");
                    clear = sc.nextLine();
                    String nodoAnterior = sc.nextLine();
                    System.out.println("Ingrese el valore del nuevo Nodo ");
                    String valor = sc.nextLine();
                    lis.insertarEntredosNodos(valor, nodoAnterior);
                    break;
                case 4:
                    System.out.println("Ingrese el valor al nodo que quiere actualizar");
                    clear = sc.nextLine();
                    String nodoActualizar = sc.nextLine();
                    System.out.println("Ingrese el valor actulizado para este Nodo");
                    String nuevoValor = sc.nextLine();
                    lis.actualizarNodo(nodoActualizar, nuevoValor);
                    break;
                case 5:
                    System.out.println("Ingrese el Valor del nodo a Consultar");
                    clear = sc.nextLine();
                    String consulta = sc.nextLine();
                    lis.buscarNodoPorSuValor(consulta);
                    break;
                case 6:
                    System.out.println("Ingrese el valor del Nodo que quire Eliminar");
                    clear = sc.nextLine();
                    String eliminacion = sc.nextLine();
                    lis.eliminarNodoPorSuValor(eliminacion);
                    break;
                case 7:
                    lis.visualizarIncioAFin();
                    System.out.println();
                    break;
                    
                     case 8:
                    lis.visualizarFinAInicio();
                    System.out.println();
                    break;
                case 9:
                    lis.eliminarTodaLaLista();
                    System.out.println("Lista Circular Eliminada por Completo!!");
                    break;

                case 10:
                    System.out.println("Ingrese el valor para ordenarlo de manera Ordenada");
                    clear = sc.nextLine();
                    String ordenado = sc.nextLine();
                    lis.insertarDeFormaOrdenada(ordenado);
                    break;
            }
        } while (opcion != 11);
       
       
        
        
       
       
       
       
    }
    
}
