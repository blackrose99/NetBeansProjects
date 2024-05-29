
package lib;

import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Metodos_Revistas {
    ArrayList<Revistas> rev;

    
    
       public Metodos_Revistas() {
        rev = new ArrayList<Revistas>();
    }
    
        public void agregarRevista(Revistas re){
        rev.add(re);
    }

    public void publicacion_Revistas() {
        String revi="Listado de revistas publicadas los ultimos 5 años: ";
        for (Revistas r : rev) {
            if (r instanceof Revistas) {
                if (((Revistas) r).año_Publicacion > 2017) {
                     revi+=("\n"+"\n" +r.mostrar_Revistass());

                }
            }
        }
        JOptionPane.showMessageDialog(null, revi );
    }

    public boolean cantidad_PorNombre(String nom) {
        boolean enco = false;
       int cont=0;
        for (Revistas re : rev) {
            if (re instanceof Revistas) {
                if (((Revistas)re).titulo.equalsIgnoreCase(nom)) {
                    enco = true;
                for(int i=rev.size()-1;i<rev.size();i++){
                    if(re.titulo.equalsIgnoreCase(nom)){
                    cont++;      
//                    break;
                        }
                    }

                }

            }

        }
         
        
        if (enco != true) {
            JOptionPane.showMessageDialog(null, " Este nombre no esta registrado ", "", JOptionPane.ERROR_MESSAGE);
        }
        JOptionPane.showMessageDialog(null, "la cantidad de revistas son: " + cont);   
        
                return enco;
            
                

    }


}
