
package Controlador;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class consulatas_Proyectores_Opacos extends Conexion{
  DefaultTableModel modelo;
    Statement go = null;
    
    
    String[] colum = {"codigo", "nombre del proyector", "lugar", "nombre del registrador","numero de lamparas","hora","fecha","en servicio"};
    String[] col = new String[8];
    java.sql.Statement state;
    ResultSet resul;
    
    
    public void cargarTabla(JTable tabla){
       modelo=  new DefaultTableModel(null, colum);
       modelo.setRowCount(0);
       String consulta = "select * from proyectores_opacos";
        try {
         Connection con = conectar();  
         state = con.createStatement();
         resul = state.executeQuery(consulta);
         while(resul.next()){
             for(int e =0;e < 8; e++){
                 col[e]= resul.getString(e + 1);
             }
             modelo.addRow(col);
         }
         tabla.setModel(modelo);
         state.close();
         con.close();   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar los proyectores de video");
        }
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void consultarOpaco(String nombre_Proyector, String lugar, String nombre_Registrador, String num_lamparas,String hora,String fecha, String servicio, JTable table) {
            modelo.setRowCount(0);
            Connection con = conectar();
            String datos[]= new String [8];
            String where = "where 1=1";
            if(nombre_Proyector.isEmpty()== false){
                where = where + "and nombre del proyector '"+nombre_Proyector+"' ";
            }
            if(lugar.isEmpty()== false){
                where = where + "and lugar '"+lugar+"' ";
            }
            if(nombre_Registrador.isEmpty()== false){
                where = where + "and nombre del registrador '"+nombre_Registrador+"' ";
            }
            if(num_lamparas.isEmpty()== false){
                where = where + "and numero de lamparas '"+num_lamparas+"' ";
            }

        if (hora.isEmpty() == false) {
            where = where + "and hora '" + hora + "' ";
        }
        if (fecha.isEmpty() == false) {
            where = where + "and fecha '" + fecha + "' ";
        }
        if (servicio.isEmpty() == false) {
            where = where + "and en servicio'" + servicio + "' ";
        }
            String consulta = "select * from proyectores opacos "+where+" ;";
            ResultSet res;
            try {
            go = con.createStatement();
            go.setQueryTimeout(20);
            res = go.executeQuery(consulta);
            while(res.next()== true){
               datos[0]=res.getString("codigo"); 
               datos[1]=res.getString("nombre del proyector");
               datos[2]=res.getString("lugar");
               datos[3]=res.getString("nombre del registrador");
               datos[4]=res.getString("numero de lamparas");
               datos[5]=res.getString("hora");
               datos[6]=res.getString("fecha");
               datos[7]=res.getString("en servicio");
               modelo.addRow(datos);
            }    
             table.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la consulta " + e);
        }
    }
    
    public void insertar_Opaco(String nombre_Proyector, String lugar, String nombre_Registrador, String num_lamparas,String hora, String fecha, String servicio, JTable table){
        Connection con = conectar();
        String mensajeError= "";
        String consulta = "";
        PreparedStatement preparar = null;
        if(nombre_Proyector.isEmpty()==true || lugar.isEmpty()==true || nombre_Registrador.isEmpty()==true || num_lamparas.isEmpty()==true  || hora.isEmpty()==true || fecha.isEmpty()==true ||  servicio.isEmpty()==true ){
            mensajeError = mensajeError + "Llene los campos que hacen falta";
        }
           
        if(Validacion(nombre_Proyector)==0){
        if (mensajeError.isEmpty() == true) {
            consulta = "INSERT INTO proyectores opacos"
                    + "nombre del proyector, lugar, nombre del registrador, numero de lamparas,hora,fecha, en servicio"
                    + "('" + nombre_Proyector + "','" + lugar + "','" + nombre_Registrador + "','" + num_lamparas + "', '" + hora + "', '" + fecha + "', '" + servicio + "')";
            try {
                preparar = con.prepareStatement(consulta);
                preparar.executeUpdate();
                cargarTabla(table);
                JOptionPane.showMessageDialog(null, "se ha agregado correctamente");
            } catch (Exception e) {
            }

        } else {
            JOptionPane.showMessageDialog(null, mensajeError);
        }
        }else{
            JOptionPane.showMessageDialog(null, "Este nombre ya ha sido registrado");
        }

        
        
        
    }
    public int Validacion(String nom_proyector ){
        PreparedStatement p = null;
        Connection cone = conectar();
        String consulta = "SELECT count (codigo) FROM proyectores opacos WHERE nombre del proyector= ?";
            try {
            p = cone.prepareStatement(consulta);
            p.setString(1, nom_proyector);
            resul = p.executeQuery();
            if(resul.next()){
                return resul.getInt(1);
            }
            return 1;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return 1;
        }
    }
    
    
    
    
    public void update_Opaco(String nombre_Proyector, String lugar, String nombre_Registrador, String num_lamparas, String servicio, JTable table){
        Connection con = conectar();
        PreparedStatement prep =null;
        String consulta = "update proyectores opacos set"   
        + "nombre del proyector= '" + nombre_Proyector + "', "
        + "lugar= '" + lugar + "', "
        + "nombre del registrador= '" + nombre_Registrador + "', "
        + "marca= '" + num_lamparas + "', "
        + "en servicio= '" + servicio + "', "
        + "where id= '"+table.getValueAt(table.getSelectedRow(), 0)+"';";
        
        try {
            prep = con.prepareStatement(consulta);
            prep.executeUpdate();
            cargarTabla(table);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void delete_Opaco(JTable table){
        Connection cone = conectar();
        PreparedStatement pr = null;
        String consulta = " delete from proyectores opacos"
           + "where codigo= '" + table.getValueAt(table.getSelectedRow(), 0) + "';";
        try {
            pr = cone.prepareStatement(consulta);
            pr.executeUpdate();
            cargarTabla(table);
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        
        
    }
    
    
    
    
    
    
}
