package ejercicio2_listas_dinamicas;

public class listas {

    private Funciones_Nodos primero;
    private Funciones_Nodos ultimo;
    int cont = 0;

    public listas() {
        primero = null;
        ultimo = null;
    }

    //se crea el metodo que me permite registrar un nodo al inicio de la cola
    public void RegistroCabeza(Equipos equipo) {
        cont++;
        if (primero == null) {
            primero = new Funciones_Nodos(equipo, primero);
            ultimo = primero;

        } else {
            primero = new Funciones_Nodos(equipo, primero);
        }
    }

    //metodo que me permite recorrer los nodos de una lista
    public void Visualizar() {
        Funciones_Nodos temp;
        int c = 0;
        temp = primero;
        if (Contador() == 0) {
            System.out.println("La lista esta vacia");
        } else {
            while (temp != null) {
                System.out.println(" Equipo  #  " + c + "  =  " + temp.getInfo().toString());
                temp = temp.getNext();
                c++;
            }
        }
    }

    //se crea el metodo que me permita crear un nodo al final de la cola 
    public void RegistroFinal(Equipos equipo) {
        cont++;
        if (primero == null) {
            primero = new Funciones_Nodos(equipo);
            ultimo = primero;

        } else {
            primero = new Funciones_Nodos(equipo);
        }
    }

    // este metodo me permite insertar en el enesimo nodo digitado
    public void agregarEnLaMitad(String enesimo, Equipos equipo) {
        cont++;
        Funciones_Nodos N, A;
        A = buscarDato1(enesimo);
        if (A != null) {
            N = new Funciones_Nodos(equipo);
            N.next = A.next;
            A.next = N;
        }

    }

    //me retorna el elemento que se busca en especifico 
    public void AgregarEntreNodos(String dato, Equipos equipo) {
        cont++;
        Funciones_Nodos temp = primero;
        Funciones_Nodos N = new Funciones_Nodos();
        N.setInfo(equipo);
        if (Empty()) {
            primero = N;
        } else {
            while (temp != null) {
                if (temp.getInfo().getCodigo().equals(dato)) {
                    N.setNext(temp.getNext());
                    temp.setNext(N);
                }
                temp=temp.getNext();

            }
        }
    }

    //me busca un elemento dentro de una lista y me retorna la lista
    public Funciones_Nodos buscarDato1(String dato) {
        Funciones_Nodos index = primero;
        if (dato == null) {
            return null;
        } else {
            while (index != null) {
                if (dato.equals(index.getInfo().getCodigo())) {
                    index = index.next;
                }
                break;
            }
        }
        return index;

    }

    //este nodo me determina si la lista esta vacia
    public boolean Empty() {
        if (primero == null) {
            return true;
        } else {
            return false;
        }
    }

    //este metodo me permite eliminar un nodo en esepecifico
    public void BorrrarNodo(String enesimo) {
        boolean eli = true;

        if (Contador() != 0) {
            if (primero == ultimo && enesimo.equals(primero.getInfo().getCodigo())) {
                primero = ultimo = null;

            } else if (enesimo.equals(primero.getInfo().getCodigo())) {
                primero = primero.getNext();
            } else {
                Funciones_Nodos anterior, temporal;
                anterior = primero;
                temporal = primero.getNext();

                while (temporal != null && temporal.getInfo().getCodigo() != enesimo) {
                    anterior = anterior.getNext();
                    temporal = temporal.getNext();
                }
                if (temporal != null) {
                    anterior.next = temporal.getNext();
                    if (temporal == ultimo) {
                        ultimo = anterior;

                    }
                } else {
                    System.out.println("El codigo No se pudo encontrar");
                    eli = false;
                }
            }
        } else {
            System.out.println(" No hay elementos La lista esta Vacia");
            eli = false;
        }
        if (eli == true) {
            System.out.println(" El Equio Fue eliminado Exisatosamente");
        }
    }

    public void BuscarCodigo(String codigo) {
        Funciones_Nodos temp;
        int c = 0;
        temp = primero;
        while (temp != null) {
            c++;
            if (codigo.equals(temp.getInfo().getCodigo())) {
                System.out.println("Nodo # " + c + temp.getInfo().toString());
                break;
            } else {
                temp = temp.getNext();
            }

        }
    }

    //me retorna la variable contador 
    public int Contador() {
        return cont;

    }
}
