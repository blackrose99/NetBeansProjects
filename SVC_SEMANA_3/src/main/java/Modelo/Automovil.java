
package Modelo;

public class Automovil {
    
    private int idVehiculo;
    private String marca;
    private String modelo;
    private int año;
    private String color;
    private double precio;

    public Automovil() {
    }

    public Automovil(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public Automovil(String marca, String modelo, int año, String color, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
        this.precio = precio;
    }

    public Automovil(int idVehiculo, String marca, String modelo, int año, String color, double precio) {
        this.idVehiculo = idVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
        this.precio = precio;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

      @Override
    public String toString() {
        return "Automovil{" + "idVehiculo=" + idVehiculo + ", marca=" + marca + ", modelo=" + modelo + ", año=" + año + ", precio=" + precio + '}';
    }
    
}

    

