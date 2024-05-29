/*                Autores
        Luis Manuel Castaño Grueso  
        Kevin Osorio Calderon 
 */
package conjunto;

import java.util.Scanner;

public class Conjunto {

    public static void main(String[] args) {
        //mando a llamar el metodo que me contiene toda la ejecucion del main
        Metodos();

    }

//----------------------------------------------------------    
    //creo un metodo para guardar la interacion y no saturar el main
    public static void Metodos() {
        Scanner leer = new Scanner(System.in);
        //defino el tamaño de los vectorea hasta 15
        int A[] = new int[15];
        int B[] = new int[15];
        int n;
        int con = 0, con2 = 0;
//--------------------------------------------------------------------------------------------
//creo un siclo que me permita insertar los datos para el conjunto A
        do {

            System.out.println("Digite un elemento para el conjunto A");
            A[con++] = leer.nextInt();

            System.out.println("Desea agregar un nuevo numero \n Si = 1 \n No = 0");
            n = leer.nextInt();
        } while (n == 1 && con < 15);
        System.out.println("los elementos digitados en A son:");
        for (int i = 0; i < con; i++) {
            System.out.println(A[i]);

        }
// mismo siclo para B
        System.out.println("");
        do {
            System.out.println("Digite un elemento para el conjunto B");

            B[con2++] = leer.nextInt();

            System.out.println("Desea agregar un nuevo numero \n Si = 1 \n No = 0");
            n = leer.nextInt();
        } while (n == 1 && con2 < 15);
        System.out.println("los elementos digitados en B son:");
        for (int i = 0; i < con2; i++) {
            System.out.println(B[i]);
        }
        //----------------------------------------------------------------------------------------------           
        //creo un arreglo donde muestre la union de los conjuntos 
        System.out.println("");
        int[] U = union(A, B, con, con2);
        System.out.println("La union de los dos Conjuntos A y B");
        for (int i = 0; i < U.length; i++) {
            System.out.println(U[i]);
        }
        // Vamos a mostrar la intersecion
        System.out.println("");
        int[] I = intersecion(A, B, con, con2);
        System.out.println("Los elementos de la intersecion A sub B son:");
        for (int i = 0; i < I.length; i++) {
            System.out.println(I[i]);
        }
        //vamos a mostrar la diferencia simetrica
        System.out.println("");
        int[] D = diferenciaSimetrica(A, B, con, con2);
        System.out.println("La diferencia simetrica de A sub B es de: ");
        for (int i = 0; i < D.length; i++) {
            System.out.println(D[i]);
        }

        //vamos a mostrar si un numero pertenece a los conjuntos 
        System.out.println("");
        System.out.println("Digite un numero para determinar si existe en los conjuntos");
        int elemento = leer.nextInt();
        //Vamos a mostrar Pertenece 
        boolean P = pertenece(A, B, elemento, con, con2);
        if (P == true) {
            System.out.println("El elemento " + elemento + " hace parte de los conjuntos ");
        } else {
            if (P == false) {
                System.out.println("El elemento " + elemento + " No pertenece a ningun conjunto");
            }

        }

        //vamos a mostrar si el conjunto B esta incluido en A o No
        System.out.println("");
        boolean S = incluido(A, B, con, con2);
        if (S == true) {
            System.out.println("El conjunto B esta incluido en A");
        } else {
            System.out.println("El conjunto B " + "No" + " esta incluido en A");
        }

    }
    // este metodo me busca los elementos repetidos 

    public static boolean exist(int[] conjunto, int elemento) {
        boolean exist = false;
        for (int i = 0; i < conjunto.length; i++) {
            if (conjunto[i] == elemento) {
                exist = true;
            }
        }
        return exist;

    }

    // este conjunto me hace la union a.union(b)
    public static int[] union(int[] A, int[] B, int con, int con2) {
//las variables con y con2 son referencia a los dos contadores de los conjuntos 
        int[] U = new int[con + con2];
        for (int i = 0; i < con; i++) {
            U[i] = A[i];
        }
        int x = 0;
        int r = 0;
        for (int i = 0; i < con2; i++) {
            if (exist(U, B[i]) == false) {
                U[con + x] = B[i];
                x++;
            } else {
                r++;
            }

        }
        int[] aux = U;
        U = new int[aux.length - r];
        for (int i = 0; i < U.length; i++) {
            U[i] = aux[i];
        }
        return U;

    }
//------------------------------------------------------------------------------    
    // creamos el metodo que me permita ver la intersecion del conjunto a.(b)

    public static int[] intersecion(int[] A, int[] B, int con, int con2) {
        int c = 0;
        int x = 0;

        for (int i = 0; i < con; i++) {
            if (exist(B, A[i]) == true) {
                c++;
            }
        }
        int[] I = new int[c];
        for (int i = 0; i < con; i++) {
            if (exist(B, A[i]) == true) {
                I[x] = A[i];
                x++;
            }

        }
        return I;
    }
//-----------------------------------------------------------------------------    
    // en esta metodo vamos a mostrar la diferencia simetrica 
    // los numeros de A que no pertenecn a A

    public static int[] diferenciaSimetrica(int[] A, int[] B, int con, int con2) {
        int[] U = union(A, B, con, con2);

        int x = 0;
        int[] D = new int[U.length - con2];
// aca hacemos la diferencia simetrica A.B  
        for (int i = 0; i < D.length; i++) {
            if (exist(B, U[i]) == false) {
                D[x] = U[i];
                x++;
            }
        }

        return D;

    }

    //------------------------------------------------------------------------------    
    //Este metodo Me permite determinar si un elemento Pertence a un conjunto
    public static boolean pertenece(int[] A, int[] B, int elemento, int con, int con2) {
        //buscar el elemento digitado y decir si pertenece aun un conjunto 
        // me parece mas practico si se dice si el numero esta en alguno de los 2 conjuntos que decir en A solo

        int[] U = union(A, B, con, con2);
        boolean P = false;
        for (int i = 0; i < U.length; i++) {
            if (elemento == U[i]) {
                P = true;
            }

        }

        return P;

    }
//------------------------------------------------------------------------------   
    //metodo incluido 

    public static boolean incluido(int[] A, int[] B, int con, int con2) {
        // se busca si los elementos de B se parecen a A y si lo esta me aumente un contador
        //despues comparo si los elementos repetidos son iguales al conjunto B significa que B esta en A
        int x = 0;
        boolean S = false;
        for (int i = 0; i < con2; i++) {
            if (exist(B, A[i]) == true) {

                x++;

            }
        }
        if (con2 == x) {
            S = true;
        }
        return S;
    }

}
