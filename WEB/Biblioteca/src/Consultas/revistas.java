

package Consultas;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
public class revistas extends conexion{
 DefaultTableModel modelos;
 Statement iniciar = null;
  
       String[] columna = {"ID","AÑO","TITULO","PRECIO","ISBN"};
      String[] lib = new String[5];
        java.sql.Statement st;
       ResultSet rs;
 
   public void cargarTabla(JTable tabla1) {
       Editar_Tabla color = new Editar_Tabla();
       modelos = new DefaultTableModel(null, columna);
        modelos.setRowCount(0);
        String sql = "select * from revistas;";
        try {
            Connection con = conectar();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
            for (int e = 0; e < 5; e++) {
            lib[e] = rs.getString(e + 1);
                }
                modelos.addRow(lib);

            }
            tabla1.setModel(modelos);
            st.close();
           con.close();
           for (int e = 0; e < tabla1.getColumnCount(); e++) {
               tabla1.getColumnModel().getColumn(e).setCellRenderer(color);
           }
       } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "Error al mostrar las revistas");
       }
   }
   
   
   
   
     
   public void consular(String AÑO, String TITULO, String PRECIO, String ISBN, JTable jo){
       modelos.setRowCount(0);
       Connection con = conectar();
       String datos[]= new String[5]; 
       String where = "where 1=1";
       if(AÑO.isEmpty()==false){
           where=where+ " and año='"+AÑO+"' " ;
       }
       if(TITULO.isEmpty()==false){ 
           where=where+ " and titulo='"+TITULO+"' " ;
       }
       if(PRECIO.isEmpty()==false){
           where=where+ " and precio='"+PRECIO+"' " ;
       }
       if(ISBN.isEmpty()==false){
           where=where+ " and ISBN='"+ISBN+"' " ;
       }
       String query = "select * from revistas "+where+" ;";
       ResultSet rs;
       try {
           iniciar = con.createStatement();
           iniciar.setQueryTimeout(20);
           rs= iniciar.executeQuery(query);
           while(rs.next()==true){
               datos[0]=rs.getString("Id"); 
               datos[1]=rs.getString("año");
               datos[2]=rs.getString("titulo");
               datos[3]=rs.getString("precio");
               datos[4]=rs.getString("ISBN");
               modelos.addRow(datos);   
           }
           jo.setModel(modelos);
       } catch (Exception e) {
       }
       
   }
   
    
    
    
         
             
    public void insertar(String AÑO, String TITULO, String PRECIO, String ISBN, JTable jop) {
        Connection con = conectar();
        String mesajeError = "";
        String quer = "";
        PreparedStatement preparar = null;
        if (AÑO.isEmpty() == true || TITULO.isEmpty() == true || PRECIO.isEmpty() == true || ISBN.isEmpty() == true) {
            mesajeError = mesajeError + " Complete los campos que hacen falta";
        }
        if(existencia(ISBN)==0){
        
        if (mesajeError.isEmpty() == true) {
            quer = "INSERT INTO revistas"
                    + "( año,                        titulo,                     precio,          ISBN) VALUES"
                    + "('" + AÑO + "', '" + TITULO + "', '" + PRECIO + "' , '" + ISBN + "' )";
            try {
                preparar = con.prepareStatement(quer);
                preparar.executeUpdate();
                cargarTabla(jop);

                JOptionPane.showMessageDialog(null, "Se ha insertado correctamente");
            } catch (Exception e) {
            }

        } else {
            JOptionPane.showMessageDialog(null, mesajeError);
        }
        }else{
            JOptionPane.showMessageDialog(null, "esta ISBN ya ha sido registrada");
        }
        
    }
         
         
     public int existencia(String usuario){
        PreparedStatement pre = null;
      
        Connection conex = conectar();
        String sql = "SELECT count(id) FROM revistas WHERE ISBN= ?";
        try {
            pre = conex.prepareStatement(sql);
            pre.setString(1, usuario);
            rs = pre.executeQuery();
            if(rs.next()){
                return rs.getInt(1);
            }
            return 1;
        } catch (SQLException e) {
            System.out.println(e);
            return 1;
        }
    }
     
     
     
        
     
       public void actualizar(String AÑO,String TITULO,String PRECIO,String ISBN, JTable tabla){
            Connection conexion = conectar();
               PreparedStatement preparar = null;
        String querry = " update revistas set "
                + "año='" + AÑO + "', "
                + "titulo='" + TITULO + "',"
                + "precio='" + PRECIO + "', "
                + "ISBN='" + ISBN + "' "
                + " where id='" + tabla.getValueAt(tabla.getSelectedRow(), 0) + "'; ";
        try {
            preparar = conexion.prepareStatement(querry);
            preparar.executeUpdate();
            cargarTabla(tabla);
        } catch (SQLException e) {
            System.out.println(e);
        }


   
   }

       
       
       
       
       
       public void eliminar(JTable tabla){
            Connection conex = conectar();
            PreparedStatement pre = null;

        String query = "delete from revistas"
                + " where id= '" + tabla.getValueAt(tabla.getSelectedRow(), 0) + "'; ";
                  
        try {
            pre = conex.prepareStatement(query);
            pre.executeUpdate();
            cargarTabla(tabla);

        } catch (Exception e) {
            System.out.println(e);
        }


       }
        
        
        
    } 
       
       
       
       
       
       
       
       
       
       
       

         
         
         
         
         
         
         
         
         
    

    
    



 

        

