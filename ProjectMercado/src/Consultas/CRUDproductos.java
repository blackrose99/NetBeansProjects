package Consultas;

import Conexion.ConexionSQLServer;
import Conexion.ConexionSQLServer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CRUDproductos {
    private Connection conn;
    
    public CRUDproductos() {
        conn = ConexionSQLServer.getConnection();
    }
    
    public void crearRegistro(String nombre, int idca, int stock, int valorcompra,int valorventa ,int estado) {
        String query = "INSERT INTO productos (nombre,idcategoria,stock,valorcompra,valorventa,estado) VALUES (?,?,?,?,?,?)";
        
        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, nombre);
            pstmt.setInt(2, idca);
            pstmt.setInt(3, stock);
            pstmt.setInt(4, valorcompra);
            pstmt.setInt(5, valorventa);
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
        String query = "SELECT * FROM productos";
        
        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet resultSet = pstmt.executeQuery();
            Object[] Pro = new Object[6];
            DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
            while (resultSet.next()) {
                Pro[0]=resultSet.getString("nombre");
                Pro [1]=resultSet.getInt("idcategoria");
                Pro [2]=resultSet.getInt("stock");
                Pro [3]=resultSet.getInt("valorcompra");
                Pro [4]=resultSet.getInt("valorventa");
                Pro [5]=resultSet.getInt("estado");
                modelo.addRow(Pro);
            }
            Tabla.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al leer los registros: " + e.getMessage());
        }
    }

    public void leerRegistrosCombo(JComboBox combo) {
        String query = "SELECT * FROM categoria";
        
        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
              combo.addItem(resultSet.getString("nombre"));
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al leer los registros: " + e.getMessage());
        }
    }
        
    
    public void actualizarRegistro(String nombre, int idca, int stock, int valorcompra,int valorventa ,int estado) {
        String query = "UPDATE productos SET nombre=?,idcategoria = ?, stock = ?,valorcompra=?,valorventa = ? , estado=? WHERE nombre = '"+nombre+"' ";
        
        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, nombre);
            pstmt.setInt(2, idca);
            pstmt.setInt(3, stock);
            pstmt.setInt(4, valorcompra);
            pstmt.setInt(5, valorventa);
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
    
    public void eliminarRegistro(String nombre) {
        String query = "DELETE FROM productos WHERE nombre = ?";
        
        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, nombre);
            
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
