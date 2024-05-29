
//El programa permitira ingresar 10 numeros enteros
//Mostrara el promedio de los que sean negativos
//Tambien mostrara el promedio de los numeros positivos
//Nos dira tambien cuantos ceros fueron ingresados

import java.util.Scanner;

public class entero {
    
    public static void main(String[] args) {
        int num=0,cantidad_negativos=0,cantidad_positivos=0; 
        int suma_negativos=0,suma_positivos=0,cantidad_ceros=0,cantidad_unos=0;
        double promediopositivo=0,promedionegativo=0;
        int k=0;
        Scanner teclado=new Scanner(System.in);
        while(k<10){ 
        
        System.out.println("INGRESE UN NUMERO: ");
        num=teclado.nextInt();
      
            
      
        if(num==0)cantidad_ceros++ ; 
      if(num==1)cantidad_unos++;
        else if(num>0){
        
            cantidad_positivos++;
            suma_positivos=suma_positivos+num;
            
        }
        else {
            
            cantidad_negativos++;
            suma_negativos=suma_negativos+num;
        }
        k++; 
        }
            if(cantidad_positivos==0)System.out.println("No se puede realizar el promedio de los numeros positivos.");
            else{
                 promediopositivo=suma_positivos/cantidad_positivos;
                 System.out.println("El promedio de los numeros positivos es de: " +promediopositivo);
            }
              if(cantidad_negativos==0)System.out.println("No se puede realizar el promedio de los numeros negativos.");
              else{
                  promedionegativo=suma_negativos/cantidad_negativos;
                  System.out.println("El promedio de los numeros negativos es de: "+promedionegativo);
              }
              System.out.println("la cantidad de ceros son: "+cantidad_ceros);
              System.out.println("la cantidad de unos son: "+cantidad_unos);
          
    }  
}
