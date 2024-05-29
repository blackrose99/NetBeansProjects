
package parcial_1_maicol.alexis.cubidespeña;


public class CONGRESISTAS {

   private int identificacion;
   private String nombre;
   private String partido_Politico;
   private int numero_Votos;

    public CONGRESISTAS(int identificacion, String nombre, String partido_Politico, int numero_Votos) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.partido_Politico = partido_Politico;
        this.numero_Votos = numero_Votos;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPartido_Politico() {
        return partido_Politico;
    }

    public void setPartido_Politico(String partido_Politico) {
        this.partido_Politico = partido_Politico;
    }

    public int getNumero_Votos() {
        return numero_Votos;
    }

    public void setNumero_Votos(int numero_Votos) {
        this.numero_Votos = numero_Votos;
    }
    
    
    
    @Override
    public String toString() {
        return "CONGRESISTA: \n" + "Identificacion: " + identificacion + " Nombre: " + nombre + " Partido Politico: " + partido_Politico + " Numero de votos: " + numero_Votos;
    }
            
    
}
