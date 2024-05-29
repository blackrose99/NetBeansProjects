
package Programacion;

import javax.swing.JOptionPane;
public class Paciente extends Humano{
     private String tipo_Sangre;
      private String peso;
       private String cedula;
        private String tipo_Afilicion;

    public Paciente(String tipo_Sangre, String peso, String cedula, String tipo_Afilicion, String nombre, String apellido, String fecha_Nacimiento, String edad, String sexo) {
        super(nombre, apellido, fecha_Nacimiento, edad, sexo);
        this.tipo_Sangre = tipo_Sangre;
        this.peso = peso;
        this.cedula = cedula;
        this.tipo_Afilicion = tipo_Afilicion;
    }



    public String getTipo_Sangre() {
        return tipo_Sangre;
    }

    public void setTipo_Sangre(String tipo_Sangre) {
        this.tipo_Sangre = tipo_Sangre;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTipo_Afilicion() {
        return tipo_Afilicion;
    }

    public void setTipo_Afilicion(String tipo_Afilicion) {
        this.tipo_Afilicion = tipo_Afilicion;
    }
    
    
    protected void datosPersona() {
        JOptionPane.showMessageDialog(null, "Paciente: \nNombre :" + getNombre() + " " + getApellido()
                + "\nFecha de nacimiento: " + getFecha_Nacimiento()
                + "\nEdad: " + getEdad()
                + "\nSexo: " + getSexo()
                + "\nTipo de sangre: " + getTipo_Sangre()
                + "\nPeso: " + getPeso()
                + "\nCedula: " + getCedula()
                + "\nTipo de afiliado: " + getTipo_Afilicion());
    }

}
