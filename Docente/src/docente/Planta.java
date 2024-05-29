
package docente;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Planta extends Docente{
    ArrayList<Planta> pla;
     ArrayList<Catedra> cat;
    int antiguedad;
    double sueldo;  
       public Planta(){
        pla = new ArrayList <Planta>();
       }
    
    public Planta(int antiguedad, double sueldo) {
        this.antiguedad = antiguedad;
        this.sueldo = sueldo;
    }

    public Planta( String documento, String nombre, String genero, String programa, int categoria,int antiguedad, double sueldo) {
        super(documento, nombre, genero, programa, categoria);
        this.antiguedad = antiguedad;
        this.sueldo = sueldo;
    }
    

           
         public boolean BuscarDocentePlanta(String documento) {
        boolean encontrado = false;
        for (Planta u : pla) {
            if (u instanceof Planta) {
                if (((Planta) u).documento.equalsIgnoreCase(documento)) {
                    encontrado = true;
                    JOptionPane.showMessageDialog(null, u.mostrarPlantaa());

                }
            }
        }
        if (encontrado != true) {
            JOptionPane.showMessageDialog(null, "Este Documento no Esta Registrado", "", JOptionPane.ERROR_MESSAGE);
        }
        return encontrado;
    }

    public void BuscarHombresAntiguedadMayorADiez() {
        String mostrar = "Lista de Docentes Masculinos con mas de 10 años de Antiguedad";
        for (Planta m : pla) {
            if (m instanceof Planta) {
                if (((Planta) m).genero.equalsIgnoreCase("M") && ((Planta) m).antiguedad > 10) {
                    mostrar += ("\n" + m.mostrarPlantaa());
                }
            }
        }
        JOptionPane.showMessageDialog(null, mostrar);
    }
    
    
        
           public void ListaPlanta(){
        String mostrar = "Lista de Docentes de Planta: ";
            for (Planta tm: pla) {      
            if (tm instanceof Planta){
               mostrar+=("\n"+tm.mostrarPlantaa());
            }
            }if(pla.size()==0){
              JOptionPane.showMessageDialog(null," No se ha Registrado ningun Docente" , "",JOptionPane.ERROR_MESSAGE);  
            }else
        JOptionPane.showMessageDialog(null,mostrar);
        
       }
    
    
    
    public Object MostrarProgramasYNumero(){
        String mostrar = "", repetido = "";
        int contador = 0;
        for(Planta tm: pla){
            if(tm instanceof Planta){
             
                if(!((Planta)tm).programa.equals(repetido)){
                    contador++;
                    mostrar+=("\n" +tm.programa);
                }else{  
                    contador++;
                }
                   repetido = tm.programa;
            }
            
        }
         
       return "Los Programas Registrados en Docentes de Planta Son: " + mostrar + "\n El numero de Programas En Docentes de Planta es de: " + contador;
    }
    
    
    public int numeroHombresPlanta(){
        int cuentaHombre = 0;
        for(Planta h: pla){
            if(h instanceof Planta){
                if(((Planta)h).genero.equalsIgnoreCase("M")){
                    cuentaHombre++;
                }
            }
        }
        return cuentaHombre;
    }
    
    public int numeroMujeresPlanta(){
       int cuentaMujer = 0;
        for(Planta m: pla){
            if(m instanceof Planta){
                if(((Planta)m).genero.equalsIgnoreCase("F")){
                    cuentaMujer++;
                }
            }
        }
        return cuentaMujer;
    }
    


    public void agregarDocenteDePlanta(Planta tra) {
        pla.add(tra);
    }
    public String mostrarPlantaa() {
        return super.mostrarDatosPlanta() + "Planta{" + "antiguedad=" + antiguedad + ", sueldo=" + sueldo + '}';
    }
    


    
    
}
