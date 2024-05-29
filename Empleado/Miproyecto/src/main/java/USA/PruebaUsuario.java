
package USA;

import javax.swing.JOptionPane;

public class PruebaUsuario {
    public static void main(String[] args) {
        ListaUsuario usuarioList = new ListaUsuario ();
       ListaTrabajadores listatra = new  ListaTrabajadores();
       ListaAreas lisar=new ListaAreas();
       
      int opc,cedula,edad,celular,codigo_area=0,codigo_t,capacidad_max,cantida_actu,cod;
      double temper=0;
      String hora_salida,nombre,fecha_entrada,fecha_salidad,hora_entrada,motivo_entrada,cargo,clave_acceso,nombre_area;
      
      Areas Ar1=new Areas("Atención al Cliente",2,1,1);
      lisar.agregarArea(Ar1);
      Areas Ar2=new Areas("Comunicaciones",3,2,2);
      lisar.agregarArea(Ar2);
      Areas Ar3=new Areas("Gestion,Planificacion y Estrategia de Servicio",3,3,1);
      lisar.agregarArea(Ar3);
      Areas Ar4=new Areas("Control de Riesgos",2,4,1);
      lisar.agregarArea(Ar4);
      Areas Ar5=new Areas("Negocios y Aplicaciones Empresariales",3,5,2);
      lisar.agregarArea(Ar5);
      Areas Ar6=new Areas("Sistema e Infraestructura",2,6,1);
      lisar.agregarArea(Ar6);
      Areas Ar7=new Areas("Desarrollo y Nuevas Tecnologias",1,7,0);
      lisar.agregarArea(Ar7);

   Trabajadores T1 = new Trabajadores("Vigilante",1234,"77777",3,20.6,"Alejandro Araque",87543828,90,30475868,"Trabajar","23/11/2019","36:30");
   listatra.agregarTrabajador(T1);
      Usuario A1 = new Usuario(1,34.6,"Carlos Caceres",128389328,32,32178489,"colsulta","23/11/2019","36:30");
      usuarioList.agregarUsuario(A1);
     Usuario A2 = new Usuario(2,36.6,"Camilo serrano",1283894588,19,3224489,"colsulta","17/12/2021","8:30");
     usuarioList.agregarUsuario(A2);
      Usuario A3 = new Usuario(3,34.1,"Marlos molina",43383434,24,3227466,"preguntas","31/09/2017","2:30");
      usuarioList.agregarUsuario(A3);
      Usuario A4 = new Usuario(2,35.8,"Paola peres",1283242342,18,32178489,"colsulta","07/10/2018","8:30");
      usuarioList.agregarUsuario(A4);
      Usuario A5 = new Usuario(5,34.0,"Maria peña",12234242,44,32178489,"colsulta","10/02/2011","7:30");
      usuarioList.agregarUsuario(A5);
      Usuario A6 = new Usuario(6,35.1,"Carlos Caceres",1235345328,76,32123289,"colsulta","24/11/2012","3:30");
     usuarioList.agregarUsuario(A6);
      Usuario A7 = new Usuario(5,37.1,"Martha Lozano",34328389,23,32212389,"colsulta","12/05/2013","3:30");
      usuarioList.agregarUsuario(A7);
      Usuario A8 = new Usuario(2,33.9,"Predro Peres",102443893,65,3214349,"colsulta","02/02/2012","3:30");
      usuarioList.agregarUsuario(A8);
        do {            
             opc=Integer.parseInt(JOptionPane.showInputDialog("MENU DE ACCIONES"+
                                "\n 1. Agregar un Usuario a la base de datos"+
                                "\n 2. Mostrar lista de empleados"+
                                "\n 3. Retirar un Usuario"+
                                "\n 4. Buscar una persona por filtro"+
                                "\n 5. Registro de ingreso de un trabajador"+
                                "\n 6. Salir del programa"+
                                "\n\n Por favor Ingrese su eleccion: "));
             if(opc>=7 || opc<1){
                 JOptionPane.showMessageDialog(null, "Elija bien su Opción ", "",JOptionPane.ERROR_MESSAGE); 
             }else
             switch(opc){
                 case 1:
                     
                     cod=Integer.parseInt(JOptionPane.showInputDialog("Muy Buenos Dias a que Area se Dirije: "+
                                "\n 1. Atención al Cliente"+
                                "\n 2. Comunicaciones"+
                                "\n 3. Gestion,Planificacion y Estrategia de Servicio"+  
                                "\n 4. Control de Riesgos"+
                                "\n 5. Negocios y Aplicaciones Empresariales"+
                                "\n 6. Sistema e Infraestructura"+ 
                                "\n 7. Desarrollo y Nuevas Tecnologias"+
                                "\n 8. salir al Menu"+
                                "\n\n ingrese una opcion")); 
                          if(cod>=9){
                              
                              JOptionPane.showMessageDialog(null," Codigo de Area Incorrecto ", "",JOptionPane.ERROR_MESSAGE);
                          }else
                                   
                          if(lisar.cantidaar(cod)){
                            JOptionPane.showMessageDialog(null,"  B i e n v e n i d o " );
                              
                              
                              
                              
                         temper=Double.parseDouble(JOptionPane.showInputDialog("Ingrese su Temperatura Corporal"));
                         if(temper<38.0) {
                             
                          JOptionPane.showMessageDialog(null, "Temperatura Aceptable puede seguir llenando sus Datos");   

                         nombre=JOptionPane.showInputDialog("Ingrese su Nombre");
                         cedula=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Cedula"));
                         edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Edad"));
                         celular=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Numero de Telefono"));
                         
                        
                         motivo_entrada=JOptionPane.showInputDialog("Cual es su motivo de entrada");
                         fecha_entrada=JOptionPane.showInputDialog("Escriba la flecha de Entrada");
                         hora_entrada=JOptionPane.showInputDialog("Escriba la hora de Entrada");

                         JOptionPane.showMessageDialog(null," Usuario " +nombre+ " Registrado Correctamente");
                         Usuario U= new Usuario(cod,temper,nombre,cedula,edad,celular,motivo_entrada,fecha_entrada,hora_entrada);
                         usuarioList.agregarUsuario(U);
                         
                          }else lisar.disminu(temper); 
                         
                           }else  lisar.nodejapa(cod);  
                           
                         break;
                 case 2: listatra.Listaemple();
                         break;           
                 case 3:cedula=Integer.parseInt(JOptionPane.showInputDialog(" Ingrese la cedula del Usuario a Retirar "));
                        usuarioList.eleiminarpro(cedula); 
                        break;
                 case 4:
                     int op;
                     do{op=Integer.parseInt(JOptionPane.showInputDialog("Menu de Filtros: "+
                     "\n 1. Buscar por Cedula"+
                     "\n 2. Buscar por Nombre"+
                     "\n 3. Buscar por Area"+ 
                     "\n 4. Usuarios Ordenados Alfabeticamente "+        
                     "\n 5. Usuarios Ordenados por la cedula"+     
                     "\n 6. Usuarios Ordenados por motivo de entrada"+        
                     "\n 7. Usuarios Ordenados por el cog del Area"+
                     "\n 8. salir al Menu"+
                     "\n\n ingrese una opcion"));
                     
                     switch(op){
                         case 1:cedula=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula "));
                         usuarioList.BuscarCedula(cedula);
                         
                         break;
                         case 2:nombre=JOptionPane.showInputDialog("Ingrese el Nombre");
                         usuarioList.BuscarNombre(nombre);
                         break;
                          
                         case 3:
                         
                     
                             codigo_area=Integer.parseInt(JOptionPane.showInputDialog("En cual area quiere consultar a la Persona: "+
                                "\n 1. Atención al Cliente"+
                                "\n 2. Comunicaciones"+
                                "\n 3. Gestion,Plnificacion y Estrategia de Servicio"+  
                                "\n 4. Control de Riesgos"+
                                "\n 5. Negocios y Aplicaciones Empresariales"+
                                "\n 6. Sistema e Infraestructura"+ 
                                "\n 7. Desarrollo y Nuevas Tecnologias"+
                                "\n 8. salir al Menu"+
                                "\n\n ingrese una opcion"));
                             
                                 if(codigo_area>=9){
                             JOptionPane.showMessageDialog(null,"  Area no Existente " , "",JOptionPane.ERROR_MESSAGE); 
                             }else
                         usuarioList.BuscarArea(codigo_area);
                         break;
                         
                         case 4:
                             
                       usuarioList.ordealfa();
                             
                         break;

                        case 5:
                             
                       usuarioList.ordencedu();
                             
                         break;
                           case 6:
                             
                       usuarioList.ordemotivo();
                             
                         break;
                          case 7:
                             
                       usuarioList.ordenporcogarea();
                             
                         break;  
                         
                     } 

                     }while(op!=8);
   
                   break;
                 case 5:
                     cargo=JOptionPane.showInputDialog("Ingrese el Cargo que tiene en la empresa");
                     codigo_t=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Codigo"));
                     clave_acceso=JOptionPane.showInputDialog("Dijite su Clave de Acceso");
                    cod=Integer.parseInt(JOptionPane.showInputDialog("Muy Buenos Dias a que Area se Dirije: "+
                                "\n 1. Atención al Cliente"+
                                "\n 2. Comunicaciones"+
                                "\n 3. Gestion,Planificacion y Estrategia de Servicio"+  
                                "\n 4. Control de Riesgos"+
                                "\n 5. Negocios y Aplicaciones Empresariales"+
                                "\n 6. Sistema e Infraestructura"+ 
                                "\n 7. Desarrollo y Nuevas Tecnologias"+
                                "\n 8. salir al Menu"+
                                "\n\n ingrese una opcion")); 
                          if(cod>=9){
                              JOptionPane.showMessageDialog(null," Codigo de Area Incorrecto ", "",JOptionPane.ERROR_MESSAGE);
                          }else
                                   
                          if(lisar.cantidaar(cod)){
  
                              
                        temper=Double.parseDouble(JOptionPane.showInputDialog("Ingrese su Temperatura Corporal"));
                         if(temper<38.0) {
                             
                          JOptionPane.showMessageDialog(null, "Temperatura Aceptable puede seguir llenando sus Datos");   

                     nombre=JOptionPane.showInputDialog("Ingrese su Nombre");
                         cedula=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Cedula"));
                         edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Edad"));
                         celular=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Numero de Telefono"));
                         
                        
                         motivo_entrada=JOptionPane.showInputDialog("Cual es su motivo de entrada");
                         fecha_entrada=JOptionPane.showInputDialog("Escriba la flecha de Entrada");
                         hora_entrada=JOptionPane.showInputDialog("Escriba la hora de Entrada");

                         JOptionPane.showMessageDialog(null," Usuario " +nombre+ " Registrado Correctamente");
                        Trabajadores U= new Trabajadores(cargo,codigo_t ,clave_acceso,cod,temper,nombre,cedula,edad,celular,motivo_entrada,fecha_entrada,hora_entrada);
                        listatra.agregarTrabajador(U);
                         
                          }else lisar.disminu(temper); 
                         
                           }else  lisar.nodejapa(cod); 
                  break;
             }

        } while (opc!=6);
        

        
    }
    
}
