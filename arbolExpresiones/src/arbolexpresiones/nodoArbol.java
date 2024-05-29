
package arbolexpresiones;


public class nodoArbol {
    Object dato;
    nodoArbol izquierdo;
    nodoArbol derecho;

    public nodoArbol(Object dato) {
        
        izquierdo = null;
        this.dato = dato;
        derecho = null;
    }
    
}
