
package arboles;


public class nodoArbol {
    familia dato;
   private nodoArbol izquierdo, derecho;
    
    public nodoArbol(familia dato){
        this.dato = dato;
        this.izquierdo = null;
        this.derecho = null;
    }

    public familia getDato() {
        return dato;
    }

    public void setDato(familia dato) {
        this.dato = dato;
    }

    public nodoArbol getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(nodoArbol izquierdo) {
        this.izquierdo = izquierdo;
    }

    public nodoArbol getDerecho() {
        return derecho;
    }

    public void setDerecho(nodoArbol derecho) {
        this.derecho = derecho;
    }
    
    

}
