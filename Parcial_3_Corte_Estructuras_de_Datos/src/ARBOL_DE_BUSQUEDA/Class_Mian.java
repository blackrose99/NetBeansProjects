
package ARBOL_DE_BUSQUEDA;

import java.util.Scanner;


public class Class_Mian {
       public static final String ANSI_RED = "\u001B[35m";
       public static final String ANSI_RESET = "\u001B[0m";
        public static void main(String[] args) {
       Scanner entra = new Scanner(System.in);
       Class_Arbol_Binario objeto = new Class_Arbol_Binario();
       int opcion1, opcion2;

        do {
            System.out.println( "--Menu de Opciones--"
                    + ANSI_RED+"\n 1.Agregar un Valor real" 
                    + ANSI_RED+"\n 2.Eliminar un Valor real" 
                    + ANSI_RED+"\n 3.El Valor real Mayor del Arbol Binario de Búsqueda es: y los numeros pares son:" 
                    + ANSI_RED+"\n 4.El Valor real menor del Arbol Binario de Búsqueda es:" 
                    + ANSI_RED+"\n 5.El Valor total de Nodos del Arbol Binario de Búsqueda es:" 
                    + ANSI_RED+"\n 6.Ver las tres formas de recorrido" 
                    + ANSI_RED+"\n 7.Exit" + ANSI_RESET);
            opcion1 = entra.nextInt();
            switch (opcion1) {
                case 1:
                        
                    System.out.println("Ingrese un Valor");
                    int valor = entra.nextInt();
                    objeto.insertarunNumero(valor);
                    break;
                    
                    
                case 2:
                    System.out.println("Ingrese el Valor a Eliminar");
                    int valorEliminar = entra.nextInt();
                    objeto.eliminar(valorEliminar);
                    break;
                    
                    
                    
                case 3:
                    System.out.println("El Valor mayor del Árbol Binario es: " +  objeto.buscarNumeroMayor(objeto.raiz));
                    
                     objeto.mostrarNumerosPares(objeto.raiz);
                    break;
                    
                    
                    
                    
                    
                case 4:
                    System.out.println("El Valor menor del Árbol Binario es: " +  objeto.buscarNumeroMenor(objeto.raiz));
                     objeto.mostrarNumerosInpares(objeto.raiz);
                    break;
                    
                    
                    
                case 5:
                    System.out.println("La cantidad de nodos que hay en el arbol es de: " +  objeto.cuentaNodos(objeto.raiz));
                    break;
                    
                    
                case 6:

                    do {
                        System.out.println(ANSI_RED + "1.Visualizar datos en PreOrden"
                                + ANSI_RED + "\n 2.Visualizar datos en InOrden"
                                + ANSI_RED + "\n 3.Visualizar datos en PostOrden"
                                + ANSI_RED + "\n 4.Volver al Menu Principal");
                        opcion2 = entra.nextInt();
                        switch (opcion2) {
                            case 1:
                                if (!objeto.isEmpy()) {
                                    objeto.MostrarEnPreOrden(objeto.raiz);
                                } else {
                                    System.out.println(ANSI_RED + "Árbol Vacio!!!" + ANSI_RESET);
                                }
                                break;

                            case 2:
                                if (!objeto.isEmpy()) {
                                    objeto.MostrarEnInoden(objeto.raiz);
                                } else {
                                    System.out.println(ANSI_RED + "Árbol Vacio!!!" + ANSI_RESET);
                                }
                                break;

                            case 3:

                                if (!objeto.isEmpy()) {
                                    objeto.MostrarEnPostOrden(objeto.raiz);
                                } else {
                                    System.out.println(ANSI_RED + "Árbol Vacio!!!" + ANSI_RESET);
                                }
                                break;
                        }

                    } while (opcion2 != 4);

                    break;
            }
        } while (opcion1 != 7);

    }
    
}
