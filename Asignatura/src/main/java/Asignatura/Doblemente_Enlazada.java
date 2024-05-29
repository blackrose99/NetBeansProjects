
package Asignatura;


public class Doblemente_Enlazada {
    private Class_Nodo principio,ultimo;
    int longitud;
    
    public Doblemente_Enlazada(){
        principio = ultimo = null;
    }
    
    public void insertarFin(Asignatura_Objeto dato) {
        if (principio != null) {
            ultimo = new Class_Nodo(dato, null, ultimo);
            ultimo.antes.despues = ultimo;
        } else {
            principio = ultimo = new Class_Nodo(dato);
        }
    }
    
    public void insertarInicio(Asignatura_Objeto dato) {
        if (principio != null) {
            principio = new Class_Nodo(dato, principio, null);
            principio.despues.antes = principio;
        } else {
            principio = ultimo = new Class_Nodo(dato);
        }
    }


    public Class_Nodo buscarPorIndice(String cogigo) {
        Class_Nodo indice;
        for (indice = principio; (!cogigo.equalsIgnoreCase(indice.getInformacion().getCodigo())) && (indice != null); indice = indice.despues) {      
        }
        return indice;
    }
    
    
        
    public void insertarEntreDosNodos(String codigo, Asignatura_Objeto datoIngresado) {
        Class_Nodo newNodo, referencia;

        referencia = buscarPorIndice(codigo);

        newNodo = new Class_Nodo(datoIngresado);
        if (referencia != null) {

            newNodo.despues = referencia.despues;
            referencia.despues.antes = newNodo;

            referencia.despues = newNodo;
            newNodo.antes = referencia;
        }
    }
    
    
        public void BuscarPorElCodigo(String codigo) {
        Class_Nodo aux;
        aux = principio;
        while (aux != null) {
            if (codigo.equalsIgnoreCase(aux.getInformacion().getCodigo())) {
                 System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
                System.out.println(aux.getInformacion().toString());
               System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
                break;
            } else {
                aux = aux.despues;
            }
        }
    }
    public void VisualizarListaIniciofFin() {
        if (principio != null) {
            Class_Nodo iteradora = principio;
            while (iteradora != null) {
               System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
                System.out.println(iteradora.getInformacion().toString());
                System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
                iteradora = iteradora.despues;
            }

        }
    }

    public void VisualizarListaFinInicio() {
        if (principio != null) {
            Class_Nodo iteradora = ultimo;
            while (iteradora != null) {
                System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
                System.out.println(iteradora.getInformacion().toString());
              System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
                iteradora = iteradora.antes;

            }

        }
    }

    public void Eliminacion(String codigo) {
        Class_Nodo actual = principio;
        boolean eliminado = false;
        if (principio != null) {
            if (principio == ultimo && codigo.equalsIgnoreCase(principio.getInformacion().getCodigo())) {
                principio = ultimo = null;
                eliminado = true;

            } else if (codigo.equalsIgnoreCase(principio.getInformacion().getCodigo())) {
                principio = principio.despues;
                principio.antes = null;
                eliminado = true;

            } else {
                while (actual != null && !codigo.equalsIgnoreCase(actual.getInformacion().getCodigo())) {
                    actual = actual.despues;
                }
                if (actual == ultimo) {
                    actual.antes.despues = null;
                    ultimo = actual.antes;

                    eliminado = true;
                } else if (actual != null) {
                    actual.despues.antes = actual.antes;
                    actual.antes.despues = actual.despues;
                    eliminado = true;

                } else {
                    System.out.println("Asignatura no encontrada");
                }
            }
        } else {
            System.out.println("Lista de Asignaturas Vacia");

        }
        if (eliminado == true) {
            System.out.println("Asignatura eliminada Exitosamente");
        }
    }


}
