
package Programacion;

public class Humano {
     private String nombre;
     private String apellido;
     private String fecha_Nacimiento;
     private String edad;
     private String sexo;

    public Humano(String nombre, String apellido, String fecha_Nacimiento, String edad, String sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_Nacimiento = fecha_Nacimiento;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFecha_Nacimiento() {
        return fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(String fecha_Nacimiento) {
        this.fecha_Nacimiento = fecha_Nacimiento;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    protected void humao(){
        
    }
        
    
}
