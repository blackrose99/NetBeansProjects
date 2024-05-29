package ejercicio2_listas_dinamicas;

import java.util.Scanner;

public class Listas_Dinamicas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        listas n = new listas();
        int menu;
        do {
            System.out.println("");
            System.out.println("MENU DE OPCIONES");
            System.out.println("#1 Ingresar al Inicio ");
            System.out.println("#2 Listar la LISTA ");
            System.out.println("#3 Insertar al Final");
            System.out.println("#4 Insertar entre nodos");
            System.out.println("#5 Eliminar un Nodo");
            System.out.println("#6 Buscar ");
            System.out.println("#7 Salir ");
            System.out.println("");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Digite el codigo");
                    String xxxx = sc.nextLine();
                    String codigo = sc.nextLine();
                    System.out.println("Digite el nombre");
                    String nombre = sc.nextLine();
                    System.out.println("Digite la Ciudad");
                    String ciudad = sc.nextLine();
                    System.out.println("Digite numero de campeonatos ganados  ");
                    int campeonatos = sc.nextInt();
                    n.RegistroCabeza(new Equipos(codigo, nombre, ciudad, campeonatos));
                    break;
                case 2:
                    System.out.println("lista de Equipos: ");
                    n.Visualizar();
                    
                    break;
                case 3:
                    System.out.println("Digite el codigo");
                    String xxxxx = sc.nextLine();
                    String codig = sc.nextLine();
                    System.out.println("Digite el nombre");
                    String nombr = sc.nextLine();
                    System.out.println("Digite la Ciudad");
                    String ciuda = sc.nextLine();
                    System.out.println("Digite numero de campeonatos ganados  ");
                    int campeonato = sc.nextInt();
                    n.RegistroFinal(new Equipos(codig, nombr, ciuda, campeonato));

                    break;
                case 4:
                    System.out.println("Digite el codigo de donde sea empezar al insertar");
                    String xxx = sc.nextLine();
                    String cod = sc.nextLine();
                    System.out.println("Digite el codigo");
                    String codi = sc.nextLine();
                    System.out.println("Digite el nombre");
                    String nomb = sc.nextLine();
                    System.out.println("Digite la Ciudad");
                    String ciud = sc.nextLine();
                    System.out.println("Digite numero de campeonatos ganados  ");
                    int campeonat = sc.nextInt();
                    // n.agregarEnLaMitad(cod, new Equipos(codi, nomb, ciud, campeonat));
                      // n.RegistroEntreNodos(cod, new Equipos(codi, nomb, ciud, campeonat));
                     n.AgregarEntreNodos( cod, new Equipos(codi, nomb, ciud, campeonat));
                    
                    break;
                case 5:
                    System.out.println("Digite el codigo del Equipo que desea Eliminar");
                    String xx = sc.nextLine();
                    String code = sc.nextLine();
                    n.BorrrarNodo(code);
                    break;
                    
                case 6:
                    System.out.println("Digite el codigo del Equipo a Buscar");
                    String x= sc.nextLine();
                    String co = sc.nextLine();
                    n.BuscarCodigo(co);
                    break;

                default:
                    throw new AssertionError();
            }

        } while (menu != 7);

    }

}
