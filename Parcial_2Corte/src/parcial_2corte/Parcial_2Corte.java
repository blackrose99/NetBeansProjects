package parcial_2corte;

import java.util.Scanner;

public class Parcial_2Corte {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lista_Metodos A = new Lista_Metodos();
        Lista_Metodos B = new Lista_Metodos();
        int tamano = 0;
        int opcion = 0;
        A.inicio = null;
        B.inicio = null;
        nodo nod = null;

        boolean bandera = false;

        do {
            System.out.println("\n Menu \n 1.Ingresar en la primera lista \n 2. Ingresar en la segunda Lista \n 3.Mostrar Listas \n4. Intercalar Lista \n5. Mostrar Lista Intercalada y Circular \n 6. Salir  ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    if (bandera == true) {
                        System.out.println("Ingrese un numero para la primera Listaaaaaa");
                        nod = new nodo();
                        nod.setDato(sc.nextInt());
                        A.Intercalar(B, bandera, nod, tamano);
                        tamano++;
                        break;
                    } else {
                        System.out.println("Ingrese un numero para la primera Lista");
                    }
                    nod = new nodo();
                    nod.setDato(sc.nextInt());
                    A.InsertarNodo(nod);
                    tamano++;
                    break;
                case 2:
                    if (bandera == true) {
                        System.out.println("Ingrese un numero para la primera Listaaaaaa");
                        nod = new nodo();
                        nod.setDato(sc.nextInt());
                        A.Intercalar(B, bandera, nod, tamano);
                        tamano++;
                        break;
                    } else {
                        System.out.println("Ingrese un numero para la Segunda Lista");
                    }
                    nod = new nodo();
                    nod.setDato(sc.nextInt());
                    B.InsertarNodo(nod);
                    tamano++;
                    break;
                case 3:
                    System.out.println("Lista #1");
                    A.MostarLista();
                    System.out.println("");
                    System.out.println("Li1sta #2");
                    B.MostarLista();
                    break;

                case 4:
                    if (A.inicio != null && B.inicio == null) {
                        break;
                    }
                    if (bandera == false) {
                        A.Intercalar(B, bandera, nod, tamano);
                        bandera = true;
                        System.out.println("Lista Intercalada");
                    }else{
                    System.out.println("Lista Intercalada");
                    }
                    break;
                case 5:
                    if (A.inicio != null && B.inicio == null) {
                        A.MostarLista();
                    } else if (A.inicio == null && B.inicio != null) {
                        B.MostarLista();
                    } else if (bandera == true) {
                        A.MostarLista();
                        System.out.println();
                        A.mostrarCircular(tamano);
                    } else {
                        System.out.println("Primero debes Intercalar!!");
                    }
                    break;
            }
        } while (opcion != 6);
    }

}
