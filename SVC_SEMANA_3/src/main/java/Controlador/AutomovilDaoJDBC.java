
package Controlador;
import Modelo.Automovil;
import java.sql.*;
import java.util.*;

public class AutomovilDaoJDBC {
    private static final String SQL_SELECT = "SELECT id_vehiculo, marca, modelo , año, color, precio "
            + " FROM automovil";

    private static final String SQL_SELECT_BY_ID = "SELECT id_vehiculo, marca, modelo, año, color, precio "
            + " FROM automovil WHERE id_vehiculo = ?";

    private static final String SQL_INSERT = "INSERT INTO automovil(marca, modelo, año, color, precio) "
            + " VALUES(?, ?, ?, ?, ?)";

    private static final String SQL_UPDATE = "UPDATE automovil "
            + " SET marca=?, modelo=?, año=?, color=?, precio=? WHERE id_vehiculo=?";

    private static final String SQL_DELETE = "DELETE FROM automovil WHERE id_vehiculo = ?";

 public List<Automovil> listar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Automovil automovil = null;
        List<Automovil> automoviles = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idVehiculo = rs.getInt("id_vehiculo");
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                int año = rs.getInt("año");
                String color = rs.getString("color");
                double precio = rs.getDouble("precio");
                automovil = new Automovil(idVehiculo, marca, modelo, año, color, precio);
                automoviles.add(automovil);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return automoviles;
    }
 public Automovil encontrar(int id) {
        Connection cone = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        Automovil automovilEncontrado = null;

        try {
            cone = Conexion.getConnection();
            sentencia = cone.prepareStatement(SQL_SELECT_BY_ID );
            sentencia.setInt(1, id);
            resultado = sentencia.executeQuery();

            if (resultado.next()) {
                String marca = resultado.getString("marca");
                String modelo = resultado.getString("modelo");
                int año = resultado.getInt("año");
                String color = resultado.getString("color");
                double precio = resultado.getDouble("precio");
   automovilEncontrado = new Automovil(marca, modelo, año, color, precio);
                automovilEncontrado.setIdVehiculo(id);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(resultado);
            Conexion.close(sentencia);
            Conexion.close(cone);
        }

        return automovilEncontrado;
   }
 public int insertar(Automovil automovil) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registro = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, automovil.getMarca());
            stmt.setString(2, automovil.getModelo());
            stmt.setInt(3, automovil.getAño());
            stmt.setString(4, automovil.getColor());
            stmt.setDouble(5, automovil.getPrecio());

            registro = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return registro;
    }
 public int actualizar(Automovil automovil) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, automovil.getMarca());
            stmt.setString(2, automovil.getModelo());
           stmt.setInt(3, automovil.getAño());
              stmt.setString(4, automovil.getColor());
              stmt.setDouble(5, automovil.getPrecio());
            stmt.setInt(6, automovil.getIdVehiculo());

            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
 
  public int eliminar(int id_vehiculo) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registro = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, id_vehiculo);

            registro = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return registro;
    }
 
 
 
 
 
}
