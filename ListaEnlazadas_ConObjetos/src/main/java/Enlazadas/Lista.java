package Enlazadas;

public class Lista {

    private nodo cabeza;
    private nodo cola;
    int size;

    public Lista() {
        cabeza = null;
        cola = null;
    }

    public void agregarAlInicio(vehiculo vei) {
        if (cabeza == null) {
            cabeza = new nodo(vei, cabeza);
            cola = cabeza;
            size++;
        } else {
            cabeza = new nodo(vei, cabeza);
            size++;
        }

    }

    public void agregarAlFinal(vehiculo vei) {
        if (cabeza == null) {
            cabeza = new nodo(vei);
            cola = cabeza;
            size++;
        } else {

            cola.enlace = new nodo(vei);
            cola = cola.enlace;
            size++;
        }
    }

    
    
    
    
    
    
    public void agregarEnLaMitad(String indice, vehiculo vei) {

        nodo nuevo, anterior;
        anterior = buscarPorIndice(indice);
        
        if (anterior != null) {
            
            nuevo = new nodo(vei);
            nuevo.enlace = anterior.enlace;
            anterior.enlace = nuevo;
        }
    }
    

    public nodo buscarPorIndice(String  cog) {
        nodo indice;
        
        int i;
//        if (pos < 0) {
//            return null;
//        }
        

        for (indice = cabeza; (!cog.equalsIgnoreCase(indice.getDatos().getPlaca())) && (indice != null); indice = indice.enlace) {      
        }
        return indice;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
        //Modificar datos de una Lista enlazada: 
    public void modificarNodo(String indiceAModificar, String placa, int modelo, int cilindraje, String marca ){
        nodo actual;
        actual = buscarPorIndice(indiceAModificar);
        
        if(actual != null){
            actual.getDatos().setPlaca(placa);
            actual.getDatos().setModelo(modelo);
            actual.getDatos().setCilindraje(cilindraje);
            actual.getDatos().setMarca(marca);         
        }
        
        
        
    }
    
    
    
    
    
    
    
    

    public void verLista() {
        nodo temporal;
        int incremento = 0;
        temporal = cabeza;
        if (temporal == null) {
            System.out.println("\n--SIN ELEMENTOS EN LA LISTA--\n");
        } else {
            while (temporal != null) {
                incremento++;
                System.out.println("--------------------------------------------------------------------------");
                System.out.println("Nodo # " + "[" + incremento + "]" + " = " + temporal.getDatos().toString());
                System.out.println("---------------------------------------------------------------------------");
                temporal = temporal.getEnlace();

            }
        }
    }

    public void BuscarPorPlaca(String placa) {
        nodo temporal;
        int incremento = 0;
        temporal = cabeza;
        while (temporal != null) {
            incremento++;
            if (placa.equalsIgnoreCase(temporal.getDatos().getPlaca())) {
                System.out.println("--------------------------------------------------------------------------");
                System.out.println("Nodo # " + "[" + incremento + "]" + " = " + temporal.getDatos().toString());
                System.out.println("---------------------------------------------------------------------------");
                break;
            } else {
                temporal = temporal.getEnlace();
            }

        }
    }

    public void eliminnarNodoEnEspecifico(String nodoAEliminar) {
        boolean eliminado = true;

        if (size != 0) {

            if (cabeza == cola && nodoAEliminar.equalsIgnoreCase(cabeza.getDatos().getPlaca())) {
                cabeza = cola = null;

            } else if (nodoAEliminar.equalsIgnoreCase(cabeza.getDatos().getPlaca())) {
                cabeza = cabeza.getEnlace();
            } else {
                nodo anterior, actual;
                anterior = cabeza;
                actual = cabeza.getEnlace();

                while (actual != null && !nodoAEliminar.equalsIgnoreCase(actual.getDatos().getPlaca())) {
                    anterior = anterior.getEnlace();
                    actual = actual.getEnlace();
                }
                if (actual != null) {
                    anterior.enlace = actual.getEnlace();
                    if (actual == cola) {
                        cola = anterior;

                    }
                }
                else {
                    System.out.println("Elemento no Encontrado");
                    eliminado = false;
                }
            }
        } else {
            System.out.println("Lista vacia, No hay elementos que Eliminar!!");
            eliminado = false;
        }
        if (eliminado == true) {
            System.out.println("Elemento eliminado Exisatosamente");
        }
    }

    public int size() {
        return size;
    }
    
    
        
    
    
//    //METODO DE ORDENACION POR INSERCCION. OSEA VA ORDENANDO MIENTRAS VOY INGRESANDO DATOS A LA LISTA
//    public  void insertarEnOrdenPorCedula(persona personita){
//        nodo nuevo = new nodo(personita, null); 
//        
//        nodo recorido1;
//        nodo recorido2;
//        
//        
//        //Caso cuando la lista esta vacia
//        if(cabeza == null){
//            cabeza = nuevo;
//            nuevo.enlace = null;
//            
//        }else{
//            //Caso cuando el dato entrante debe ir al inico de la lista
//            recorido1 = cabeza;
//             while(recorido1 != null){
//                 recorido2  = recorido1.enlace;
//                 if(nuevo.getDatos().getCedula()<= recorido1.getDatos().getCedula()){
//                     nuevo.enlace = cabeza;
//                     cabeza = nuevo;
//                     break;
//                     
//                 }else{
//                     //Caso cuando el dato ingresado es mayor que todos los otros datos de la lista. Lo colocamos de ultimo
//                     if(nuevo.getDatos().getCedula() > recorido1.getDatos().getCedula() && recorido2 == null){
//                        recorido1.enlace = nuevo; 
//                        nuevo.enlace = null;
//                        break;
//                        
//                        
//                     }else {
//                         // Caso cuando el numero ingresado debe ir en el intermedio de otros dos nodos!!
//                         if(recorido1.getDatos().getCedula() < nuevo.getDatos().getCedula()   &&    recorido2.getDatos().getCedula() >= nuevo.getDatos().getCedula()){
//                              recorido1.enlace =  nuevo;
//                              nuevo.enlace = recorido2;
//                              break;
//                         }else{
//                             recorido1 = recorido1.enlace;
//                         }
//                     }
//                 }  
//             }
//        }
//        
//    }
    
    
    
    
    
    
    
    
    
    public void recortarLista(int eli){
        int contador = 0;
        nodo temporal =  cabeza;
        while(contador < eli - 1){
           temporal = temporal.getEnlace();
           contador++;
        }
         temporal.enlazarSiguiente(null);
        
        if(eli == 1){
            cabeza = null;
            cola = null;
        }
       
    }
    
    

}
