
package listas;


public class Metodos_Vehiculo {
    VEHICULOS cabeza;
    public Metodos_Vehiculo(){
        cabeza = null;
    }

   public Metodos_Vehiculo insertarDatosALaCabeza(String placa_Entrante, String marca_Entrante, int modelo_Entrante, int cilindraje_Entrante){
       VEHICULOS nuevo;
       nuevo = new VEHICULOS(placa_Entrante,marca_Entrante,modelo_Entrante,cilindraje_Entrante);
       nuevo.enlace = cabeza;
       cabeza = nuevo;
       return this;
   }    
   
   
   public void verLista(){
       VEHICULOS temporal;
       int incremento = 0;
       temporal = cabeza;
       while(temporal != null){
           incremento++;
            System.out.println("--------------------------------------------------------------------------");
           System.out.println( "Nodo # " + "[" + incremento + "]" + " = " + "Placa: " + temporal.placa + "  " + " Marca: " + temporal.marca + "  " + "Modelo: " + temporal.modelo + "  " + " Cilindrage:  " + temporal.cilindraje);
            System.out.println("---------------------------------------------------------------------------");
           temporal = temporal.enlace;
       }
   }

}
