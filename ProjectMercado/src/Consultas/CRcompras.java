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

public class CRcompras {
    private Connection conn;
    
    public CRcompras() {
        conn = ConexionSQLServer.getConnection();
    }
    
    public void crearRegistro(int idprod, int idprov, int cantidad, int valorventa,int totalventa ,int empleado,int estado) {
        String query = "INSERT INTO compras (idproducto,idproveedor,cantidad,valor,total,idempleado,estado) VALUES (?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, idprod);
            pstmt.setInt(2, idprov);
            pstmt.setInt(3, cantidad);
            pstmt.setInt(4, valorventa);
            pstmt.setInt(5, totalventa);
            pstmt.setInt(6, empleado);
            pstmt.setInt(7, estado);
            
            int filasInsertadas = pstmt.executeUpdate();
            if (filasInsertadas > 0) {
                JOptionPane.showMessageDialog(null, "Registro insertado exitosamente");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar el registro: " + e.getMessage());
        }
    }
    
    public void leerRegistros(JTable Tabla) {
        String query = "SELECT * FROM compras";
        
        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet resultSet = pstmt.executeQuery();
            Object[] Comp = new Object[7];
            DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
            while (resultSet.next()) {
                Comp [0]=resultSet.getInt("idproducto");
                Comp [1]=resultSet.getInt("idproveedor");
                Comp [2]=resultSet.getInt("cantidad");
                Comp [3]=resultSet.getInt("valor");
                Comp [4]=resultSet.getInt("total");
                Comp [5]=resultSet.getInt("idempleado");
                Comp [6]=resultSet.getInt("estado");
                modelo.addRow(Comp);
            }
            Tabla.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al leer los registros: " + e.getMessage());
        }
    }

    public void leerRegistrosComboProd(JComboBox combo) {
        String query = "SELECT * FROM productos";
        
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
        
     public void leerRegistrosComboProv(JComboBox combo) {
        String query = "SELECT * FROM proveedor";
        
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
     
     public void leerRegistrosComboEmple(JComboBox combo) {
        String query = "SELECT * FROM empleado";
        
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
