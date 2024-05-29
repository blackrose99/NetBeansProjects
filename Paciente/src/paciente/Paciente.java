
package paciente;

public class Paciente {
    private int cedula;
    private String nombre; 
    private String direccion; 
    private int telefono;

    public Paciente() {
    }

    public Paciente(int cedula, String nombre, String direccion, int telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    public Paciente(Paciente p){
        this.cedula = p.cedula;
        this.nombre = p.nombre;
        this.direccion = p.direccion;
        this.telefono = p.telefono;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public String mostrarDatos(){
        return "Datos del paciente. Cedula: "+getCedula()+ " Nombre: "+getNombre()+ " Dirección: "+getDireccion()+ " Telefono: "+getTelefono();
    }
}
    