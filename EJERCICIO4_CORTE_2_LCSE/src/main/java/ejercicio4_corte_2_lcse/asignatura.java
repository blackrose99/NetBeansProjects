
package ejercicio4_corte_2_lcse;


public class asignatura {
    
    private String codigo;
    private String nombre;
    private String carrera;
    private int numerocredito;
    
        public asignatura(String codigo, String nombre, String carrera, int numerocredito) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.carrera = carrera;
        this.numerocredito = numerocredito;
    }
        
            public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getNumerocredito() {
        return numerocredito;
    }

    public void setNumerocredito(int numerocredito) {
        this.numerocredito = numerocredito;
    }

    @Override
    public String toString() {
        return "codigo=" + codigo + ", nombre=" + nombre + ", carrera=" + carrera + ", numerocredito=" + numerocredito;
    }
}
