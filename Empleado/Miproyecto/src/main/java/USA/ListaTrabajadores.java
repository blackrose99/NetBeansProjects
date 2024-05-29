
package USA;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class ListaTrabajadores {
     ArrayList<Trabajadores> traba;
     
     
       public ListaTrabajadores(){
        traba = new ArrayList <Trabajadores> ();}
     
       public void Listaemple(){
        String mostrar = "Lista de trabajadores de la empresa: ";
            for (Trabajadores tm: traba) {      
            if (tm instanceof Trabajadores){
               mostrar+=("\n"+tm.Mostrardatos()); }
            }if(traba.size()==0){
              JOptionPane.showMessageDialog(null," No se ha Registrado ningun Trabajador" , "",JOptionPane.ERROR_MESSAGE);  
            }else
        JOptionPane.showMessageDialog(null,mostrar);
        
       }
        
        public void agregarTrabajador(Trabajadores tra){
            traba.add(tra);
    
        
    }
          
        
}
