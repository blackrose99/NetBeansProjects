


/* Ejercicio que presenta un menú, con 9 opciones ejecutables y la opción 10 
   para salir.  Cada opción del menú llama a un método que se encarga de realizar
   la operación y retornar al menú.
   Este ejercicio utiliza la clase Scanner para la captura de datos y para los
   mensajes de salida utiliza System.out.println()  
  */
package menumetodos;

import java.util.Scanner;

public class Menumetodos {

 
    public static void main(String[] args) {
        int a,b,m,op;
        Scanner entrada=new Scanner(System.in);
        do{ 
          System.out.println("\n    MENU" +
                "\n 1. MCD entre dos numeros."+
                "\n 2. Determinar si un numero es primo"+
                "\n 3. Hallar el factorial de un número"+
                "\n 4. Determinar si un número de tres cifras es simétrico"+
                "\n 5. Hallar e imprimir los números múltiplos de 2 y 3 que esten entre dos valores A y B"+
                "\n 6. Hallar la cantidad de cifras que tiene un numero entero: "+
                "\n 7. Hallar el mcm entre dos  numeros: "+  
                "\n 8. Hallar las permutaciones de un conjunto de n elementos, tomando de m elementos: "+ 
                "\n 9. Hallar el mayor número que se pueda formar a partir de las tres cifras de un numero dado: "+ 
                "\n 10. Salir"+
                "\n\nIngrese su opcion: " );
          op=entrada.nextInt();
                    
            switch(op){
                case 1: System.out.println("\nIngrese el primer valor");
                        a=entrada.nextInt();
                        System.out.println("Ingrese el segundo valor");
                        b=entrada.nextInt();
                        System.out.println("El MCD entre "+a + " y " + b + " es= "+ mcd(a,b));
                        break;
                case 2: System.out.println("\nIngrese el número que desea evaluar si es primo");
                        a=entrada.nextInt();
                        if (primo(a))
                            System.out.println("El número "+ a + " es primo");
                        else
                            System.out.println("El número "+ a + " NO es primo");
                        break;
                case 3: System.out.println("\nIngrese el número al que le desea hallar el factorial: ");
                        a=entrada.nextInt();
                        int k= factorial(a);
                        System.out.println("El Factorial de "+a + " es: " + k);
                        break;
                case 4: System.out.println("\nIngrese el número de tres cifras que desea evaluar para saber si es simétrico: ");
                        a=entrada.nextInt();
                        if (simetrico(a))
                            System.out.println("El número "+a + " es simétrico ");
                        else
                            System.out.println("El número "+a + " NO es simétrico ");
                        break;
                case 5: System.out.println("\nIngrese el primer valor");
                        a=entrada.nextInt();
                        System.out.println("Ingrese el segundo valor");
                        b=entrada.nextInt();
                        multiplos2y3(a,b);
                        break;
                case 6: System.out.println("\nIngrese el numero entero al que le desea contar sus cifras");
                        a=entrada.nextInt();
                        System.out.println("El número "+a + " tiene " + cuentacifras(a) + " cifras");
                        break;
                case 7: System.out.println("\nIngrese el primer valor");
                        a=entrada.nextInt();
                        System.out.println("Ingrese el segundo valor");
                        b=entrada.nextInt();
                        System.out.println("El mcm "+a + " y " + b + " es= "+ mcm(a,b));
                        break;
                case 8:System.out.println("\nIngrese el numero de elementos del conjunto");
                        a=entrada.nextInt();
                        System.out.println("Ingrese cuantos elementos quiere permutar");
                        b=entrada.nextInt();
                        System.out.println("El numero de permutaciones es "+ permutaciones(a,b));
                        break;
                    
                case 9: System.out.println("Ingrese numero de tres cifras para hallar el mayor valor con las mismas cifras");
                        a=entrada.nextInt();
                        System.out.println("El mayor numero con las mismas tres cifras es: "+ nmayor(a));
                        break; 
                                       
            }
            
        }while(op!=10);
        
}
    
      
    // Método para determinar si un número es primo o no.
    public static boolean primo (int a){
        int cont=0,x;
        for (x=1;x<=a;x++){
            if (a%x==0){    
                cont++;
            }
        }
        if (cont<=2){
            return true;
        }
        else {
            return false;
        }
    }
    
    // Método para hallar el factorial de un numero entero n!
    public static int factorial (int a){ 
        int f=1,x;
        for (x=1; x<=a; x++){ 
            f=f*x; //La variable x acumula los productos

        }
                
        return f;
        
    }
    
    // Método para determinar si un número es simétrico, se lee igual de izquiera a derecha, que de derecha a izquierda.
    public static boolean simetrico (int a){
        boolean rta=false;
        int c, u;
        c=a/100;  //cifra de las centenas
        u=a%10;   //cifra de las unidades
        if (c==u){
            rta=true;
        }
        return rta;
    }
    
    // Método para hallar los múltiplos de 2 y 3 entre A y B
    public static void multiplos2y3 (int a , int b){
        int x;
        for (x=a;x<=b;x++){
            if(x%2==0 && x%3==0){
                System.out.println("El numero "+x + " es múltiplo de 2 y 3");
            }
               
        }
        
        
    }
    // Método para la cantidad de cifras que tiene un número entero
    public static int cuentacifras(int a){
        int cont=0,x;
        while(a!=0){     
            a=a/10;      
            cont++;    
        }
        return cont;
    }
  /*  //Método para hallar el mcm entre dos números. Otra forma del método mcm
    public static int mcm (int a , int b){
        //por el método de euclides
        int num1, num2,m=0;
        num1 = Math.max(a, b);  
        num2 = Math.min (a,b);
        for (int x=num1; x<=(num1*num2); x++){
            if (x%a==0 && x%b==0){
                m=x;
                break;
            }
        }
        return m;
     }*/
    
// Método para hallar el mcm entre dos números
    public static int mcm (int a , int b){ 
        //por el metodo de euclides
        int num1, num2,m;                                                  
        num1 = Math.max(a, b);   
        num2 = Math.min (a,b);    
       m = num1/mcd(a,b)*num2;
 
        return m;
    }
    
   //Método para hallar las permutaciones
    public static int permutaciones (int a , int b){  
        int p;
        p= factorial(a) / factorial(b);   
        return p;                         
    }                                       

    // Método para hallar las permutaciones
    public static int nmayor (int a){  
        int n,u,d,c,mayor,medio,menor,x;
        c=a/100;
        x=a%100;
        d=x/10;
        u=x%10;
        if (c>=d && d>=u){
            mayor=c;
            medio=d;
            menor=u;
        }
        else {
            if (c>=u && u>=d){
            mayor=c;
            medio=u;
            menor=d;
            }
            else
            {
              if (d>=c && c>=u){
                 mayor=d;
                 medio=c;
                 menor=u;
                }
              else {
                  if (d>=u && u>=c){
                     mayor=d;
                     medio=u;
                     menor=c;
                    }
                  else {
                      if (u>=c && c>=d){
                        mayor=u;
                        medio=c;
                        menor=d;
                        }
                      else{
                          mayor=u;
                          medio=d;
                          menor=c;
                        }
                      }
                  }
              }
            }
        n=mayor*100+medio*10+menor*1;
        return n;
    }
    
    
    
    
    
    
  
      // Método para hallar el MCD entre dos números
    public static int mcd (int a , int b){  
        int d=1,men=a,x;
        if (a>b){
            men=b;
        }
        for (x=1;x<=men;x++){
            if(a%x==0 && b%x==0){ 
                d=x;
            }
        }
        return d;    
    }

}

