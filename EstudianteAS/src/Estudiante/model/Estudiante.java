package Estudiante.model;

public class Estudiante {
    
    private static Estudiante instance;
    
    private int id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

    private Estudiante() {
        // Private constructor to prevent instantiation outside the class
    }

    public static Estudiante getInstance() {
        if (instance == null) {
            instance = new Estudiante();
        }
        return instance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
