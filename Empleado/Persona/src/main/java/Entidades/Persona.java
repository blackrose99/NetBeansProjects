
package Entidades;
public class Persona {
    //atributos encapsulados
    protected String cedula;
    //datos privados
    private String nombre;
    private String apellido;
    private char  sexo;
    private int  edad;
    //declaramos metodo de lectura que retorna la cedula
    public String getCedula() {
        return cedula;
    }
    //metodo de escritura que modifica cedula
    public void  setcedula(String cedula){
        this.cedula=cedula;
    }
    //metod de lectura que retorna nombre

    public String getNombre() {
        return nombre;
    }
    //metodfo de escritura que modifica nombre
    public void  setcnombre(String nombre){
        this.nombre=nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    //constructor vacio
    public  Persona(){
   }
    public Persona(String ced, String nom, String ape, char sex, int eda) {
        this.cedula = ced;
        this.nombre = nom;
        this.apellido = ape;
        this.sexo = sex;
        this.edad = eda;
    }
    //metodo personlaizada


    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", edad=" + edad + '}';
    }
    
    
    
    
    
    
}
