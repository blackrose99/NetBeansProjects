package presentacion;

import datos.empleadoDAO;
import dominio.empleado;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        do {
            System.out.println("Digite una opcion ");
            System.out.println("1: Mostrar Datos del Empleado");
            System.out.println("2: Insertar Datos del Empleado");
            System.out.println("3: Elininar Datos del Empleado");
            System.out.println("4: Actualizar Datos del Empleado");
            System.out.println("5: Salir");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    mostrar();
                    break;
                case 2:
                    insertar();
                    break;
                case 3:
                    eliminar();
                    break;
                case 4:
                    actualizar();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    throw new AssertionError();
            }
        } while (menu != 5);

    }

    public static void mostrar() {
        empleadoDAO emple = new empleadoDAO();
        List<empleado> empleados = emple.mostrar();

        for (empleado empleado1 : empleados) {

            System.out.println(empleado1);
        }
    }
     public static void insertar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el apellido del empleado: ");
        String apellido = sc.nextLine();
        System.out.println("Ingrese el email del empleado: ");
        String email = sc.nextLine();
        System.out.println("Ingrese el teléfono del empleado: ");
        String telefono = sc.nextLine();

        empleado nuevoEmpleado = new empleado(nombre, apellido, email, telefono);
        empleadoDAO emple = new empleadoDAO();
        int registrosInsertados = emple.insertar(nuevoEmpleado);

        if (registrosInsertados > 0) {
            System.out.println("Empleado insertado exitosamente.");
        } else {
            System.out.println("No se pudo insertar el empleado.");
        }
    }

 public static void eliminar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el ID del empleado a eliminar: ");
        int id = sc.nextInt();

        empleadoDAO emple = new empleadoDAO();
        int registrosEliminados = emple.eliminar(id);

        if (registrosEliminados > 0) {
            System.out.println("Empleado eliminado exitosamente.");
        } else {
            System.out.println("No se pudo eliminar el empleado.");
        }
    }

    public static void actualizar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el ID del empleado a actualizar: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea después del número

        System.out.println("Ingrese el nuevo nombre del empleado: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el nuevo apellido del empleado: ");
        String apellido = sc.nextLine();
        System.out.println("Ingrese el nuevo email del empleado: ");
        String email = sc.nextLine();
        System.out.println("Ingrese el nuevo teléfono del empleado: ");
        String telefono = sc.nextLine();

        empleado empleadoActualizado = new empleado(nombre, apellido, email, telefono);
        empleadoActualizado.setId(id);

        empleadoDAO emple = new empleadoDAO();
        int registrosActualizados = emple.actualizar(empleadoActualizado);

        if (registrosActualizados > 0) {
            System.out.println("Empleado actualizado exitosamente.");
        } else {
            System.out.println("No se pudo actualizar el empleado.");
        }
    }
}
