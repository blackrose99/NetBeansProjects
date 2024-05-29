
package Asignatura;

public class Asignatura_Objeto {

    private String Codigo;
    private String Nombre ;
    private String Carrera;
    private int NumeroDeCreditos;

    public Asignatura_Objeto(String Codigo, String Nombre, String Carrera, int NumeroDeCreditos) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Carrera = Carrera;
        this.NumeroDeCreditos = NumeroDeCreditos;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public int getNumeroDeCreditos() {
        return NumeroDeCreditos;
    }

    public void setNumeroDeCreditos(int NumeroDeCreditos) {
        this.NumeroDeCreditos = NumeroDeCreditos;
    }
    
       @Override
    public String toString() {
        return " Asignatura: " + " Codigo: " + Codigo +  " | " + " Nombre: " + Nombre + " | " + " Carrera: " + Carrera + " | " +" Numero de Creditos: " + NumeroDeCreditos;
    }

}
