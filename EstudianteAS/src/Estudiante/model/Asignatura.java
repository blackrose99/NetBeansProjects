package Estudiante.model;

public class Asignatura {

    private static Asignatura instance;

    private int id;
    private int creditos;
    private String Nombre;
    private Estudiante id_estudiante;
    private Estudiante nom_estudiante;

    private Asignatura() {
        // Private constructor to prevent instantiation outside the class
    }

    public static Asignatura getInstance() {
        if (instance == null) {
            instance = new Asignatura();
        }
        return instance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Estudiante getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(Estudiante id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public Estudiante getNom_estudiante() {
        return nom_estudiante;
    }

    public void setNom_estudiante(Estudiante nom_estudiante) {
        this.nom_estudiante = nom_estudiante;
    }

}
