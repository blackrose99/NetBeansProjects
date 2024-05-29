
package Doblemente_Enlazadas;


public class ListasCDE {
    nodo primero;
    nodo ultimo;
    int tamano;
    
    public ListasCDE(){
        primero = null;
        ultimo = null;
        tamano = 0;
    }
    
    public boolean estaVacia() {
        return primero == null;
    }
    
    public void insertarDatosAlPrincio(String valor){
        nodo nuevo = new nodo();
        nuevo.setDato(valor);
        if(estaVacia()){
            primero = nuevo;
            ultimo = nuevo;
            primero.setSiguiente(primero);
            primero.setAnterior(ultimo);
        }else{
            nuevo.setSiguiente(primero);
            primero.setAnterior(nuevo);
            nuevo.setAnterior(ultimo);
            ultimo.setSiguiente(nuevo);
            primero = nuevo;
        }
        tamano++;
    }
    
    
    
    
    
    
    
    public void insertarDatosAlFinal(String valor){
        nodo nuevo = new nodo();
        nuevo.setDato(valor);
        if(estaVacia()){
            primero = nuevo;
            ultimo = nuevo;
            primero.setSiguiente(primero);
            primero.setAnterior(ultimo);
        }else{
         nuevo.setAnterior(ultimo);
         ultimo.setSiguiente(nuevo);
         nuevo.setSiguiente(primero);
         primero.setAnterior(nuevo);
         ultimo = nuevo;
        }
        tamano++;
    }
    
    
    public boolean buscar(String elemento){
        nodo auxiliar = primero;
        boolean encontrado = false;
        do {            
            if(elemento.equalsIgnoreCase(auxiliar.getDato())){
                encontrado = true;
            }
             auxiliar = auxiliar.getSiguiente();
        } while (auxiliar != primero && encontrado != true);
        
        return encontrado;
    }
    
    
    //Metodo para insertar entre dos nodos con referencia al valor anterior
    public void insertarEntredosNodos(String datoNuevo, String referencia){
        nodo nuevo = new nodo();
        nuevo.setDato(datoNuevo);
        
        if(!estaVacia()){
            if(buscar(referencia)){
                nodo auxiliar = primero;
                while(!auxiliar.getDato().equalsIgnoreCase(referencia)){
                    auxiliar = auxiliar.getSiguiente();
                }
                if(auxiliar == ultimo){
                    nuevo.setAnterior(auxiliar);
                    auxiliar.setSiguiente(nuevo);
                    nuevo.setSiguiente(primero);
                    primero.setAnterior(nuevo);
                    ultimo = nuevo;
                } else {
                    nodo siguiente = auxiliar.getSiguiente();
                    nuevo.setSiguiente(auxiliar.getSiguiente());
                    siguiente.setAnterior(nuevo);
                    nuevo.setAnterior(auxiliar);
                    auxiliar.setSiguiente(nuevo);
                }
                tamano++;
            }
        }
    }
    

    
    
    
    
    
    
    
    
    
    
    
    
    
        public void actualizarNodo(String referencia, String datoActulalizado){
        if(buscar(referencia)){
             nodo recorrido = primero;
            while(!recorrido.getDato().equalsIgnoreCase(referencia)){
                recorrido = recorrido.getSiguiente();
            }
           recorrido.setDato(datoActulalizado);
            
        }
    }
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    public void buscarNodoPorSuValor(String referencia){
        if(buscar(referencia)){
             nodo recorrido = primero;
            while(!recorrido.getDato().equalsIgnoreCase(referencia)){
                recorrido = recorrido.getSiguiente();
            }
            System.out.println("El valor de este nodo es : " +  recorrido.getDato());            
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void eliminarTodaLaLista(){
        primero =  null;
        ultimo = null;
        tamano = 0;
    }
    
    
    public void eliminarNodoPorSuValor(String datoEliminar){
        nodo actual;
        nodo anterior;
         actual = primero;
         anterior = ultimo;

        do {
            if (actual.getDato().equalsIgnoreCase(datoEliminar)) {

                if (actual == primero) {
                    primero = primero.getSiguiente();
                    ultimo.setSiguiente(primero);
                    primero.setAnterior(ultimo);
                    
                } else if (actual == ultimo) {
                    anterior.setSiguiente(ultimo.getSiguiente());
                    ultimo = anterior;
                    primero.setAnterior(ultimo);
                }else{
                    anterior.setSiguiente(actual.getSiguiente());
                    actual.setSiguiente(anterior);
                }
                  tamano--;
            }
          
            anterior = actual;
            actual = actual.getSiguiente();
        } while (actual != primero);

    }
    
    
    
    
    
    
    
    
    
    public void insertarDeFormaOrdenada(String dato){
        nodo nuevo = new nodo();
        nuevo.setDato(dato);
        nodo recorrido1;
        nodo recorrido2;
        
        if(estaVacia()){
            primero = nuevo;
            ultimo = nuevo;
            primero.setAnterior(primero);
            ultimo.setSiguiente(nuevo);
        }else{
            recorrido1 = primero;
            do {
                recorrido2 = recorrido1.getSiguiente();
                if (nuevo.getDato().compareToIgnoreCase(recorrido1.getDato()) < 0) {
                    nuevo.setSiguiente(primero);
                    primero.setAnterior(nuevo);
                    primero = nuevo;
                    ultimo.setSiguiente(primero);
                    primero.setAnterior(ultimo);
                    break;
                } else if(recorrido1.getDato().compareToIgnoreCase(nuevo.getDato()) < 0 && recorrido2.getDato().compareToIgnoreCase(nuevo.getDato()) >= 0){
                    
                    nuevo.setSiguiente(recorrido2);
                    recorrido2.setAnterior(nuevo);
                    nuevo.setAnterior(recorrido1);
                    recorrido1.setSiguiente(nuevo);
                    break;
                    
                }else if(nuevo.getDato().compareToIgnoreCase(recorrido1.getDato()) > 0 && recorrido2 == ultimo){
                    recorrido2.setSiguiente(nuevo);
                    nuevo.setAnterior(recorrido2);
                    ultimo = nuevo;
                    ultimo.setSiguiente(primero);
                    primero.setAnterior(ultimo);
                    break;
                }else{
                    recorrido1 = recorrido1.getSiguiente();
                }


            } while (recorrido1 != primero);
        }
        tamano++;
    }

    
    
    
    public void visualizarIncioAFin(){
        if(!estaVacia()){
            nodo aux = primero;
            int j = 1;
            
            for(int i = 0 ; i < (tamano+1);i++){
                System.out.print(j + ".[ " +  aux.getDato() + " ] " + " - > ");
                aux = aux.getSiguiente();
                j++;
                
                  if(j == tamano+1){
                    j = 1;
                }
                
            }
            
        }
    }
        public void visualizarFinAInicio(){
        if(!estaVacia()){
            nodo aux = ultimo;
            int j = tamano;
            for(int i = 0 ; i < (tamano+1);i++){
                System.out.print(j + ".[ " +  aux.getDato() + " ] " + " - > ");
                aux = aux.getAnterior();
                j--;
                  if(j == 0){
                    j = tamano;
                }
                
            }
            
        }
    }
    
    
}
