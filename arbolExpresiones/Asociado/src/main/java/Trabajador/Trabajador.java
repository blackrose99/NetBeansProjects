/*
 La clase Asociado permite crear la estructura para poder crear objetos de dicha 
clase.  Cada nuevo asociado será un nuevo objeto.
 */
package Trabajador;


public class Trabajador {
//Atributos de la clase
    double cedula;
    String nombre;
    double salario;
    String departamento;
    int libranza;
  

    //Metodo contructor por defecto
    public Trabajador() {
    }

    //Metodo constructor con datos

    public Trabajador(double cedula, String nombre, double salario, String departamento, int libranza) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
        this.libranza = libranza;
    }




public void actualizarSalario(){
    double almacenar1, almacenar2;
    if(salario <= 2000000){
       almacenar1 = salario * 0.05;
        salario = salario + almacenar1;
        
        System.out.println("el nuevo sueldo es de: " +salario);
        
    }else if(salario > 2000000){
        almacenar2 = salario * 0.03;
        salario = salario + almacenar2;
        
       System.out.println("el nuevo sueldo es de: " +salario);
      
    }

}

    public void AsignarLibranza() {

        if (libranza <= 0) {
            System.out.println("Libranza sin valor para aplicar");

        } else if (libranza > salario * 0.30) {
            System.out.println("Libranza no aplicable para este salario");
        } else {
            salario = salario - libranza;
        }
        System.out.println("su nuevo sueldo descontado es de: " + salario);
    }


    @Override
    public String toString() {
        return ("Trabajador:" + "\n cedula=" + cedula + "\n nombre=" + nombre + "\n salario=" + salario + "\n departamento=" + departamento +"\n libranza=" + libranza );
    }
    
     

}

