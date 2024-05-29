
package USA;

import java.util.Comparator;

public  class compararmo implements Comparator<Usuario>{

    public int compare(Usuario x, Usuario j) {
   return x.motivo_emtrada.compareToIgnoreCase(j.motivo_emtrada);
   
    }
    
}
