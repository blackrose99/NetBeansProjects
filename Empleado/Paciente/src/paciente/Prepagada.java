
package paciente;

public class Prepagada extends Paciente {
    private String tipoPoliza;
    private int edad;

    public Prepagada() {
    }

    public Prepagada(String tipoPoliza, int edad, int cedula, String nombre, String dirección, int teléfono) {
        super(cedula, nombre, dirección, teléfono);
        this.tipoPoliza = tipoPoliza;
        this.edad = edad;
    }

    public String getTipoPoliza() {
        return tipoPoliza;
    }

    public void setTipoPoliza(String tipoPoliza) {
        this.tipoPoliza = tipoPoliza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    

    public String mostrarDatos(){
        return super.mostrarDatos()+"Tipo de Póliza: "+getTipoPoliza()+ " Edad: "+getEdad();
    } 
        
}
