
package Quicksort;
public class Compañia_Refrescos {
    
   private int cedula;
   private String nombre;
   private double ventas;
   private int años;

    public Compañia_Refrescos(int cedula, String nombre, double ventas, int años) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.ventas = ventas;
        this.años = años;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }
    
    

    @Override
    public String toString() {
        return  " cedula: " + cedula + " nombre: " + nombre + " ventas: " + ventas + " años: " + años + "\n";
    }
    

}
