
package punto;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class ClasArrayList {
    
    public static void main(String[] args) {
        ArrayList<Circulo> ci = new ArrayList<>();
        Circulo c1 =new Circulo();
        Cilindro c2 =new Cilindro();
        Cono c3 =new Cono();
        ci.add(c1);
         JOptionPane.showMessageDialog(null,ci.size());
        ci.add(c2);
        JOptionPane.showMessageDialog(null,ci.size());
        ci.add(c3);
        JOptionPane.showMessageDialog(null,ci.size());
       
        
    }
  
}