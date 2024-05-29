package arbol;

public class nodoArbol {
    
   
  private nodoArbol izquierda, derecha;
  private vehiculo dato;
    
    public nodoArbol(vehiculo dato){
        this.dato = dato;
        this.izquierda = null;
        this.derecha = null;
    } 

    public nodoArbol getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(nodoArbol izquierda) {
        this.izquierda = izquierda;
    }

    public nodoArbol getDerecha() {
        return derecha;
    }

    public void setDerecha(nodoArbol derecha) {
        this.derecha = derecha;
    }

    public vehiculo getDato() {
        return dato;
    }

    public void setDato(vehiculo dato) {
        this.dato = dato;
    }
    
    
}