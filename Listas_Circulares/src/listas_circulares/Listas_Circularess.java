    package listas_circulares;

public class Listas_Circularess {

    private claseNodo inicio;
    private claseNodo ultimo;
    private int tamano;

    
    //incializamos el incico y fin de la lista
    public void listaCircular() {
        inicio = null;
        ultimo = null;
        tamano = 0;
    }
    
    
    // Metodo para ver si la lista esta vacia
    public boolean estaVacia() {
        return inicio == null;
    }
    

    
    //Metodo para agreagar al final de la lista Circular, hacemos uso del INCIO y FIN
    public void agregarAlFinal(String nuevoDato){
        
        claseNodo nuevo = new claseNodo();
        nuevo.setValor(nuevoDato);
        
        if(estaVacia()){
            inicio = nuevo;
            ultimo = nuevo;
            ultimo.setSiguiente(nuevo);
        }else{
            ultimo.setSiguiente(nuevo);
              ultimo = nuevo;
            nuevo.setSiguiente(inicio);
          
        }
        tamano++;
    }
    
    
    
    
    //Metodo para agreagar al inicio de la lista Circular, hacemos uso del INCIO y FIN
    public void agregarAlInicio(String nuevoDato){
        claseNodo nuevo = new claseNodo();
        nuevo.setValor(nuevoDato);
        
        if(estaVacia()){
            inicio = nuevo;
            ultimo = nuevo;
            ultimo.setSiguiente(nuevo);
        }else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
            ultimo.setSiguiente(inicio);
        }
        tamano++;
    }
    
    
    
    
    
    //Metodo para validar la existencia de de un nodo por su Valor
    public boolean buscar(String elemento){
        claseNodo auxiliar = inicio;
        
        boolean encotrado = false;
        
        do {            
            if(elemento.equalsIgnoreCase(auxiliar.getValor())){
                encotrado = true;
            }else{
                auxiliar = auxiliar.getSiguiente();
            }
        } while (auxiliar != inicio && encotrado != true);
        
        return encotrado;
    }
    

    
    
    
    //Metodo para inserta entre nodos por el Valor 
    public void insertarEntreDosPorElValor(String datoNuevo, String referencia){
        claseNodo nuevo = new claseNodo();
        
        nuevo.setValor(datoNuevo);
        
        if(!estaVacia()){
            
            if(buscar(referencia)){
                
                claseNodo auxiliar = inicio;
                
                while(!auxiliar.getValor().equalsIgnoreCase(referencia)){
                    auxiliar = auxiliar.getSiguiente();
                }
                if(auxiliar == ultimo){
                    auxiliar.setSiguiente(nuevo);
                    nuevo.setSiguiente(inicio);
                    ultimo = nuevo;
                    
                }else{
                    
                    claseNodo siguiente = auxiliar.getSiguiente();
                    auxiliar.setSiguiente(nuevo);
                    nuevo.setSiguiente(siguiente);
                }
                tamano++;
            }
        }
    }
    
    
    
    
    
    
    //Metodo para editar un nodo por su valor 
    public void editarNodo(String nodoActulizar, String actulizacion){
        if(buscar(nodoActulizar)){
            claseNodo aux = inicio;
            
            while(!aux.getValor().equalsIgnoreCase(nodoActulizar)){
                aux  = aux.getSiguiente();
            }
            aux.setValor(actulizacion);
        }
    }
    
    
    
    
    
    
    public void buscarNodo(int busqueda) {
        int bus = busqueda - 1;

        if (busqueda >= 0 && busqueda <= tamano) {

            if (bus == 0) {
                System.out.println("El valore en la posicion " + busqueda + " es: " + inicio.getValor());

            } else {
                claseNodo aux = inicio;
                for (int i = 0; i < bus; i++) {
                    aux = aux.getSiguiente();
                }

                System.out.println("El nodo en la posicion " + busqueda + " es: " + aux.getValor());
            }
        } else {
            System.out.println("Esta posicion no existe.");
        }
    }

    
    
    
    
        
    //Metodo para eliminar toda la lista
    public void eliminarTodaLaLista(){
        inicio = null;
        ultimo = null;
        tamano = 0;
    }
    
    
    public void eliminarNodoPorSuValor(String dato){
        claseNodo actual;
        claseNodo anterior;
        actual = inicio;
        anterior = ultimo;
        do {            
            if(actual.getValor().equalsIgnoreCase(dato)){
                
                if(actual == inicio){ 
                    inicio = inicio.getSiguiente();
                    ultimo.setSiguiente(inicio);
                    
                    
                }else if(actual == ultimo){
                    anterior.setSiguiente(ultimo.getSiguiente());
                    ultimo = anterior;
                    
                }else{
                    anterior.setSiguiente(actual.getSiguiente());
                }
                tamano--;
            }
            anterior = actual;
            actual = actual.getSiguiente();
        } while (actual != inicio);
        
    }

    public void ordenarAlMomentoDeInsertar(String dato) {
        claseNodo nuevo = new claseNodo();
        nuevo.setValor(dato);
        claseNodo recorrido1;
        claseNodo recorrido2;
        
        //cuando la lista esta vacia
        if (estaVacia()) {
            inicio = nuevo;
            ultimo = nuevo;
            ultimo.setSiguiente(nuevo);
        } else {
            recorrido1 = inicio;
            do {
                recorrido2 = recorrido1.getSiguiente();
                
                 //cuando el valor entrante es menor a los demas y debe ir al principio 
                if (nuevo.getValor().compareToIgnoreCase(recorrido1.getValor()) < 0) {
                    nuevo.setSiguiente(inicio);
                    inicio = nuevo;
                    ultimo.setSiguiente(inicio);
                    break;
                    
                    //condicion cuando el dato ingresado es mayor al de la izquierda y menor o igual al de la derecha
                } else if (recorrido1.getValor().compareToIgnoreCase(nuevo.getValor()) < 0 && recorrido2.getValor().compareToIgnoreCase(nuevo.getValor()) >= 0) {
                        nuevo.setSiguiente(recorrido1.getSiguiente());
                        recorrido1.setSiguiente(nuevo);
                        break;
                        
                            //condicion cuando el dato ingresado es mayor a todos entonces quedara de Ultimo
                    } else if (nuevo.getValor().compareToIgnoreCase(recorrido1.getValor()) > 0 && recorrido2 == ultimo) {
                            recorrido2.setSiguiente(nuevo);
                            ultimo = nuevo;
                            nuevo.setSiguiente(inicio);
                            break;

                        } else { //seguira recorriendo 
                            recorrido1 = recorrido1.getSiguiente();
                        }
                    
                
            } while (recorrido1 != inicio);
        }       
        tamano++;

    }


    
    
    
    
    
    
    
        
//    public  void eliminarNodoPorSuValor(String elemento){
//        if(buscar(elemento)){
//            if(inicio.getValor().equalsIgnoreCase(elemento) ){
//                inicio = inicio.getSiguiente();
//                ultimo.setSiguiente(inicio);
//            }else{
//                claseNodo aux= inicio;
//                while(!aux.getSiguiente().getValor().equalsIgnoreCase(elemento)){
//                    aux = aux.getSiguiente();
//                }
//                if(aux.getSiguiente() == ultimo){
//                    aux.setSiguiente(inicio);
//                    ultimo = aux;   
//                }else{
//                    claseNodo despues = aux.getSiguiente();
//                    aux.setSiguiente(despues.getSiguiente());
//                }
//            }
//            tamano--;
//        }
//    }    
        

    //Mostrar elementos de la lista y volviendo a mostrar el primero
    public void mostrarLista(){
        if(!estaVacia()){
            claseNodo aux = inicio;
            int j= 1;
            
            for (int i = 0; i < (tamano+1); i++) {
               System.out.print(j + ".[ " +  aux.getValor() + " ] " + " - > ");
              aux = aux.getSiguiente();
               j++;
               
                  if(j == tamano+1){
                    j = 1;
                }
            }
        }
    }
        
        
        
        
        
    
        
    
    
    
    
    //Metodo para insertar un nuevo nodo por la posicion del otro
    
//    public void insertarEntreDosNodosPorSuPosicion(int posicion, String nuevoDato) {
//
//        claseNodo nuevo = new claseNodo();
//        nuevo.setValor(nuevoDato);
//        if(posicion >= 0 && posicion <= tamano){
//            if(posicion == 0){
//                nuevo.setSiguiente(inicio);
//                inicio = nuevo;
//                ultimo.setSiguiente(inicio);
//            }else{
//                if(posicion == tamano){
//                    ultimo.setSiguiente(nuevo);
//                    nuevo.setSiguiente(inicio);
//                    ultimo = nuevo;
//                }else{
//                    claseNodo auxiliar = inicio;
//                    for(int i = 0;i < (posicion - 1);i++){
//                        auxiliar = auxiliar.getSiguiente();
//                    }
//                    claseNodo siguiente = auxiliar.getSiguiente();
//                    auxiliar.setSiguiente(nuevo);
//                    nuevo.setSiguiente(siguiente);
//                    
//                }
//            }
//            tamano++;
//        }
//        
//    }

    
}
