
package ejercicio4_corte_2_lcse;


public class nodo {
    
    private asignatura asig;
    nodo siguiente;

    public nodo(asignatura asig) {
        this.siguiente = this;
        this.asig = asig;
    }


    public asignatura getAsig() {
        return asig;
    }

    public void setAsig(asignatura asig) {
        this.asig = asig;
    }

    public nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;

    }
}
