
package parcial_2corte;

public class nodoCircular {
    int dato;
    nodoCircular siguiente;

    public nodoCircular(int d) {
        dato=d;
        siguiente=this;
    }
}
