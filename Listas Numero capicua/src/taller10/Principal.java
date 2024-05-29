package taller10;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner LeerNumero = new Scanner(System.in);
        Pila pil = new Pila();
        System.out.println("Verificador si un numero es capicua o no");
        System.out.println("\n Ingrese el numero a verificar");
        String numero = LeerNumero.next();
        pil.datos(numero);
    }

}
