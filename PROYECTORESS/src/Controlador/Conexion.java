
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Conexion {

    Connection cone = null;
    String URL = "jdbc:mysql://localhost:3306/proyectores?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    String USUARIO = "root";
    String CON = "";

    public Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cone = DriverManager.getConnection(URL, USUARIO, CON);
      
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar la base de datos " + e);
        }
        return cone;
    }

    
}
    

    
    
    