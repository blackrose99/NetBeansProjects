
package taller_no.pkg12_arbolexpresiones;


public class Class_PilaExpresionesç {
        private NodoPila cima;
    public Class_PilaExpresionesç() {
    }
    
    public Class_PilaExpresionesç(NodoPila cima) {
        this.cima = null;
    }

    public void ingresar(NodoArbol dato){
        NodoPila nuevo;
        nuevo = new NodoPila(dato);
        nuevo.next = cima;
        cima = nuevo;
    }
    
    public boolean estavacia(){
        return cima == null;
    }
    
    public NodoArbol cimaPila(){
        return cima.datoPila;
    }


    public NodoArbol sacar() {
        NodoArbol auxiliar = null;

        if (!estavacia()) {
            auxiliar = cima.datoPila;
            cima = cima.next;
        }
        return auxiliar;
    }
}
