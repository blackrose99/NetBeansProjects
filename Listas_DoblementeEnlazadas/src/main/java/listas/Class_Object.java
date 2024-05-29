
package listas;
import java.text.SimpleDateFormat;

import java.util.Date;

public class Class_Object {
     private String placa;
    private int modelo;
    private int cilindraje;
    private String marca;
  private Date calendario;

    public Class_Object(String placa, int modelo, int cilindraje, String marca, Date calendario) {
        this.placa = placa;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
        this.marca = marca;
        this.calendario = calendario;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Date getCalendario() {
        return calendario;
    }

    public void setCalendario(Date calendario) {
        this.calendario = calendario;
    }
    

 
    public String formatearFecha(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaArreglada = sdf.format(calendario);
        return fechaArreglada;
    }
            

    
    
    @Override
    public String toString() {
        return " Vehiculo: " + " Placa: " + placa + " Modelo: " + modelo + " Cilindraje: " + cilindraje + " Marca: " + marca + " Fecha de Compra: " + formatearFecha();
    }
}
