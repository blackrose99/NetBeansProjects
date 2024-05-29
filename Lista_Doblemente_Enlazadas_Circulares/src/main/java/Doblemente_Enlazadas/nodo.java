
package Doblemente_Enlazadas;

public class nodo {
    private nodo anterior;
    private nodo siguiente;
    private String dato;

    public nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(nodo anterior) {
        this.anterior = anterior;
    }

    public nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }


}
