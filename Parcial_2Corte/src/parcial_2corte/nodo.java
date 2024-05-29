
package parcial_2corte;


public class nodo {
      private  int dato;
     nodo siguiente, anterior;

     
     //Constructor cuando ya hay nodos en la lista
     public nodo(int elemento, nodo sigui, nodo ante){
         dato = elemento;
         siguiente = sigui;
         anterior = ante;
       
     }
     //Constructor cuando no hay nodos en la lista
     public nodo(int elemento){
      this(elemento, null, null);
     }
     public nodo(){
     }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
    public nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }

    public nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(nodo anterior) {
        this.anterior = anterior;
    }




    
}
