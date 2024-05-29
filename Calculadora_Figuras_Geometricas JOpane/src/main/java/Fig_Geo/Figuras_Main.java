 /*
Nombre: Maicol Alexis Cubides Peña.
Grupo: D193
Fecha: 09/03/2022
 */
package Fig_Geo;

import javax.swing.JOptionPane;

public class Figuras_Main {

    public static void main(String[] args) {

        Cuadrado f1 = new Cuadrado();
        Circulo f2 = new Circulo();
        Triangulo f3 = new Triangulo();
        Rectangulo f4 = new Rectangulo();
        double ladoA, ladoB;
        int var;
        do {
            var = Integer.parseInt(JOptionPane.showInputDialog("\n  1. Cuadrado \n  2. Circulo \n  3. Triangulo \n  4. Rectangulo \n  0. Salir \n\n ■ Elija su Opción:■"));
            if (var != 1 && var != 2 && var != 3 && var != 0 && var !=4) {
                JOptionPane.showMessageDialog(null, " « Eleccion Incorrecta » ", "", JOptionPane.ERROR_MESSAGE);
            } else {
                switch (var) {

                    case 1:
                        int varr;
                        do {

                            varr = Integer.parseInt(JOptionPane.showInputDialog("\n 1. Area del Cuadrado \n 2. Perimetro del Cuadrado \n 0. Regresar al Menu"));
                            switch (varr) {
                                case 1:
                                    ladoA = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado A del Cuadrado"));
                                    ladoB = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado B del Cuadrado"));
                                    if (ladoA == ladoB) {
                                        f1.calcularArea(ladoA);
                                    } else {
                                        f1.calcularArea(ladoA, ladoB);
                                    }
                                    break;
                                case 2:
                                    ladoA = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de los lados del Cuadrado"));
                                    f1.calcularPerimetro(ladoA);
                                    break;
                            }
                        } while (varr != 0);

                        break;

                    case 2:
                        do {
                            varr = Integer.parseInt(JOptionPane.showInputDialog("\n 1. Area del Circulo \n 2. Perimetro del Circulo \n 3. Diametri del Circulo  \n 0. Regresar al Menu"));
                            switch (varr) {
                                case 1:
                                    ladoA = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Radio del Circulo "));
                                    f2.calcularArea(ladoA);
                                    break;
                                case 2:
                                    ladoA = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Diametro del Circulo "));
                                    f2.calcularPerimetro(ladoA);
                                    break;
                                    
                                case 3:
                                    ladoA = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Perimetro para calcular el Diametro "));
                                    f2.calcularDiametro(ladoA);
                                    break;

                            }

                        } while (varr != 0);
                        break;

                    case 3:
                        do {
                            varr = Integer.parseInt(JOptionPane.showInputDialog("\n 1. Area del Triangulo\n 2. Perimetro del Triangulo \n 0. Regresar al Menu"));
                            switch (varr) {
                                case 1:
                                    ladoA = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la Base del Triangulo"));
                                    ladoB = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la Altura del Triangulo"));
                                    f3.calcularArea(ladoA, ladoB);
                                    break;
                                case 2:
                                    ladoA = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la Base del Triangulo"));
                                    ladoB = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la Altura del Triangulo"));
                                    f3.calcularPerimetro(ladoA, ladoB);

                                    break;
                            }
                        } while (varr != 0);

                    case 4:
                        do {
                            varr = Integer.parseInt(JOptionPane.showInputDialog("\n 1. Area del Rectangulo\n 2. Perimetro del Rectangulo \n 3. Diagonal de un Rectangulo \n 0. Regresar al Menu"));
                            switch (varr) {
                                case 1:
                                    ladoA = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la Base del Rectangulo"));
                                    ladoB = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la Altura del Rectangulo"));
                                    f4.calcularArea(ladoA, ladoB);

                                    break;
                                case 2:
                                    ladoA = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la Base del Rectangulo"));
                                    ladoB = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la Altura del Rectangulo"));
                                    f4.calcularPerimetro(ladoA, ladoB);
                                    break;
                                    
                                case 3:
                                    ladoA = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del lado A del Rectangulo"));
                                    ladoB = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del lado B del Rectangulo"));
                                    f4.calcularDiagonal(ladoA, ladoB);
                                    break;
                            }
                        } while (varr != 0);

                        break;
                }
            }
        } while (var != 0);

    }
}
