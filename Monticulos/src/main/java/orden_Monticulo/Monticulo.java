
package orden_Monticulo;

import java.util.Date;
import java.util.Scanner;


public class Monticulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, anio, ano;
        String nombre,limpiar;
            objeto_Fecha arr[] = new objeto_Fecha[2];

        for (int i = 0; i < arr.length; i++) {
                     
            System.out.println("Ingrese el año ");
            ano = sc.nextInt();
            limpiar = sc.nextLine();
            System.out.println("Ingrese el nombre");
            nombre = sc.nextLine();
            
            
            System.out.println("ingrese el dia del la " + (i+1) + " persona ");
            dia= sc.nextInt();
            System.out.println("ingrese el mes del la " + (i+1) + " persona ");
           mes = sc.nextInt();
            mes = mes - 1;
            System.out.println("ingrese el año del la " + (i+1) + " persona ");
            anio = sc.nextInt();
            
            anio = anio - 1900;
           Date fecha = new Date(anio,mes,dia);
           arr[i] = new objeto_Fecha(ano,nombre, fecha);

        }

        System.out.println("Array desordenado por fecha");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
        System.out.println("\n");
        
        ordenar(arr);
        System.out.println("Array ordenado por fecha");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

  static objeto_Fecha vector[];

    public static void ordenar(objeto_Fecha []nombres){
        if(nombres == null || nombres.length == 0){
            return;
        }
       vector = nombres;
        quicksort(0, nombres.length-1);
        
    }

    public static void quicksort(int izquierda, int derecha){
        int i = izquierda;
        int j = derecha;
        
        String pivote = vector[izquierda +(derecha - izquierda) / 2].formatearFecha();
        
        while(i <= j){
           while(vector[i].formatearFecha().compareToIgnoreCase(pivote) < 0){
               i++;
           }
           while(vector[j].formatearFecha().compareToIgnoreCase(pivote) > 0){
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

        objeto_Fecha name = vector[i];
        vector[i] = vector[j];
        vector[j] = name;

    }
}
