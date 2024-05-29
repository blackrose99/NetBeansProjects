package arbolexpresiones;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion = 0, opcion2 = 0;
        ArbolExpresiones nuevo = new ArbolExpresiones();
        do {
            System.out.println("\n 1.Ingresar una expresion \n 2.Formas de Recorrido \n 3. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la Expresión");
                    String limpiar = sc.nextLine();
                    String expre = sc.nextLine().replaceAll(" ", "");
                    nuevo = new ArbolExpresiones(expre);
                    break;

                case 2:
                    do {
                        System.out.println("1.Ver en PreOrden \n2.Ver en InOrden \n3.Ver en PostOrden \n4.Regresar");
                        opcion2 = sc.nextInt();
                        switch (opcion2) {

                            case 1:
                                System.out.println(nuevo.preorden(nuevo.raiz));
                                break;

                            case 2:
                                System.out.println(nuevo.inorden(nuevo.raiz));
                                break;

                            case 3:
                                System.out.println(nuevo.posorden(nuevo.raiz));
                                break;
                            case 4:
                                nuevo.raiz = null;
                                break;
                        }
                    } while (opcion2 != 4);

            }
        } while (opcion != 3);
    }
}
