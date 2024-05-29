package Asignatura;

import java.util.Scanner;

public class Class_Principal {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Doblemente_Enlazada objeto = new Doblemente_Enlazada();
        String clear;
        int opcion = 0;
        do {
            System.out.println("MENU DE OPERACIONES\n"
                    + "1. Insertar informacion de una Asignatura al principio\n"
                    + "2. Insertar informacion de una Asignatura al final\n"
                    + "3. Mostrar informacion de las Asignaturas de inicio a fin\n"
                    + "4. Mostrar informacion de las Asignaturas de fin a inicio\n"
                    + "5. Insertar una Asignatura despues de una en especifico\n"
                    + "6. Buscar una Asignatura por su Codigo\n"
                    + "7. Eliminar una Asignatura por su Codigo \n"
                    + "8. Salir del Programa");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    clear = sc.nextLine();
                    objeto.insertarInicio(llamadoDatos());
                    break;
                case 2:
                    clear = sc.nextLine();
                    objeto.insertarFin(llamadoDatos());
                    break;
                case 3:
                    objeto.VisualizarListaIniciofFin();
                    break;
                case 4:
                    objeto.VisualizarListaFinInicio();
                    break;
                case 5:
                    clear = sc.nextLine();
                    System.out.println("Digite el codigo de la Asignatura en la que quiere insertar una asignatura despues");

                    String calorIntermedio = sc.nextLine();

                    objeto.insertarEntreDosNodos(calorIntermedio, llamadoDatos());
                    break;

                case 6:
                    System.out.println("Digite el codigo de la asignatura a consultar");
                    clear = sc.nextLine();
                    String codigo = sc.nextLine();
                    objeto.BuscarPorElCodigo(codigo);
                    break;

                case 7:
                    System.out.println("Digite el codigo de la asignatura que quiere eliminar");
                    clear = sc.nextLine();
                    String codigoAEliminar = sc.nextLine();
                    objeto.Eliminacion(codigoAEliminar);
                    break;
                case 8:
                    System.out.println("Gracias por Utilizar nuestros Servicios!!");
                    break;
            }
        } while (opcion != 8);
        
    }

    public static Asignatura_Objeto llamadoDatos() {
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
        System.out.println("Digite el Codigo de la nueva asignatura: ");
        String codigo = sc.nextLine();
        System.out.println("Digite el Nombre de la nueva asignatura: ");
        String nombre = sc.nextLine();
        System.out.println("Digite el Nombre de la carrera: ");
        String carrera = sc.nextLine();
        System.out.println("Digite el Numero de Creditos: ");
        int numeroCreditos = sc.nextInt();
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
        Asignatura_Objeto retorno = new Asignatura_Objeto(codigo, nombre, carrera, numeroCreditos);
        return retorno;
    }
}
