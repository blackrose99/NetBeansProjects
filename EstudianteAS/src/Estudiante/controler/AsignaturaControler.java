package Estudiante.controler;

import Estudiante.model.Asignatura;
import Estudiante.model.Estudiante;
import Estudiante.view.AsignaturaView;

public class AsignaturaControler {

    private Asignatura modelo;
    private AsignaturaView vista;

    public AsignaturaControler(Asignatura modelo, AsignaturaView vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public int getId() {
        return modelo.getId();
    }

    public void setId(int id) {
        this.modelo.setId(id);
    }

    public int getCreditos() {
        return modelo.getCreditos();
    }

    public void setCreditos(int creditos) {
        this.modelo.setCreditos(creditos);
    }

    public String getNombre() {
        return modelo.getNombre();
    }

    public void setNombre(String nombre) {
        this.modelo.setNombre(nombre);
    }

    public Estudiante getId_estudiante() {
        return modelo.getId_estudiante();
    }

    public void setId_estudiante(Estudiante id_estudiante) {
        this.modelo.setId_estudiante(id_estudiante);
    }

    public Estudiante getNom_estudiante() {
        return modelo.getNom_estudiante();
    }

    public void setNom_estudiante(Estudiante Nom_estudiante) {
        this.modelo.setNom_estudiante(Nom_estudiante);
    }

    public void actualizarAsignatura() {
        Estudiante estudiante = modelo.getId_estudiante();
        Estudiante estudiante1 = modelo.getNom_estudiante();
        vista.imprimirAsignatura(modelo.getId(), modelo.getCreditos(), modelo.getNombre(), estudiante, estudiante1);
    }
}
