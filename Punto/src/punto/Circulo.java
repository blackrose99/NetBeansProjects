
package punto;

public class Circulo extends Punto { 
double radio; // radio del Circulo 

// constructor sin argumentos; el valor predeterminado de radio es 0.0 
public Circulo() 
{ 
// la llamada implícita al constructor de Punto ocurre aquí 
} 

    public Circulo(double radio, int valorX, int valorY) {
        super(valorX, valorY);
        this.radio = radio;
    }

   


// establecer el radio 
public void setRadio( double radio ) 
{ if (radio<0) //validar que no se ingrese un valor negativo
     this.radio=0;
  else
     this.radio = radio; 
} 

// devolver el radio 
public double getRadio() 
{ 
return radio; 
} 

// calcular y devolver el diámetro 
public double getDiametro() 
{ 
return 2 * getRadio(); 
} 

// calcular y devolver la circunferencia 
public double getCircunferencia() //2*PI*radio
{ 
  return Math.PI * getDiametro();
} 

// sobrescribir el método abstracto obtenerArea para devolver área del Circulo 
public double getArea() 
{ 
return Math.PI * getRadio() * getRadio();
} 

// sobrescribir el método abstracto obtenerNombre para devolver "Circulo" 
public String getNombre() 
{ 
return "Circulo"; 
} 

// sobrescribir toString para devolver la representación String de Circulo 
public String toString() 
{ 
return "Centro = " + super.toString() + "; Radio = " + getRadio(); 
} 

} // fin de la clase Circulo
