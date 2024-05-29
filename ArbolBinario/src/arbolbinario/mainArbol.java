
package arbolbinario;

import java.util.Scanner;
public class mainArbol {
 
       
    public static void main(String[] args) {
       Scanner entradaDatos = new Scanner(System.in);
       metodoArbol ar = new metodoArbol();
       int entrada, entrada2;
       String Limpiar;
       
        do {
            System.out.println("Menu de Opciones\n 1.Agregar un Equipo\n 2.Buscar un Equipo por su Codigo\n 3.Eliminar un Equipo por su Codigo\n 4.Mostrar Árbol con diferentes recorridos\n 5.Exit");
            entrada = entradaDatos.nextInt();
            switch (entrada) {
                case 1:
                    System.out.println("Digite el codigo del equipo");
                    int codigo = entradaDatos.nextInt();
                    System.out.println("Digite el nombre del equipo");
                    Limpiar = entradaDatos.nextLine();
                    String nombre = entradaDatos.nextLine();
                    System.out.println("Digite la ciudad");
                  
                    String ciudad = entradaDatos.nextLine();
                    System.out.println("Digite el numero de campeonatos ganados");
                    int numero = entradaDatos.nextInt();
                    ar.Ingresar(new Equipos(codigo, nombre, ciudad, numero));
                    break;
                case 2: 
                    if(!ar.estaVacio()){
                    System.out.println("Ingrese el Codigo del equipo que quiere consultar");
                    int cog = entradaDatos.nextInt();
                  
                   if(ar.buscarUnVehiculo(cog) == null){
                         System.out.println("El Equipo no esta registrado");
                         break;
                    }else{
                       System.out.println(ar.buscarUnVehiculo(cog)); 
                    }
                   }else{
                       System.out.println("Árbol vacio!!!!"); 
                    }
            
                    break;

                case 3:

                    System.out.println("Ingrese el Codigo del Equipo a eliminar");
                    int cog = entradaDatos.nextInt();
                   ar.eliminarNodo(cog);
                    break;
                    
                case 4:
                    do {
                        System.out.println("1.Ver en PreOrden\n 2.Ver en InOrden\n 3.Ver en PostOrden\n 4.Volver");
                        entrada2 = entradaDatos.nextInt();
                        switch (entrada2) {
                            case 1:
                                if (!ar.estaVacio()) {
                                    ar.Preorden(ar.raiz);
                                } else {
                                    System.out.println("Árbol Vacio");
                                }
                                break;

                            case 2:
                                if (!ar.estaVacio()) {
                                    ar.Inorden(ar.raiz);
                                } else {
                                    System.out.println("Árbol Vacio");
                                }
                                break;

                            case 3:

                                if (!ar.estaVacio()) {
                                    ar.Postorden(ar.raiz);
                                } else {
                                    System.out.println("Árbol Vacio");
                                }
                                break;
                        }

                    } while (entrada2 != 4);
                    
                    break;
            }
        } while (entrada != 5);

    }
    
}
