
package arboles;

public class familia {
    private String nombre;
    private int identificador;

    public familia(String nombre, int identificador) {
        this.nombre = nombre;
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    
    

    @Override
    public String toString() {
        return   "nombre: " + nombre;
    }
    
}
