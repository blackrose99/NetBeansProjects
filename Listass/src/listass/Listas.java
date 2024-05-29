package listass;

public class Listas {
    nodo tope;
   int tamano =0 ;
    String lista = "";
    
    public Listas(){
        tope = null;
    }
    //Metodo para ver si la pila se encuentra vacia
    public boolean estaVacia(){
        return tope == null;
    
    }
  
    //Insertar un nodo en la Pila
    public void insertarNodo(String dato) {
        int longi ;
        char caracterr;
        longi = dato.length();
        System.out.println(longi);
        for (int i = 0; i < longi; i++) {
            char caracter = dato.charAt(i);
            nodo nuevo = new nodo(caracter);
            nuevo.enlace = tope;
            tope = nuevo;
            tamano++;
        }

    }
    
    public void verPalindroma(String dato){
        
        int longi;
        char caracterr;
        boolean ban = true;
        nodo recorrido1 = tope;
        longi = dato.length();
        for (int j = 1; j < longi; j++) {
            caracterr = dato.charAt(j);
            recorrido1 = recorrido1.enlace;
            borrar();
            if(recorrido1.dato == caracterr){
               ban = true;
            
            }else{
                ban = false;
            }
        }
        
        if(ban == true){
            System.out.println("Esta Palabra es Polindroma");
        }else{
            System.out.println("Esta palabra no es Polindroma");
        }
    }
    
    
    public char borrar(){
        tope = tope.enlace;
        return  tope.dato;
    }
    
    

    public void mostrarElementos(){
        nodo recorrido = tope;
         while(recorrido != null){
             lista += recorrido.dato + "";
             recorrido = recorrido.enlace;
         }
         System.out.println(lista);
    }
    
    public char mostrarUltimo(){
        return tope.dato;
    }

   
    
}
