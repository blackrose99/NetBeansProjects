package ejercicio2_listas_dinamicas;

public class Funciones_Nodos {

    Funciones_Nodos next;
    private Equipos info;

    public Funciones_Nodos() {

    }

    public Funciones_Nodos(Equipos info, Funciones_Nodos next) {
        this.next = next;
        this.info = info;
    }

    public Funciones_Nodos(Equipos equipo) {
        info = equipo;
        next = null;
    }

    public Funciones_Nodos getNext() {
        return next;
    }

    public void setNext(Funciones_Nodos next) {
        this.next = next;
    }

    public Equipos getInfo() {
        return info;
    }

    public void setInfo(Equipos info) {
        this.info = info;
    }

}
