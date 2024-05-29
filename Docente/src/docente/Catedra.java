
package docente;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Catedra extends Docente{
    ArrayList<Catedra> ca;
    int hSem;
    double valorHora;
    
    
       public Catedra(){
        ca = new ArrayList <Catedra>();
       }
    
    
    public Catedra(int hSem, double valorHora) {
        this.hSem = hSem;
        this.valorHora = valorHora;
    }

    public Catedra( String documento, String nombre, String genero, String programa, int categoria,int hSem, double valorHora) {
        super(documento, nombre, genero, programa, categoria);
        this.hSem = hSem;
        this.valorHora = valorHora;
    }

    
               public void ListaCatedra(){
        String mostrar = "Lista de Docentes de Catedra: ";
            for (Catedra tm: ca) {      
            if (tm instanceof Catedra){
               mostrar+=("\n"+tm.mostrarCatedra());
            }
            }if(ca.size()==0){
              JOptionPane.showMessageDialog(null," No se ha Registrado ningun Docente" , "",JOptionPane.ERROR_MESSAGE);  
            }else
        JOptionPane.showMessageDialog(null,mostrar);
        
       }
               
               
      public Object MostrarProgramasYNumeroCatedra(){
        String mostrar = "", repetido = "";
        int contador = 0;
        for(Catedra tm: ca){
            if(tm instanceof Catedra){
             
                if(!((Catedra)tm).programa.equals(repetido)){
                    contador++;
                    mostrar+=("\n" +tm.programa);
                }else{  
                    contador++;
                }
                   repetido = tm.programa;
            }
            
        }
       return "Los Programas Registrados en Docentes de Catedra Son: " + mostrar + "\n El numero de Programas En Docentes de Catedra es de: " + contador;
    }        
               
        public int numeroHombresCatedra(){
        int cuentaHombre = 0;
        for(Catedra h: ca){
            if(h instanceof Catedra){
                if(((Catedra)h).genero.equalsIgnoreCase("M")){
                    cuentaHombre++;
                }
            }
        }
        return cuentaHombre;
    }
    
    public int numeroMujeresCatedra(){
       int cuentaMujer = 0;
        for(Catedra m: ca){
            if(m instanceof Catedra){
                if(((Catedra)m).genero.equalsIgnoreCase("F")){
                    cuentaMujer++;
                }
            }
        }
        return cuentaMujer;
    }
      
      
      
    
      public void agregarDocenteDePlanta(Catedra c) {
        ca.add(c);
    }
    
  
    public String mostrarCatedra() {
        return super.mostrarDatosCatedra() + "Catedra{" + "hSem=" + hSem + ", valorHora=" + valorHora + '}';
    }
    
    
    
}
