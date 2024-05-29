
package punto;
import javax.swing.JOptionPane;
public class PruebaPunto {
    public static void main (String[] args){
        int x,y;
        double radio, altura;
        x= Integer.parseInt(JOptionPane.showInputDialog(null," Ingrese el valor de la coordenada x del punto: "));
        y= Integer.parseInt(JOptionPane.showInputDialog(null," Ingrese el valor de la coordenada y del punto: "));
        radio= Double.parseDouble(JOptionPane.showInputDialog(null," Ingrese el valor del radio del circulo: "));
        Circulo C1= new Circulo(radio,x,y);
        JOptionPane.showMessageDialog(null,C1.toString());
        JOptionPane.showMessageDialog(null,"El area del circulo es = "+ C1.getArea()+ "\nLa longitud de la circunferencia es = " + C1.getCircunferencia());
        
        x= Integer.parseInt(JOptionPane.showInputDialog(null," Ingrese el valor de la coordenada x del punto: "));
        y= Integer.parseInt(JOptionPane.showInputDialog(null," Ingrese el valor de la coordenada y del punto: "));
        radio= Double.parseDouble(JOptionPane.showInputDialog(null," Ingrese el valor del radio del cilindro: "));
        altura= Double.parseDouble(JOptionPane.showInputDialog(null," Ingrese el valor de la altura del cilindro: "));
        Cilindro cil = new Cilindro(altura,radio,x,y);
        JOptionPane.showMessageDialog(null,cil.toString()+ "\nArea: "+ Math.round(cil.getArea())+ "\nVolumen: "+ Math.round(cil.getVolumen()));
        
        String red="\033[31m";
        String reset="\u001B[0m";
        System.out.println(red+"Codigo: "+reset+" PRUEBA");
        
    }
    
}
