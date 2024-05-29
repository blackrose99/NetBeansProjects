package Parcial_A;

import java.util.Scanner;

public class Main {
    /*
    public static int[] increaseSize(int[] v)
    {
        int[] newArr = new int[v.length + 1];//Creating a new array with space for an extra element
        for(int i = 0; i < v.length; i++)
        {
            newArr[i] = v[i];//Copying the elements to the new array
        }
        return newArr;
    }
    */
    public static void main(String[] args) {
        int opcion;
        Scanner SC = new Scanner(System.in);
        System.out.println("Ingrese 1 para entrar al sistema");
        int n=SC.nextInt();
        
        VectorEQUIPOS e = new VectorEQUIPOS(n);
        
        boolean salir = false;

        while(!salir){
            System.out.println("1. Crear Equipo");
            System.out.println("2. Listar sin ordenar");
            System.out.println("3. Ordenar por Campeonatos");
            System.out.println("4. Listar ordenado");
            System.out.println("5. Buscar por Campeonatos Ganados");
            System.out.println("6. Salir");

            System.out.println("Digite un número");
            opcion=SC.nextInt();
            
            
            switch(opcion){
            case 1:
            System.out.println("Cuantos Equipos Quiere Crear?");
            n=SC.nextInt();
            System.out.println("Generando/Creando un Equipo....");
            e.generar();
            System.out.println(e.toString());
            break;

            case 2:
            for(int i=0;i<e.v.length;i++){
                System.out.println(e.v[i]);
            }
            break;

            case 3:
            e.ordenacionQuicksort(e.v, 0, e.v.length-1);
            System.out.println(e.toString());
            break;

            case 4:

            break;

            case 5:

            break;

            case 6:
            salir = true;
            break;

            default:
                System.out.println("Las Opciones son entre 1 y 6");
            }
        }
    }
}
    
/*
        System.out.println("*** 1. Generando datos Aleatorios");
        e.generar();
        
        System.out.println("*** 2. Datos generados");
        System.out.println(e.toString());
        
        
        System.out.println("*** 3. Ordenando Datos");     
        e.ordenacionQuicksort(e.v, 0, e.v.length-1);
        System.out.println("\n\n");
        
        System.out.println("*** 4. Datos Ordenados Por Ventas");
        System.out.println(e.toString());*/