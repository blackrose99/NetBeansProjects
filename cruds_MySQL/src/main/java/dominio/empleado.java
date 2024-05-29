package dominio;

public class empleado {

    private int id;
    private String name;
    private String apellido;
    private String email;
    private String telefono;

    public empleado() {
    }

    public empleado(int id) {
        this.id = id;
    }

    public empleado(int id, String name, String apellido, String email, String telefono) {
        this.id = id;
        this.name = name;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    public empleado(String name, String apellido, String email, String telefono) {
        this.name = name;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "empleado{" + "id=" + id + ", name=" + name + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono + '}';
    }
    
}
