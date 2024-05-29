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

public class ConsultaId {
    private Connection conn;
    
    public ConsultaId() {
        conn = ConexionSQLServer.getConnection();
    }
    
        public double leerClientes(String datoid) {
        String query = "SELECT id FROM clientes WHERE nombre = '"+datoid+"'";
        
        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet resultSet = pstmt.executeQuery();

          
               if (resultSet.next()) {
               
                int dato = resultSet.getInt("id");
                return dato;
            } else {
                JOptionPane.showMessageDialog(null,"No se encontraron resultados.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al leer los registros: " + e.getMessage());
        }
        return 0;
    }
    
        public double leerRegistrosCategoria(String datoid) {
        String query = "SELECT id FROM categoria WHERE nombre = '"+datoid+"'";
        
        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet resultSet = pstmt.executeQuery();

          
               if (resultSet.next()) {
               
                int dato = resultSet.getInt("id");
                return dato;
            } else {
                JOptionPane.showMessageDialog(null,"No se encontraron resultados.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al leer los registros: " + e.getMessage());
        }
        return 0;
    }
    
    
    public double leerRegistrosProductos(String datoid) {
        String query = "SELECT id FROM productos WHERE nombre = '"+datoid+"'";
        
        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet resultSet = pstmt.executeQuery();

          
               if (resultSet.next()) {
               
                int dato = resultSet.getInt("id");
                return dato;
            } else {
                JOptionPane.showMessageDialog(null,"No se encontraron resultados.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al leer los registros: " + e.getMessage());
        }
        return 0;
    }
    
     public double leerRegistrosProveedor(String datoid) {
        String query = "SELECT id FROM proveedor WHERE nombre = '"+datoid+"'";
        
        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet resultSet = pstmt.executeQuery();

          
               if (resultSet.next()) {
               
                int dato = resultSet.getInt("id");
                return dato;
            } else {
                JOptionPane.showMessageDialog(null,"No se encontraron resultados.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al leer los registros: " + e.getMessage());
        }
        return 0;
    }
    
    public double leerRegistrosEmpleado(String datoid) {
        String query = "SELECT id FROM empleado WHERE nombre = '"+datoid+"'";
        
        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet resultSet = pstmt.executeQuery();

          
               if (resultSet.next()) {
               
                int dato = resultSet.getInt("id");
                return dato;
            } else {
                JOptionPane.showMessageDialog(null,"No se encontraron resultados.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al leer los registros: " + e.getMessage());
        }
        return 0;
    }
    
    
    public void cerrarConexion() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                JOptionPane.showMessageDialog(null,"Conexión cerrada correctamente");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al cerrar la conexión: " + e.getMessage());
        }
    }
}
