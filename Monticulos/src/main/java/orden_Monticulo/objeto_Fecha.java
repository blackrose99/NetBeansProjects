


package orden_Monticulo;

import java.text.SimpleDateFormat;
import java.util.Date;


public class objeto_Fecha {
    private int anio;
    private String nombre;
    private Date fecha;

    public objeto_Fecha(int anio, String nombre, Date fecha) {
        this.anio = anio;
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String formatearFecha(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaArreglada = sdf.format(fecha);
        return fechaArreglada;
    }

    @Override
    public String toString() {
        return  "anio: " + anio + " nombre: " + nombre + " fecha: " + formatearFecha();
    }
    
    
}
