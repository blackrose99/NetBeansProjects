
package paciente;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class ListaPacientes {
   
    private ArrayList <Paciente> listaPac;

    //Constructor
    public ListaPacientes () {
        listaPac = new ArrayList <Paciente> (); }

    //Método para agregar pacientes
    public void agregarPaciente (Paciente pac) {
        listaPac.add(pac); }     // Cierre método addProfesor

    //Listado de pacientes de Medicina Prepagada
    public void listarPrepagada() {
        String cadena = "Pacientes medicina Prepagada";
        for (Paciente tmp: listaPac) {       //Uso de for extendido
            if (tmp instanceof Prepagada){
               cadena+=("\n"+tmp.mostrarDatos()); }
        }    
        JOptionPane.showMessageDialog(null,cadena);
    }
    
     
    //Listado de pacientes de una EPS dada
    public void listarEPS(String e) {
        String cadena = "Pacientes de la EPS "+e;
        for (Paciente tmp: listaPac) {       //Uso de for extendido
            if (tmp instanceof Eps){
                if(((Eps) tmp).getNomEPS().equalsIgnoreCase(e))
                   cadena+=("\n"+tmp.mostrarDatos()); 
                }
        }    
        JOptionPane.showMessageDialog(null,cadena);
    }
    
    //Dadtos de un paciente de EPS por cédula
    public void pacienteEPS(int ced) {
        for (Paciente tmp: listaPac) {       //Uso de for extendido
            if (tmp instanceof Eps){
                if(((Eps) tmp).getCedula()==ced)
                   JOptionPane.showMessageDialog(null,tmp.mostrarDatos()); 
                }
        }    
       
    }
        
    
    //Listado de pacientes de Medicina Prepagada mayores de 18 años
    public void listarPrepagada18() {
        String cadena = "Pacientes medicina Prepagada mayores de 18 años: ";
        for (Paciente tmp: listaPac) {       //Uso de for extendido
            if (tmp instanceof Prepagada){
                if (((Prepagada) tmp).getEdad()>18)
                     cadena+=("\n"+tmp.mostrarDatos()); 
            }
        }    
        JOptionPane.showMessageDialog(null,cadena);
    }
  
    //Actualizar cuota moderadora de todos los pacientes de Eps
     public void actualizarCuota( ) {
         double aumento;
        for (Paciente tmp: listaPac) {       //Uso de for extendido
            if (tmp instanceof Eps){
                aumento=((Eps) tmp).getValorCuota()+ (((Eps) tmp).getValorCuota()*0.035);
                ((Eps) tmp).setValorCuota(aumento);
                
                }
        }    
    }
    //Calcular cantidad de pacientes de Prepagada con poliza GOLD 
    public void cantidadGold() {
        int cont=0;
        for (Paciente tmp: listaPac) {       //Uso de for extendido
            if (tmp instanceof Prepagada){
                if (((Prepagada) tmp).getTipoPoliza().equalsIgnoreCase("GOLD"))   
                    cont++;
            }
        }    
        JOptionPane.showMessageDialog(null,"Cantidad de pacientes con poliza GOLD: "+cont);
    }
}

