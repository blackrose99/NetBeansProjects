package Areas_4;

import javax.swing.JOptionPane;

public class Areas_4 extends Configuracion {

    public static Cuadrados miCuadrado = new Cuadrados();
    public static Circulos miCirculo = new Circulos();
    public static Triangulos miTriangulo = new Triangulos();
    public static int opcion;

    public static void main(String[] args) {

        do {
            try {
                mostrarMenu();
                opcionMenu();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error de eleccion introduce una opción valida");
                opcion = 100;

            }

        } while (opcion != 0);
    }

    public static void mostrarMenu() {

        if (idioma == 0) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "\n MENU \n 1. Calcular area del cuadrado \n 2. Calcular perimetro del cuadrado \n 3. Calcular diagonal del cuadrado \n 4. Calcular area del circulo \n 5. Calcular perimetro del circulo \n 6. Calcular diametro del circulo \n 7. Calcular area del triangulo \n 8. Calcular perimetro del triangulo \n 9. Calcular hipotenusa del triangulo \n 10. Cambiar Idioma \n\n 0. Salir"));
        } else {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "\n MENU \n 1. Calculate square area \n 2. Calculate perimeter of the square \n 3. Calculate square diagonal \n 4. Calculate area of the circle \n 5. Calculate perimeter of the circle \n 6. Calculate diameter of the circle \n 7. Calculate area of the triangle \n 8. Calculate the perimeter of the triangle \n 9. Calculate hypotenuse of the triangle \n 10. Change language \n\n 0. Exit"));
        }

    }

    public static void opcionMenu() {

        switch (opcion) {
            case 1:
                miCuadrado.calcularArea();
                break;

            case 2:
                miCuadrado.calcularPerimetro();
                break;

            case 3:
                miCuadrado.calcularDiagonalCuadrado();
                break;

            case 4:
                miCirculo.calcularArea();
                break;

            case 5:
                miCirculo.calcularPerimetro();
                break;

            case 6:
                miCirculo.calcularDiametroCirculo();
                break;

            case 7:
                miTriangulo.calcularArea();
                break;

            case 8:
                miTriangulo.calcularPerimetro();
                break;

            case 9:
                miTriangulo.calcularHipotenusaTriangulo();
                break;
            case 10:

                if (idioma == 0) {

                    idioma = 1;
                } else {
                    idioma = 0;
                }

                break;

            case 0:
                JOptionPane.showMessageDialog(null, "Adios, Gracias por utilizar el programa");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Ingrese una opción valida");
                break;
        }

    }

}
