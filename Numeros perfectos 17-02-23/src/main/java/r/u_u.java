//numeros perfectos
package r;
import java.util.Scanner;
public class u_u {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
      double entra;
         double numn=0;
        System.out.println("Ingrese un Numero");
        entra=sc.nextInt();
        for (int i = 1; i < entra; i++) {
         if( entra%i==0){
             numn = numn + i;
         }    
        }
              if(numn==entra){
             System.out.println("Numero Perfecto");
         }else System.out.println("Numero No perfecto");
    }

}
