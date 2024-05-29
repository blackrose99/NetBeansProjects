package mediana;

import java.util.Scanner;

public class calcularMediana {
    static int numeros[];
    static int dimencion;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese la dimención de la array : ");
        int dimen = sc.nextInt();
        numeros = new int[dimen];
        dimencion = numeros.length; 
        llenarArray();
        ordenarArrayMetodoSeleccion(numeros);
        mostrarArray(numeros);
        System.out.println("La mediana es " + calcularMediana());

    }
    public static void llenarArray() {
        int cont = 0;
        for (int i = 0; i < dimencion; i++) {
            cont++;
            System.out.println("Ingrese el elemento numero " + (cont));
            numeros[i] = sc.nextInt();
        }
    }
    public static void mostrarArray(int arra[]) {
        System.out.println();
        for (int i = 0; i < arra.length; i++) {
            System.out.print(arra[i] + "\n");
        }
    }
    public static void ordenarArrayMetodoSeleccion(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minimo]) {
                    minimo = j;
                }
            }
            int aux = array[i];
            array[i] = array[minimo];
            array[minimo] = aux;
            
            
            System.out.println("Ordenacion en la " + (i + 1) + " vuelta");
            for (int h = 0; h < array.length; h++) {
                System.out.print("[" + array[h] + "]");
            }
            System.out.println("");

        }
    }
    public static double calcularMediana() {
        double mediana;
        if (dimencion % 2 == 0) {            
            int sumarNumerosMedios = numeros[dimencion / 2] + numeros[dimencion / 2 - 1];
            mediana = (double) sumarNumerosMedios / 2;
        }else {
            mediana = numeros[dimencion / 2];
        }
        return mediana;
    }
    
    
    public static void mostrarOrden(int []numerosOrdenados){
        for (int i = 0; i < numerosOrdenados.length; i++) {
            System.out.println("["+ numerosOrdenados[i] +"]");
            
        }
    }
}
