package ListaEnlazadas_DoblementeCirculares;
import java.util.Scanner;
public class Class_Main {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        ClassMetodos lis = new ClassMetodos();
        int opcion = 0;
        String clear;
        do {
            System.out.println("\n -- Menu de Opciones --\n"
                    + "1. Agregar un Vehiculo al Principio de la Lista\n"
                    + "2. Agregar un Vehiculo al Final de la Lista\n"
                    + "3. Agregar un Vehiculo entre dos\n"
                    + "4. Editar Dato de un Vehiculo\n"
                    + "5. Buscar un Vehiculo por su Placa\n"
                    + "6. Eliminar un Vehiculo por su Placa\n"
                    + "7. Visualizar todos datos de los Vehiculos de inicio a fin\n"
                    + "8. Visualizar todos datos de los Vehiculos de fin a inicio\n"
                    + "9. Eliminar toda la lista de los Vehiculos\n"
                    + "10. Agregar datos de Vehiculos de Forma Ordenada\n"
                    + "11. Salir del Menu");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    lis.insertarDatosAlPrincio(automatic());
                    break;
                case 2:
                    lis.insertarDatosAlFinal(automatic());
                    break;
                case 3:
                    System.out.println("Ingrese la  Placa del Vehiculo anterior a donde quiere insertar el Nuevo");
                    clear = sc.nextLine();
                    String nodoAnterior = sc.nextLine();
                   lis.insertarEntredosNodos(automatic(), nodoAnterior);
                    break;
                case 4:
                    System.out.println("Ingrese la Placa del Vehiculo que quiere actualizar");
                     clear = sc.nextLine();
                    String nodoActualizar = sc.nextLine();
                    lis.actualizarNodo(nodoActualizar, automatic());
                    break;
                case 5:
                    System.out.println("Ingrese la Placa del Vehiculo a consultar");
                    String consulta = sc.next();
                    lis.buscarNodoPorSuValor(consulta);
                    break;
                case 6:
                    System.out.println("Ingrese la Placa del Vehiculo que quiere Eliminar");
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
                    System.out.println("Inserccion de forma ordenada Por su Placa");
                    lis.insertarDeFormaOrdenada(automatic());
                    break;
            }
        } while (opcion != 11);
    }

    public static ClassObject automatic() {
        Scanner sc = new Scanner(System.in);
        String limpiar;
        System.out.println("---------------------------------------------");
        System.out.println("Ingrese la Placa del nuevo Vehiculo: ");
        String placa = sc.nextLine();
        System.out.println("Ingrese el Modelo del nuevo Vehiculo: ");
        int modelo = sc.nextInt();
        System.out.println("Ingrese el Cilindraje del nuevo Vehiculo: ");
        int cilindraje = sc.nextInt();
        limpiar = sc.nextLine();
        System.out.println("Ingrese la Marca del nuevo Vehiculo: ");
        String marca = sc.nextLine();
        System.out.println("---------------------------------------------");
        ClassObject obj = new ClassObject(placa, modelo, cilindraje, marca);
        return obj;
    }

}
