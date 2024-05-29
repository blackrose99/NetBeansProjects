package Calculadora_Geometrica;

public class Rectangulos extends Abstract_class {

    public double base;
    public double altura;


    public static String resultado;

    @Override
    public String calcularArea(double base, double altura) {
        resultado = Double.toString(base * altura);
        return resultado;
    }

    @Override
    public String calcularPerimetro(double lado1, double lado2) {
        resultado = Double.toString(2 * (lado1 + lado2));
        return resultado;
    }

    public String calcularDiagonal(double ladooA, double ladooB) {
        resultado = Double.toString(Math.sqrt(Math.pow(ladooA, 2) + Math.pow(ladooB, 2)));
        return resultado;
    }

    @Override
    public String calcularArea(double ladoA) {
        return resultado;
    }

    @Override
    public String calcularPerimetro(double ladoA) {
        return resultado;
    }

}