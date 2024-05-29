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

public class LoginUser {
    private Connection conn;
    
    public LoginUser() {
        conn = ConexionSQLServer.getConnection();
    }
    
    public double login(String email,String Password ) {
        String query = "SELECT idrol FROM empleado WHERE email = '"+email+"' and  pass = '"+Password+"'";
        
        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet resultSet = pstmt.executeQuery();

          
               if (resultSet.next()) {
               
                int dato = resultSet.getInt("idrol");
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
