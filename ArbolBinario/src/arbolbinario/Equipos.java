
package arbolbinario;


public class Equipos {
   int codigoEquipo;
   String nombre_equipo;
   String ciudad;
     int numeroCampeonatosGanados;

    public Equipos(int codigoEquipo, String nombre_equipo, String ciudad, int numeroCampeonatosGanados) {
        this.codigoEquipo = codigoEquipo;
        this.nombre_equipo = nombre_equipo;
        this.ciudad = ciudad;
        this.numeroCampeonatosGanados = numeroCampeonatosGanados;
    }

    @Override
    public String toString() {
        return "Equipos: " + " Codigo del Equipo " + codigoEquipo + " Nombre del Equipo: " + nombre_equipo + " Ciudad: " + ciudad + " Numero de Campeonatos Ganados: " + numeroCampeonatosGanados;
    }
    
    




    
    
    
    
}
