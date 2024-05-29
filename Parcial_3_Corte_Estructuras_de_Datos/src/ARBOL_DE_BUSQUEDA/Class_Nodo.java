
package ARBOL_DE_BUSQUEDA;

public class Class_Nodo {
    
   
  private Class_Nodo izquierda, derecha;
  private int dato;
  
  

    public Class_Nodo(int dato) {
        this.izquierda = null;
        this.derecha = null;
        this.dato = dato;
    }

    public Class_Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Class_Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Class_Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Class_Nodo derecha) {
        this.derecha = derecha;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
}