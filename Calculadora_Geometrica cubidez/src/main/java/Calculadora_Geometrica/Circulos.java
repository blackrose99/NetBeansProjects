
package Calculadora_Geometrica;


public class Circulos extends Abstract_class{


    private double PI = 3.141592;

    public String resultado;

    @Override
    public String calcularArea(double radioo) {
        resultado = Double.toString(PI * Math.pow(radioo, 2));
        return resultado;
    }

    @Override
    public String calcularPerimetro(double perimetro) {
         resultado = Double.toString(2 * PI * perimetro) ; 
        return resultado;
    }    
    
    public String calcularDiametroCirculo(double diametro){
        resultado = Double.toString(diametro * 2);
         return resultado;
    }

 

    @Override
    public String calcularArea(double ladoA, double ladoB) {
        return resultado;
    }



    @Override
    public String calcularPerimetro(double ladoA, double ladoB) {
       return resultado;
    }
}

