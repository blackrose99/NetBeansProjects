
package listas;


public class clase_Lista {
    
    private nodoDoble inicio, fin;
    int size;
    public clase_Lista(){
        inicio = fin = null;
    }
    //Metodo cuando la lista esta vacia 
    public boolean estaVacia(){
        return inicio == null;
    }
    //Metodo para agregar al final
    public void agregarAlFinal(Class_Object el){
        if(!estaVacia()){
            fin = new nodoDoble(el,null,fin);
            fin.anterior.siguiente=fin;
            size++;
        }else{
            inicio = fin = new nodoDoble(el);
            size++;
        }
    }
    //Metodo para agregar al inicio
        public void agregarAlInicio(Class_Object el){
        if(!estaVacia()){
            inicio = new nodoDoble(el,inicio,null);
            inicio.siguiente.anterior=inicio;
            size++;
        }else{
            inicio = fin = new nodoDoble(el); 
            size++;
        }
    }
        public void InsertarEntreDos(int indice, Class_Object datoIngresado){
            nodoDoble nuevo, anterior;
            
            anterior = buscarPorIndice(indice);

            nuevo = new nodoDoble(datoIngresado);
            if (anterior != null) {

                //conexion con el nodo de la derecha(siquiente) y el nodo nuevo
                nuevo.siguiente = anterior.siguiente;
                anterior.siguiente.anterior = nuevo;
                //conexion con el nodo de la izquierda(anterior),  y el nodo nuevo
                anterior.siguiente = nuevo;
                nuevo.anterior = anterior;
                size++;
            }
        }
    public nodoDoble buscarPorIndice(int pos) {
        nodoDoble indice;
        int i;
        if (pos < 0) {
            return null;
        }
        indice = inicio;
        for (i = 1; (i < pos) && (indice != null); i++) {
            indice = indice.siguiente;
        }
        return indice;
    }
    public void InsertarAntesDeUnNodo(int indice, Class_Object datoIngresado) {
        nodoDoble nuevo, despues;

        despues = buscarPorIndice(indice);

        nuevo = new nodoDoble(datoIngresado);
        if (despues != null) {
           //conexion entre el nodo de la izquierda y el nuevo creado
            nuevo.anterior = despues.anterior;
            despues.anterior.siguiente = nuevo;

            
            //conexion entre el nodo despues del nuevo 
            despues.anterior = nuevo;
            nuevo.siguiente = despues;
            size++;
        }
    }
    public void actualizarNodo(String placa, int modelo, int cilindraje, String marca, int indice){
        nodoDoble actulizar;
        actulizar = buscarPorIndice(indice);
        
        if(actulizar != null){
            actulizar.getDato().setPlaca(placa);
            actulizar.getDato().setModelo(modelo);
            actulizar.getDato().setCilindraje(cilindraje);
            actulizar.getDato().setMarca(marca);
        }
    }
    public void BuscarPorPlaca(String placa) {
        nodoDoble temporal;
        int incremento = 0;
        temporal = inicio;
        while (temporal != null) {
            incremento++;
            if (placa.equalsIgnoreCase(temporal.getDato().getPlaca())) {
                System.out.println("--------------------------------------------------------------------------");
                System.out.println("Nodo # " + "[" + incremento + "]" + " = " + temporal.getDato    ().toString());
                System.out.println("---------------------------------------------------------------------------");
                break;
            } else {
                temporal = temporal.siguiente;
            }

        }
    }
    //Metodo para mostrar la lista de inicio a fin
        public void mostrarListaIniciofFin(){
            if(!estaVacia()){
                nodoDoble auxiliar = inicio;
                int cont = 0;
                while (auxiliar != null) {
                    ++cont;
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("Nodo # " + "[" + cont + "]" + " = " + auxiliar.getDato().toString());
                    System.out.println("---------------------------------------------------------------------------");
                    auxiliar = auxiliar.siguiente;
                }
              
            }
        }
    //Metodo para mostar la lista de fin a inicio
    public void mostrarListaFinInicio() {
        if (!estaVacia()) {
            nodoDoble auxiliar = fin;
            int cont = size+1;
            while (auxiliar != null) {
                --cont;
                System.out.println("--------------------------------------------------------------------------");
                System.out.println("Nodo # " + "[" + cont + "]" + " = " + auxiliar.getDato().toString());
                System.out.println("---------------------------------------------------------------------------");
                auxiliar = auxiliar.anterior;

            }

        }
    }
    public void eliminarNodos(String placa) {
        nodoDoble actual = inicio;
        boolean eliminado = false;
        if (!estaVacia()) {
            if (inicio == fin && placa.equalsIgnoreCase(inicio.getDato().getPlaca())) {
                inicio = fin = null;
                eliminado = true;
        
            } else if (placa.equalsIgnoreCase(inicio.getDato().getPlaca())) {
                inicio = inicio.siguiente;
                inicio.anterior = null;
                eliminado = true;
             
            } else {
                while (actual != null && !placa.equalsIgnoreCase(actual.getDato().getPlaca())) {
                    actual = actual.siguiente;
                }
                if (actual == fin) {
                    actual.anterior.siguiente = null;
                    fin = actual.anterior;
           
//                    fin = fin.anterior;
//                    fin.siguiente = null;
                    eliminado = true;
                    
                    
                    
                } else if (actual != null) {
                    actual.siguiente.anterior = actual.anterior;
                    actual.anterior.siguiente = actual.siguiente;
                    eliminado = true;
                   
                } else {
                    System.out.println("Elemento no encontrado");
                }
            }
        } else {
            System.out.println("Lista vacia no hay nodos por Eliminar");

        }
        if (eliminado == true) {
            System.out.println("Elemento Eliminado Correctamente");
            size--;
        }
    }
    
    
    
    
    
    
    
    
    //METODO DE ORDENACION POR INSERCCION. OSEA VA ORDENANDO MIENTRAS VOY INGRESANDO DATOS A LA LISTA
    public void ordenacion(Class_Object ordenPlaca) {
        nodoDoble nuevo = new nodoDoble(ordenPlaca);

        nodoDoble recorido1;
        nodoDoble recorido2;

        //Caso cuando la lista esta vacia
        if (inicio == null) {
            inicio = nuevo;
            nuevo.siguiente = null;
            nuevo.anterior = null;
           size++;
        } else {
            
            
            //Caso cuando el dato entrante debe ir al inico de la lista

            recorido1 = inicio;
            while (recorido1 != null) {
                recorido2 = recorido1.siguiente;

                if (nuevo.getDato().formatearFecha().compareToIgnoreCase(recorido1.getDato().formatearFecha()) < 0 ) {  

                    nuevo.siguiente = inicio;
                    nuevo.siguiente.anterior = nuevo;
                    inicio = nuevo;
                    size++;
                    break;

                } else {

                    //Caso cuando el dato ingresado es mayor que todos los otros datos de la lista. Lo colocamos de ultimo
                    if (nuevo.getDato().formatearFecha().compareToIgnoreCase(recorido1.getDato().formatearFecha()) > 0 && recorido2 == null) {

                        nuevo.anterior = recorido1;
                        recorido1.siguiente = nuevo;
                        fin = nuevo;
                        size++;

                        break;

                    } else {               //
                        // Caso cuando el numero ingresado debe ir en el intermedio de otros dos nodos!!
                        if (recorido1.getDato().formatearFecha().compareToIgnoreCase(nuevo.getDato().formatearFecha()) < 0 && recorido2.getDato().formatearFecha().compareToIgnoreCase(nuevo.getDato().formatearFecha()) >= 0) {

                            nuevo.siguiente = recorido2;
                            recorido1.siguiente.anterior = nuevo;

                            recorido1.siguiente = nuevo;
                            nuevo.anterior = recorido1;
                            size++;
                            break;
                        } else {
                            recorido1 = recorido1.siguiente;
                        }
                    }

                }   
            }
        }
    }

    
    
    
    public int size() {
        return size;
    }
    
}
    
    

