package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionSQLServer {
    private static final String HOST = "localhost"; 
    private static final int PORT = 3306; 
    private static final String DATABASE = "supermercado"; 
    private static final String USERNAME = "root"; 
    private static final String PASSWORD = ""; 

    public static Connection getConnection() {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE;
            conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
            JOptionPane.showMessageDialog(null, "Conexion exitosa a la base de datos");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos" + e.getMessage());
        }
        return conn;
    }
}
