 
package parcial_1_maicol.alexis.cubidespeña;

import java.util.Scanner;


public class metodos_Main {
   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        String limpiar;
        
        
            System.out.println("Cuantos congresistas quiere registrar");
            int cantidad = sc.nextInt();
        CONGRESISTAS congreso [] = new CONGRESISTAS[cantidad];
//        
//        congreso [0] = new CONGRESISTAS(1049393, "Oscar Miranda", "la flores", 32);
//       congreso [1] = new CONGRESISTAS( 1049393, "Carlos Miranda", "la flores", 32);
//       congreso [2] = new CONGRESISTAS( 1049393, "a", "la flores", 32);
//         
        do {            
            System.out.println("1. Crear Congresista \n 2. Lista sin Ordenar \n 3. Ordenados por nombre \n 4. Lista Ordenada \n 5. Buscar por nombre \n 6. Salir");
            opcion = sc.nextInt();
         

            switch(opcion){
                case 1:
                    for (int i = 0; i < cantidad; i++) {
                    System.out.println("Ingrese la Identificacion del congresista ");
                    int cedula = sc.nextInt();
                     limpiar = sc.nextLine();
                     
                      System.out.println("Ingrese el Nombre del del congresista ");
                      String nombre = sc.nextLine();
                      
                
                        System.out.println("Ingrese el Partido del del congresista ");
                        String partido = sc.nextLine();
                    
                    System.out.println("Ingrese los Votos del del congresista ");
                    int votos = sc.nextInt();
             
                    congreso[i] = new CONGRESISTAS(cedula, nombre, partido, votos);

                    }
                        System.out.println("Registrado exitosamente");
                      

                    break;

                    case 2:
                        for (int i = 0; i < congreso.length; i++) {
                            if(congreso[i] == null){
                                System.out.print("");
                            }else
                            System.out.println(congreso[i]);
                        }
                    break;
                    
                    
    
                    case 3:
                       ordenar1(congreso);
                        System.out.println("Ordenado Exitosamente");
                    break;
     
                    case 4:
                
                        for (int i = 0; i < congreso.length; i++) {
                            if(congreso[i] == null){
                                System.out.print("");
                            }else
                            System.out.println(congreso[i]);
                        }  
                    break;

                    case 5:
                        
                        limpiar = sc.nextLine();
                        System.out.println("Ingrese el nombre a buscar");
                        String nombree = sc.nextLine();
                    for (int i = 0; i < congreso.length; i++) {
                        if (nombree.equalsIgnoreCase(congreso[i].getNombre())) {
                            System.out.println(congreso[i]);
                        }
                    }

                    break;
            }
        } while (opcion != 6);
    }

   static CONGRESISTAS orden[];
   static int longitud;

    public static void ordenar1(CONGRESISTAS or[]) {
        if (or == null || or.length == 0) {
            return;
        }
        orden = or;
        longitud = or.length;
        Quicksort(0, longitud - 1);
        
    }
    
    public static void Quicksort(int izquierda, int derecha){
        int i = izquierda;
        int d = derecha;
        
        String pivote = orden[izquierda + (derecha - izquierda) / 2].getNombre();
        
        while(i <= d){
            while(orden[i].getNombre().compareToIgnoreCase(pivote) < 0){
                i++;
            }
            while(orden[d].getNombre().compareToIgnoreCase(pivote) > 0){
                d--;
            }
            if(i <= d){
                ordenacion(i,d);
                i++;
                d--;
            }  
        }
        
        
        if(izquierda < d){
            Quicksort(izquierda, d);
        }
        if(i < derecha){
            Quicksort(i, derecha);
        }
    }

    public static void ordenacion(int i, int d) {
        CONGRESISTAS nombre = orden[i];
        orden[i] = orden[d];
        orden[d] = nombre;
    }


}
