package ex_5_4;
import java.util.Arrays;
import java.util.Scanner;
public class ex_5_4 {
     static int notas[][];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        System.out.println("Cuantos Grupos quiere registrar");
        int almacenar = sc.nextInt();
        notas = new int[almacenar][]; 
        
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("¿En el grupo " + (i + 1) + " cuantos alumnos hay?");
            int grupos = sc.nextInt();
            notas[i] = new int[grupos];
            
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Ingrese las notas del estudiante " + (j + 1) + " del Grupo " + (i + 1));
                notas[i][j] = sc.nextInt();
                
                
                while (notas[i][j] >= 11) {
                    System.out.println("Nota fuera de Rango");
                    System.out.println("Ingrese las notas del estudiante " + (j + 1) + " del Grupo " + (i + 1));
                    notas[i][j] = sc.nextInt();
                }
            }
        }
        System.out.println("\n Rangos de Calificaciones: \n [0,5]  Insuficiente \n [5,7]  Aprovado \n [7,9]  Notable \n [9,10]  Excelente \n");
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                imprecion(i, j);

            }
        }
    }

    public static void imprecion(int i, int j) {
        if (notas[i][j] == 0 || notas[i][j] == 1 || notas[i][j] == 2 || notas[i][j] == 3 || notas[i][j] == 4) {
            System.out.println("El grupo " + (i + 1) + " con el Estudiante " + (j + 1) + " su nota es INSUFICIENTE");

        } else if (notas[i][j] == 5 || notas[i][j] == 6) {
            System.out.println("El grupo " + (i + 1) + " con el Estudiante " + (j + 1) + " su nota es APROBADO");

        } else if (notas[i][j] == 7 || notas[i][j] == 8) {
            System.out.println("El grupo " + (i + 1) + " con el Estudiante " + (j + 1) + " su nota es NOTABLE");

        } else if (notas[i][j] == 9 || notas[i][j] == 10) {
            System.out.println("El grupo " + (i + 1) + " con el Estudiante " + (j + 1) + " su nota es EXCELENTE");
        }

    }
}
    


    

