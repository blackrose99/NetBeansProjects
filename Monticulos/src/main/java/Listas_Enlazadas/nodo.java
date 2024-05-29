
package Listas_Enlazadas;

public class nodo {
    String dato;
    nodo enlace;

  public nodo(String x){
      dato = x; 
      enlace = null;
  }
    public String  getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(nodo enlace) {
        this.enlace = enlace;
    }
  
    
    
    
}
