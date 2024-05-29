/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 *
 * @author jhond
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class metodos {

    private Connection con = null;

    public metodos() {
        con = conexion.getConexion();
    }

    public int insertarProducto(String codigo,String nombre, String precio,String existencias) {
        int r = 0;
        String consulta= "INSERT INTO productos(codigo,nombre,precio,existencias) VALUES ('"+codigo+"','"+nombre+"','"+precio+"','"+existencias+"')";
        try {
            Statement st = (Statement) con.createStatement();
            r=st.executeUpdate(consulta);
            
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e.toString());
        }finally{
            
        return r;
        }
        

    }

    
    
    public ResultSet getConsulta() {
        ResultSet rs = null;

        try {
            Statement st = (Statement) con.createStatement();
            rs = st.executeQuery("SELECT * FROM productos");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al efectuar la consulta");
        }

        return rs;

    }

    
    
    
    
    
    
    
    
    public int eliminarProducto(String id) {
        int r = 0;
        
        String consulta= "DELETE FROM productos WHERE id="+id;
        try {
            Statement st = (Statement) con.createStatement();
            r=st.executeUpdate(consulta);
            
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e.toString());
        }finally{
            
        return r;
        }
    
    }
    
   public int actualizarProducto(int id, String codigo,String nombre, String precio,String existencias) {
        int r = 0;
        
        String consulta= "UPDATE productos SET id ='"+id+"',codigo='"+codigo+"',nombre='"+nombre+"',precio='"+precio+"',existencias='"+existencias+"' WHERE id=" +id;
        try {
            Statement st = (Statement) con.createStatement();
            r=st.executeUpdate(consulta);
            
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e.toString());
        }finally{
            
        return r;
        }
    
    
    
}
   

   
   
   
}

