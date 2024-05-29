
package Calculadora_Geometrica;


public class Triangulos extends Abstract_class {


    public double hipotenusa;
    public String resultado;
    
    @Override
    public String calcularArea(double base, double altura) {
        resultado = Double.toString( base * altura / 2);
     return resultado; 
    }

    @Override
    public String calcularPerimetro(double base, double altura) {
        resultado = Double.toString(base + altura * 2);
        
        return resultado;
    }
    
    public String calcularHipotenusaTriangulo(double base, double altura){
        resultado = Double.toString(Math.sqrt(Math.pow(altura, 2)+ Math.pow(base, 2)));
        
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
