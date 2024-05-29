//Miguel Angel Ortiz Ramirez  
//Darwin Moncada Castro

package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class conexion_sql {
    Connection  conn= null;
    String url="jdbc:postgresql://localhost:5432/Biblioteca";
    String usuario = "postgres";
    String clave = "123456";  
    public Connection conectar(){
        try {
            Class.forName("org.postgresql.Driver");
            conn=DriverManager.getConnection(url,usuario,clave);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error revisar el driver de conexion  "+ e);
        }
        return conn;
    }
}
