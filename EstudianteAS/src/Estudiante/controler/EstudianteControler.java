package Estudiante.controler;

import Estudiante.model.Estudiante;
import Estudiante.view.EstudianteView;

public class EstudianteControler {
    
    private Estudiante modelo;
    private EstudianteView vista;

    public EstudianteControler(Estudiante modelo, EstudianteView vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public Estudiante getModelo() {
        return modelo;
    }

    public void setModelo(Estudiante modelo) {
        this.modelo = modelo;
    }

    public EstudianteView getVista() {
        return vista;
    }

    public void setVista(EstudianteView vista) {
        this.vista = vista;
    }
    
    

    public int getId() {
        return modelo.getId();
    }

    public void setId(int id) {
        this.modelo.setId(id);
    }
    
    public String getNombre() {
        return modelo.getNombre();
    }

    public void setNombre(String nombre) {
        this.modelo.setNombre(nombre);
    }
    
    public String getApellido() {
        return modelo.getApellido();
    }

    public void setApellido(String apellido) {
        this.modelo.setApellido(apellido);
    }
    
    public String getTelefono() {
        return modelo.getTelefono();
    }

    public void setTelefono(String telefono) {
        this.modelo.setTelefono(telefono);
    }
    
    public String getEmail() {
        return modelo.getEmail();
    }

    public void setEmail(String email) {
        this.modelo.setEmail(email);
    }

    public void actualizar(){
        vista.imprimirDatos(modelo.getId(),modelo.getNombre(), modelo.getApellido(), modelo.getTelefono(), modelo.getEmail());
    }
}
