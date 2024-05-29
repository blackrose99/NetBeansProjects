
package prueba_interfaz;

//clase de prueba de la clase Trigonometria
public class Prueba_Interfaz {
    public static void main(String[] args) {
        Trigonometria t  = new Trigonometria();
        System.out.println(String.format ("Seno de 30º es: %.3f",t.seno(30)));
        System.out.println(String.format ("Coseno de 30º es: %.3f",t.coseno(30)));

    }
    
}
