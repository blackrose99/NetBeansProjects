
package paquete;


public class operaciones {
    
            private static int resultado;

            public static int Suma(int n1, int n2) {
                resultado = n1 + n2;
                return resultado;
            }

            public static int Resta(int n1, int n2) {
                resultado = n1 - n2;
                return resultado;
            }

            public static int Multiplicacion(int n1, int n2) {
                resultado = n1 * n2;
                return resultado;
            }

            public static int Division(int n1, int n2) {
                if (n2 != 0) {
                    resultado = n1 / n2;

                }
                return resultado;
            }
}
