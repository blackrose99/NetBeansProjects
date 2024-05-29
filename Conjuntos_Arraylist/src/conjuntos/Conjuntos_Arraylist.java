//luis manuel castaño grueso 

/* hizo falta complementar los metodos de:
imprimir
complemento
diferencia simetrica 
posdata... los otros meotos los probe de manera intividual y si funcionan 
            pero no puede hacer el metodo para imprimir los datos 

 */

package conjuntos;

import java.util.Scanner;
import java.util.ArrayList;

public class Conjuntos_Arraylist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        conjunto a, b, c;

        a = new conjunto();
        b = new conjunto();
        c = new conjunto();
//ingresar datos para el conujto a
        System.out.println("Digite los elementos del primer vector");
        int opcion = 1, c1 = 0;
        while (opcion == 1) {
            System.out.println("Digite el valor del Conjunto a");
            a.insertar(sc.nextInt());
            System.out.println("Desea agregar otro Elemento 1 Si / 0 No");
            opcion = sc.nextInt();
            if (c1 >= 15) {
                break;
            }
        }
        a.contador = c1;
        System.out.println("Digite los elementos del primer vector");
        opcion = 1;
        c1 = 0;
//ingresar datos para el conjunto b
        while (opcion == 1) {
            System.out.println("Digite el valor del Conjunto b");
            b.insertar(sc.nextInt());
            System.out.println("Desea agregar otro Elemento 1 Si / 0 No");
            opcion = sc.nextInt();
            if (c1 >= 15) {
                break;
            }

        }
        //parte de pruba....
        a.Union(b).imprimir();
        a.Interseccion(b).imprimir();
        a.Diferencia(b).imprimir();
        a.diferenciaSimetrica(b).imprimir();
        System.out.println("el elemto a buscar ");
        int n;
        n = sc.nextInt();
        if (a.pertenece(n) == true) {
            System.out.println("pertenece");
        } else {
            System.out.println("no pertenece");
        }
        a.Union(b).Union(b).Interseccion(b);
        a.complemento();

    }

    public static class conjunto {

        public ArrayList<Integer> items;
        public int tamaño;
        public int contador;

        public conjunto() {
            items = new ArrayList<Integer>();
        }

        public conjunto(ArrayList<Integer> v) {
            items = v;
        }
//metodo para insertar los datos 

        public void insertar(int dato) {
            if (Encontrar(dato) == 0) {
                items.add(dato);

            } else {
                System.out.println("Ya se encuentra en el conjunto");
            }
        }
//metodo para unir los conjuntos 

        public conjunto Union(conjunto a) {
            conjunto R = new conjunto();
            R.contador = 0;
            for (int i = 0; i < a.items.size(); i++) {
                R.items.add(a.items.get(i));
            }
            int i = 0, dato = 0;
            while (true) {
                dato = items.get(i);
                if (R.Encontrar(dato) == 0) {
                    R.insertar(items.get(i));
                } else {
                    ++i;
                }
                if (i == contador) {
                    break;
                }

            }
            return R;
        }
//este metodo me busca elementos

        public int Encontrar(int dato) {
            for (int i = 0; i < items.size(); i++) {
                if (dato == items.get(i)) {
                    return 1;
                }

            }
            return 0;
        }
//metodo para defineir la interseccion 

        public conjunto Interseccion(conjunto a) {
            conjunto R = new conjunto();
            int i = 0;
            while (true) {
                if (a.Encontrar(this.items.get(i)) == 1) {
                    R.insertar(this.items.get(i));

                }
                if (i == contador - 1) {
                    break;
                }
                ++i;

            }
            if (R.contador <= 0) {
                System.out.println("La interseccion es un conjunto vacio");

            }

            return R;
        }
//metodo de diferencia simetrica

        public conjunto Diferencia(conjunto a) {
            conjunto R = new conjunto();
            int x = 0;
            while (true) {
                if (a.Encontrar(items.get(x)) == 0) {
                    R.insertar(items.get(x));
                }
                ++x;
                if (x == a.contador) {
                    break;
                }

            }
            if (R.contador == 0) {
                System.out.println("No hay diferencia");
            }
            return R;

        }
//pertenece 

        public boolean pertenece(int dato) {
            boolean encontrado = false;
            for (int i = 0; i < items.size(); i++) {
                if (dato == items.get(i)) {
                    encontrado = true;
                }
            }
            return encontrado;
        }
//incluido

        public boolean incluido(conjunto a) {
            boolean R = false;
            int i = 0;
            while (true) {
                if (a.Encontrar(items.get(i)) == 1) {
                    R = true;
                } else {
                    R = false;
                    break;
                }
                ++i;
                if (i == contador) {
                    break;
                }
            }
            return R;
        }
//complemento         

        public conjunto complemento() {
            conjunto R = new conjunto();

            return R;

        }
//diferencia smetrica       

        public conjunto diferenciaSimetrica(conjunto a) {
            conjunto R = new conjunto();
            for (int i = 0; i < items.size(); i++) {
                if (true) {

                }
            }
            return R;

        }
//imprimir         

        public void imprimir() {
            for (int i = 0; i < items.size(); i++) {
                System.out.println(items.get(i));
            }
        }
    }

}
