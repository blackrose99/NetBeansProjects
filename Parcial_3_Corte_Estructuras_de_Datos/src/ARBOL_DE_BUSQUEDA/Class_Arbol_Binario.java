
package ARBOL_DE_BUSQUEDA;

public class Class_Arbol_Binario {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    Class_Nodo raiz;

    public Class_Arbol_Binario() {
        this.raiz = null;
    }

    public boolean isEmpy() {
        return raiz == null;
    }

  
    public void insertarunNumero(int dato){
        raiz = insertar(raiz, dato);
    }
    

    public Class_Nodo insertar(Class_Nodo aux, int dato){
        if(aux == null){
            aux = new Class_Nodo(dato);
        }else if(dato < aux.getDato()){
            Class_Nodo iz = insertar(aux.getIzquierda(), dato);
            aux.setIzquierda(iz);
        }else if(dato  > aux.getDato()){
               Class_Nodo de = insertar(aux.getDerecha(), dato);
            aux.setDerecha(de);
        }else{
            System.out.println(ANSI_RED + "Dato ya registrado!!!" + ANSI_RESET);
        }
        return aux;
    }
    
    
    
   
    public void eliminar(int dato) {
        raiz = EliminarNodo(raiz, dato);
    }
    public Class_Nodo EliminarNodo(Class_Nodo aux, int dato) {
        if (aux == null) {           
            System.out.println(ANSI_RED + "Nodo No encontrado!!!" + ANSI_RESET);
        } else if (dato  < aux.getDato()) {
            Class_Nodo izquierdo = EliminarNodo(aux.getIzquierda(), dato);
            aux.setIzquierda(izquierdo);
        } else if (dato  > aux.getDato()) {
            Class_Nodo derecho = EliminarNodo(aux.getDerecha(), dato);
            aux.setDerecha(derecho);
        } else {
            if (aux.getIzquierda() == null && aux.getDerecha() == null) {
                aux = null;
            } else {
                Class_Nodo punto = aux;
                if (punto.getDerecha() == null) {
                    aux = punto.getIzquierda();
                } else if (punto.getIzquierda() == null) {
                    aux = punto.getDerecha();
                } else {
                    punto = cambiarNodo(punto);
                }
            }
        }
        return aux;
    }
   public Class_Nodo cambiarNodo(Class_Nodo aux) {
        Class_Nodo p = aux;
        Class_Nodo a = aux.getIzquierda();

        while (a.getDerecha() != null) {
            p = a;
            a = a.getDerecha();
        }
        aux.setDato(a.getDato());
        if (p == aux) {
            p.setIzquierda(a.getIzquierda());
        } else {
            p.setDerecha(null);
        }
        return a;
    }
   
    public void MostrarEnInoden(Class_Nodo aux){
        if(aux != null){
            MostrarEnInoden(aux.getIzquierda());
            System.out.println(aux.getDato());
            MostrarEnInoden(aux.getDerecha());
        }
    }

        public void MostrarEnPreOrden(Class_Nodo aux){
        if(aux != null){
            System.out.println(aux.getDato());
            MostrarEnPreOrden(aux.getIzquierda());
            MostrarEnPreOrden(aux.getDerecha());
        }
    }
  
     public void MostrarEnPostOrden(Class_Nodo aux){
        if(aux != null){
            MostrarEnPostOrden(aux.getIzquierda());
            MostrarEnPostOrden(aux.getDerecha());
            System.out.println(aux.getDato());
        }   
    }
     
     
         

      public int cuentaNodos(Class_Nodo aux){
            int contador = 1;
            
        if(aux.getIzquierda() != null){
           contador +=  cuentaNodos(aux.getIzquierda());
           
        }
        if(aux.getDerecha() != null){
           contador += cuentaNodos(aux.getDerecha());  
        }
        return contador;
    }
      
      
      
      
      
      public int buscarNumeroMayor(Class_Nodo aux){
           if(aux.getDerecha() != null){
            return buscarNumeroMayor(aux.getDerecha());
           }
           return aux.getDato();
      }
      
      
      
           public int buscarNumeroMenor(Class_Nodo aux){
           if(aux.getIzquierda() != null){
            return buscarNumeroMenor(aux.getIzquierda());
           }
           return aux.getDato();
      }

    public void mostrarNumerosPares(Class_Nodo aux) {
        if (aux != null) {
            
            if(aux.getDato() % 2 == 0){
                System.out.println(aux.getDato());
            }
            mostrarNumerosPares(aux.getIzquierda());
            mostrarNumerosPares(aux.getDerecha());
        }

    }

    
        public void mostrarNumerosInpares(Class_Nodo aux) {
        if (aux != null) {
            
            if(aux.getDato() % 2 != 0){
                System.out.println(aux.getDato());
                
            }
            mostrarNumerosInpares(aux.getIzquierda());
            mostrarNumerosInpares(aux.getDerecha());
            
        }

    }
}
