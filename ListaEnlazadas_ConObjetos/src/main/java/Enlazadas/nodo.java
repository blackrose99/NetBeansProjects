package Enlazadas;
public class nodo {
    
 nodo enlace;
private vehiculo datos;
//insertar al inicio
    public nodo(vehiculo datos, nodo enlace) {
        this.enlace = enlace;
        this.datos = datos;
    }
 //insertar al final
    public nodo(vehiculo per) {
        datos = per;
        enlace = null;
    }
    
    
    public void enlazarSiguiente(nodo n) {
        enlace = n;
    }
    
        
    public nodo getEnlace() {
        return enlace;
    }
    
    
    public void setEnlace(nodo enlace) {
        this.enlace = enlace;
    }

    public vehiculo getDatos() {
        return datos;
    }

    public void setDatos(vehiculo datos) {
        this.datos = datos;
    }

}

