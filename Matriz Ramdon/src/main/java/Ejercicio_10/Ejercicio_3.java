// Name: Maicol Alexis Cubides Peña
// Date: 26/08/2022 
// Group: B191

package Ejercicio_10;

import java.util.Arrays;

import java.util.Scanner;

public class Ejercicio_3 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int dimencionArray;
        
        System.out.println("--Ingrese las dimenciones de la Array--");
        
        dimencionArray = entrada.nextInt();
        
        int matrix[][] = new int[dimencionArray][dimencionArray];
        
        // Asignacion de la Diagonal Principal
        for (int i = 0; i < matrix.length; i++) {
            
            matrix[i][i] = 7;   
        }
        
        for (int filas = 0; filas < dimencionArray; filas++) {
            
            for (int columnas = 0; columnas < filas; columnas++) {
                
                matrix[filas][columnas] = (int)(Math.random()*(1-(10)+1)+10);
            }
        }
        
        //Imprecion de la array 
        for (int imprimir = 0; imprimir < matrix.length; imprimir++) {
            
            System.out.println(Arrays.toString(matrix[imprimir]));
            
        }
        
    }
    
}
