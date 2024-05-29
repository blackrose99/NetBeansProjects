package arbolesbinarios;

import java.util.Scanner;

public class ArbolesBinarios {

    public static void main(String[] args) {
        //menu para mostrar el arbol genealogico 
        Scanner sc = new Scanner(System.in);
        int menu;
        Arbol P = new Arbol();
        P.InsertarArbol(15, "Abuelo");//tiene 2 hijos 
        P.InsertarArbol(7, "Padre");//tiene 2 hijos 
        P.InsertarArbol(20, "tia");//tiene 2 hijos 
        P.InsertarArbol(21, "Primo");//se va a la derecha de la tia 
        P.InsertarArbol(16, "Prima");//se va a la izquierda de la tia 
        P.InsertarArbol(5, "Yo");//no tengo hijos
        P.InsertarArbol(8, "Hermana");// tiene un hijo
        P.InsertarArbol(9, "Sobrina ");//ultimo nivel hija de mi hermana

        do {
            System.out.println("");
            System.out.println("Bienvenido");
            System.out.println("-------------------");
            System.out.println("Digite una opcion ");
            System.out.println("1# Mostrar Arbol");
            System.out.println("2# Salir ");
            System.out.println("-------------------");
            menu = sc.nextInt();
            switch (menu) {
                case 1:                
                    P.MostrarArbol(P.padre);
                    break;

                case 2:
                    System.out.println("Goodbyeee...");
                    System.exit(0);
                    break;

                default:
                    throw new AssertionError();
            }
        } while (menu != 2);

    }

    public static class Arbol {
        
        nodo padre;

        public Arbol() {
            padre = null;
        }

        public boolean Empty() {
            return padre == null;
        }

        public void InsertarArbol(int key, String familiar) {
            nodo nuevo = new nodo(key, familiar);       
            if (Empty()) {
                padre = nuevo;
            } else {
                 nodo auxiliar = padre;
                 nodo temporal ;
                 
                while (true) {     
                    temporal=auxiliar;
                    if (nuevo.key > auxiliar.key) {
                        auxiliar = auxiliar.derecho;
                        if (auxiliar == null) {
                            temporal.derecho = nuevo;
                            return;
                        }
                        
                    } else if (nuevo.key < auxiliar.key) {
                        auxiliar = auxiliar.izquierdo;
                        if (auxiliar == null) {
                            temporal.izquierdo = nuevo;
                            return;
                        }

                    }

                } //fin de while 
            }

        }

        public void MostrarArbol(nodo a) {
            if (a != null) {
                System.out.println("--------");
                System.out.println("|"+a.nombre+"|");
                MostrarArbol(a.izquierdo);
                MostrarArbol(a.derecho);
               
               
            }
        }
    }

    public static class nodo {
        
        private String nombre;
        private int key;
        private nodo izquierdo;
        private nodo derecho;

        public nodo() {

        }

        public nodo(int llave, String nombre) {
            this.key = llave;
            this.nombre = nombre;
            this.izquierdo = null;
            this.derecho = null;
        }

    }
}
