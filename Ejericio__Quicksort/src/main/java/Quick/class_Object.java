
package Quick;

public class class_Object {
    
    int id;
    String nombre;
    String apellido;
    double notafinal;

    public class_Object(int id, String nombre, String apellido, double notafinal) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.notafinal = notafinal;
    }
    
    

    @Override
    public String toString(){
        
        return " ID: " + id + " NOMBRE :" + nombre + " APELLIDO: " + apellido + " NOTA FINAL: " + notafinal + "\n";   
    }    
}






