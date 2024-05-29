
package taller_no.pkg12_arbolexpresiones;


public class MetodosExpresionesç {
    
        NodoArbol raizArbol;

    public MetodosExpresionesç(NodoArbol centro) {
        this.raizArbol = centro;
    }
        
   public MetodosExpresionesç(){
       raizArbol = null;
   } 
   
   public MetodosExpresionesç(String expresion){
       raizArbol = crearArbol(expresion);
   }

   
   public void crearNodo(Object entrada){
       raizArbol = new NodoArbol(entrada);
   }
   
   public NodoArbol crearSubArbol(NodoArbol iz, NodoArbol de, NodoArbol centro){
       centro.izquierdo = de;
       centro.derecho = iz;
       return centro;
   }
   

   public String mostrarPreorden(NodoArbol sub){
       String cadena = "";
       if(sub != null){
           cadena = sub.datoArbol+"\n"+mostrarPreorden(sub.izquierdo)+mostrarPreorden(sub.derecho);
       }
       return cadena;
   }
   
   
      public String mostrarInorden(NodoArbol sub){
       String cadena= "";
       if(sub != null){
           cadena = mostrarInorden(sub.izquierdo)+ sub.datoArbol+"\n"+mostrarInorden(sub.derecho);
       }
       return cadena;
   }
      
      
    public String mostrarPosorden(NodoArbol sub){
       String cadena= "";
       if(sub != null){
           cadena = mostrarPosorden(sub.izquierdo)+mostrarPosorden(sub.derecho)+ sub.datoArbol+"\n";
       }
       return cadena;
   }

   
   
    private int prioridadSigno(char signo) {
        int p = 100;

        switch (signo) {
            case '^':
                p = 30;
                break;
            case '*':
            case '/':
                p = 20;
                break;
            case '+':
            case '-':
                p = 10;
                break;
            default:
                p = 0;
        }
        return p;
    }

    
     private boolean esOperador(char opera){
         boolean resultado;
         
         switch(opera){
             case'(':
             case')':
             case'^':
             case'*':
             case'/':
             case'+':
             case'-':
             resultado = true;
             break;
             
             default:
                 resultado = false;
         }
        return resultado;
     }
     
     private NodoArbol crearArbol(String entrada){
         Class_PilaExpresionesç pilaOperadores;
         Class_PilaExpresionesç pilaExpresiones;
         NodoArbol valor;
         NodoArbol op1;
         NodoArbol op2;
         NodoArbol centro;
         
         pilaOperadores = new Class_PilaExpresionesç();
         pilaExpresiones = new Class_PilaExpresionesç();
         char caracterEvaluado;
         
         for (int i = 0; i < entrada.length(); i++) {
             
             caracterEvaluado = entrada.charAt(i);
             
             valor = new NodoArbol(caracterEvaluado);
             
             
             if(!esOperador(caracterEvaluado)){
                 pilaExpresiones.ingresar(valor);
             }else{
                 switch(caracterEvaluado){
                     case '(':
                         pilaOperadores.ingresar(valor);
    
                         break;

                     case ')':
                         
                         while (!pilaOperadores.estavacia()&& !pilaOperadores.cimaPila().datoArbol.equals('(')) {
                             op2 = pilaExpresiones.sacar();
                             op1 = pilaExpresiones.sacar();
                             centro = pilaOperadores.sacar();
                             centro = crearSubArbol(op2, op1, centro);
                             pilaExpresiones.ingresar(centro);
                         }
                         pilaOperadores.sacar();
                         break;
                     
                     default:
                         while (!pilaOperadores.estavacia() && prioridadSigno(caracterEvaluado) <= prioridadSigno(pilaOperadores.cimaPila().datoArbol.toString().charAt(0))) {
                             op2 = pilaExpresiones.sacar();
                             op1 = pilaExpresiones.sacar();
                             centro = pilaOperadores.sacar();
                             centro = crearSubArbol(op2, op1, centro);
                             pilaExpresiones.ingresar(centro);
                         }
                         pilaOperadores.ingresar(valor);
                     
                 }
             }

        }
        while (!pilaOperadores.estavacia()) {
            op2 = pilaExpresiones.sacar();
            op1 = pilaExpresiones.sacar();
            centro = pilaOperadores.sacar();
            centro = crearSubArbol(op2, op1, centro);
            pilaExpresiones.ingresar(centro);
        }
        
        centro = pilaExpresiones.sacar();
        return  centro; 

    }
}
