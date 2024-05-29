
package ListaEnlazadas_DoblementeCirculares;

public class ClassNodo {
    ClassNodo anterior;
     ClassNodo siguiente;
    private ClassObject dato;

    
    public ClassNodo(ClassObject dato){
        this.dato = dato;
        anterior = this;
        siguiente = this;
    }
    public ClassObject getDato() {
        return dato;
    }

    public void setDato(ClassObject dato) {
        this.dato = dato;
    }


    


}
