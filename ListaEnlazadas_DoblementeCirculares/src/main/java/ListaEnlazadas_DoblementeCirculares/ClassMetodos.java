

package ListaEnlazadas_DoblementeCirculares;

public class ClassMetodos {
    ClassNodo LC;
    int tamano;
    
    
    public ClassMetodos(){
        LC = null;
        tamano = 0;
    }
    
      public boolean estaVacia() {
        return LC == null;
    }
      
    public void insertarDatosAlPrincio(ClassObject dato) {
        if (estaVacia()) {
            LC = new ClassNodo(dato);
            LC.siguiente = LC;
            LC.anterior = LC;
        } else {
            ClassNodo nuevo = new ClassNodo(dato);
            nuevo.siguiente = LC;
            nuevo.anterior = LC.anterior;
            LC.anterior = nuevo;
            nuevo.anterior.siguiente = nuevo;
            LC = nuevo;
        }
        tamano++;
    }
    
    public void insertarDatosAlFinal(ClassObject dato){
        if(estaVacia()){
            LC = new ClassNodo(dato);
            LC.siguiente = LC;
            LC.anterior = LC;
        }else{
            ClassNodo nuevo = new ClassNodo(dato);
           nuevo.anterior = LC.anterior;
           LC.anterior.siguiente = nuevo;
           LC.anterior = nuevo;
           nuevo.siguiente = LC;
        }
        tamano++;
    }
    public void insertarEntredosNodos(ClassObject valor, String referenciaAnterior){
        ClassNodo nuevo = new ClassNodo(valor);
        nuevo.setDato(valor);

        if (!estaVacia()) {
            ClassNodo auxiliar = LC;
            while (!auxiliar.getDato().getPlaca().equalsIgnoreCase(referenciaAnterior)) {
                auxiliar = auxiliar.siguiente;
            }
            if (auxiliar == LC.anterior) {
                nuevo.anterior = auxiliar;
                auxiliar.siguiente = nuevo;
                nuevo.siguiente = LC;
                LC.anterior = nuevo;

            } else {
                ClassNodo despues = auxiliar.siguiente;
                nuevo.siguiente = auxiliar.siguiente;
                despues.anterior = nuevo;
                nuevo.anterior = auxiliar;
                auxiliar.siguiente = nuevo;
            }
            tamano++;
        }
    }
    
    public void buscarNodoPorSuValor(String valorConsultar){
        ClassNodo iterador = LC;
        int j=1;
        while(!iterador.getDato().getPlaca().equalsIgnoreCase(valorConsultar)){
            iterador = iterador.siguiente;
            j++;
        }
        System.out.println(j + ".[ " +  iterador.getDato().toString() + " ] ");
    }
    
    
    
    public void actualizarNodo(String placa, ClassObject nuevoValor){
        ClassNodo iterador = LC;
        while(!iterador.getDato().getPlaca().equalsIgnoreCase(placa)){
            iterador = iterador.siguiente;
        }
        iterador.setDato(nuevoValor);
    }
    
    
    public void eliminarTodaLaLista(){
        tamano = 0;
        LC = null;
    }

    
    
    
    public void eliminarNodoPorSuValor(String datoEliminar) {
        ClassNodo actual;
        ClassNodo anterior;
        actual = LC;
        anterior = LC.anterior;
        if(tamano == 1){
            LC = null;
            tamano = 0;
        }else
        do {
            if (actual.getDato().getPlaca().equalsIgnoreCase(datoEliminar)) {
                if (actual == LC) {
                    LC = LC.siguiente;
                    LC.anterior = anterior;
                    LC.anterior.siguiente = LC;
                    
                } else if (actual == LC.anterior) {
                    anterior.siguiente = LC;
                    LC.anterior = anterior;                    
                } else {
                    anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = anterior;
                }
                tamano--;
            }
            
            anterior = actual;
            actual = actual.siguiente;
        } while (actual != LC);
    }
    
    
    
    
    
    public void insertarDeFormaOrdenada(ClassObject dato){
        ClassNodo nuevo = new ClassNodo(dato);
         nuevo.setDato(dato);
        
        ClassNodo recorrido1;
        ClassNodo recorrido2;
        if(estaVacia()){
            LC = new ClassNodo(dato);
            LC.siguiente = LC;
            LC.anterior = LC;
        }else{
            recorrido1 = LC;
            do {
                recorrido2 = recorrido1.siguiente;
                if(nuevo.getDato().getPlaca().compareToIgnoreCase(recorrido1.getDato().getPlaca()) < 0){
                    nuevo.siguiente = LC;
                    nuevo.anterior = LC.anterior;
                    LC.anterior = nuevo;
                    nuevo.anterior.siguiente = nuevo;
                    LC = nuevo;
                    break;
                }else if (recorrido1.getDato().getPlaca().compareToIgnoreCase(nuevo.getDato().getPlaca()) < 0 && recorrido2.getDato().getPlaca().compareToIgnoreCase(nuevo.getDato().getPlaca()) > 0){
                    nuevo.siguiente = recorrido2;
                    recorrido2.anterior = nuevo;
                    nuevo.anterior = recorrido1;
                    recorrido1.siguiente = nuevo;
                    break;
                }else if(nuevo.getDato().getPlaca().compareToIgnoreCase(recorrido1.getDato().getPlaca()) > 0 && recorrido2 == LC.anterior){
                    recorrido2.siguiente = nuevo;
                    nuevo.anterior = recorrido2;
                    nuevo.siguiente = LC;
                    LC.anterior = nuevo;
                   break;
                }else{
                    recorrido1 = recorrido1.siguiente; 
                }
            } while (recorrido1 != LC);
        }
        tamano++;
    }
    
    public void visualizarIncioAFin(){
            ClassNodo aux = LC;
            int j = 1;
            if (!estaVacia()) {
                for (int i = 0; i < (tamano + 1); i++) {
                    System.out.println(j + ".[ " + aux.getDato().toString() + " ] ");
                    aux = aux.siguiente;
                    j++;
                    if (j == tamano + 1) {
                        j = 1;
                    }
                }
            }else{
                   System.out.println("No hay Vehiculos Registrados");
            }
        
    }
    
   
    public void visualizarFinAInicio() {
            int j = tamano;
            if (!estaVacia()) {
                 ClassNodo aux = LC.anterior;
                for (int i = 0; i < (tamano + 1); i++) {
                    System.out.println(j + ".[ " + aux.getDato().toString() + " ] ");
                    aux = aux.anterior;
                    j--;
                    if (j == 0) {
                        j = tamano;
                    }
                }
            } else {
                System.out.println("No hay Vehiculos Registrados");
            }
        }
}
