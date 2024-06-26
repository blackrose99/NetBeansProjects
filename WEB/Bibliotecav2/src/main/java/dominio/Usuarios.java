
package dominio;


public class Usuarios {
    private int id;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telfono;

    public Usuarios() {
    }

    public Usuarios(int id) {
        this.id = id;
    }

    public Usuarios(String nombre, String apellido, String direccion, String telfono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telfono = telfono;
    }

    public Usuarios(int id, String nombre, String apellido, String direccion, String telfono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telfono = telfono;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelfono() {
        return telfono;
    }

    public void setTelfono(String telfono) {
        this.telfono = telfono;
    }

    
}
