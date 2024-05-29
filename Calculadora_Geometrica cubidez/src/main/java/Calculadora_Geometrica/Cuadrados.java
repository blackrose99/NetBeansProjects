
package Calculadora_Geometrica;

public class Cuadrados extends Abstract_class {


    public double diagonal;
    public  String resultadoo;

    @Override
    public String calcularArea(double ladoUNO, double ladoDOS) {
        resultadoo = Double.toString(ladoUNO * ladoDOS);
        return  resultadoo;
    }

    @Override
    public String calcularPerimetro(double lado, double ladoT) {

        return resultadoo;
    }
    
    public String calcularDiagonalCuadrado(double ladoUNO,double ladoDOS ) {

        resultadoo = Double.toString(Math.sqrt(Math.pow(ladoUNO, 2) + Math.pow(ladoUNO, 2)));
        return resultadoo;
    }

    @Override
    public String calcularArea(double ladoA) {
        return resultadoo;
    }

    @Override
    public String calcularPerimetro(double ladoUNO) {

           resultadoo = Double.toString(ladoUNO * 4);
        return resultadoo;
    }

    
    
}
