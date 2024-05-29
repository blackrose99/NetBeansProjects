package Consultas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class conexion {
    Connection  conn= null;
    String url="jdbc:mysql://localhost:3306/BIBLIOTECAS?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    String usuario = "root";
    String clave = "";  
    public Connection conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection(url,usuario,clave);
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar la base de datos "+ e);
        }
        return conn;
    }
}


    

