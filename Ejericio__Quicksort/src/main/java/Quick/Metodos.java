
package Quick;

public class Metodos {

    class_Object vector[];
    int longitud;

    public void ordenar(class_Object[] nombre) {

        if (nombre == null || nombre.length == 0) {
            return;
        }

        this.vector = nombre;
        longitud = nombre.length;
        quicksort(0, longitud - 1);

    }

    private void quicksort(int izq, int der) {
        int i = izq;
        int j = der;

        String pivote = vector[izq + (der - izq) / 2].nombre;

        while (i <= j) {
            while (vector[i].nombre.compareToIgnoreCase(pivote) < 0) {
                i++;
            }

            while (vector[j].nombre.compareToIgnoreCase(pivote) > 0) {
                j--;
            }
            if (i <= j) {
                cambiosatributo(i, j);
                i++;
                j--;
            }
        }

        if (izq < j) {
            quicksort(izq, j);
        }
        if (i < der) {
            quicksort(i, der);
        }
    }

    private void cambiosatributo(int i, int j) {

        int id = vector[i].id;
        vector[i].id = vector[j].id;
        vector[j].id = id;

        String nombre = vector[i].nombre;
        vector[i].nombre = vector[j].nombre;
        vector[j].nombre = nombre;

        String apellido = vector[i].apellido;
        vector[i].apellido = vector[j].apellido;
        vector[j].apellido = apellido;

        double notafinal = vector[i].notafinal;
        vector[i].notafinal = vector[j].notafinal;
        vector[j].notafinal = notafinal;
    }
}










