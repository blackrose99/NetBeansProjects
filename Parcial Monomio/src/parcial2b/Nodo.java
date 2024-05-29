package parcial2b;

public class Nodo {

    Polinomio poli;
    Nodo enlace;

    public Nodo() {
    }

    public Nodo(Polinomio poli) {

        this.poli = poli;

        enlace = null;
    }

    public Nodo(Nodo n) {
        this.poli = poli;

        enlace = n;
    }

}
