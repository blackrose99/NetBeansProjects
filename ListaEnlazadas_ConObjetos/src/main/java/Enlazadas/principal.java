package Enlazadas;

import java.util.Scanner;

public class principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Lista lis = new Lista();
        int opcion;
        String limpiar;
        do {
            System.out.println(" Menu de Opciones: \n 1.Registrar datos de un carro al principio \n 2. Registrar datos de un carro en el medio \n 3. Registrar datos de un carro al final \n 4. Buscar un carro por su placa \n 5.Eliminar por placa \n 6. Mostrar datos de los carros \n 7. Modificar nodo \n 8.Salir ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("---------------------------------------------");
                    System.out.println("Ingrese la placa del carro: ");
                    limpiar = sc.nextLine();
                    String placa = sc.nextLine();
                    System.out.println("Ingrese el modelo el modelo de  l carro: ");
                    int modelo = sc.nextInt();
                    System.out.println("Ingrese el cilindraje del carro: ");
                    int cilindraje = sc.nextInt();
                    limpiar = sc.nextLine();
                    System.out.println("Ingrese la marca del carro: ");
                    String marca = sc.nextLine();
                    lis.agregarAlInicio(new vehiculo(placa, modelo, cilindraje, marca));
                    System.out.println("---------------------------------------------");
                    break;

                case 2:
                    System.out.println("Indique el nodo en el que quiere colocar un elemento adelante");
                    limpiar = sc.nextLine();
                    String  nodoIntemedio = sc.nextLine();
                    System.out.println("---------------------------------------------");
                    System.out.println("Ingrese la placa del carro: ");
                    limpiar = sc.nextLine();
                    String placa1 = sc.nextLine();
                    System.out.println("Ingrese el modelo el modelo del carro: ");
                    int modelo1 = sc.nextInt();
                    System.out.println("Ingrese el cilindraje del carro: ");
                    int cilindraje1 = sc.nextInt();
                    limpiar = sc.nextLine();
                    System.out.println("Ingrese la marca del carro: ");
                    String marca1 = sc.nextLine();
                    lis.agregarEnLaMitad(nodoIntemedio, new vehiculo(placa1, modelo1, cilindraje1, marca1));
                    System.out.println("---------------------------------------------");
                    break;

                case 3:
                    System.out.println("---------------------------------------------");
                    System.out.println("Ingrese la placa del carro: ");
                    limpiar = sc.nextLine();
                    String placa2 = sc.nextLine();
                    System.out.println("Ingrese el modelo el modelo del carro: ");
                    int modelo2 = sc.nextInt();
                    System.out.println("Ingrese el cilindraje del carro: ");
                    int cilindraje2 = sc.nextInt();
                    limpiar = sc.nextLine();
                    System.out.println("Ingrese la marca del carro: ");
                    String marca2 = sc.nextLine();
                    lis.agregarAlFinal(new vehiculo(placa2, modelo2, cilindraje2, marca2));
                    System.out.println("---------------------------------------------");
                    break;
                case 4:
                    limpiar = sc.nextLine();
                    System.out.println("Ingrese la Placa del carro a consular");
                    String buscarPlaca = sc.nextLine();
                    lis.BuscarPorPlaca(buscarPlaca);
                    break;

                case 5:
                   limpiar = sc.nextLine();
                    System.out.println("Ingrese la placa del carro a eliminar");
                    String notoEliminado = sc.nextLine();
                    lis.eliminnarNodoEnEspecifico(notoEliminado);
                    break;

                case 6:
                    lis.verLista();
                    break;
                    
                case 7:
                    System.out.println("Indique el nodo en el que quiere modificar sus datos");
                    String nodoIntemedio0 = sc.nextLine();
                    System.out.println("---------------------------------------------");
                    System.out.println("Ingrese la placa del nueva placa ");
                    limpiar = sc.nextLine();
                    String placa0 = sc.nextLine();
                    System.out.println("Ingrese el nuevo modelo el modelo del carro: ");
                    int modelo0 = sc.nextInt();
                    System.out.println("Ingrese el nuevo cilindraje del carro: ");
                    int cilindraje0 = sc.nextInt();
                    limpiar = sc.nextLine();
                    System.out.println("Ingrese la nueva marca del carro: ");
                    String marca0 = sc.nextLine();
                    lis.modificarNodo(nodoIntemedio0, placa0, modelo0, cilindraje0, marca0);
                    System.out.println("---------------------------------------------");
                    break;

            }
        } while (opcion != 8);
    }
}
