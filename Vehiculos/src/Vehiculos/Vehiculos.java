
package Vehiculos;

import javax.swing.JOptionPane;

public class Vehiculos 
{
    Menu obj = new Menu();
    private String marca;
    private String modelo;
    private String placa;
    private int cilindraje;
   

    public Vehiculos(String marca, String modelo, String placa, int cilindraje) 
    {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.cilindraje = cilindraje;
       
     }

    public void setMarca(String marca) 
    {
        this.marca = marca;
    }

    public void setModelo(String modelo) 
    {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) 
    {
        this.placa = placa;
    }

    public void setCilindraje(int cilindraje) 
    {
        this.cilindraje = cilindraje;
    }
    
    public String getMarca() 
    {
        return marca;
    }

    public String getModelo() 
    {
        return modelo;
    }

    public String getPlaca() 
    {
        return placa;
    }

    public double getCilindraje() 
    {
        return cilindraje;
    }

    
    

    /*
    Muestra los datos del vehículo
    */
    public String mostrarDatos()
    {
        return  "\nMarca del vehículo: " + marca + "\nModelo del vehículo" + modelo 
                + "\nPlaca del vehículo: " + placa + "\nCilindraje del vehículo: " + cilindraje;
    }
    
    /*
    "Borra" los datos del vehículo
    */
    public void borrarVehiculo()
    {
        marca = null;
        modelo = null;
        placa = null;
        cilindraje = 0;
    }    
    
   
    
    

}
