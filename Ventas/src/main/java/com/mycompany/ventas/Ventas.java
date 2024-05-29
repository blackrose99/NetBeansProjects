package com.mycompany.ventas;

import java.util.Scanner;

public class Ventas {

    public static void main(String[] args) {

        double ventas[] = new double[30];
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE LAS 30 VENTAS DEL MES: ");

        for (int i = 0; i < ventas.length; i++) {
            System.out.println("VENTAS " + (i + 1));
            ventas[i] = sc.nextDouble();
        }
        int k = 0;
        int total = 0;
        System.out.println("VENTAS MAYORES O IGUALES A 2000: ");
        while (k < 30) {

            if (ventas[k] >= 2000) {
                System.out.println("$" + Math.round(ventas[k]));
                total++;
            }
            k++;
        }
        System.out.println("EL TOTAL DE LAS VENTAS MAYOR A 2000 SON: " + total);

    }

}
