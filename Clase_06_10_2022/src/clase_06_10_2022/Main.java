/*     
 Creado Por:
           Luis Manuel Castaño Grueso
           09/10/2022
           Estructuras de Datos 
           Unidades Tecnologicas de Santander 
 */

package clase_06_10_2022;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 1;
        Pila P = new Pila();
        Pila Q = new Pila();
        P.primero = null;
        Q.primero = null;
        nodo r;

        System.out.println("");
        int menu;
        do {
            System.out.println("");
            System.out.println("---------------------------");
            System.out.println("1# Apilar por nodo ");
            System.out.println("2# Apilar por dato");
            System.out.println("3# Desapilar");
            System.out.println("4# StackTop ");
            System.out.println("5# Mostrar la lista ");
            System.out.println("6# Salir ");
            System.out.println("");

            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Apilar Nodo ");
                    r = new nodo();
                    r.info = sc.nextInt();
                    P.Push(r);
                    System.out.println("");

                    break;
                case 2:
                    System.out.println("Apilar Dato");
                    r = new nodo();
                    P.Push_(r.info = sc.nextInt());

                    break;
                case 3:
                    P.Pop();

                    break;
                case 4:
                    System.out.println("Ultimo dato digitado es:  ");
                    P.StackTop();

                    break;
                case 5:
                    System.out.println("Mostrando datos de la Pila");
                    System.out.println("");
                    P.ImprimirLista();
                    System.out.println("");
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    throw new AssertionError();
            }

        } while (opc != 6);

    }

    
    
    public static class Pila {

        nodo primero;
        nodo ultimo;
        nodo temporal;

        public Pila() {
            primero = null;
            ultimo = null;
        }

        public void imprimirLista() {
            nodo r = new nodo();
            r = primero;
            while (r != null) {
                System.out.print(r.info + "---->");
                r = r.next;
            }
        }

        public void Push(nodo a) {
            if (primero == null) {
                primero = a;
                ultimo = a;

            } else {
                ultimo.next = a;
                ultimo = ultimo.next;
            }
        }

        public void Push_(int info) {
            if (!Empty()) {
                ultimo.next = new nodo(info, primero);
                ultimo = ultimo.next;
            } else {
                primero = ultimo = new nodo(info, primero);

            }
        }

        public int StackTop() {
            int R;
            nodo T = new nodo();
            T = primero;
            if (primero != null) {
                while (T.next != null) {
                    T = T.next;
                }
                R = T.info;
            } else {
                System.out.println("La pila ya se encuntra Vacia ");
                return 0;
                

            }
            System.out.println(R);
            return R;
        }

        public nodo Pop() {
            nodo r = new nodo();
            nodo s = new nodo();
            if (primero.next != null) {
                s = r = primero;
                while (r.next != null) {
                    s = r;
                    r = r.next;
                }
                s.next = null;
            } else {
                temporal = primero;
                primero = null;

            }
            return r;

        }

        public void ImprimirLista() {
            nodo T = new nodo();
            while (primero != null) {
                T.info = StackTop();
                System.out.println(T.info);
                T = Pop();
                if (T == null) {
                    break;
                }
            }
            if (Empty()) {
                System.out.println("La pila se encuentra Vacia ");
            }
        }

        public boolean Empty() {
            if (primero == null) {
                return true;
            } else {
                return false;
            }
        }

    }

    public static class nodo {

        int info;
        nodo next;

        public nodo() {
            next = null;
        }

        public nodo(int inf) {
            this.next = null;
            this.info = inf;
        }

        public nodo(int inf, nodo n) {
            info = inf;
            next = null;
        }

    }

}
