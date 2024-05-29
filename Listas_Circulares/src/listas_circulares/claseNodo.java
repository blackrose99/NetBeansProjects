
package listas_circulares;


public class claseNodo {
    
    private String valor;
    private claseNodo siguiente;
    
    public claseNodo(){
        this.valor = "";
        this.siguiente = this;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public claseNodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(claseNodo siguiente) {
        this.siguiente = siguiente;
    }

}
