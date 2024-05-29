package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

public class ConexionDB {

    public static final String url = "jdbc:mysql://sql305.epizy.com:3306/epiz_32850231_clientes?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String user = "epiz_32850231";
    private static final String password = "MLiY6PRyfO";

    private static BasicDataSource dataSource;

    public static DataSource getDataSource() {
        if (dataSource == null) {
            dataSource = new BasicDataSource();
            dataSource.setUrl(url);
            dataSource.setUsername(user);
            dataSource.setPassword(password);
            dataSource.setInitialSize(50);

        }
        return dataSource;

    }

    public static Connection getConexion() throws SQLException {
        return getDataSource().getConnection();

    }

    public static void Cerrar(Connection conexion) throws SQLException {
        try {
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void Cerar(Statement sentancia) throws SQLException {

        try {
            sentancia.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void cerrar(PreparedStatement sentencia) throws SQLException {
        try {
            sentencia.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void cerrar(ResultSet resultado) throws SQLException {
        try {
            resultado.close();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }
}
