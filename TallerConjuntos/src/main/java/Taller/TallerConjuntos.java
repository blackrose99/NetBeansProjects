//luis manuel castaño
// kevin osorio calderon


package Taller;

import java.util.Scanner;

public class TallerConjuntos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        conjunto a, b, c;

        a = new conjunto();
        b = new conjunto();
        c = new conjunto();

        System.out.println("Digite los elementos del primer vector");
        int opcion = 1, c1 = 0;
        while (opcion == 1) {
            System.out.println("Digite el valor del Conjunto a");
            a.items[c1++] = sc.nextInt();
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

        while (opcion == 1) {
            System.out.println("Digite el valor del Conjunto b");
            b.items[c1++] = sc.nextInt();
            System.out.println("Desea agregar otro Elemento 1 Si / 0 No");
            opcion = sc.nextInt();
            if (c1 >= 15) {
                break;
            }

        }

        b.contador = c1;
        c = a.Union(b);

        System.out.println("UNION: ");
        for (int i = 0; i <= c.contador; i++) {
            System.out.println(c.items[i]);
        }
        c = a.Interseccion(b);
        System.out.println("Interseccion");
        for (int i = 0; i < c.contador; i++) {
            System.out.println(c.items[i]);
        }
        System.out.println("Diferencia Simetrica");
        c = a.DiferenciaSimetrica(b);
        for (int i = 0; i < c.contador; i++) {
            System.out.println(c.items[i]);
        }
        System.out.println("Incluido");
        System.out.println("");
        boolean R =a.incluido(a);
        if (R == false) {
            System.out.println("esta incluido");
        } else {
            System.out.println("No esta incluida");
        }
        System.out.println("");
        System.out.println("Pertennce");
        System.out.println("Digite un elento");
        int n = sc.nextInt();
        boolean P = a.pertenece(n);
        if (P == true) {
            System.out.println("el elemento pertenece");

        } else {
            System.out.println("el elemento no pertenece a A.(B) ");
        }

    }

    public static class conjunto {

        public int items[];
        public int tamaño;
        public int contador;

        public conjunto() {
            items = new int[15];
        }

        public conjunto(int v[]) {
            items = v;
        }

        public void insertar(int dato) {
            if (Encontrar(dato) == 0) {
                items[contador++] = dato;

            } else {
                System.out.println("Ya se encuentra en el conjunto");
            }
        }

        public conjunto Union(conjunto a) {
            conjunto R = new conjunto();

            boolean repetido = false;
            int i = 0;
            for (int dato1 : a.items) {
                if (dato1 != 0) {
                    R.items[i] = dato1;
                    i++;
                }
            }

            for (int dato1 : this.items) {
                for (int dato2 : a.items) {
                    if (dato1 == dato2) {
                        repetido = true;
                    }
                }
                if (!repetido && dato1 != 0) {
                    R.items[i] = dato1;
                    i++;
                } else {
                    repetido = false;
                }
            }
            R.contador = (i - 1);

            return R;
        }

        public int Encontrar(int dato) {
            for (int i = 0; i < items.length; i++) {
                if (dato == items[i]) {
                    return 1;
                }

            }
            return 0;
        }

        public conjunto Interseccion(conjunto a) {
            conjunto R = new conjunto();
            int i = 0;
            while (true) {
                if (a.Encontrar(this.items[i]) == 1) {
                    R.insertar(this.items[i]);

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

        public conjunto DiferenciaSimetrica(conjunto a) {
            conjunto R = new conjunto();
            int x = 0;
            while (true) {
                if (a.Encontrar(items[x]) == 0) {
                    R.insertar(items[x]);
                }
                ++x;
                if (x == a.contador) {
                    break;
                }

            }
            if (R.contador == 0) {
                System.out.println("No hay diferencia simetrica");
            }
            return R;

        }

        public boolean pertenece(int dato) {
            boolean encontrado = false;
            for (int i = 0; i < items.length; i++) {
                if (dato == items[i]) {
                    encontrado = true;
                }
            }
            return encontrado;
        }

        public boolean incluido(conjunto a) {
            boolean R = false;
            int i = 0;
            while (true) {
                if (a.Encontrar(items[i]) == 1) {
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
    }

}
