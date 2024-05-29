package listas;

public class nodoDoble {
    private Class_Object dato;
     nodoDoble siguiente, anterior;
     
     //Constructor cuando ya hay nodos en la lista
     public nodoDoble(Class_Object elemento, nodoDoble sigui, nodoDoble ante){
         dato = elemento;
         siguiente = sigui;
         anterior = ante;
     }
     //Constructor cuando no hay nodos en la lista
     public nodoDoble(Class_Object elemento){
      this(elemento, null, null);
     }

    public Class_Object getDato() {
        return dato;
    }

    public void setDato(Class_Object dato) {
        this.dato = dato;
    }
    public nodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    public nodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(nodoDoble anterior) {
        this.anterior = anterior;
    }
     
}
