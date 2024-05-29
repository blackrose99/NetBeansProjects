package arboles;

public class arbolBinario {

    nodoArbol raiz;

    public arbolBinario() {
        raiz = null;
    }

    public boolean Empty(){
        return raiz == null;
    }
    
    public void agregar(int d, String nom) {
        
        familia dat = new familia(nom, d);
        nodoArbol nuevo = new nodoArbol(dat);
        nodoArbol auxiliar = raiz;
         nodoArbol padre;
        if (raiz == null) {
            raiz = nuevo; 
        } else {
            while (true) {
                padre = auxiliar;
                
                if (d < auxiliar.dato.getIdentificador()) {
                    auxiliar = auxiliar.getIzquierdo();
                    if (auxiliar == null) {
                        padre.setIzquierdo(nuevo);
                        return;
                    }
                } else {
                    auxiliar = auxiliar.getDerecho();
                    if (auxiliar == null) {
                        padre.setDerecho(nuevo);
                        return;
                    }
                }
            }
        }
    }
    
                
            public void MostrarArbol(nodoArbol a) {
            if (a != null) {
                System.out.println("--------");
                System.out.println("|"+a.dato.getNombre()+"|");
                MostrarArbol(a.getIzquierdo());
                MostrarArbol(a.getDerecho());
            }
    }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
    //Metodo para buscar un dato por su Numero de identificacion
    public String buscar(int busqueda) {
        nodoArbol aux = raiz;
        while (aux.dato.getIdentificador() != busqueda) {
            if (busqueda < aux.dato.getIdentificador()) {
                aux = aux.getIzquierdo();
            } else {
                aux = aux.getDerecho();
            }
            if (aux == null) {
                return null;
            }
        }

        return aux.dato.toString();

    }

    
}
