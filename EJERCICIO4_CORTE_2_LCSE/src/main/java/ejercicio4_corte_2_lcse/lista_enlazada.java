
package ejercicio4_corte_2_lcse;


public class lista_enlazada {
    
    private nodo lc;
    public int size;

    public lista_enlazada() {
        lc = null;
        size = 0;
    }

    public boolean estavacia() {
        return lc == null;
    }

    public void agregarinicio(asignatura asig) {
          nodo nuevo = new nodo(asig);
          nuevo.setAsig(asig);
       
        if (estavacia()){
            lc = new nodo(asig);
            lc.siguiente = lc;
        } else {
         nuevo.siguiente = lc.siguiente;
         lc.siguiente = nuevo;
         lc  = nuevo;
        }
        size++;
    }

    
    
    
    
    
    public nodo buscarentredos(int pos) {

        nodo indice;

        if (pos < 0) {
            return null;
        }

        indice = lc;
        for (int i = 0; (i < pos); i++) {
            indice = indice.siguiente;
        }
        return indice;
    }
    
    
    
    

    public void agregarentredos(int indice, asignatura asig) {

        nodo nuevo;
        nodo anterior;
         nuevo = new nodo(asig);
        anterior = buscarentredos(indice+1);

        if (lc.siguiente == lc) {
            System.out.println("");
            System.out.println("NO SE PERMITE INGRESAR EL NODO DEBE SER EN MEDIO DE DOS NODOS");
        } else {
            if(anterior == lc.siguiente){
                nuevo.siguiente = lc;
                anterior.siguiente = nuevo;
              size++;
                
            }else if (anterior != null) {
                nuevo.siguiente = anterior.siguiente;
                anterior.siguiente = nuevo;
                size++;
            }
        }
    }
    
    
    
    

    public void eliminarNodo(String nodoAeliminar) {

        boolean eliminado = true;

        if (!estavacia()) {
            if (lc.siguiente == lc && nodoAeliminar.equalsIgnoreCase(lc.siguiente.getAsig().getCodigo())) {
                lc.siguiente = lc.siguiente = null;

            } else if (nodoAeliminar.equalsIgnoreCase(lc.siguiente.getAsig().getCodigo())) {
                lc.siguiente = lc.siguiente.getSiguiente();
            } else {
                nodo anterior;
                nodo temporal;

                anterior = lc.siguiente;
                temporal = lc.siguiente.getSiguiente();

                while (temporal != lc.siguiente && !nodoAeliminar.equalsIgnoreCase(temporal.getAsig().getCodigo())) {
                    anterior = anterior.getSiguiente();
                    temporal = temporal.getSiguiente();
                }

                if (temporal != lc) {
                    anterior.siguiente = temporal;

                    if (temporal == lc) {
                        lc = anterior;
                    }

                } else {
                    System.out.println("NO SE ENCUENTRA NINGUN CODIGO");
                    eliminado = false;
                }
            }
        } else {
            System.out.println("LA LISTA SE ENCUENTRA VACIA");
        }
        if (eliminado == true) {
            System.out.println("NODO ELIMINADO");
            size--;
        }
    }

    public void buscar(String codigo) {

        nodo temp;
        temp = lc;

        while (!codigo.equalsIgnoreCase(temp.getAsig().getCodigo())) {
            temp = temp.siguiente;
        }
        System.out.println("EL NODO ENCONTRADO ES: " + "[" + temp.getAsig().toString() + "]");
    }

    public int size() {
        return size;
    }

    public void listar() {

        nodo aux = lc;

        int j = 1;
        if (!estavacia()) {
            for (int i = 0; i < (size + 1); i++) {
                System.out.println(j + "." + "[" + aux.getAsig() + "]->" + " ");
                aux = aux.siguiente;
                j++;

                if (j == size + 1) {
                    j = 1;
                }
            }
        } else {
            System.out.println("LA LISTA VACIA");
        }

    }
}
