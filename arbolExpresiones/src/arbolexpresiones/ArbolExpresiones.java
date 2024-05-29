package arbolexpresiones;

import java.util.Stack;

public class ArbolExpresiones {
    nodoArbol raiz;
    public ArbolExpresiones(nodoArbol raiz) {
        this.raiz = raiz;
    }
    public ArbolExpresiones() {
        raiz = null;
    }
    public ArbolExpresiones(String cadena) {
        raiz = crearArbol(cadena);
    }
    public void recetearArbol() {
        raiz = null;
    }
    public void crearNodo(Object dato) {
        raiz = new nodoArbol(dato);
    }
    public nodoArbol crearSubArbol(nodoArbol derecho, nodoArbol izquierdo, nodoArbol operador) {
        operador.izquierdo = izquierdo;
        operador.derecho = derecho;
        return operador;
    }
    public nodoArbol crearSubArbolfaltante(nodoArbol dato2, nodoArbol operador) {
        operador.derecho = dato2;
        return operador;
    }
    
        public nodoArbol crearSubArbolfaltanteiz(nodoArbol iz, nodoArbol operador) {
        operador.izquierdo = iz;
        return operador;
    }
    public void arbolVacio() {
        raiz = null;
    }
    public String preorden(nodoArbol subarbol) {
        String cadena = "";
        if (subarbol != null) {
            cadena = subarbol.dato.toString() + preorden(subarbol.izquierdo) + preorden(subarbol.derecho);
        }
        return cadena;
    }
    public String inorden(nodoArbol subarbol) {
        String cadena = "";
        if (subarbol != null) {
            cadena = inorden(subarbol.izquierdo) +  subarbol.dato.toString() +  inorden(subarbol.derecho);
        }
        return cadena;
    }

    public String posorden(nodoArbol subarbol) {
        String cadena = "";
        if (subarbol != null) {
            cadena = posorden(subarbol.izquierdo) + posorden(subarbol.derecho) + subarbol.dato.toString() ;
        }
        return cadena;
    }
    private int prioridad(char c) {
        int p;

        switch (c) {
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
    private boolean esOperador(char operador) {
        boolean resultado;
        switch (operador) {
            case '(':
            case ')':
            case '^':
            case '*':
            case '/':
            case '+':
            case '-':
                resultado = true;
                break;
            default:
                resultado = false;
        }
        return resultado;
    }
    private nodoArbol crearArbol(String cadena) {
        Stack<nodoArbol> pilaOperadores = new Stack();
        Stack<nodoArbol> pilaExpresiones = new Stack();
        Stack<nodoArbol> auu = new Stack();
        nodoArbol token;
        nodoArbol izquierda;
        nodoArbol derecha;
        nodoArbol centro;
         nodoArbol iu;
        char caracterEvaluado;
        for (int i = 0; i < cadena.length(); i++) {
            caracterEvaluado = cadena.charAt(i);
            token = new nodoArbol(caracterEvaluado);
            if (!esOperador(caracterEvaluado)) {
                pilaExpresiones.push(token);
            } else {
                switch (caracterEvaluado) {
                    case '(':
                        pilaOperadores.push(token);
                        break;
                    case ')':
                        while (!pilaOperadores.empty() && !pilaOperadores.peek().dato.equals('(')) {
                            derecha = pilaExpresiones.pop();
                            if (pilaExpresiones.isEmpty()) {
                                centro = pilaOperadores.pop();
                                centro = crearSubArbolfaltante(derecha, centro);
                                pilaExpresiones.push(centro);
                                  
                                auu.push(centro);
                            } else {
                                izquierda = pilaExpresiones.pop();
                                centro = pilaOperadores.pop();
                                centro = crearSubArbol(derecha, izquierda, centro);
                                pilaExpresiones.push(centro);
                            }
                        }
                            pilaOperadores.pop();
                        break;
                    default:
                        while (!pilaOperadores.empty() && prioridad(caracterEvaluado) <= prioridad(pilaOperadores.peek().dato.toString().charAt(0))) {
                            derecha = pilaExpresiones.pop();
                            if (pilaExpresiones.isEmpty()){
                                centro = pilaOperadores.pop();
                                centro = crearSubArbolfaltante(derecha, centro);
                                pilaExpresiones.push(centro);
                             auu.push(centro);
                                
                            } else {
                                izquierda = pilaExpresiones.pop();
                                centro = pilaOperadores.pop();
                                centro = crearSubArbol(derecha, izquierda, centro);
                                pilaExpresiones.push(centro);

                            }
                        }

                        pilaOperadores.push(token);
                }
            }
        }
        
        
        while(!auu.isEmpty()){
             derecha = auu.pop();
            if (pilaExpresiones.isEmpty()) {
                centro = pilaOperadores.pop();
                centro = crearSubArbolfaltante(derecha, centro);
                pilaExpresiones.push(centro);

            } else {
                izquierda = auu.pop();
                centro = pilaOperadores.pop();
                centro = crearSubArbol(derecha, izquierda, centro);
                pilaExpresiones.push(centro);
                
            }
        }
        
        
        
        
        
        while (!pilaOperadores.empty()) {
            derecha = pilaExpresiones.pop();
            if (pilaExpresiones.isEmpty()) {
                centro = pilaOperadores.pop();
                centro = crearSubArbolfaltante(derecha, centro);
                pilaExpresiones.push(centro);

            } else {
                izquierda = pilaExpresiones.pop();
                centro = pilaOperadores.pop();
                centro = crearSubArbol(derecha, izquierda, centro);
                pilaExpresiones.push(centro);
                
            }
        }
        centro = pilaExpresiones.pop();
        return centro;
    }
}
