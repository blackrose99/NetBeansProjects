package Quicksort;

import java.util.Arrays;

public class Metodo_Quicksort {

    Compañia_Refrescos vector[];

    public void ordenar(Compañia_Refrescos []nombres){
        if(nombres == null || nombres.length == 0){
            return;
        }
       this.vector = nombres;
        quicksort(0, nombres.length-1);
        
    }

    public void quicksort(int izquierda, int derecha){
        int i = izquierda;
        int j = derecha;
        
        String pivote = vector[izquierda +(derecha - izquierda) / 2].getNombre();
        
        while(i <= j){
           while(vector[i].getNombre().compareToIgnoreCase(pivote) < 0){
               i++;
           }
           while(vector[j].getNombre().compareToIgnoreCase(pivote) > 0){
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


    public void cambiosDeAtributos(int i, int j) {

        Compañia_Refrescos name = vector[i];
        vector[i] = vector[j];
        vector[j] = name;

    }

    public  void ordenarQuicksort(Compañia_Refrescos arr[], int izquierdo, int derecho){
    
      int pivote = arr[izquierdo].getCedula();
      Compañia_Refrescos pivoteCambio = arr[izquierdo];
      
        int i = izquierdo;
        int j = derecho;
        
        
        while(i < j){
            while(arr[i].getCedula() <= pivote && i < j) i++;
                while(arr[j].getCedula() > pivote) j--;
                if(i < j){
                   Compañia_Refrescos auxiliar = arr[i];
                    arr[i] = arr[j];
                    arr[j] = auxiliar;
            }

        }
        arr[izquierdo] = arr[j];
        arr[j] = pivoteCambio;
        
        

        if(izquierdo < j - 1){
            ordenarQuicksort(arr, izquierdo, j - 1);
        }
        if(j+1 < derecho){
            ordenarQuicksort(arr, j + 1 , derecho);
        }
        
    }
    
 
}

    
    
    
    


