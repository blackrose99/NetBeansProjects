
package datos;

import java.sql.*;


public class conexion {
    public static final String url = "jdbc:mysql://localhost:3306/ejemplobd";
    private static final String user = "root";
    private static final String password= "0852";
    
    public static  Connection getConexion() throws SQLException{
        return DriverManager.getConnection(url,user,password) ;
        
    }
    
    public static void Cerrar(Connection conexion) throws SQLException{
        conexion.close();
    }
    
    public static void Cerar(Statement sentancia) throws SQLException{
        sentancia.close();
    }
    
    public static void cerrar(PreparedStatement sentencia) throws SQLException{
        sentencia.close();
    }
       public static void cerrar(ResultSet resultado) throws SQLException{
        resultado.close();
    }
}
