//diferentes opciones para redondiar un numero
package decimal;
import java.text.DecimalFormat;
import java.math.BigDecimal;   //clase importada para redondiar con BIGDECIMAL
import java.math.RoundingMode;  //clase importada para redondiar con BIGDECIMAL



public class Limitardecimales {
    public static void main(String[] args) {
        
        double numero=2;
        double raiz=Math.sqrt(numero);
        
        System.out.println("La raiz cuadrada de " + numero + " es: " +raiz);
        
        
        //utilizando la clase decimalforma
        DecimalFormat df =new DecimalFormat ("#.00");
           System.out.println("La raiz cuadrada de " + numero + " es: " + df.format(raiz));
           
           //String format otro metodo
            System.out.println("La raiz cuadrada de " + numero + " es: " +String.format("%.2f", raiz));
            
          //en esta utilizaremos la clase math.round   
                 System.out.println("La raiz cuadrada de " + numero + " es: " + (double)Math.round(raiz * 100d) /100);
                 
          //utilizando la clase BigDecimal 
          BigDecimal bd = new BigDecimal (raiz);
          bd = bd.setScale(2, RoundingMode.HALF_UP);
             System.out.println("La raiz cuadrada de " + numero + " es: " +bd.doubleValue());
          
    }
    
}
