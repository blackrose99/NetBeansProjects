package listas;

import java.util.Scanner;


import java.util.Date;

public class clase_Main {
 static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        clase_Lista clase = new clase_Lista();
        String limpiar;
      
        int opcion = 0;
        do {
            System.out.println("--Menu de Opciones--\n"
                    + "1. Insertar datos de vehiculos al principio\n"                    
                    + "2. Insertar datos de vehiculos al final\n"
                    + "3. Mostrar Lista de vehiculos inicio a fin\n"
                    + "4. Mostrar Lista de vehiculos fin a inicio\n"
                    + "5. Insertar un vehiculos despues del uno en especifico\n"
                    + "6. Insertar un vehiculos antes del uno en especifico\n"
                    + "7. Buscar un vehiculo por su placa \n"
                    + "8. Actualizar valores de un vehiculo \n"
                    + "9. Eliminar un vehiculo por su placa \n"
                    + "10.Ordenar vehiculos al momento de insertar \n"
                    + "11. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    clase.agregarAlInicio(automatic());
                    break;
                case 2:
                    clase.agregarAlFinal(automatic());
                    break;
                case 3:
                    clase.mostrarListaIniciofFin();
                    break;
                case 4:
                    clase.mostrarListaFinInicio();
                    break;
                case 5:
                    System.out.println("Indique el nodo en el que quiere colocar un elemento adelante");
                    limpiar = sc.nextLine();
                    int nodoIntemedio = sc.nextInt();
                    clase.InsertarEntreDos(nodoIntemedio, automatic());
                    break;
                case 6:
                    System.out.println("Indique el nodo en el que quiere colocar un elemento antes");
                    limpiar = sc.nextLine();
                    int nodoIntemedio3 = sc.nextInt();
                    clase.InsertarAntesDeUnNodo(nodoIntemedio3, automatic());
                    break;
                case 7:
                    System.out.println("Ingrese la placa del carro a buscar");
                    limpiar = sc.nextLine();
                    String index = sc.nextLine();
                    clase.BuscarPorPlaca(index);
                    break;
                case 8:
                    System.out.println("Ingrese el Indice del nodo a actulizar");
                    int ind = sc.nextInt();
                    System.out.println("---------------------------------------------");
                    System.out.println("Ingrese la nueva placa para este carro: ");
                    limpiar = sc.nextLine();
                    String plac4 = sc.nextLine();
                    System.out.println("Ingrese el nuevo modelo para este carro: ");
                    int modelo4 = sc.nextInt();
                    System.out.println("Ingrese el cilindraje actulizado para este carro: ");
                    int cilindraje4 = sc.nextInt();
                    limpiar = sc.nextLine();
                    System.out.println("Ingrese la marca actulizada para este carro: ");
                    String marca4 = sc.nextLine();
                    clase.actualizarNodo(plac4, modelo4, cilindraje4, marca4, ind);
                    System.out.println("---------------------------------------------");
                    break;
                case 9:
                    System.out.println("Ingrese la placa del carro que quiere eliminar");
                    limpiar = sc.nextLine();
                    String valorAEliminar = sc.nextLine();
                    clase.eliminarNodos(valorAEliminar);
                    break;
                case 10:
                    System.out.println("---------------------------------------------");
                    System.out.println("Registrar Carros de forma Ordenada por su Fecha");
                    clase.ordenacion(automatic());
                    break;
            }
        } while (opcion != 11);

    }
    public static Class_Object automatic() {
        String limpiar;
        System.out.println("---------------------------------------------");
        System.out.println("Ingrese la Placa del nuevo Vehiculo: ");
        limpiar = sc.nextLine();
        String placa = sc.nextLine();
        System.out.println("Ingrese el Modelo del nuevo Vehiculo: ");
        int modelo = sc.nextInt();
        System.out.println("Ingrese el Cilindraje del nuevo Vehiculo: ");
        int cilindraje = sc.nextInt();
        limpiar = sc.nextLine();
        System.out.println("Ingrese la Marca del nuevo Vehiculo: ");
        String marca = sc.nextLine();
        System.out.println("Ingrese el dia en que compro el Vehiculo: ");
        int dia = sc.nextInt();
        System.out.println("Ingrese el mes en que compro el Vehiculo:");
        int mes = sc.nextInt();
        mes = mes -1;
        System.out.println("Ingrese el año en que compro el Vehiculo: ");
        int anio = sc.nextInt();
        anio = anio - 1900;
        Date fecha = new Date(anio,mes,dia);
   
        
        System.out.println("---------------------------------------------");
        
        Class_Object obj = new Class_Object(placa,modelo,cilindraje,marca, fecha);
        return obj;
    }
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//     
//    public static String retornarFecha(Date fecha){
//        SimpleDateFormat  fec = new SimpleDateFormat("dd/MM/YYYY");
//        return fec.format(fecha);
//    }
//    
//        public static void cargandoFecha(int dia, int mes, int año){
//        calen.set(año,mes,dia);
//    }
//    
//    
//        public static Date getDateCalendar(){
//        return calen.getTime();
//    }
//    
    
    
}
