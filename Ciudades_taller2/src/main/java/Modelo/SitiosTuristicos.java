package Modelo;

public class SitiosTuristicos {
    private int id;
    private String name;
    private String direccion;
    private String descripcion; // Corregido el nombre del atributo
    private String hora_inicio;
    private String hora_fin;
    private String foto;
    private Ciudad ciudad;
    private double precio;
    

    public SitiosTuristicos() {
    }

    public SitiosTuristicos(int id) {
        this.id = id;
    }

    public SitiosTuristicos(String name, String direccion, String descripcion, String hora_inicio, String hora_fin, double precio) {
        this.name = name;
        this.direccion = direccion;
        this.descripcion = descripcion; // Corregido el nombre del atributo
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        this.precio = precio;
    }

    public SitiosTuristicos(String name, String direccion, String descripcion, String hora_inicio, String hora_fin, String foto, Ciudad ciudad ,double precio) {
        this.name = name;
        this.direccion = direccion;
        this.descripcion = descripcion; 
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        this.foto = foto;
        this.ciudad = ciudad; 
        this.precio = precio;
    }

    public SitiosTuristicos(int id, String name, String direccion, String descripcion, String hora_inicio, String hora_fin, String foto, Ciudad ciudad, double precio) {
        this.id = id;
        this.name = name;
        this.direccion = direccion;
        this.descripcion = descripcion; // Corregido el nombre del atributo
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        this.foto = foto;
        this.ciudad = ciudad; 
        this.precio = precio;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public String getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(String hora_fin) {
        this.hora_fin = hora_fin;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
