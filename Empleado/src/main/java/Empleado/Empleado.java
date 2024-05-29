/*Crear la clase empleado, con los atributos documento de identidad, nombre, sueldo y antiguedad en la empresa en años.
Construir la clase de prueba donde se puedan crear los objetos de la clase Empleado
*/
package empleado;

public class Empleado {
    String documento;
    String nombre;
    double sueldo;
    int antiguedad;
    
    //Métodos constructores de la clase

    public Empleado() {
    }

    public Empleado(String documento, String nombre, double sueldo, int antiguedad) {
        this.documento = documento;
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.antiguedad = antiguedad;
    }

    public Empleado(String documento, String nombre) {
        this.documento = documento;
        this.nombre = nombre;
    }
    
    
    
//     public Empleado(String doc, String nom, double su, int ant) {
//        documento = doc;
//        nombre = nom;
//        sueldo = su;
//        antiguedad = ant;
//    }

    public String getDocumento() {  //para consulta
        return documento;
    }

    public void setDocumento(String documento) {  //para asignar valor
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    public void modificarSueldo(double porcentaje){
        double incremento;
        incremento=sueldo*porcentaje/100;
        sueldo=sueldo+incremento;
    }
    
    public double bonificacion(){
        double boni;
        if(antiguedad<=5){
            boni=sueldo*0.1;
        }
        else
            if(antiguedad<=10)
                boni=sueldo*0.15;
            else
                boni=sueldo*0.2;
        return boni;        
    }

    @Override
    public String toString() {
        return "Empleado{" + "documento=" + documento + ", nombre=" + nombre + ", sueldo=" + sueldo + ", antiguedad=" + antiguedad + '}';
    }

    public String mostrarDatos(){
        return "Nombre del empleado: "+nombre+ " Documento de identidad: "+documento+ " Salario actual: "+sueldo + " Años en la empresa: "+antiguedad;
    }
    
        
}  
  


     