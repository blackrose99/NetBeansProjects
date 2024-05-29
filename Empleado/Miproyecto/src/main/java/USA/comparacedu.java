
package USA;
import java.util.Comparator;

public class comparacedu implements Comparator<Usuario>{

    @Override
    
    public int compare(Usuario o, Usuario m) {
        if(o.cedula>m.cedula){
           return 1;
        }else if(o.cedula>m.cedula){
            return  0;
        }else{
            return -1;
        }
        
    }
    
}
