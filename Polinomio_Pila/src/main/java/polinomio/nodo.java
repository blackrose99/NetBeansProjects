
package polinomio;


public class nodo {
    classObjeto dato;
    nodo enlace;
     
    public nodo(){
    }

    public nodo(classObjeto dato, nodo siguiente) {
        this.dato = dato;
        this.enlace = siguiente;
    }

    public classObjeto getDato() {
        return dato;
    }

    public void setDato(classObjeto dato) {
        this.dato = dato;
    }

    public nodo getSiguiente() {
        return enlace;
    }

    public void setSiguiente(nodo siguiente) {
        this.enlace = siguiente;
    }
    
}
