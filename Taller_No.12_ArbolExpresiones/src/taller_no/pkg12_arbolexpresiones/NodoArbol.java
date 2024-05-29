
package taller_no.pkg12_arbolexpresiones;


public class NodoArbol {
    

    Object datoArbol;
    NodoArbol izquierdo;
    NodoArbol derecho;

    public NodoArbol(Object dato) {
        this.datoArbol = dato;
        izquierdo = null;
        derecho = null;
    }

    public NodoArbol() {
    }
    
    
}
