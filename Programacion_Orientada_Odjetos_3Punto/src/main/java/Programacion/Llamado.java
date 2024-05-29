
package Programacion;
import javax.swing.JOptionPane;
public class Llamado {
    public static void main(String[] args) {
//        String nombre="Carlos";
//        String apellido="Apellido";
//        String fecha="08/07/2022";
//        String edad="32";
//        String sexo="masculino";
//        String tipoSangre="o+";
//        String peso="69";
//        String cc="1195343443";
//        String tipoAfiliado="Seguro";
//      Paciente pas = new Paciente(nombre,apellido,fecha, edad,sexo,tipoSangre,tipoAfiliado,peso,cc);
//        pas.datosPersona();
//        
//        
        
    
        String nombre="Carlos";
        String apellido="Apellido";
        String fecha="08/07/2022";
        String edad="32";
        String sexo="masculino";
         String horario="medio tiempo";
        String areaEs="neurocirujano";
      Medico pa = new Medico(nombre,apellido,fecha, edad,sexo,horario,areaEs);
        pa.datosMedico();
    }
}
