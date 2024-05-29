/*
22/02/23

 */

package Cal_Arit;
import javax.swing.JOptionPane;


public class calculadoraAritmetica {

    public static void main(String[] args) {
        calculadoraMetodos calcular = new calculadoraMetodos();
        int var;
        int num1, num2;
        double nume1, nume2;
        String seguir;
        do {

            var = Integer.parseInt(JOptionPane.showInputDialog("\n  1. Suma \n  2. Resta \n  3. Multiplicación \n  4. División \n  0. Salir \n\n  Elija su Opción:"));
            if (var != 1 && var != 2 && var != 3 && var != 0 && var != 4) {
                JOptionPane.showMessageDialog(null, " « Eleccion Incorrecta » ", "", JOptionPane.ERROR_MESSAGE);
            }else
                switch (var) {
                    case 1:
                        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Primer valor"));
                        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Segundo valor"));
                        calcular.Suma(num1, num2);
                        break;
                    case 2:
                        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Primer valor"));
                        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Segundo valor"));
                        calcular.Resta(num1, num2);

                        break;
                    case 3:
                        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Primer valor"));
                        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Segundo valor"));
                        calcular.Multiplicación(num1, num2);
                        break;
                    case 4:

                        nume1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Primer valor"));
                        nume2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Segundo valor"));
                        while (nume1 <= 0 || nume2 <= 0) {
                            JOptionPane.showMessageDialog(null, "Ingrese un Numero que no sea Cero");
                            if (nume1 <= 0 || nume2 <= 0) {
                                nume1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Primer valor"));
                               nume2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Segundo valor"));
                              
                            } 
                          

                        }
                            calcular.Divición(nume1, nume2);

                        break;

                }

        } while (var != 0);


    }

}
