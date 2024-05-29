
package ejercicio4_corte_2_lcse;

import java.util.Scanner;


public class PRINCIPAL {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        lista_enlazada lista = new lista_enlazada();

        String limpiar;
        int numero = 0;

        do {
            System.out.println("");
            System.out.println("BIENVENIDO AL MENU DE ASIGNATURA \n "
                    + "1.CREAR NODO \n"
                    + "2.INSERTAR ENTRE DOS NODOS \n"
                    + "3.BUSCAR UN NODO \n"
                    + "4.ELIMINAR UN NODO\n"
                    + "5.VISUALIZAR \n"
                    + "6.SALIR \n");
            numero = sc.nextInt();

            switch (numero) {

                case 1:
                    limpiar = sc.nextLine();
                    System.out.println("DIGITE EL CODIGO: ");
                    String codigo = sc.nextLine();
                    System.out.println("DIGITE EL NOMBRE: ");
                    String nombre = sc.nextLine();
                    System.out.println("DIGITE LA CARRERA: ");
                    String carrera = sc.nextLine();
                    System.out.println("DIGITE LOS CREDITOS: ");
                    int numerocredito = sc.nextInt();

                    lista.agregarinicio(new asignatura(codigo, nombre, carrera, numerocredito));
                    break;

                case 2:

                    System.out.println("DATOS RECIENTES:");
                    lista.listar();
                    System.out.println("");
                    System.out.println("");
                    System.out.print("INDIQUE EL NODO DONDE QUIERE INSERTAR: \n");
                    int codigoo = sc.nextInt();
                    limpiar = sc.nextLine();
                    System.out.println("DIGITE EL CODIGO: ");
                    String codigo2 = sc.nextLine();
                    System.out.println("DIGITE EL NOMBRE: ");
                    String nombre2 = sc.nextLine();
                    System.out.println("DIGITE LA CARRERA: ");
                    String carrera2 = sc.nextLine();
                    System.out.println("DIGITE LOS CREDITOS: ");
                    int numerocredito2 = sc.nextInt();

                    lista.agregarentredos(codigoo, new asignatura(codigo2, nombre2, carrera2, numerocredito2));
                    break;

                case 3:
                    System.out.println("DATOS RECIENTES:");
                    lista.listar();
                    System.out.println("");
                    System.out.println("");
                    limpiar = sc.nextLine();
                    System.out.println("INGRESE EL CODIGO DEL NODO PARA BUSCAR: \n");
                    String busca = sc.nextLine();
                    lista.buscar(busca);
                    break;

                case 4:
                    System.out.println("DATOS RECIENTES:");
                    lista.listar();
                    System.out.println("");
                    System.out.println("");
                    limpiar = sc.nextLine();
                    System.out.println("INGRESE EL CODIGO DEL NODO PARA ELIMINAR: \n");
                    String eliminar = sc.nextLine();
                    lista.eliminarNodo(eliminar);
                    break;

                case 5:
                    System.out.println("LA LISTA ES: \n");
                    lista.listar();
                    break;
            }
            System.out.println("");
        } while (numero != 6);
    }
}
