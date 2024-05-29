package Consultas;

import Conexion.ConexionSQLServer;
import Conexion.ConexionSQLServer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CRUDproveedores {
    private Connection conn;
    
    public CRUDproveedores() {
        conn = ConexionSQLServer.getConnection();
    }
    
    public void crearRegistro(int dni,String nombre, String email, String movil, String Direccion, int estado) {
        String query = "INSERT INTO proveedor (nombre, dni,direccion,movil,email,estado) VALUES (?,?,?,?,?,?)";
        
        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, nombre);
            pstmt.setInt(2, dni);
            pstmt.setString(3, Direccion);
            pstmt.setString(4, movil);
            pstmt.setString(5, email);
            pstmt.setInt(6, estado);
            
            int filasInsertadas = pstmt.executeUpdate();
            if (filasInsertadas > 0) {
                JOptionPane.showMessageDialog(null, "Registro insertado exitosamente");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar el registro: " + e.getMessage());
        }
    }
    
    public void leerRegistros(JTable Tabla) {
        String query = "SELECT * FROM proveedor";
        
        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet resultSet = pstmt.executeQuery();
            Object[] Clien = new Object[6];
            DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
            while (resultSet.next()) {
                Clien [0]=resultSet.getInt("dni");
                Clien [1]=resultSet.getString("nombre");
                Clien [2]=resultSet.getString("email");
                Clien [3]=resultSet.getString("movil");
                Clien [4]=resultSet.getString("direccion");
                Clien [5]=resultSet.getInt("estado");
                modelo.addRow(Clien);
            }
            Tabla.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al leer los registros: " + e.getMessage());
        }
    }
    
    public void actualizarRegistro(int dni,String nombre, String email, String movil, String Direccion, int estado) {
        String query = "UPDATE proveedor SET dni=?,nombre = ?, email = ?,movil=?,direccion = ? , estado=? WHERE dni = '"+dni+"' ";
        
        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, dni);
            pstmt.setString(2, nombre);
            pstmt.setString(3, email);
            pstmt.setString(4, movil);
            pstmt.setString(5, Direccion);
            pstmt.setInt(6, estado);
            
            
            
            int filasActualizadas = pstmt.executeUpdate();
            if (filasActualizadas > 0) {
                JOptionPane.showMessageDialog(null, "Registro actualizado exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el registro con el ID especificado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el registro: " + e.getMessage());
        }
    }
    
    public void eliminarRegistro(int id) {
        String query = "DELETE FROM proveedor WHERE dni = ?";
        
        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, id);
            
            int filasEliminadas = pstmt.executeUpdate();
            if (filasEliminadas > 0) {
                JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el registro con el ID especificado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el registro: " + e.getMessage());
        }
    }
    
    public void cerrarConexion() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                JOptionPane.showMessageDialog(null, "Conexión cerrada correctamente");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage());
        }
    }
}
