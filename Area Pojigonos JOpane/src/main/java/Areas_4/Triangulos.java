package Areas_4;

import javax.swing.JOptionPane;

public class Triangulos extends FigurasGeometricas {

    public static double base;
    public static double altura;
    public static double hipotenusa;

    public void pedirVariables() {
        base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la Base del Triangulo"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la Altura del Triangulo"));

    }

    @Override
    public void calcularArea() {
        pedirVariables();
        double area = base * altura / 2;
        JOptionPane.showMessageDialog(null, "El area del Triangulo es de: " + String.format("%.2f ", area));
    }

    @Override
    public void calcularPerimetro() {
        pedirVariables();
        double perimetro = base + altura * 2;
        JOptionPane.showMessageDialog(null, "El perimetro del Triangulo es de: " + String.format("%.2f ", area));

    }


    public void calcularHipotenusaTriangulo(){
        base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado A del Triangulo"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado B del Triangulo"));
      hipotenusa = (Math.sqrt(Math.pow(altura, 2)+ Math.pow(base, 2)));
         JOptionPane.showMessageDialog(null, "La Hipotenusa del Triangulo es de: " + String.format("%.2f ", hipotenusa));
        
    }
    
}
