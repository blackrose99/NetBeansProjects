package USA;

public class Usuario implements Comparable<Usuario> {

    int cod_area;
    double temperatura;
    String nombre;
    int cedula;
    int edad;
    int telefono;
    String motivo_emtrada;
    String fecha_entrada;
    String hora_entrada;

    public Usuario() {
    }

    public Usuario(int cod_area, double temperatura, String nombre, int cedula, int edad, int telefono, String motivo_emtrada, String fecha_entrada, String hora_entrada) {
        this.cod_area = cod_area;
        this.temperatura = temperatura;
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.telefono = telefono;
        this.motivo_emtrada = motivo_emtrada;
        this.fecha_entrada = fecha_entrada;
        this.hora_entrada = hora_entrada;
    }

    public String Mostrardatos() {
        return "Usuario:" + "\n Codigo del Area: # " + cod_area + "\n Temperatura: " + temperatura + "\n Nombre: " + nombre + "\n Cedula: " + cedula + "\n Edad: " + edad + "\n Telefono: " + telefono + "\n Motivo de Etrada: " + motivo_emtrada + "\n Fecha de Entrada: " + fecha_entrada + "\n Hora de Entrada: " + hora_entrada + "\n";
    }
        public String Mos() {
        return "Trabajador:" + "\n Codigo del Area: # " + cod_area + "\n Temperatura: " + temperatura + "\n Nombre: " + nombre + "\n Cedula: " + cedula + "\n Edad: " + edad + "\n Telefono: " + telefono + "\n Motivo de Etrada: " + motivo_emtrada + "\n Fecha de Entrada: " + fecha_entrada + "\n Hora de Entrada: " + hora_entrada + "\n";
    }

    public String mostrardatos() {
        return "Usuarios:" + "\n nombres:" + nombre;

    }

    @Override
    public int compareTo(Usuario o) {
        return nombre.compareTo(o.nombre);//Si queremos podemos colocar el ignorecase, no importa
    }

}
