    
package paciente;

import javax.swing.JOptionPane;

public class PruebaPaciente {
    public static void main (String [ ] Args) {
        ListaPacientes listap = new ListaPacientes ();
        
        int cedula, telefono, edad,op;
        String nombre,direccion,tipopoliza, nomeps,nombreEps;
        double valorc;
        
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("MENU DE ACCIONES"+
                                "\n 1. Agregar paciente de EPS"+
                                "\n 2. Agregar paciente de Medicina Prepagada"+
                                "\n 3. Listado de pacientes de Prepagada"+
                                "\n 4. Listado de pacientes de una EPS dada"+
                                "\n 5. Mostrar datos de paciente EPS por cedula"+
                                "\n 6. Listado de pacientes de Prepagada mayores de 18 años"+
                                "\n 7. Actualizar valor cuota moderadora para EPS"+
                                "\n 8. Cantidad de pacientes prepagada de poliza GOLD"+ 
                                "\n 9. Salir del menu"+
                                "\n\n Ingrese su eleccion: "));
            
            switch(op){
                case 1:cedula=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del paciente: "));
                       nombre=JOptionPane.showInputDialog("Ingrese el nombre del paciente: ");
                       direccion=JOptionPane.showInputDialog("Ingrese la direccion del paciente: ");
                       telefono=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el telefono del paciente: "));
                       nomeps=JOptionPane.showInputDialog("Ingrese el nombre de la EPS: ");
                       valorc=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la cuota moderadora: "));
                       Eps E= new Eps(nomeps,valorc,cedula,nombre,direccion,telefono);
                       listap.agregarPaciente(E);
                       break;
                case 2:cedula=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del paciente: "));
                       nombre=JOptionPane.showInputDialog("Ingrese el nombre del paciente: ");
                       direccion=JOptionPane.showInputDialog("Ingrese la direccion del paciente: ");
                       telefono=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el telefono del paciente: "));
                       tipopoliza=JOptionPane.showInputDialog("Ingrese el tipo de póliza: ");
                       edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del paciente: "));
                       Prepagada P= new Prepagada(tipopoliza,edad,cedula,nombre,direccion,telefono);
                       listap.agregarPaciente(P);
                        break;
                case 3: listap.listarPrepagada();
                        break;
                case 4: nombreEps=JOptionPane.showInputDialog("Ingrese nombre de la EPS a consultar: ");
                        listap.listarEPS(nombreEps);
                        break;
                case 5: cedula=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del paciente EPS a consultar: "));
                        listap.pacienteEPS(cedula);
                        break;
                case 6: listap.listarPrepagada18();
                        break;
                case 7: listap.actualizarCuota();
                        break;
                case 8: listap.cantidadGold();
                        break;
                        
                        
            }
            
        }while(op!=9);
        
    }
}
