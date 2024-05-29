package com.mycompany.contador;
import java.util.Scanner;
public class CONT {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num=sc.nextInt();
        for (int i = 1; i <= num; i++) {
           int raiz=(int)Math.sqrt(i);
            int contador = 0;
            
            
            for (int j = raiz; j > 1; j--) {
                if (i % j == 0) {
                    contador++;
                }

            }
            if (contador < 1) {
                System.out.println(i);
            }
        }

    }

}
