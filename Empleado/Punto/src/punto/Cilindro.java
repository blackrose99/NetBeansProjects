
package punto;
// La clase Cilindro que hereda de Circulo. 

public class Cilindro extends Circulo { 
private double altura; // la altura del Cilindro 

// constructor sin argumentos; el valor predeterminado de altura es 0.0 
public Cilindro() 
{ 
// la llamada implícita al constructor de Circulo ocurre aquí 
} 

// constructor 

    public Cilindro(double altura, double radio, int valorX, int valorY) {
        super(radio, valorX, valorY);
        this.altura = altura;
    }





// establecer la altura del Cilindro 
public void setAltura( double altura ) 
{ if (altura<0)
    this.altura=0;
  else
    this.altura = altura; 
} 

// obtener la altura del Cilindro 
public double getAltura() 
{ 
return altura; 
} 

// sobrescribir método abstracto obtenerArea para devolver area de Cilindro 
public double getArea() 
{ 
return 2 * super.getArea() + getCircunferencia() * getAltura(); 
} 

// sobrescribir método abstracto obtenerVolumen para devolver valor del Cilindro 
public double getVolumen() 
{ 
return super.getArea() * getAltura(); 
} 

// sobrescribir método abstracto obtenerNombre para devolver "Cilindro" 
public String getNombre() 
{ 
return "Cilindro"; 
} 

// sobrescribir toString para devolver representación String del Cilindro 
public String toString() 
{ 
return super.toString() + "; Altura = " + getAltura(); 
} 

} // fin de la clase Cilindro