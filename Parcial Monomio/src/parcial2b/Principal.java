package parcial2b;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner LeerNumero = new Scanner(System.in);
        int op;
        Lista lista = new Lista();
        double total2 = 0;

        do {
            System.out.println("MENU DE OPCIONES");
            System.out.println("1 Ingresar un nuevo monomio ");
            System.out.println("2 Mostrar la tabla con los calculos ");
            System.out.println("3 Mostrar el polinomio");
            System.out.println("4 Salir ");

            op = LeerNumero.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingrese el termino");
                    int termino = LeerNumero.nextInt();

                    System.out.println("Ingrese el exponente ");
                    System.out.println(" Recuerde que si el exponente es 0 se tomara como termino independiente ");
                    int exponente = LeerNumero.nextInt();
                    while (exponente < 0) {
                        System.out.println(" Por favor ingrese un exponente mayor o igual a 0 ");
                        exponente = LeerNumero.nextInt();

                    }
                    lista.insertarTerminoExponente(new Polinomio(termino, exponente));
                    break;
                case 2:
                    lista.vizualizarPolinomio();
                    System.out.println("Tabla de calculo ");

                    lista.calculo();

                    break;

                case 3:
                    System.out.print("Polinomio: ");
                    lista.vizualizarPolinomio();
                    System.out.println();
                    break;

            }
        } while (op != 4);
    }

}
