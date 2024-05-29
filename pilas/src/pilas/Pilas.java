//luis manuel castaño
package pilas;

import java.util.ArrayList;
import java.util.Scanner;

public class Pilas {

    public static void main(String[] args) {
        PILA a = new PILA();
        PILA b = new PILA();
        PILA c = new PILA();
        PILA espejo = new PILA();
        Scanner sc = new Scanner(System.in);
        int opcion = 1;

        do {
            System.out.println("Numero del dato para la pila A");
            a.Push(sc.nextInt());
            System.out.println("Digite 0 para salir 1 para continuar");
            opcion = sc.nextInt();
        } while (opcion == 1);
        do {
            System.out.println("Numero del dato para la pila B");
            b.Push(sc.nextInt());
            System.out.println("Digite 0 para salir 1 para continuar");
            opcion = sc.nextInt();
        } while (opcion == 1);

//la suma de todos los datos         
        espejo = a.Copy();
        int contador = 0, suma = 0, dato = 0;
        while (!a.Empty()) {
            dato = a.Pop();
            ++contador;
            suma += dato;

        }
        System.out.println("la cantidad de datos es de  " + contador + " y la suma es de " + suma);
//suma del tope mas la el ultimo dato 
        a = espejo.Copy();
        int tope = 0;
        dato = 0;
        if (!a.Empty()) {
            tope = a.Pop();
            while (!a.Empty()) {
                dato = a.Pop();

            }
        }
        System.out.println("El resultado de la suma del tope mas la del mas profundo es de: " + (tope + dato));

//elementos repetidos 
        System.out.println("Digite un numero para determinar cuantas veces esta repetido");
        int dato1 = sc.nextInt();
        int n2 = 0;
        a = espejo.Copy();
        while (!a.Empty()) {
            int n1 = a.Pop();
            if (dato1 == n1) {
                ++n2;
            } else {
                a.Pop();

            }
        }

        if (n2 == 0) {
            System.out.println("El numero " + dato1 + " no se encuantra en la pila");
        } else {
            System.out.println("el numero " + dato1 + "  se repite " + n2 + " veces ");
        }
//mayor de los numeros pares
        a = espejo.Copy();
        int n = 0, m = 0;
        while (!a.Empty()) {
            n = a.Pop();
            if (n % 2 == 0) {
                if (n > m) {
                    m = n;
                }
            }
        }
        System.out.println("el numero mayor de los datos pares es de: " + m);

        //mayor de los numeros impares
        a = espejo.Copy();
        int n1 = 0, m1 = 0;
        while (!a.Empty()) {
            n1 = a.Pop();
            if (n1 % 2 != 0) {
                if (n1 > m1) {
                    m1 = n1;
                }
            }
        }
        System.out.println("el numero mayor de los datos impares es de: " + m1);

//intercarlas los numeros pares e impares de dos pilas diferentes
        a = espejo.Copy();
        b = espejo.Copy();
        while (!a.Empty() || !b.Empty()) {
            while (!a.Empty()) {
                int x = a.Pop();
                if (x % 2 == 0) {
                    c.Push(x);
                    break;
                }
            }
            while (!b.Empty()) {
                int y = b.Pop();
                if (y % 2 != 0) {
                    c.Push(y);
                    break;
                }
            }
        }
        System.out.println("los datos de la pila c son");
        for (int i = 0; i < c.Items.size(); i++) {
            System.out.println(c.Items.get(i));
        }
//poner los numeros primos de ambas pilas en una sola       
        a = espejo.Copy();
        b = espejo.Copy();
        int conta = 0;
        int conta2 = 0;
        while (!a.Empty() || !b.Empty()) {
            while (!a.Empty()) {
                int a1 = a.Pop();
                for (int i = 1; i < a1; i++) {
                    if (a1 % i == 0) {
                        conta++;
                    }
                }
                if (conta == 2) {
                    c.Push(a1);
                    break;
                }

            }
            while (!a.Empty()) {
                int b1 = b.Pop();
                for (int i = 1; i < b1; i++) {
                    if (b1 % i == 0) {
                        conta2++;
                    }
                }
                if (conta2 == 2) {
                    c.Push(b1);
                    break;
                }

            }
        }
        System.out.println("la lista de numeros primos de las dos pilas es de");
        for (int i = 0; i < c.Items.size(); i++) {
            System.out.println(c.Items.get(i));
        }
    }

    public static class PILA {

        private int top;
        ArrayList<Integer> Items;

        public PILA() {
            top = -1;
            Items = new ArrayList<Integer>();
        }

        public void Push(int a) {
            Items.add(a);
            ++top;
        }

        public int Pop() {
            int r;
            if (top >= 0) {
                r = Items.remove(top);
                --top;
            } else {
                System.out.println("la pila se encuentra vacia");
                r = -1;
            }

            return r;

        }

        public int StackTop() {
            int r;
            if (top >= 0) {
                r = Items.get(top);
            } else {
                System.out.println("la pila se encuentra vacia");
                r = -1;
            }
            return r;
        }

        public boolean Empty() {
            if (top == -1 || Items.size() == 0) {
                top = -1;
                return true;
            } else {
                return false;
            }

        }

        public PILA Copy() {
            PILA f = new PILA();
            for (int i = 0; i < Items.size(); i++) {
                f.Push(Items.get(i));

            }
            f.top = top;
            return f;
        }

    }

}
