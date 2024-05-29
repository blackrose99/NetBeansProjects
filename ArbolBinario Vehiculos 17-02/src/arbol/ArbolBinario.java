package arbol;

import java.util.Scanner;
public class ArbolBinario {
       public static final String ANSI_RED = "\u001B[32m";
       public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
       Scanner entra = new Scanner(System.in);
       class_Arbol objeto = new class_Arbol();
       int opcion1, opcion2;
       String clearEntrada;

        do {
            System.out.println( ANSI_RED + "--Menu de Opciones--"
                    + ANSI_RED+"\n 1.Registrar un nuevo Vehiculo"
                    + ANSI_RED+"\n 2.Consultar un Vehiculo por su Placa "
                    + ANSI_RED+"\n 3.Eliminar un Vehiculo"
                    + ANSI_RED+"\n 4.Seleccionar Metodos de Visualización"
                    + ANSI_RED+"\n 5.Ver Cuantos Nodos tiene El arbol Y Cuantos Nodos Hojas tiene el Arbol"
                    + ANSI_RED+"\n 6.Ver la Altura del arbol"
                    + ANSI_RED+"\n 7.Exit" + ANSI_RESET);
            opcion1 = entra.nextInt();
            
            
            switch (opcion1) {
                case 1:
                    System.out.println(ANSI_RED+"Ingrese la Placa del Vehiculo");
                    clearEntrada = entra.nextLine();
                    String placa = entra.nextLine();
                    System.out.println(ANSI_RED+"Ingrese el Modelo del Vehiculo");
                    int modelo = entra.nextInt();
                    System.out.println(ANSI_RED+"Ingrese el Cilindraje del Vehiculo");
                    int cilindraje = entra.nextInt();
                    System.out.println(ANSI_RED+"Ingrese la Marca del Vehiculo");
                     clearEntrada = entra.nextLine();
                    String marca = entra.nextLine();
                    objeto.insertarVehiculo(new vehiculo(placa, modelo, cilindraje, marca));
                    break;
                case 2:
                    System.out.println(ANSI_RED+"Ingrese la Placa que quiere Consultar");
                    clearEntrada = entra.nextLine();
                    String placaBuscar = entra.nextLine();
                    System.out.println(objeto.buscarNodo(placaBuscar));
                    break;
                case 3:
                    System.out.println(ANSI_RED+"Inglrese la Placa del Vehiculo a Eliminar");
                    clearEntrada = entra.nextLine();
                    String placaEliminar = entra.nextLine();
                       objeto.eliminar(placaEliminar);
                    break;
                case 4:
                    do {
                        System.out.println(ANSI_RED+"1.Visualizar datos en PreOrden"
                                + ANSI_RED+"\n 2.Visualizar datos en InOrden"
                                + ANSI_RED+"\n 3.Visualizar datos en PostOrden"
                                + ANSI_RED+"\n 4.Volver al Menu Principal");
                        opcion2 = entra.nextInt();
                        switch (opcion2) {
                            case 1:
                                if (!objeto.EstaVacio()) {
                                    objeto.MostrarEnPreOrden(objeto.raiz);
                                } else {
                                    System.out.println(ANSI_RED + "Árbol Vacio!!!" + ANSI_RESET);
                                }
                                break;

                            case 2:
                                if (!objeto.EstaVacio()) {
                                    objeto.MostrarEnInoden(objeto.raiz);
                                } else {
                                    System.out.println(ANSI_RED + "Árbol Vacio!!!" + ANSI_RESET);
                                }
                                break;

                            case 3:

                                if (!objeto.EstaVacio()) {
                                    objeto.MostrarEnPostOrden(objeto.raiz);
                                } else {
                                    System.out.println(ANSI_RED + "Árbol Vacio!!!" + ANSI_RESET);
                                }
                                break;
                        }

                    } while (opcion2 != 4);
                    
                    break;
                    
                    
                    
                    
                case 5:
                    System.out.println("La cantidad de nodos que tiene el árbol es de: " + objeto.cuentaNodos(objeto.raiz));
                    System.out.println("La cantidad de nodos Hoja que tiene el arbol es de: " + objeto.cuentaHojas(objeto.raiz));
                    break; 
                    
                    
                case 6:
                    
                    break;
                            
            }
        } while (opcion1 != 7);

    }
    
}