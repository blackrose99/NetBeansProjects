
package Cal_Arit;

import javax.swing.JOptionPane;
public class calculadoraMetodos {
    int guardar;
    public void Suma(int num1, int num2){
         guardar= num1+num2;
         JOptionPane.showMessageDialog(null," La suma entre " + num1 + " y " + num2 + " es: " + guardar);
    }
        public void Resta(int num1, int num2){
         guardar= num1-num2;
         JOptionPane.showMessageDialog(null," La resta entre " + num1 + " y " + num2 + " es: " + guardar);
    }
    public void Multiplicación(int num1, int num2) {
        guardar = num1 * num2;
        JOptionPane.showMessageDialog(null, " La multiplicación entre " + num1 + " y " + num2 + " es: " + guardar);
    }

    public void Divición(double num1, double num2) {
        double guardar = num1 / num2;
        JOptionPane.showMessageDialog(null, " La División entre " + num1 + " y " + num2 + " es: " + String.format("%.2f", guardar));
    }
}
