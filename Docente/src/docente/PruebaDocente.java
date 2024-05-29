
package docente;

import java.util.ArrayList;
import javax.swing.JOptionPane;
public class PruebaDocente {
 
    public static void main(String[] args) {
        ArrayList <Docente> lista = new ArrayList <Docente>();
        Planta obPla = new Planta();
        Catedra ca = new Catedra();
        
        int op,cat, antiguedad,hsem,op2 = 0;
        String doc, nom, genero, prog;
        double sueldo,vhora;
        //Datos de prueba de tipo docente Planta
        Planta P1= new Planta ( "102030", "Juan Perez", "M", "Sistemas", 2,12, 5000000);
        Planta P2= new Planta ( "556677", "Carolina Cruz", "F", "Sistemas", 1,11, 6500000);
        Planta P3= new Planta ( "108080", "Diego Lopez", "M", "Topografia",3,90, 4000000);
        obPla.agregarDocenteDePlanta(P1);
        obPla.agregarDocenteDePlanta(P2);
        obPla.agregarDocenteDePlanta(P3);
        
        //Agregar datos de prueba de tipo docente Catedra
        
        Catedra c1= new Catedra ( "102030", "Marcos Perez", "M", "Sistemas", 2,5, 5000000);
        Catedra c2= new Catedra ( "556677", "Andrea Cruz", "F", "Administracion", 1,2, 6500000);
        Catedra c3= new Catedra ( "108080", "Rodrigo Lopez", "M", "Topografia",3,4, 4000000);
        ca.agregarDocenteDePlanta(c1);
        ca.agregarDocenteDePlanta(c2);
        ca.agregarDocenteDePlanta(c3);
        
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("MENU DE ACCIONES"+
                                "\n 1. Crear nuevo docente de planta"+
                                "\n 2. Crear nuevo docente de cátedra"+
                                "\n 3. Obtener lista de todos los docentes de un programa (solicitar el programa a listar)"+
                                "\n 4. Mostrar datos completos de un objeto de la clase Planta, buscando por el documento"+
                                "\n 5. Obtener lista de docentes de Planta hombres, con más de 10 años de antigüedad"+
                                "\n 6. Hallar y mostrar el porcentaje de docente hombres y mujeres que hay en la institución."+
                                "\n 7. Hallar y mostrar cuántos y cuáles programas diferentes están registrados en el conjunto de docentes."+                     
                                "\n 0. Salir del menu"+
                                "\n\n Ingrese su eleccion: "));
            switch(op){
            case 1:doc=JOptionPane.showInputDialog("Ingrese el documento del docente: ");
                   nom=JOptionPane.showInputDialog("Ingrese el nombre del docente: ");
                   genero=JOptionPane.showInputDialog("Ingrese el género del docente: ");
                   prog=JOptionPane.showInputDialog("Ingrese el programa al que pertenece el docente: ");
                   cat=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la categoria del paciente: "));
                   antiguedad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese los años de antiguedad en la institución:"));
                   sueldo=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo: "));
                   Planta P= new Planta (doc,nom,genero,prog,cat,antiguedad, sueldo);
                   obPla.agregarDocenteDePlanta(P);
                   break;
            case 2:doc=JOptionPane.showInputDialog("Ingrese el documento del docente: ");
                   nom=JOptionPane.showInputDialog("Ingrese el nombre del docente: ");
                   genero=JOptionPane.showInputDialog("Ingrese el género del docente: ");
                   prog=JOptionPane.showInputDialog("Ingrese el programa al que pertenece el docente: ");
                   cat=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la categoria del paciente: "));
                   hsem=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de horas a la semana:"));
                   vhora=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la hora: "));
                   Catedra C= new Catedra(doc,nom,genero,prog,cat,hsem,vhora);
                   lista.add(C);
                   break; 
            case 3:
                
                do {  
                  op2 = Integer.parseInt(JOptionPane.showInputDialog("Elija que tipo de Docentes quiere ver"
                          + "\n 1.Docentes de Planta"
                          + "\n 2.Docentes de Catedra"
                          + "\n 0.Regresar"));  
                    switch(op2){
                        case 1:
                            obPla.ListaPlanta();
                            break;
                        case 2:
                            ca.ListaCatedra();
                            break;
                    }
                } while (op2 != 0);
                   break;
                   
            case 4:
               doc=JOptionPane.showInputDialog("Ingrese el documento del Docente de Planta a consultar: ");
               obPla.BuscarDocentePlanta(doc);
                break;

                case 5:
                    obPla.BuscarHombresAntiguedadMayorADiez();
                    break;

                case 6:

                    int cantidadMujeres = obPla.numeroMujeresPlanta() + ca.numeroMujeresCatedra();
                    int cantidadHombres = obPla.numeroHombresPlanta() + ca.numeroHombresCatedra();
                    int sumaGenero = cantidadMujeres + cantidadHombres;

                    double porcentajeHombres = (cantidadHombres * 50 / sumaGenero);
                    double porcentajeMujeres = (cantidadMujeres * 50 / sumaGenero);

                    JOptionPane.showMessageDialog(null, porcentajeHombres + " " + porcentajeMujeres);

                    break;

                case 7:
                    JOptionPane.showMessageDialog(null, obPla.MostrarProgramasYNumero() + "\n\n" + ca.MostrarProgramasYNumeroCatedra());

                    break;
            }
        } while (op != 0);
    }
    
    
  

    
}
