
package Listas_Enlazadas;


public class Listas_Enlazadas {
    protected nodo primero;
    int size;

  public Listas_Enlazadas(){
      primero = null;
      size = 0;
  }
    
  public Listas_Enlazadas InsertarCabezaLista(String  entrada){
      if(primero == null){
          primero = new nodo(entrada);
      }else{

      nodo nuevo;
      nuevo = new nodo(entrada);
      nuevo.enlace = primero;
      primero = nuevo;
      
      }
      return this;
  }
  
  public void visualizar(){
      nodo n;
      int k = 0;
      
       n = primero;
       while(n != null){
           System.out.print( n.dato + " ");
           n = n.enlace;
           k++;
           System.out.print( k%15 !=0 ? " " : "\n"  );
       }
  }
  
  public boolean estaVacia(){
      return (primero == null)?true:false;
  }
  
  
  public String obtener(int index){
      int contador = 1;
      nodo temporal = primero;
      while(contador < index){
          temporal = temporal.getEnlace();
          contador++;
      }
      return  temporal.getDato();
      
  }
  
}
