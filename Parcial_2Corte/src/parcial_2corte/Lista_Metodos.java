package parcial_2corte;

public class Lista_Metodos {

    nodo inicio, fin;
    nodoCircular LC;

    public Lista_Metodos() {

        inicio = null;
        LC = null;
    }

    public boolean estaVacia() {
        return inicio == null;
    }

    public void InsertarNodo(nodo a) {
        if (inicio == null) {
            inicio = a;
            fin = a;
        } else {
            fin.siguiente = a;
            a.anterior = fin;
            fin = fin.siguiente;
        }

    }

    public void MostarLista() {
       nodo r = inicio;
        while (r != null) {
            System.out.print(" <--" + r.getDato() + "--> ");
            r = r.siguiente;
        }
        if (r != null) {
            System.out.print(" <--" + r.getDato() + "--> ");
        }
    }

    public void Intercalar(Lista_Metodos a, boolean bandera, nodo nuevo, int tamano) {

        nodo aux1 = inicio;
        nodo aux2 = a.inicio;
        nodo auxCir = inicio;
        nodo ultimo = a.fin;

        if (bandera == false) {
            if (aux1.siguiente != null && aux2.siguiente != null) {
                do {
                    aux2 = aux2.siguiente;
                    aux1 = aux1.siguiente;

                    (aux2.anterior).anterior = aux1.anterior;
                    (aux1.anterior).siguiente = aux2.anterior;
                    aux1.anterior = aux2.anterior;
                    (aux2.anterior).siguiente = aux1;

                } while (aux1.siguiente != null && aux2.siguiente != null);

                if (aux1.siguiente == null && aux2.siguiente == null) {
                    aux2.anterior = aux1;
                    aux1.siguiente = aux2;

                } else if (aux1.siguiente != null && aux2.siguiente == null) {
                    aux2.siguiente = aux1.siguiente;
                    aux1.siguiente = aux2;
                    aux2.anterior = aux1;
                    aux1.siguiente.anterior = aux2;
                } else if (aux1.siguiente == null && aux2.siguiente != null) {
                    aux1.siguiente = aux2;
                    aux2.siguiente = aux2.siguiente;
                    aux2.anterior = aux1;
                    aux2.siguiente.anterior = aux2;
                }
            } else if (aux1.siguiente != null && aux2.siguiente == null) {
                aux2.siguiente = aux1.siguiente;
                aux1.siguiente.anterior = aux2;
                aux1.siguiente = aux2;
                aux2.anterior = aux1;
            } else {
                aux1.siguiente = aux2;
                aux2.anterior = aux1;
            }
        } else {
            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;
            a.fin = nuevo;
        }
        LC = null;
        tamano = 0;
        pasarDatosALaCircular(auxCir);

    }

    public void pasarDatosALaCircular(nodo a) {
        a = inicio;
        int guardar;
        while (a != null) {
            guardar = a.getDato();
            nodoCircular nuevo = new nodoCircular(guardar);
            if (LC == null) {
                LC = nuevo;
            } else {
                nuevo.siguiente = LC.siguiente;
                LC.siguiente = nuevo;
                LC = nuevo;
            }
            a = a.siguiente;
        }
    }

    public void mostrarCircular(int tamano) {
        nodoCircular aux = LC.siguiente;
        for (int i = 0; i < (tamano + 1); i++) {
            System.out.print(" <--" + aux.dato + "--> ");
            aux = aux.siguiente;
        }
    }
}
