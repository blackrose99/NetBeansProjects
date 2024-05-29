
package dominio;


public class Asignaturas {
    private int id;
    private String codigo;
    private String nombre;
    private int creditos;

    public Asignaturas() {
    }

    public Asignaturas(int id) {
        this.id = id;
    }

    public Asignaturas(String codigo ,String nombre, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public Asignaturas(int id,String codigo, String nombre, int creditos) {
        this.codigo = codigo;
        this.id = id;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    
}
