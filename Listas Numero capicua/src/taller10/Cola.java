package taller10;

public class Cola {

    private Nodo frente;
    private Nodo fin;

    public Cola() {
    }

    public Nodo getFrente() {
        return frente;
    }

    public void setFrente(Nodo frente) {
        this.frente = frente;
    }

    public Nodo getFin() {
        return fin;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }

    public Cola(Nodo frente, Nodo fin) {
        this.frente = this.fin = null;

    }

    public boolean ListaVacia() {

        return frente == null;
    }

    public void InsertarCola(char num) {

        Nodo nuevo;
        nuevo = new Nodo(num);
        if (ListaVacia()) {
            frente = nuevo;
        } else {
            fin.enlace = nuevo;
        }
        fin = nuevo;

    }

    public void mostrarCola() {

        Nodo nuevo;
        nuevo = frente;
        while (nuevo != null) {

            System.out.println(nuevo.numero);
            nuevo = nuevo.enlace;
        }

    }

    public void eliminarCola() {

        if (ListaVacia()) {
            System.out.println("La lista esta vacia");
        }
        frente = frente.enlace;
    }

}
