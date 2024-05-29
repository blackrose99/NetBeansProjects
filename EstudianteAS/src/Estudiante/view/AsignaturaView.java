package Estudiante.view;

import Estudiante.model.Estudiante;

public class AsignaturaView {

    public void imprimirAsignatura(int id, int creditos, String nombre, Estudiante id_estudiante, Estudiante nom_estudiante) {
        System.out.println("---Datos Asignatura---");
        System.out.println("ID: " + id);
        System.out.println("Creditos: " + creditos);
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: Estudiante: " + id_estudiante.getId());
        System.out.println("Nombre del estudiante: " + nom_estudiante.getNombre());
        System.out.println("");
    }
}
