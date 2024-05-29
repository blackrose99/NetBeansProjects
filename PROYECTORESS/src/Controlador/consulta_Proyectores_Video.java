
package Controlador;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
public class consulta_Proyectores_Video extends Conexion{
    DefaultTableModel mol;
    Statement iniciar = null;
    
    
    String[] columna = {"codigo", " nombre del proyector", "lugar", "nombre del registrador", "marca", "color","hora","fecha","en serviºcio"};
    String[] col = new String[9];
    java.sql.Statement state;  
    ResultSet resul;
    
    
    public void cargarTabla(JTable tabla){
       mol=  new DefaultTableModel(null, columna);
       mol.setRowCount(0);
       String sql = "select * from proyectores_de_video;";
        try {
         Connection con = conectar();  
         state = con.createStatement();
         resul = state.executeQuery(sql);
         while(resul.next()){
             for(int e =0;e < 9; e++){
                 col[e]= resul.getString(e + 1);
             }
             mol.addRow(col);
         }
         tabla.setModel(mol);
         state.close();
         con.close();   
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar los proyectores de video" + e);
        }
    }

    public void consultarVideo(String nombre_Proyector, String lugar, String nombre_Registrador, String marca, String color, String hora, String fecha, String servicio, JTable table) {
            mol.setRowCount(0);
            Connection con = conectar();
            String datos[]= new String [9];
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
            if(marca.isEmpty()== false){
                where = where + "and marca '"+marca+"' ";
        }
        if (color.isEmpty() == false) {
            where = where + "and color '" + color + "' ";
        }

        if (hora.isEmpty() == false) {
            where = where + "and hora '" + hora + "' ";
        }

        if (fecha.isEmpty() == false) {
            where = where + "and fecha '" + fecha + "' ";
        }


            if(servicio.isEmpty()== false){
                where = where + "and en servicio'"+servicio+"' ";
            }
            String consulta = "select * from proyectores del video "+where+" ;";
            ResultSet res;
            try {
            iniciar = con.createStatement();
            iniciar.setQueryTimeout(20);
            res = iniciar.executeQuery(consulta);
            while(res.next()== true){
               datos[0]=res.getString("codigo"); 
               datos[1]=res.getString("nombre del proyector");
               datos[2]=res.getString("lugar");
               datos[3]=res.getString("nombre del registrador");
               datos[4]=res.getString("marca");
               datos[5]=res.getString("color");
               datos[6]=res.getString("hora");
               datos[7]=res.getString("fechas");
               datos[8]=res.getString("en servicio");
               mol.addRow(datos);
            }    
             table.setModel(mol);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la consulta " + e);
        }
    
        
    }
    
    public void insertar_Video(String nombre_proyec, String lugar, String nombre_registrador, String marca, String color,String hora, String fecha, String servicio, JTable tad){
        Connection con = conectar();
        String mensajeError= "";
        String consulta = "";
        PreparedStatement preparar = null;
        if(nombre_proyec.isEmpty()==true || lugar.isEmpty()==true || nombre_registrador.isEmpty()==true || marca.isEmpty()==true || color.isEmpty()==true ||  hora.isEmpty()==true ||  fecha.isEmpty()==true || servicio.isEmpty()==true ){
            mensajeError = mensajeError + "Llene los campos que hacen falta";
        }
           
        if(Validacion(nombre_proyec)==0){
        if (mensajeError.isEmpty() == true) {
            consulta = "INSERT INTO proyectores del video"
                    + "nombre del proyector, lugar, nombre del registrador, marca, color, hora, fecha, en servicio"
                    + "('" + nombre_proyec + "','" + lugar + "','" + nombre_registrador + "','" + marca + "', '" + color + "', '" + hora + "', '" + fecha + "', '" + servicio + "')";
            try {
                preparar = con.prepareStatement(consulta);
                preparar.executeUpdate();
                cargarTabla(tad);
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
        Connection conex = conectar();
        String consulta = "SELECT count (codigo) FROM proyectores de video WHERE nombre del proyector= ?";
            try {
            p = conex.prepareStatement(consulta);
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
    
    
    
    
    public void update(String nombre_proyec, String lugar, String nombre_registrador, String marca, String color,String hora,String fecha, String servicio, JTable tad){
        Connection con = conectar();
        PreparedStatement prep =null;
        String consulta = "update proyectores de video set"   
        + "nombre del proyector= '" + nombre_proyec + "', "
                + "lugar= '" + lugar + "', "
                + "nombre del registrador= '" + nombre_registrador + "', "
                + "marca= '" + marca + "', "
                + "color= '" + color + "', "
                + "hora= '" + hora + "', "
                + "fecha= '" + fecha + "', "
                + "en servicio= '" + servicio + "', "
                + "where id= '" + tad.getValueAt(tad.getSelectedRow(), 0) + "';";

        try {
            prep = con.prepareStatement(consulta);
            prep.executeUpdate();
            cargarTabla(tad);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void delete(JTable table){
        Connection con = conectar();
        PreparedStatement pr = null;
        String consulta = " delete from proyectores de video"
           + "where codigo= '" + table.getValueAt(table.getSelectedRow(), 0) + "';";
        try {
            pr = con.prepareStatement(consulta);
            pr.executeUpdate();
            cargarTabla(table);
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        
        
    }
    
    
    
    
    
    
    
    
    
}
