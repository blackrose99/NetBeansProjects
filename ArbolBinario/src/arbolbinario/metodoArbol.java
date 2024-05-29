
package arbolbinario;


public class metodoArbol {
    nodo_Arbol raiz;

    public metodoArbol() {
        this.raiz = null;
    }
    
    public boolean estaVacio(){
        return raiz == null;
    }
    
    public void Ingresar(Equipos entrada) {
        nodo_Arbol nuevo = new nodo_Arbol(entrada);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            nodo_Arbol recorrer = raiz;
            nodo_Arbol rama;
            
            while (true) {
                rama = recorrer;

                if (entrada.codigoEquipo < recorrer.valor.codigoEquipo) {
                    recorrer = recorrer.iz;
                    if (recorrer == null) {
                        rama.iz = nuevo;
                        return;                     
                    }
                }else if(entrada.codigoEquipo > recorrer.valor.codigoEquipo){
                    recorrer = recorrer.de;
                    if (recorrer == null) {
                        rama.de = nuevo;
                        return;
                    }
                }else{
                    System.out.println("El codigo del Equipo ya se encuentra Registrado");
                    return;
                }
            }

        }

    }
    
    
    public void Inorden(nodo_Arbol entrada){
        if(entrada != null){
            Inorden(entrada.iz);
            System.out.println(entrada.valor.toString());
            Inorden(entrada.de);
        }
        
    }
  
     public void Postorden(nodo_Arbol entrada){
        if(entrada != null){
            Postorden(entrada.iz);
            Postorden(entrada.de);
            System.out.println(entrada.valor.toString());
        }
        
    }
     
     
     
         public void Preorden(nodo_Arbol entrada){
        if(entrada != null){
            System.out.println(entrada.valor.toString());
            Preorden(entrada.iz);
            Preorden(entrada.de);
        }
        
    }
    
    public Equipos buscarUnVehiculo(int cog){
        nodo_Arbol auxiliar = raiz;
        while(auxiliar.valor.codigoEquipo != cog){
            if(cog < auxiliar.valor.codigoEquipo){
                auxiliar = auxiliar.iz;
            }else if(cog > auxiliar.valor.codigoEquipo){
                auxiliar = auxiliar.de;
            }
            if(auxiliar == null){
               return null;
            }
        }
        
        
        return auxiliar.valor;
    }
    
    
    
    public boolean eliminarNodo(int cog){
        nodo_Arbol aux = raiz;
        nodo_Arbol padre = raiz;
        boolean izquierdo = true;
        while(aux.valor.codigoEquipo != cog){
           padre = aux;
           if(cog < aux.valor.codigoEquipo){
               izquierdo = true;
               aux = aux.iz;
           }else{
               izquierdo = false;
               aux = aux.de;
           }
           
           if(aux == null){
               return false;    
           }
        }
        
        if(aux.iz == null && aux.de == null){
            if(aux == raiz){
                raiz = null;     
            }else if(izquierdo){
                padre.iz = null;
                
            }else{
                padre.de = null;
            }
        }else if(aux.de == null){
                  if(aux == raiz){
                raiz = aux.iz;
            }else if(izquierdo){
                padre.iz = aux.iz;
            }else{
                padre.de = aux.iz;
            }
   
        } else if (aux.iz == null) {
            if (aux == raiz) {
                raiz = aux.de;
            } else if (izquierdo) {
                padre.iz = aux.de;
            } else {
                padre.de = aux.iz;
            }
        }else{
            
            nodo_Arbol reemplazo = reemplazarNodo(aux);
            if(aux == raiz){
                aux = reemplazo;
            }else if(izquierdo){
                padre.iz = reemplazo;
            }else{
                padre.de = reemplazo;
            }
            reemplazo.iz = aux.iz;
        }

       return true;
     
    }
    

    public nodo_Arbol reemplazarNodo(nodo_Arbol nodoReemplazo){
        nodo_Arbol reemplazarPadre = nodoReemplazo;
        nodo_Arbol reemplazo = nodoReemplazo;
        nodo_Arbol auxiliar = nodoReemplazo.de;
        
        while(auxiliar != null){
            reemplazarPadre = reemplazo;
            reemplazo = auxiliar;
            auxiliar = auxiliar.iz;
        }
        
        if(reemplazo!= nodoReemplazo.de){
            reemplazarPadre.iz = reemplazo.de;
            reemplazo.de = nodoReemplazo.de;
        }
        return reemplazo;
    }
    
}





















