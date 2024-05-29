package taller10;
public class Pila {

    private Nodo cima;

    public Pila() {
    }

    public Nodo getCima() {
        return cima;
    }

    public void setCima(Nodo cima) {
        this.cima = cima;
    }

    public Pila(Nodo cima) {
        this.cima = null;
    }

    public boolean ListaVacia() {

        return cima == null;
    }

    public void insertarPila(char num) {
        Nodo nuevo;
        nuevo = new Nodo(num);
        nuevo.enlace = cima;
        cima = nuevo;

    }

    public void mostrarPila() {

        Nodo nuevo;
        nuevo = cima;
        while (nuevo != null) {

            System.out.println(nuevo.numero);
            nuevo = nuevo.enlace;
        }

    }

    public void eliminarPila() {

        if (ListaVacia()) {
            System.out.println("La lista esta vacia");

        }
        cima = cima.enlace;
    }

    public void datos(String numero) {
       Cola cola = new Cola();
       
       boolean bandera = true;
        for (int i = 0; i < numero.length(); i++) {
            char num = numero.charAt(i);
            cola.InsertarCola(num);
            insertarPila(num);
        }
        while (!ListaVacia()) {
            if (cima.numero == cola.getFrente().numero) {

               bandera = true;
                eliminarPila();
                cola.eliminarCola();
            } else {
                bandera = false;
                break;

            }
        }
        
        if (bandera == true) {
            System.out.println("El numero " + numero + " es capicùa");
        } else {
            System.out.println("El numero " + numero + " No es capicìua");
        }
    }

}
