package parcial2b;

public class Polinomio {

    private int termino;
    private int exponente;

    public Polinomio() {
        this.termino = 0;
        this.exponente = 0;
    }

    public Polinomio(int termino, int exponente) {
        this.termino = termino;
        this.exponente = exponente;
    }

    public int getTermino() {
        return termino;
    }

    public void setTermino(int termino) {
        this.termino = termino;
    }

    public int getExponente() {
        return exponente;
    }

    public void setExponente(int exponente) {
        this.exponente = exponente;
    }

    

}
