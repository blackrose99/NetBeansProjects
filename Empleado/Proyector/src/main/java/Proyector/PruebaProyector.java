package proyector;
import java.util.Scanner;
public class PruebaProyector{
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        //variables
        int i,op,cod,año_com,cont,x;
        String marca; 
        boolean encontrado;
        //vector de tipo proyector
        Proyector P[]=new Proyector[100];
        P[0]=new Proyector (1234, "Sony", 2019, true);//esta prestado
        P[1]=new Proyector (3425, "LG", 2017, false);//esta disponible
        P[2]=new Proyector (45442, "Epson", 2017, true);
        P[3]=new Proyector (86859, "Sony", 2020, false);
        cont=4;      
        do{
                System.out.println("MENU DE OPCIONES");
                System.out.println("1. INGRESAR DATOS DE UN NUEVO PROYECTOR. ");
                System.out.println("2. CONSULTAR DATOS DE UN PROYECTOR POR EL CODIGO. ");
                System.out.println("3. PRESTAR UN PROYECTOR. ");
                System.out.println("4. DEVOLVER UN PROYECTOR. ");
                System.out.println("5. LISTADO DE PROYECTORES ORDENADO POR MARCA. ");
                System.out.println("0. SALIR DEL MENU. ");
                System.out.println("\n INGRESE SU OPCION:  ");
                op=entrada.nextInt();
                
                
                
                
                
                
                switch(op){
                    case 1:System.out.println("Ingrese el codigo del proyector: ");
                    cod=entrada.nextInt();
                    boolean repetido=false;
                    for(i=0;i<cont;i++){
                        if(P[i].codigo==cod){
                         repetido=true;
                            
                        }
                    }
                      if(repetido)
                                System.out.println("El codigo " + cod + " ya está asignado");
                            else
                            {
                                  System.out.println("Ingrese la marca del proyector: ");
                                marca=entrada.next();
                                System.out.println("Ingrese el año de compra: ");
                                año_com=entrada.nextInt();
                                P[cont]= new Proyector(cod,marca,año_com,false);
                                cont++;
                            }
                      break;
                      
                      
                      
                      
                      
                      
                      
                      
                      
                      
                      
                      
                       case 2: System.out.println("Ingrese el codigo del proyector a buscar: ");
                            cod=entrada.nextInt();
                            encontrado=false;
                            for(i=0;i<cont;i++){
                                if(P[i].codigo==cod){
                                    encontrado=true;
                                    System.out.println(P[i].mostrarDatos());
                                    i=cont;
                                }
                            }
                            if(!encontrado)
                               System.out.println("El codigo "+cod + " no existe");
                            break;
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                       case 3: System.out.println("Ingrese el codigo del proyector a prestar: ");
                            cod=entrada.nextInt();
                            encontrado=false;
                            for(i=0;i<cont;i++){
                                if(P[i].codigo==cod){
                                    encontrado=true;
                                    P[i].prestar();
                                    i=cont;
                                }
                            }
                            if(!encontrado)
                               System.out.println("El codigo "+cod + " no existe");
                           
                            break; 
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                              case 4: System.out.println("Ingrese el codigo del proyector que va a devolver: ");
                              cod=entrada.nextInt();
                         boolean disponible=false;
                         for(i=0;i<cont;i++){
                             if(P[i].codigo==cod){
                                 disponible=true;
                               P[i].devolver();
                               i=cont;
                          
                             }
                             
                         }
                         if(disponible!=true)
                               System.out.println("no se puede resivir el proyector por que el: " + cod + " no esta registrado");
                         else
                         {
                          System.out.println("se ha devuelto el proyector con el codigo: " + cod + " correctamente");
                         }
                       break;
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                         case 5:System.out.println("Proyectores ordenados por su respectiva marca: ");
                           Proyector aux;
                           for(i=0;i<(cont-1);i++){
                               for(x=(i+1);x<cont;x++){
                                   if (P[i].marca.compareTo(P[x].marca)>0){
                                           aux= P[i];
                                             P[i]=P[x];
                                             P[x]=aux;
                                   }
                               }
                                    
                                }
                            for( i = 0; i <cont; i++) {
                          System.out.println(P[i].marca);
                            }     
                           
                         
                          
                }
            
        
    }while(op!=0);
    }
    
    
}



    