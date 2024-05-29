package listas;

import java.util.Random;
import java.util.Scanner;

public class Main_Vehiculos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos_Vehiculo lis = new Metodos_Vehiculo();
        int opcion;
        String limpiar;
        do {
            System.out.println(" Menu de Opciones: \n 1.Registrar datos de un Carro \n 2.Visualizar Lista de Carros \n 3.Salir ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("---------------------------------------------");
                    System.out.println("Ingrese la placa del carro: ");
                    limpiar = sc.nextLine();
                    String placa = sc.nextLine();
                    System.out.println("Ingrese la marca del carro: ");
                    String marca = sc.nextLine();
                    System.out.println("Ingrese el modelo del carro: ");
                    int modelo = sc.nextInt();
                    System.out.println("Ingrese el cilindrage del carro: ");
                    int cilindrage = sc.nextInt();
                    lis.insertarDatosALaCabeza(placa, marca, modelo, cilindrage);
   //si fuera objeto seria: lis.insertarDatosALaCabeza(new persona(nombre, apellido , años, cedula));
                    System.out.println("---------------------------------------------");
                    break;

                case 2:
                    System.out.println("La lista conformada por nodo de Carros es la siguiente: ");
                    lis.verLista();
                    break;
            }
        } while (opcion != 3);
    }

}
