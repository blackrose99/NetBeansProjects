
package Paquete.iniciar;

import javafx.beans.binding.Bindings;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class buscar {
    
       DefaultTableModel mol;
       DefaultTableModel mold;
       
       
        
   TableRowSorter<DefaultTableModel> buscarPacientes;
   TableRowSorter<DefaultTableModel> buscarMedicos;

  
  
  
  
  
  
  
  
  
  
   
    
//    public void paciente(JTable jpaciente,String cc,String nombre,String apellido,String fecha,String enfermedad,String consultorio) {
//   DefaultTableModel modeloTabla;
//   String[] cabecera = { "CC", "NOMBRE","APELLIDO","FECHA","ENFERMEDAD","CONSULTORIO" }; 
//   String[][] datos = new String[0][];
//   modeloTabla = new DefaultTableModel(datos, cabecera);
//   jpaciente.setModel(modeloTabla);
//   
//     String[] filasTabla = new String[6]; 
//   
//    filasTabla[0]=cc;
//    filasTabla[1]=nombre;
//    filasTabla[2]=apellido;
//    filasTabla[3]=fecha;
//    filasTabla[4]=enfermedad;
//    filasTabla[5]=consultorio;
//    modeloTabla.addRow(filasTabla);
//    jpaciente.setModel(modeloTabla);
//    }
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//        public void medico(JTable jmedico,String cc,String nombre,String apellido,String fecha,String especialidad,String consultorio) {
//           DefaultTableModel modeloTabla2;
//            String[] cabecera2 = { "CC", "NOMBRE","APELLIDO","FECHA","ESPECILIDAD","CONSULTORIO" }; 
//        String[][] datos2 = new String[0][];
//   modeloTabla2 = new DefaultTableModel(datos2, cabecera2);
//   jmedico.setModel(modeloTabla2);
//   
//     String[] filasTabla = new String[6];                 
//     filasTabla[0]=cc;
//     filasTabla[1]=nombre;
//     filasTabla[2]=apellido;
//     filasTabla[3]=fecha;
//     filasTabla[4]=especialidad;
//     filasTabla[5]=consultorio;
//     modeloTabla2.addRow(filasTabla);
//     jmedico.setModel(modeloTabla2);
//
//       
//     
//    }
        
        
     
        public void llenarpa(JTable tabla){
            mol = new DefaultTableModel();
            mol.addColumn("CC");
            mol.addColumn("NOMBRE");
            mol.addColumn("APELLIDO");
            mol.addColumn("FECHA");
            mol.addColumn("ENFERMEDAD");
            mol.addColumn("COLCULTORIO");
          tabla.setModel(mol);

          
        }
        public void inserPaciente(JTable tabla,String cc,String nombre,String apellido,String fecha,String enfermedad,String consultorio){
            String [] arre= new String[6];
            arre[0]=cc;
            arre[1]=nombre;
            arre[2]=apellido;
            arre[3]=fecha;
            arre[4]=enfermedad;
            arre[5]=consultorio;
            mol.addRow(arre);
       buscarPacientes = new  TableRowSorter<>(mol);
          tabla.setRowSorter(buscarPacientes);
        }
        
        
        
          public void buscar(String con){
        try {
          buscarPacientes.setRowFilter(RowFilter.regexFilter(con, 5));
        } catch (Exception e) {
        }
    }
  
        
        
             
        public void llenarme(JTable tabla){
            mold = new DefaultTableModel();
            mold.addColumn("CC");
            mold.addColumn("NOMBRE");
            mold.addColumn("APELLIDO");
            mold.addColumn("FECHA");
            mold.addColumn("ESPECIALIDAD");
            mold.addColumn("COLCULTORIO");
          tabla.setModel(mold);
        }
        public void inserMedico(JTable tabla,String cc,String nombre,String apellido,String fecha,String especialidad,String consultorio){
            String [] arree= new String[6];
            arree[0]=cc;
            arree[1]=nombre;
            arree[2]=apellido;
            arree[3]=fecha;
            arree[4]=especialidad;
            arree[5]=consultorio;
            mold.addRow(arree);
            buscarMedicos = new  TableRowSorter<>(mold);
          tabla.setRowSorter(buscarMedicos);
        }
                  public void buscarMedicos(String con){
        try {
          buscarMedicos.setRowFilter(RowFilter.regexFilter(con, 5));
        } catch (Exception e) {
        }
    }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        public void alimento(JTable tabla3){
        int fila = tabla3.getSelectedRow();
        String animal = tabla3.getValueAt(fila, 0).toString();
     
        if (tabla3.getSelectedRow() >= 0 ) {
            if (fila == 0) {
                JOptionPane.showMessageDialog(null, "Se a alimentado el amimal " + animal);
            }else {
                 JOptionPane.showMessageDialog(null, "Se a alimentado el amimal " + animal);
            }       
        } 
    }
        
                
                public void alimentoPer(JTable tabla3){
        int fila = tabla3.getSelectedRow();

         String persona = tabla3.getValueAt(fila, 0).toString();
        if (fila >= 0) {
                        if (fila == 0) {

                JOptionPane.showMessageDialog(null, "Se a alimentado la persona " + persona);
            }else {
                 JOptionPane.showMessageDialog(null, "Se a alimentado la persona" + persona);
            }
                    
        } 
    }
}
