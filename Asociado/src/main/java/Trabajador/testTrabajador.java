/*
Clase PruebaAsociado para probar  la clase Asociado, crear objetos de la clase 
Asociado y los métodos de dicha clase
 */
package Trabajador;


import java.util.Scanner;
public class testTrabajador {
     public static void main(String[] args) {
         Trabajador t = new Trabajador();
         int opc,k,i, libranza;
         double d,r,salario=0,cedula;
         String nombre,limpiar, departamento,nuevoder;
         Scanner entrada=new Scanner(System.in);
         Trabajador A[]=new Trabajador[100];
         k=0;

         String[] depar = new String[100];
         int ventas=0, sistemas=0, contabilidad=0;
         depar[0]="ventas";
         depar[1]="sistemas";
         depar[2]="contabilidad";

         do{
             System.out.println("\t\tMENU");
             System.out.println("\t1. Agregar un trabajador ");
             System.out.println("\t2. actulizar salario");
             System.out.println("\t3. Mostrar trabajador por la cedula");
             System.out.println("\t4. Aplicar la libranza a un trabajador");
             System.out.println("\t5. Cambiar nombre al departamento");
             System.out.println("\t6. Mostrar Cantidad de trabajadores en cada departamento");
             System.out.println("\t7. Salir.");
             System.out.println("\n\tIngrese su Opcion: ");
             opc=entrada.nextInt();

             switch (opc) {
                 case 1:
                     System.out.println("Ingrese documento de identidad:");
                     cedula = entrada.nextDouble();
                     limpiar = entrada.nextLine();
                     System.out.println("Ingrese nombre del Trabajador:");
                     nombre = entrada.nextLine();
                     System.out.println("Ingrese el salario del trabajador:");
                     salario = entrada.nextDouble();
                     System.out.println("Ingrese su departamento");
                     departamento = entrada.next();
                     if (depar[0].equals(departamento)) {
                         depar[0] = departamento;
                         ventas++;
                     } else if (depar[1].equals(departamento)) {
                         depar[1] = departamento;
                         sistemas++;
                     } else if (depar[2].equals(departamento)) {
                         depar[2] = departamento;
                         contabilidad++;
                          limpiar = entrada.nextLine();
                         }else {System.out.println("Departamento incorrecto");
                         break;
                     }
                         System.out.println("Ingrese la libranza:");
                         libranza = entrada.nextInt();
                         A[k] = new Trabajador(cedula, nombre, salario, departamento, libranza);
                         k++;

                     
                       
                     
                     break;
                 case 2:
                     System.out.println("Ingrese el documeto de identidad");
                     cedula = entrada.nextInt();
                     boolean enco = false;
                     for (int j = 0; j < k; j++) {
                         if (A[j].cedula == cedula) {
                             enco = true;
                             A[j].actualizarSalario();
                             j = k;


                        }
                      }if(!enco){
                          System.out.println("Este documento no ese encuetra registrado");
                      }
              
                    break;

                    
                 case 3: 
                     System.out.println("Ingrese el documento del Empleado");
                     cedula=entrada.nextInt();
                     boolean encont=false;
                     for (int l = 0; l < k; l++) {
                         if(A[l].cedula==cedula){
                             encont=true;
                             System.out.println( A[l].toString());
                             l=k;
                         }
                     }if(!encont){
                         System.out.println("Este documento no ese encuetra registrado");
                     }
                     
                     break;
                     
                     
                 case 4:
                 System.out.println("Ingrese el documento del Empleado");
                     cedula=entrada.nextInt();
                     boolean encontr=false;
                     for (int y = 0; y < k; y++) {
                         if(A[y].cedula==cedula){
                             encontr=true;
                            A[y].AsignarLibranza();
                             y=k;
                         }
                     }if(!encontr){
                         System.out.println("Este documento no ese encuetra registrado");
                     }

                     break;
                     

                 case 5:
                     
                     

                     
                     
                     System.out.println("Ingrese el departamento a modificar");
                     departamento=entrada.next();
                     
                     boolean mofi=false;
                     for(int w = 0;w < depar.length ;w++){
                         if(depar[w].equals(departamento)){
                             System.out.println("Ingrese el nuevo departamento");
                            String f= depar[w]=entrada.next();
                       
                             mofi=true;
                         }
                     }if(mofi==false){
                         System.out.println("Departamento no encontrado");
                     }
                     
                     
                     
                      
//                                 
//                      boolean mof=false;
//                     for (int ñ = 0; ñ < k; ñ++) {
//
//                         if (A[ñ].departamento.equals(departamento)) {
//                             System.out.println("Confirme su departamento");
//                             A[ñ].departamento=entrada.next();
//                             ñ=k;
//                             mof = true;
//
//                         }
//                     }
//                     if (mof == false) {
//                         System.out.println("Departamento no encontrado");
//                     }
//
//                     
//                     
                     
                     
                     
                     
                     
                     
                     break;
                     
      
                     
                 case 6:
                     System.out.println("Departamentos y cantidad de personal");
                     System.out.println(depar[0] + " = " + ventas);
                     System.out.println(depar[1] + " = " + sistemas);
                     System.out.println(depar[2] + " = " + contabilidad);
                     break;
             }            
        }while (opc!=7);
         
          
     }
 



}
