
package Class_Vector;

import java.util.Vector;
public class class_Vector {
    public static void main(String[] args) {
//     
//        Vector v1 = new Vector();
//        Vector v2 = new Vector(10);
//        Vector v3 = new Vector(v2);
//        
//        Vector <String> vector = new Vector<String>();
//        
//        vector.addElement("Maicol");
//        
//        vector.insertElementAt("Maicoll", 1);
//        
//        
//        //ACCEDER
//        System.out.println(vector.get(2));
//        System.out.println(vector.size());
//        System.out.println(vector.elementAt(2));
//        
//        //ELIMINAR
//        vector.removeElementAt(0);
//        vector.removeElement("Maicoll");
//        
//        vector.removeAll(vector);
//        
//        //OPERACIONES
//        
//        System.out.println(vector.contains("Maicoll"));
//        System.out.println(vector.indexOf("Maicoll"));
     String array[] = {"maicol","carmen","ana","lola","cody"};

        ordenar(array);
     
    
     
        for (int i = 0; i < array.length; i++) {
            System.out.println(" [ " + (i) + " ] " + array[i]);
        }
        System.out.println("\n Elemento a buscar: maicol");
        System.out.println("se encuentra en la posicion: " + (busquedaPorMetodoBinario(array, "maicol")));
     

     



    }
    
    
    
//    public  static void ordenarQuicksort( int arr[], int izquierdo, int derecho){
//    
//      int pivote = arr[izquierdo];
//        int i = izquierdo;
//        int j = derecho;
//        int auxiliar;
//        
//        while(i < j){
//            while(arr[i] <= pivote && i < j) i++;
//                while(arr[j] > pivote) j--;
//                if(i < j){
//                    auxiliar = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = auxiliar;
//            }
//
//        }
//        arr[izquierdo] = arr[j];
//        arr[j] = pivote;
//        
//        
//
//        if(izquierdo < j - 1){
//            ordenarQuicksort(arr, izquierdo, j - 1);
//        }
//        if(j+1 < derecho){
//            ordenarQuicksort(arr, j + 1 , derecho);
//        }
//        
//    }
    
     static String vector[];
     public static void ordenar(String []nombres){
        if(nombres == null || nombres.length == 0){
            return;
        }
       vector = nombres;
        quicksort(0, nombres.length-1);
        
    }

    public static void quicksort(int izquierda, int derecha){
        int i = izquierda;
        int j = derecha;
        
        String pivote = vector[izquierda +(derecha - izquierda) / 2];
        
        while(i <= j){
           while(vector[i].compareToIgnoreCase(pivote) < 0){
               i++;
           }
           while(vector[j].compareToIgnoreCase(pivote) > 0){
               j--;
           }
           if(i <= j){
               cambiosDeAtributos(i, j);
               i++;
               j--;
           }
        }
        
        if(izquierda < j){
            quicksort(izquierda, j);
        }
        if(i < derecha){
            quicksort(i, derecha);
        }
    }


    public static void cambiosDeAtributos(int i, int j) {

        String name = vector[i];
        vector[i] = vector[j];
        vector[j] = name;

    }

    
    
    
    public static String busquedaPorMetodoBinario(String arreglo[], String claveABuscar){
        
        int central, bajo, alto;
        bajo = 0;
        alto = arreglo.length - 1;
        while(bajo <= alto){
            central = (bajo + alto)  / 2;
            if(claveABuscar == arreglo[central]){
                return  ""+central;
                
            }else if(claveABuscar.compareToIgnoreCase(arreglo[central]) < 0){
                alto = central -1;
                
            }else if(claveABuscar.compareToIgnoreCase(arreglo[central]) > 0){
                bajo = central + 1;
            }
        }
        return "No se encontro el Nombre";
        }
        
    
    
//        public static int busquedaPorMetodoBinario(int arreglo[], int claveABuscar){
//        
//        int central, bajo, alto;
//        bajo = 0;
//        alto = arreglo.length - 1;
//        while(bajo <= alto){
//            central = (bajo + alto)  / 2;
//            if(claveABuscar == arreglo[central]){
//                return  central;
//            }else if(claveABuscar < arreglo[central]){
//                alto = central -1;
//            }else if(claveABuscar > arreglo[central]){
//                bajo = central + 1;
//            }
//        }
//        return -2;
//        }
//        
        
    }

