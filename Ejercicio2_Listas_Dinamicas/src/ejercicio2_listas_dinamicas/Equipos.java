package ejercicio2_listas_dinamicas;

public class Equipos {

    private String codigo;
   private String nombre;
     private String ciudad;
     private int Campeonatos;
   

    public Equipos(String codigo, String nombre, String ciudad, int Campeonatos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.Campeonatos = Campeonatos;
 
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCampeonatos() {
        return Campeonatos;
    }

    public void setCampeonatos(int Campeonatos) {
        this.Campeonatos = Campeonatos;
    }

    @Override
    public String toString() {
        return  "codigo=" + codigo + ", nombre=" + nombre + ", ciudad=" + ciudad + ", Campeonatos=" + Campeonatos;
    }


}
