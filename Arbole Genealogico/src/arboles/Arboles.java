package arboles;

import java.util.Scanner;

public class Arboles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu, buscando;
        arbolBinario P = new arbolBinario();

        P.agregar(30, "Abuelo Hector <-- 1 Nivel");
        P.agregar(40, "Padre: Carlos <-- 2 Nivel");
        P.agregar(45, "Hermana: Kathe <-- 3 Nivel");
        P.agregar(39, "Hermano: Maicol <-- 3 Nivel");
        P.agregar(50, "Sobrina: Maria <-- 4 Nivel hijos del 3 Nivel");
        P.agregar(42, "Sobrino: Juan <-- 4 Nivel hijos del 3 Nivel");
        P.agregar(60, "Sobrino Nieto: Sebastian <-- 5 Nivel hijos del 4 Nivel");
        P.agregar(49, "Sobrino Nieto: Marlon <-- 5 Nivel hijos del 4 Nivel");
        
        do {
            System.out.println("");
            System.out.println("Bienvenido");
            System.out.println("-------------------");
            System.out.println("Digite una opcion ");
            System.out.println("1. Mostrar Arbol");
            System.out.println("2. Buscar un nodo");
            System.out.println("3. Salir ");
            System.out.println("-------------------");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    P.MostrarArbol(P.raiz);
                    break;
                case 2:
                    if(!P.Empty()){
                        System.out.println("Ingrese el identificador del nodo que quieres buscar");
                     buscando = sc.nextInt();
                        if(P.buscar(buscando) == null){
                            System.out.println("No ha sido encontrado esta clave");
                        }else{
                            System.out.println(P.buscar(buscando));
                        }
                    }else{
                        System.out.println("El arbol esta vacio");
                    }
                    break;
                case 3:
                    System.out.println("See you Later....!!");
                    System.exit(0);
                    break;
                default:
                    throw new AssertionError();
            }
        } while (menu != 3);
    }


}
