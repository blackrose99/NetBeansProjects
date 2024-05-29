
package web;


public class Vendedor {
    
    private String id;
    private String name;
    private String apellido;
    private double ventas;

    public Vendedor(String id, String name, String apellido, double ventas) {
        this.id = id;
        this.name = name;
        this.apellido = apellido;
        this.ventas = ventas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }
    
    
}
