//Name: Maicol Alexis Cubides Peña.
//02/09/2022
//Group: B191
package ordenamientoDirecto;
public class Ordenamiento_Directo {

    public static void main(String[] args) {
        
        
        int tamaño = 999;            
        int array[] = new int[tamaño];   
        int arraysDesordenada[] = new int[tamaño];  
        for (int i = 0; i < array.length; i++) {
            int aleatorio = (int) (Math.random() * (2000 - 0 + 1) + 0);
            array[i] = aleatorio;

        }

        System.out.println("Array Desordenada:  \t|          Array Ordenada: ");

        for (int i = 0; i < array.length; i++) {
            arraysDesordenada[i] = array[i];
        }
        ordenacionPorMetodoShell(array);
        imprecionDesordenada(arraysDesordenada, array);

    }

    public static void imprecionDesordenada(int[] array, int ordenada[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("\t" + array[i] + "\t\t" + "|" + "\t\t" + ordenada[i]);
        }

    }
// 
//    public static void ordenada(int[] array) {  
//        for (int i = 0; i < array.length - 1; i++) {
//            int minimo = i;  
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[j] < array[minimo]) {
//                    minimo = j;
//                }
//            }
//            int aux = array[i];
//            array[i] = array[minimo];
//            array[minimo] = aux;
//
//        }
//
//    }
    public static void ordenarPorInserccion(int array[]){
        int posicion;  //0    1    
        int aux;
        for(int i = 0; i < array.length; i++){
            posicion = i; 
            aux = array[i]; 
            while ((posicion > 0) && (array[posicion-1] > aux)) {  
                                       
                array[posicion] = array[posicion-1];
                      
                array[posicion-1] = array[posicion];
                        
                posicion--; 
            }
            array[posicion] = aux;
                     
        }
    }
    
    
    
    
    public static void ordenacionPorMetodoShell(int array[]) {
        int i, aux=0, salto;
        boolean cambios;
        for (salto = array.length / 2; salto != 0; salto = salto / 2) {
            cambios = true;
            while (cambios) {
                cambios = false;
                for (i = salto; i < array.length; i++) {
                    if (array[i - salto] > array[i]) {
                       
                        intercambiar(aux, array, salto, i);
                       
                        cambios = true;

                    }
                }
            }
            
            
        }
    }
    public static void intercambiar(int aux, int array[], int salto, int i) {
        aux = array[i];
        array[i] = array[i - salto];
        array[i - salto] = aux;
    }


    

}
