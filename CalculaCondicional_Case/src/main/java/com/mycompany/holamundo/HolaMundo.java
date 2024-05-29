//Date 14/02/2020
//Author M.C.
package com.mycompany.holamundo;

import java.util.Scanner;

public class HolaMundo {

    public static String usuario = "Juan";
    
    public static void main(String[] args) {
        System.out.println("Hola " + HolaMundo.usuario);
        HolaMundo.usuario="Carlos";
        Scanner sc = new Scanner(System.in);

        System.out.println(" 1.sumar \n 2.restar \n 3.multiplicar \n 4.dividir \n" + " Ingrese su Opción");
        int opcion = sc.nextInt();
        System.out.println("Ingre el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Ingre el segundo numero");
        int num2 = sc.nextInt();
        switch (opcion) {
            case 1:
                // sumar(num2, num2);
                System.out.println("El resultado es: " + sumar(num1, num2));
                break;
            case 2:
                restar(num1, num2);
                break;
            case 3:
                multiplicar(num1, num2);
                break;
            case 4:
                validarcero(num1, num2);
                break;
            default:
                System.out.println("Ingrese una opcion valida");
                break;

        }

    }
    public static int sumar(int numA, int numB) {
        int total = numA + numB;
        return total;
    }

    public static void restar(int numA, int numB) {
        int total = numA - numB;
        System.out.println("El resultado es: " + total);
        System.out.println(usuario);
        usuario="Ana";
        System.out.println(usuario);
    }

    public static void multiplicar(int A, int B) {
        int total = A * B;
        imprimirResultado(total);
    }

    public static void dividir(int numA, int numB) {
        int total = numA / numB;

        imprimirResultado(total);

    }

    public static void imprimirResultado(int resultado) {
        System.out.println("El resultado es: " + resultado);
    }

    public static void saludar() {
        System.out.println("Hola Mundo");
        int f = 0;
        //return f; 
    }
    public static void validarcero(int num1, int num2) {
        Scanner sc=new Scanner(System.in);
        if (num2 == 0) {
            do {
                System.out.println("Porfavor ingrese un numero diferente de cero");
                num2 = sc.nextInt();
            } while (num2 == 0);
            dividir(num1, num2);
        } else {
            dividir(num1, num2);
        }

    }
}
