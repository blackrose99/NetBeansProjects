package controldeingreso;
public class usuarios {

int cedula;
 String Nombre;
int contacto;
String Tipo_de_usuario;
String motivo_entrada;

public  usuarios(){
    
}

    public usuarios(int cedula, String Nombre, int contacto, String Tipo_de_usuario, String motivo_entrada) {
        this.cedula = cedula;
        this.Nombre = Nombre;
        this.contacto = contacto;
        this.Tipo_de_usuario = Tipo_de_usuario;
        this.motivo_entrada = motivo_entrada;
    }

    @Override
    public String toString() {
        return "usuarios{" + "cedula=" + cedula + ", Nombre=" + Nombre + ", contacto=" + contacto + ", Tipo_de_usuario=" + Tipo_de_usuario + ", motivo_entrada=" + motivo_entrada + '}';
    }

   public String mostrardatos() {
        return "usuarios{" + "cedula=" + cedula + ", Nombre=" + Nombre + ", contacto=" + contacto + ", Tipo_de_usuario=" + Tipo_de_usuario + ", motivo_entrada=" + motivo_entrada + '}';
    }



 



 
    
}

