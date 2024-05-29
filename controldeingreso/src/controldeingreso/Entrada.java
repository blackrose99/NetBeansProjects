
package controldeingreso;


public class Entrada extends usuarios{
    String fecha;
String hora;
double temperatura;
 String area;
int capacidadmax;

public Entrada(){
    
}

    public Entrada(String fecha, String hora, double temperatura, String area, int capacidadmax, int cedula, String Nombre, int contacto, String Tipo_de_usuario, String motivo_entrada) {
        super(cedula, Nombre, contacto, Tipo_de_usuario, motivo_entrada);
        this.fecha = fecha;
        this.hora = hora;
        this.temperatura = temperatura;
        this.area = area;
        this.capacidadmax = capacidadmax;
    }



    @Override
    public String toString() {
        return "Entrada{" + "fecha=" + fecha + ", hora=" + hora + ", temperatura=" + temperatura + ", area=" + area + ", capacidadmax=" + capacidadmax + '}';
    }

    public String mostrardatos() {
        return "Entrada{" + "fecha=" + fecha + ", hora=" + hora + ", temperatura=" + temperatura + ", area=" + area + ", capacidadmax=" + capacidadmax + '}';
    }


}
