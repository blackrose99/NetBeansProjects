package Quick;

import java.util.Arrays;
import java.util.Scanner;
public class main_Quicksort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int cantidad;
         String limpiar;
        System.out.println("Ingrese la cantidad de alumnos");
        cantidad = sc.nextInt();
        class_Object arreglo[] = new class_Object[cantidad];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese la identificacion del " + (i + 1) + " alumno");
            int id = sc.nextInt();
               limpiar = sc.nextLine();
            System.out.println("Ingrese el nombre del " + (i + 1) + " alumno");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el apellido del " + (i + 1) + " alumno");
            String apellido = sc.nextLine();
            System.out.println("Ingrese la nota Final del " + (i + 1) + " alumno");
            double nota = sc.nextDouble();
            
            System.out.println("\n");
            arreglo [i] = new class_Object(id,nombre,apellido, nota);
        }

        
        System.out.println("Lista por nombres de alumnos Desordenada: " + "\n" + Arrays.toString(arreglo));
    Metodos algoritmo = new Metodos();
        algoritmo.ordenar(arreglo);

        System.out.println("Lista por nombres de alumnos Ordenada: " + "\n" + Arrays.toString(arreglo));

    }
}
