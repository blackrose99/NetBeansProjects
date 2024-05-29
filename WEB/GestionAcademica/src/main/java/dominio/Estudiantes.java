
package dominio;


public class Estudiantes {
    private int id;
    private int cc;
    private String nombre;
    private String apellido;
    private String email;
    private String telfono;
    private double promedio;

    public Estudiantes() {
    }

    public Estudiantes(int id) {
        this.id = id;
    }

    public Estudiantes(int cc, String nombre, String apellido, String email, String telfono, double promedio) {
        this.cc = cc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telfono = telfono;
        this.promedio = promedio;
    }

    public Estudiantes(int id,int cc, String nombre, String apellido, String email, String telfono, double promedio) {
        this.id = id;
        this.cc = cc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telfono = telfono;
        this.promedio = promedio;
    }

    public int getId() {
        return id;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
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

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    
}
