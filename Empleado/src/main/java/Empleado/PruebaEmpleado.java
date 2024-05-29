 /*
 * Clase de prueba con el método principal
 */
package empleado;


import java.util.Scanner;
public class PruebaEmpleado {
    public static void main(String[] args){
        int i,j,n,op;
        String doc,nom;
        double sueldo,p,acum,b;
        boolean encontrado;
        int ant;
        Scanner entrada= new Scanner (System.in);
        System.out.println("Ingrese el numero de elementos del vector: ");
        n=entrada.nextInt();
        
        Empleado E[]= new Empleado[n];
        //Llenar unas casillas con datos de prueba
        E[0]=new Empleado("232323","JUAN CARLOS DIAZ", 3000000, 12);
        E[1]=new Empleado("454545","DIANA MARCELA PEREZ",4500000, 3);
        E[2]=new Empleado("2020202","LUIS TORRES", 4200000, 8);
        int ct=3 ;  // contador de casillas llenas del vector
        do{
         //Menu de opciones con el vector
        
        System.out.println("\n MENU DE OPCIONES");      
        System.out.println("1. Agregar un nuevo empleado");
        System.out.println("2. Consultar los datos de un empleado por el documento");
        System.out.println("3. Actualizar el sueldo");
        System.out.println("4. Calcular la bonificación total");
        System.out.println("5. Listado de empleados");
        System.out.println("6. Listado de empleados con antiguedad superior a 10 años ");
        System.out.println("7. Encontrar empleado con mayor sueldo");
        System.out.println("0. SALIR DEL MENU");
        System.out.println("\n Ingrese su opcion: ");
        op=entrada.nextInt();
        switch(op){
            case 1: System.out.println("Ingrese el documento de identidad del empleado: ");
                    doc=entrada.next();
                    String limpiar = entrada.nextLine(); //limpiar la entrada de datos
                    System.out.println("Ingrese el nombre del empleado: ");
                    nom=entrada.nextLine();
                    System.out.println("Ingrese el sueldo del empleado: ");
                    sueldo= entrada.nextDouble();
                    System.out.println("Ingrese la antiguedad en años del empleado: ");
                    ant= entrada.nextInt();
                    E[ct]=new Empleado(doc,nom,sueldo,ant);
                    ct++;
                    break;
            case 2: System.out.println("Ingrese el documento de identidad del empleado a consultar: ");
                    doc=entrada.next();
                    for(i=0;i<ct;i++){
                        if(E[i].documento.equals(doc)){
                            System.out.println(E[i].mostrarDatos());
                            encontrado = true;
                            i=ct; //forzar la salida del ciclo
                        }
                    }
                    encontrado=false; //se usa para saber si el documento se encuentra 
                    
                    if (!encontrado)
                       System.out.println("El documento " + doc + " no existe");
                    
                    break;
            case 3: System.out.println("Ingrese el documento de identidad del empleado a modificar el sueldo: ");
                    doc=entrada.next();
                    System.out.println("Ingrese el porcentaje de incremento: ");
                    p=entrada.nextDouble();
                    encontrado=false; //se usa para saber si el documento se encuentra 
                    for(i=0;i<ct;i++){
                        if(E[i].documento.equals(doc)){
                            E[i].modificarSueldo(p);
                            encontrado = true;
                            i=ct; //forzar la salida del ciclo
                        }
                    }
                    if (!encontrado)
                       System.out.println("El documento " + doc + " no existe");
                    
                    break;
                
            case 4: acum=0;
                    for(i=0;i<ct;i++){
                        b=E[i].bonificacion();
                        System.out.println(E[i].nombre + " Valor de la Bonificación: "+ b);
                        acum=acum+b;
                    }
                    System.out.println("El total pagado por bonificaciones es: "+acum);
                    break;
            case 5: System.out.println("\nLISTADO ORDENADO DE EMPLEADOS");
                    Empleado aux;
                    for(i =0   ; i <(ct-1) ;i++ )   {
                      for(j= i+1 ; j < ct    ;j++  )  {
                         if(E[i].nombre.compareTo(E[j].nombre)>0){
                            aux=E[i];
                            E[i]=E[j];
                            E[j]=aux;
                          } 
                      }
                    }
                    for(i=0;i<ct;i++){
                       System.out.println(E[i].documento+"\t"+E[i].nombre);}
            
                    break;  
            case 6: System.out.println("\nLISTADO DE EMPLEADOS CON ANTIGUEDAD SUPERIOR A 10 AÑOS: ");
                    for(i=0;i<ct;i++){
                        if(E[i].antiguedad>10){
                            System.out.println(E[i].nombre + " Antiguedad: "+ E[i].antiguedad);
                        }
                    }
                    break;
       
            case 7:  double mejorsueldo=0;
                     int pm=0;  //posicion del mejor sueldo
                    for(i=0;i<ct;i++){
                        if(E[i].sueldo >mejorsueldo){
                            mejorsueldo=E[i].sueldo;   
                            pm= i;
                        }
                     }
                    System.out.println("El mejor sueldo es: "+mejorsueldo+ " del empleado: "+E[pm].nombre );
                
        }
        
        }while(op!=0);
    }
    
}

