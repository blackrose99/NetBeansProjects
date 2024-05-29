
package USA;
import java.util.Comparator;

public class ordecog implements Comparator<Usuario>{

    @Override
    
    public int compare(Usuario t, Usuario u) {
        if(t.cod_area>u.cod_area){
           return 1;
        }else if(t.cod_area>u.cod_area){
            return  0;
        }else{
            return -1;
        }
        
    }
    
}

