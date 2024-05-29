
package polinomio;

public class classMetodos {
    nodo inicio;


    
    public classMetodos(){
        inicio = null;

    }
    
    public void insertarCoeExp(classObjeto dato){
        nodo nuevo = new nodo(dato,inicio);
        if(inicio == null){
            inicio = nuevo;
        }else{
            nuevo.enlace = inicio;
            inicio = nuevo;
        }
    }
    
    public void verTodoElPolinimio() {
        nodo aux = inicio;
        int cont = 0;
        boolean ban = true;
        while (aux != null) {
            if (aux.dato.coeficiente > 0) {
                if (cont > 0) {
                    System.out.print(" + " + aux.dato.coeficiente + "x" + "^" + aux.dato.exponente);
                } else {
                    System.out.print(aux.dato.coeficiente + "x" + "^" + aux.dato.exponente);
                    ban = true;
                }
                cont++;
            } else {
                System.out.print(" (" + aux.dato.coeficiente + ")" + "x" + "^" + aux.dato.exponente + " + ");
            }
            aux = aux.enlace;
        }
    }

    
    
    
    public void mostrarTablaDeValores() {
        double valorVariable = 0.0;
        double total = 0, ex = 0;
        double valorTotal = 0.0;
        int im = 0;
        while (valorVariable <= 5.0) {
            for (nodo i = inicio; i != null; i = i.enlace) {
                ex = Math.pow(valorVariable, i.dato.exponente);
                valorTotal = i.dato.coeficiente * ex;
                total = total + valorTotal;
            }
            System.out.println("Cuanlo la x vale " +valorVariable + " el Polinomio es de: " + total);
            valorVariable = valorVariable + 0.5;
            total = 0;
            im++;

        }

    }

}
