
package taller_no.pkg12_arbolexpresiones;

import java.util.Scanner;

public class Taller_No12_ArbolExpresiones {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        MetodosExpresionesç nuevo = new MetodosExpresionesç();
        int entrada = 0,entradaSubmenu = 0;
        do {    
            System.out.println("\n 1.DIGITAR UNA EXPRESIÓN MATEMATICA "
                    + "\n 2.VER METODOS DE RECORRIDO "
                    + "\n 3. EXIT");
            entrada = leer.nextInt();
            switch(entrada){
                case 1:
                    System.out.println("DIGITE UNA EXPRESIÓN");
                    String limpiar = leer.nextLine();
                    String expresion = leer.nextLine().replaceAll(" ","");
                 nuevo = new MetodosExpresionesç(expresion);
                    break;

                case 2:
                    do {
                        System.out.println("1.VISUALIZAR EN PREORDEN "
                                + "\n2.VISUALIZAR EN INORDEN "
                                + "\n3.VISUALIZAR EN POSTORDEN "
                                + "\n4.DEVOLVERSE");
                        entradaSubmenu = leer.nextInt();
                        switch (entradaSubmenu) {
                            
                            case 1:
                                System.out.println(nuevo.mostrarPreorden(nuevo.raizArbol));
                                break;

                            case 2:
                                System.out.println(nuevo.mostrarInorden(nuevo.raizArbol));
                                break;

                            case 3:
                                 System.out.println(nuevo.mostrarPosorden(nuevo.raizArbol));
                                break;
                        }
                    } while (entradaSubmenu != 4);
            }
        } while (entrada != 3);
    }
    
}
