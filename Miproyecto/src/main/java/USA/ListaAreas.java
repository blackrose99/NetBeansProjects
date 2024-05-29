
package USA;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ListaAreas {
    
     ArrayList<Areas> ar;
     ArrayList <Usuario> Usuar;
         
      public ListaAreas(){
        ar = new ArrayList <Areas> ();}

           public void agregarArea(Areas are){
            ar.add(are);
    }
           
      public boolean cantidaar(int codareaa){
    boolean enco=false;
    for(Areas tp:ar ){
        if(tp.cod==codareaa){
             if(tp.cantidad_actual<tp.capa_max){
                  tp.cantidad_actual++;
                enco=true;
           
             
            }   
        } 
    
    }
    
    return enco ;
        
}
public boolean nodejapa(int codareaa){
  boolean en=false;
    for(Areas tp:ar ){
        if(tp.cod==codareaa){
             if(tp.cantidad_actual>=tp.capa_max){
               JOptionPane.showMessageDialog(null," El Area " + tp.cod + " , " +  tp.nom_area + " se encuentra en su maximo de Personal","",JOptionPane.WARNING_MESSAGE);
                 en=false;
                
           
             
            }   
        } 
    }
   
     return  en;
}

public void disminu(double tem){
    for(Areas t:ar){
        if(t instanceof Areas){
        if(tem>=38.0){            
            t.cantidad_actual--;
           
        }
        }
        
    }JOptionPane.showMessageDialog(null," Su Temperatura sobrepasa los Protocolos  ", "",JOptionPane.WARNING_MESSAGE);
}

          


}