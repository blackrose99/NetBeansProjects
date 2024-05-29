
package punto;

public class Punto {

private int x; // parte x del par de coordenadas 
private int y; // parte y del par de coordenadas 

// constructor sin argumentos; valor predeterminado de 0 para x e y 
public Punto() 
{ 
// la llamada implícita al constructor  
} 

// constructor 

public Punto( int valorX, int valorY ) 
{ 
    x = valorX;  
    y = valorY;  
} 

  // establecer x en el par de coordenadas 
public void setX ( int x ) 
{ 
this.x = x; 
} 

// devolver x del par de coordenadas 
public int getX () 
{ 
return x; 
} 

// establecer y en el par de coordenadas 
public void setY ( int y ) 
{ 
this.y = y; 
} 

// devolver y del par de coordenadas 
public int getY () 
{ 
return y; 
} 

public String obtenerNombre() 
{ 
return "Punto"; 
} 


// sobrescribir a toString para devolver la representación String de Punto 
public String toString()     
{ 
return "[" + getX()+ ", " + getY() + "]"; 
} 


} // fin de la clase Punto
