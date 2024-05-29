
package arbol;


public class class_Arbol {
    nodoArbol raiz;
       public static final String ANSI_RED = "\u001B[31m";
       public static final String ANSI_RESET = "\u001B[0m";
       
       
    public class_Arbol() {
        this.raiz = null;
    }
    public boolean EstaVacio(){
        return raiz == null;
    }
    
    //Metodo que se llama en el Main para la Inserccion del Objeto
    public void insertarVehiculo(vehiculo dato){
        raiz = insertaNodo(raiz, dato);
    }
    
    //Metodo para Buscar el lugar donde debe ir el nodo 
    public nodoArbol insertaNodo(nodoArbol aux, vehiculo dato){
        if(aux == null){
            aux = new nodoArbol(dato);
        }else if(dato.getPlaca().compareToIgnoreCase(aux.getDato().getPlaca()) < 0 ){
            nodoArbol iz = insertaNodo(aux.getIzquierda(), dato);
            aux.setIzquierda(iz);
        }else if(dato.getPlaca().compareToIgnoreCase(aux.getDato().getPlaca()) > 0 ){
               nodoArbol de = insertaNodo(aux.getDerecha(), dato);
            aux.setDerecha(de);
        }else{
            System.out.println(ANSI_RED + "Dato ya registrado!!!" + ANSI_RESET);
        }
        return aux;
    }
    
    
    //Motodo para ver el mostrado del Árbol en Inorden
    public void MostrarEnInoden(nodoArbol aux){
        if(aux != null){
            MostrarEnInoden(aux.getIzquierda());
            System.out.println(aux.getDato().toString());
            MostrarEnInoden(aux.getDerecha());
        }
    }
    //Motodo para ver el mostrado del Árbol en PreOrden
        public void MostrarEnPreOrden(nodoArbol aux){
        if(aux != null){
            System.out.println(aux.getDato().toString());
            MostrarEnPreOrden(aux.getIzquierda());
            MostrarEnPreOrden(aux.getDerecha());
        }
    }
    //Motodo para ver el mostrado del Árbol en PostOrden
     public void MostrarEnPostOrden(nodoArbol aux){
        if(aux != null){
            MostrarEnPostOrden(aux.getIzquierda());
            MostrarEnPostOrden(aux.getDerecha());
            System.out.println(aux.getDato().toString());
        }   
    }
     
     
     
     
     
     //Metodo que se llama en el Main para buscar el nodo según su Placa
    public vehiculo buscarNodo(String id) {
        return encontrarNodo(id, raiz);
    }
    //Metodo para la busqueda de la placa ingresada
    public vehiculo encontrarNodo(String id, nodoArbol aux) {
        if (aux == null) {
            System.out.println(ANSI_RED + "Nodo no encontrado!!!" + ANSI_RESET);
            return null;
        } else if (id.equalsIgnoreCase(aux.getDato().getPlaca())) {
            return aux.getDato();
        } else if (id.compareToIgnoreCase(aux.getDato().getPlaca()) < 0) {
            return encontrarNodo(id, aux.getIzquierda());
        } else if (id.compareToIgnoreCase(aux.getDato().getPlaca()) > 0) {
            return encontrarNodo(id, aux.getDerecha());
        }
        return null;
    }
    
    
    
    
    
    //Metodo que se llama en el Main 
    public void eliminar(String dato) {
        raiz = EliminarNodo(raiz, dato);
    }
    //Metodo para buscar y eliminar el nodo segun su placa, eliminamos aca si es un nodo hoja o contiene solo un hijo
    public nodoArbol EliminarNodo(nodoArbol aux, String dato) {
        if (aux == null) {           
            System.out.println(ANSI_RED + "Nodo No encontrado!!!" + ANSI_RESET);
        } else if (dato.compareToIgnoreCase(aux.getDato().getPlaca()) < 0) {
            nodoArbol izquierdo = EliminarNodo(aux.getIzquierda(), dato);
            aux.setIzquierda(izquierdo);
        } else if (dato.compareToIgnoreCase(aux.getDato().getPlaca()) > 0) {
            nodoArbol derecho = EliminarNodo(aux.getDerecha(), dato);
            aux.setDerecha(derecho);
        } else {
            if (aux.getIzquierda() == null && aux.getDerecha() == null) {
                aux = null;
            } else {
                nodoArbol punto = aux;
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
    
    //Metodo para elimar un nodo cuando tienen dos hijos y buscar el sucesor de tal nodo, 
    // se busca el mayor de la rama izquierda o el menor de la rama derecha
    public nodoArbol cambiarNodo(nodoArbol aux) {
        nodoArbol p = aux;
        nodoArbol a = aux.getIzquierda();

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
    
    
    
    
    
    //Metodo para contar los Nodos del Arbol Binario
        public int cuentaNodos(nodoArbol aux){
            int contador = 1;
            
        if(aux.getIzquierda() != null){
           contador +=  cuentaNodos(aux.getIzquierda());
           
        }
        if(aux.getDerecha() != null){
           contador += cuentaNodos(aux.getDerecha());  
        }
        return contador;
    }
    
        
        
        
        
        
        //Metodo para contar las Hojas de un Arbol Binario
    public int cuentaHojas(nodoArbol aux) {
        int contadorr = 0;
        if (aux.getDerecha() == null && aux.getIzquierda() == null) {
            contadorr++;
        }
        if (aux.getIzquierda() != null) {
            contadorr += cuentaNodos(aux.getIzquierda());

        }
        if (aux.getDerecha() != null) {
            contadorr += cuentaNodos(aux.getDerecha());
        }

        return contadorr;
    }


}
