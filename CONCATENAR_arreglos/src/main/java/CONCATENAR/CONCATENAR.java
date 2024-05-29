package CONCATENAR;

import java.util.Scanner;

public class CONCATENAR {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array1 = new int[leerNumeros("Dimencion del Primer arreglo")];
        int[] array2 = new int[leerNumeros("Dimencion del segundo arreglo")];
        int[] array3 = new int[leerNumeros("Dimencion del Tercer arreglo")];
        
        
        int[] arrayConcatenado = new int[array1.length +  array2.length + array3.length];
        System.out.println("ingrese los valores del Primer arreglo ");
        llenar(array1);
        System.out.println("Los valores ingresados del Primer arreglo son: ");
        visualizar(array1);
        System.out.println();
        System.out.println("ingrese los valores del Segundo arreglo ");
        llenar(array2);
        System.out.println("Los valores ingresados del Segundo arreglo son: ");
        visualizar(array2);
        System.out.println();
        System.out.println("ingrese los valores del Tercer arreglo ");
        llenar(array3);
        System.out.println("Los valores ingresados del Tercer arreglo son: ");
        visualizar(array3);
        System.out.println();

         arregloConcatenado(array1, array2, array3, arrayConcatenado);
        
        System.out.println("El nuevo Arreglo concatenado es: ");
        visualizar(arrayConcatenado);
        
        

    }
    
    public static void arregloConcatenado(int arreglo1[], int arreglo2[], int arreglo3[]   , int arregloResultante[]){
        for (int i = 0; i < arreglo1.length; i++) {
            arregloResultante[i] = arreglo1[i];
        }

        
        for (int i = 0, j = arreglo1.length; i  < arreglo2.length ;i++, j++) {
            arregloResultante[j] = arreglo2[i];
        }
        
        
        for (int i = 0 , k = arreglo1.length + arreglo2.length; i < arreglo3.length;k++, i++) {
            arregloResultante[k] = arreglo3[i];
        }
        
    }
    public static int leerNumeros(String mensaje) {
        System.out.println(mensaje);
        int num = sc.nextInt();
        return num;
    }
    
    
    public static void visualizar(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void llenar(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = leerNumeros("Ingresel el " + (i+1) + " valor " );
        }
    }
    
    
    

}
