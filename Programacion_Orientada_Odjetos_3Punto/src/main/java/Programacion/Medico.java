
package Programacion;

import javax.swing.JOptionPane;


public class Medico extends Humano{
    private String horario;
    private String area_Especializacion;

    public Medico(String horario, String area_Especializacion, String nombre, String apellido, String fecha_Nacimiento, String edad, String sexo) {
        super(nombre, apellido, fecha_Nacimiento, edad, sexo);
        this.horario = horario;
        this.area_Especializacion = area_Especializacion;
    }
    


    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getArea_Especializacion() {
        return area_Especializacion;
    }

    public void setArea_Especializacion(String area_Especializacion) {
        this.area_Especializacion = area_Especializacion;
    }
    
        protected void datosMedico() {
        JOptionPane.showMessageDialog(null, "Paciente: \nNombre :" + getNombre() + " " + getApellido()
                + "\nFecha de nacimiento: " + getFecha_Nacimiento()
                + "\nEdad: " + getEdad()
                + "\nSexo: " + getSexo()
                + "\nHorario: " + getHorario()
                + "\nArea de especializacio: " + getArea_Especializacion());
    }
}
