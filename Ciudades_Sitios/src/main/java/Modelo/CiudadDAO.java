
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CiudadDAO {
private static final String select = "select * from ciudades order by name";
     private static final String buscarPorId = "SELECT name, depto, pais, area, poblacion, latitud, longitud FROM ciudades WHERE id = ?";
     private static final String insert = "INSERT INTO ciudades(id, name, depto, pais, area, poblacion, latitud, longitud) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String update = "UPDATE ciudades SET id = ?, name = ?, depto = ?, pais = ?, area = ?, poblacion = ?, latitud = ?, longitud = ? WHERE id = ?";
    private static final String delete = "DELETE FROM ciudades WHERE id = ?";
   
    public List<Ciudad> mostrar() {
        Connection cone = null;
        PreparedStatement sentancia = null;
        ResultSet resultado = null;
        Ciudad ciudad = null;
        List<Ciudad> ciudades = new ArrayList<>();
        try {
            cone = ConexionDB.getConexion();
            sentancia = cone.prepareStatement(select);
            resultado = sentancia.executeQuery();

            while (resultado.next()) {
                ciudad = new Ciudad();
                ciudad.setId(resultado.getInt("id"));
                ciudad.setName(resultado.getString("name"));
                ciudad.setDepto(resultado.getString("depto"));
                ciudad.setPais(resultado.getString("pais"));
                ciudad.setArea(resultado.getDouble("area"));
                ciudad.setPoblacion(resultado.getInt("poblacion"));
                ciudad.setLatitud(resultado.getDouble("latitud"));
                ciudad.setLongitud(resultado.getDouble("longitud"));
                ciudades.add(ciudad);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                ConexionDB.cerrar(resultado);
                ConexionDB.Cerar(sentancia);
                ConexionDB.Cerrar(cone);

            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return ciudades;
    }
     public Ciudad buscarPorId(int id) {
        Connection cone = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        Ciudad encontrada = null;

        try {
            cone = ConexionDB.getConexion();
            sentencia = cone.prepareStatement(buscarPorId);
            sentencia.setInt(1, id);
            resultado = sentencia.executeQuery();

            if (resultado.next()) {
             
                String name = resultado.getString("name");
                String depto = resultado.getString("depto");
                String pais = resultado.getString("pais");
                double area = resultado.getDouble("area");
                int poblacion = resultado.getInt("poblacion");
                double latitud = resultado.getDouble("latitud");
                double longitud = resultado.getDouble("longitud");
                
                encontrada = new Ciudad( name, depto, pais, area, poblacion, latitud, longitud);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                ConexionDB.cerrar(resultado);
                ConexionDB.Cerar(sentencia);
                ConexionDB.Cerrar(cone);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return encontrada;
    }
      public int insertar(Ciudad ciudad) {
        Connection cone = null;
        PreparedStatement sentancia = null;
        int registro = 0;
        try {
            cone = ConexionDB.getConexion();
            sentancia = cone.prepareStatement(insert);
            sentancia.setInt(1, ciudad.getId());
            sentancia.setString(2, ciudad.getName());
            sentancia.setString(3, ciudad.getDepto());
            sentancia.setString(4, ciudad.getPais());
            sentancia.setDouble(5, ciudad.getArea());
            sentancia.setInt(6, ciudad.getPoblacion());
            sentancia.setDouble(7, ciudad.getLatitud());
            sentancia.setDouble(8, ciudad.getLongitud());
            registro = sentancia.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                ConexionDB.Cerar(sentancia);
                ConexionDB.Cerrar(cone);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return registro;
    }

    public int eliminar(int id) {
        Connection cone = null;
        PreparedStatement sentencia = null;
        int registro = 0;
        try {
            cone = ConexionDB.getConexion();
            sentencia = cone.prepareStatement(delete);
            sentencia.setInt(1, id);
            registro = sentencia.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                ConexionDB.cerrar(sentencia);
                ConexionDB.Cerrar(cone);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return registro;
    }

    public int actualizar(Ciudad ciudad) {
        Connection cone = null;
        PreparedStatement sentencia = null;
        int registro = 0;
        try {
            cone = ConexionDB.getConexion();
            sentencia = cone.prepareStatement(update);
            sentencia.setInt(1, ciudad.getId());
            sentencia.setString(2, ciudad.getName());
            sentencia.setString(3, ciudad.getDepto());
            sentencia.setString(4, ciudad.getPais());
            sentencia.setDouble(5, ciudad.getArea());
            sentencia.setInt(6, ciudad.getPoblacion());
            sentencia.setDouble(7, ciudad.getLatitud());
            sentencia.setDouble(8, ciudad.getLongitud());
            sentencia.setInt(9, ciudad.getId());
            registro = sentencia.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                ConexionDB.cerrar(sentencia);
                ConexionDB.Cerrar(cone);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return registro;
    }
    

}
