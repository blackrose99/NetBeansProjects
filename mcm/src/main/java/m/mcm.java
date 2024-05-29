

import java.util.Scanner;

public class mcm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op, n1, n2;

        do {
            System.out.println("\n    MENU"
                    + "\n 1. MCD entre dos numeros."
                    + "\n 2. Determinar si un numero es primo"
                    + "\n 3. Hallar el factorial de un número"
                    + "\n 4. Determinar si un número de tres cifras es simétrico"
                    + "\n 5. Determinar con 3 numeros ingresados si son multiplos de 5"
                    + "\n 6. Hallar la cantidad de cifras que tiene un numero entero: "
                    + "\n 7. Hallar el mcm entre dos  numeros: "
                    + "\n 8. Hallar las permutaciones de un conjunto de n elementos, tomando de m elementos: "
                    + "\n 9. Hallar el mayor número que se pueda formar a partir de las tres cifras de un numero dado: "
                    + "\n 10. Salir"
                    + "\n\nIngrese su opcion: ");
            op = sc.nextInt();
            switch (op) {

                case 1:

                    while (true) {
                        boolean mcd = false;
                        System.out.println("Ingrese el Primer numero");
                        n1 = sc.nextInt();
                        System.out.println("Ingrese el Segundo numero");
                        n2 = sc.nextInt();
                        if (n1 > 0 && n2 > 0 && n1 != n2) {
                            if (n1 > n2) {
                                int aux = n1;
                                n1 = n2;
                                n2 = aux;
                            }
                            int i = n1;
                            while (!mcd && i >= 1) {
                                if (n1 % i == 0 && n2 % i == 0) {
                                    System.out.println("El MCD es: " + i);
                                    mcd = true;
                                } else {
                                    i--;
                                }
                            }
                            break;
                        } else if (n1 == n2) {
                            System.out.println("Estos numeros son Iguales. Escriba otros");

                        } else {
                            System.out.println("Estos numeros no son correctos");
                        }
                    }
                    break;

                case 2:
                    System.out.println("Ingrese un Numero");
                    int n = sc.nextInt();
                    int a = 0;
                    for (double i = 1; i <= n; i++) {
                        if (n % i == 0) {
                            a++;
                        }
                    }
                    if (a == 2) {
                        System.out.println("El numero es Primo");
                    } else {
                        System.out.println("El numero no es primo");
                    }

                    break;

                case 3:

                    System.out.println("Ingrese un numero");
                    int nu = sc.nextInt();
                    int f = 1,
                     x;
                    for (x = 1; x <= nu; x++) {
                        f = f * x;
                    }
                    System.out.println("El factorial de " + nu + " es " + f);
                    break;

                case 4:
                    System.out.println("Ingrese el Numero de tres cifras ");
                    int en = sc.nextInt();

                    int c,
                     u;
                    c = en / 100;  //cifra de las centenas
                    u = en % 10;   //cifra de las unidades
                    if (c == u) {
                        System.out.println("Numero Simetrico");

                    } else {
                        System.out.println(" Numero no Simetrico");
                    }

                    break;

                case 5:

                    int ex;
                    boolean ver = false;
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Ingrese el numero para rectificar si es multiplo de '5'");
                        int N1 = sc.nextInt();
                        if (N1 % 5 == 0) {
                            System.out.println("El numero " + N1 + " Es multiplo de '5' ");
                        } else {
                            System.out.println("El numero " + N1 + " No es multiplo de '5' ");
                        }
                    }
                    break;

                case 6:
                    System.out.println("Ingrese un Número");
                    int num = sc.nextInt();
                    int cont = 0;
                    while (num != 0) {
                        num = num / 10;
                        cont++;

                    }
                    System.out.println("El Numero Tiene: " + cont + " Cifras");

                    break;

                case 7:
                    System.out.println("Ingrese el Primer valor");
                    int m1 = sc.nextInt();//8
                    System.out.println("Ingrese el segundo valor");
                    int m2 = sc.nextInt();//12
                    System.out.println("Ingrese el Tercer valor");
                    int m3 = sc.nextInt();//10
                    int max = m1,
                     i;

                    if (m2 > max) {
                        max = m2;
                    }
                    if (m3 > max) {
                        max = m3;
                    }
                    i = max;
                    while ((i % m1 != 0) || (i % m2 != 0) || (i % m3 != 0)) {
                        i++;
                    }
                    System.out.println(" El mcm de " + m1 + " y " + m2 + " y " + m3 + " es: " + i);

                    break;

                case 8:

                    System.out.println("Ingrese El conjunto de las Permutaciones");
                    int num1 = sc.nextInt();
                    System.out.println("Ingrese el numero que quiere para combinar");
                    int num2 = sc.nextInt();
                    int p;
                    p = facto(num1) / facto(num2);
                    System.out.println("Las combianciones que son de: " + p);

                    break;

                case 9:

                    break;

            }
        } while (op != 10);

    }

    public static int facto(int t) {
        int f = 1, x;
        for (x = 1; x <= t; x++) {
            f = f * x;

        }

        return f;
    }

}
