package dominio;

public class Clientes {
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private String telfono;
    private double sueldo;

    public Clientes() {
    }

    public Clientes(int id) {
        this.id = id;
    }

    public Clientes(String nombre, String apellido, String email, String telfono, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telfono = telfono;
        this.sueldo = sueldo;
    }

    public Clientes(int id, String nombre, String apellido, String email, String telfono, double sueldo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telfono = telfono;
        this.sueldo = sueldo;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelfono() {
        return telfono;
    }

    public void setTelfono(String telfono) {
        this.telfono = telfono;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
          
}
