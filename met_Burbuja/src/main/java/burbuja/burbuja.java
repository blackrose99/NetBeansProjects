package burbuja;
import java.util.Arrays;
import java.util.Scanner;
public class burbuja {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int entrada, llenarArreglo;
        System.out.println("Ingrese el tamaño del arreglo");
        entrada= sc.nextInt();
        int arrayyy[] = new int[entrada];
        int tpm;
        for (int i = 0; i < arrayyy.length; i++) {
            System.out.println("ingrese un valor" );
            llenarArreglo = sc.nextInt();
        arrayyy[i] = llenarArreglo;
        }
        for (int i = 0; i < arrayyy.length; i++) {
            for (int j = 0; j < arrayyy.length-1; j++) {
                if(arrayyy[j]>arrayyy[j+1]){
                    tpm=arrayyy[j];
                    arrayyy[j]=arrayyy[j+1];
                    arrayyy[j+1]=tpm;               
                }
            }
        } 
        System.out.println(Arrays.toString(arrayyy));  
        System.out.println("El numero menor es: " + arrayyy[0]);
        System.out.println("El numero mayor es: " + arrayyy[entrada-1]);
    }
}
