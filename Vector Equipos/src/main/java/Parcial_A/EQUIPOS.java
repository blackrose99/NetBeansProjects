package Parcial_A;
public class EQUIPOS {
    public String Codigo;
    public String Nombre;
    public String Ciudad;
    public int Campeonatos_Ganados;

    public EQUIPOS(String Codigo, String Nombre, String Ciudad, int Campeonatos_Ganados) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Ciudad = Ciudad;
        this.Campeonatos_Ganados = Campeonatos_Ganados;
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

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public int getCampeonatos_Ganados() {
        return Campeonatos_Ganados;
    }

    public void setCampeonatos_Ganados(int Campeonatos_Ganados) {
        this.Campeonatos_Ganados = Campeonatos_Ganados;
    }

public String toString(){
        return  Codigo + "\t" + Nombre + "\t" + Ciudad + "\t" + Campeonatos_Ganados;
    }

}
