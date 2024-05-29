
package paciente;

public class Eps extends Paciente{
      private String nomEPS;
      private double valorCuota;

    public Eps() {
    }

    public Eps(String nomEPS, double valorCuota, int cedula, String nombre, String direccion, int telefono) {
        super(cedula, nombre, direccion, telefono);
        this.nomEPS = nomEPS;
        this.valorCuota = valorCuota;
    }

   
    public String getNomEPS() {
        return nomEPS;
    }

    public void setNomEPS(String nomEPS) {
        this.nomEPS = nomEPS;
    }

    public double getValorCuota() {
        return valorCuota;
    }

    public void setValorCuota(double valorCuota) {
        this.valorCuota = valorCuota;
    }

     public String mostrarDatos(){
        return super.mostrarDatos()+" Nombre de la EPS: "+getNomEPS()+ " Valor cuota moderadora: "+getValorCuota();
    } 
      
}
