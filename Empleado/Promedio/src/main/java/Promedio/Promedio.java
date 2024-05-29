package Promedio;
import java.util.Scanner;


public class Promedio {
    
    public static void main(String[] args) {
        
        int num=0, suma=0, cantidadNumero=0;
        double media;
        Scanner sc=new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO (POSITIVO) ");
        num=sc.nextInt();
        while(num>0){
            suma=suma+num;
            cantidadNumero++;
            System.out.println(" INGRESE OTRO NUMERO ");
             num=sc.nextInt();
        }
        if(cantidadNumero==0){
            System.out.println(" NO SE PUEDE CALCULAR EL PROMEDIO ");
        }
        else{
            media=suma/cantidadNumero;
            System.out.println("EL PROMEDIO DE ESTOS NUMEROS ES: "+media);
        }
    }
    
}
