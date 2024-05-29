package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SitiosDAO {

    private static final String insert = "INSERT INTO sitios_turisticos (name, direccion, descripcion, hora_inicio, hora_final, ciudad_id, precio) VALUES (?, ?,?,?,?,?,?)";
    private static final String delete = "delete from sitios_turisticos where id = ?";
    private static final String borrarTodo = "delete from sitios_turisticos where ciudad_id = ? ";
    private static final String buscarPorId = "SELECT id, name, direccion, descripcion, hora_inicio, hora_final, precio FROM sitios_turisticos WHERE ciudad_id = ? order by name";
    private static final String verId = "select ciudad_id from sitios_turisticos where id = ?";
        private static final String verId2 = "select * from sitios_turisticos where id = ?";


    public List<SitiosTuristicos> busquePorId(int id) {
        Connection cone = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        List<SitiosTuristicos> sitios = new ArrayList<>();

        try {
            cone = ConexionDB.getConexion();
            sentencia = cone.prepareStatement(buscarPorId);
            sentencia.setInt(1, id); // Asignar el parámetro ID en la consulta
            resultado = sentencia.executeQuery();

            while (resultado.next()) {
                SitiosTuristicos sitio = new SitiosTuristicos();
                sitio.setId(resultado.getInt("id"));
                sitio.setName(resultado.getString("name"));
                sitio.setDireccion(resultado.getString("direccion"));
                sitio.setDescripcion(resultado.getString("descripcion"));
                sitio.setHora_inicio(resultado.getString("hora_inicio"));
                sitio.setHora_fin(resultado.getString("hora_final"));
                sitio.setPrecio(resultado.getDouble("precio"));
                sitios.add(sitio);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                ConexionDB.cerrar(resultado);
                ConexionDB.cerrar(sentencia);
                ConexionDB.Cerrar(cone);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return sitios;
    }

    public int insertar(SitiosTuristicos sitio) {
    Connection cone = null;
    PreparedStatement sentencia = null;
    int registro = 0;

    try {
        cone = ConexionDB.getConexion();
        sentencia = cone.prepareStatement(insert);

        sentencia.setString(1, sitio.getName());
        sentencia.setString(2, sitio.getDireccion());
        sentencia.setString(3, sitio.getDescripcion());
        sentencia.setString(4, sitio.getHora_inicio());
        sentencia.setString(5, sitio.getHora_fin());
        sentencia.setInt(6, sitio.getCiudad().getId());
        sentencia.setDouble(7, sitio.getPrecio());

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

    public int eliminarTodos(int id) {
       Connection cone = null;
        PreparedStatement sentencia = null;
        int registro = 0;
        try {
            cone = ConexionDB.getConexion();
            sentencia = cone.prepareStatement(borrarTodo);
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

    public int obtenerCiudadIdPorId(int id) {
        Connection cone = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        int ciudadId = -1; 

        try {
            cone = ConexionDB.getConexion();
            sentencia = cone.prepareStatement(verId);
            sentencia.setInt(1, id);
            resultado = sentencia.executeQuery();

            if (resultado.next()) {
                ciudadId = resultado.getInt("ciudad_id");
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                ConexionDB.cerrar(resultado);
                ConexionDB.cerrar(sentencia);
                ConexionDB.Cerrar(cone);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return ciudadId;
    }



 public SitiosTuristicos buscarSitio(int id) {
    Connection cone = null;
    PreparedStatement sentencia = null;
    ResultSet resultado = null;
    SitiosTuristicos encontrada = null;

    try {
        cone = ConexionDB.getConexion();
        sentencia = cone.prepareStatement(verId2);
        sentencia.setInt(1, id);
        resultado = sentencia.executeQuery();

        if (resultado.next()) {
            String name = resultado.getString("name");
            String direccion = resultado.getString("direccion");
            String descripcion = resultado.getString("descripcion");
            String hora_inicio = resultado.getString("hora_inicio");
            String hora_final = resultado.getString("hora_final");
            double precio = resultado.getDouble("precio");
            
            encontrada = new SitiosTuristicos(name, direccion, descripcion, hora_inicio, hora_final, precio);
        }
    } catch (SQLException e) {
        e.printStackTrace(System.out);
    } finally {
        try {
            ConexionDB.cerrar(resultado);
            ConexionDB.cerrar(sentencia);
            ConexionDB.Cerrar(cone);
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }
    return encontrada;
}
 public int actualizar(SitiosTuristicos sitio) {
    Connection cone = null;
    PreparedStatement sentencia = null;
    int registro = 0;
    try {
        cone = ConexionDB.getConexion();
        // Definir la consulta de actualización (Asegúrate de adaptarla a tu esquema)
        String updateQuery = "UPDATE sitios_turisticos SET name=?, direccion=?, descripcion=?, hora_inicio=?, hora_final=?, precio=? WHERE id=?";
        sentencia = cone.prepareStatement(updateQuery);

        // Establecer los nuevos valores para el registro
        sentencia.setString(1, sitio.getName());
        sentencia.setString(2, sitio.getDireccion());
        sentencia.setString(3, sitio.getDescripcion());
        sentencia.setString(4, sitio.getHora_inicio());
        sentencia.setString(5, sitio.getHora_fin());
        sentencia.setDouble(6, sitio.getPrecio());
        sentencia.setInt(7, sitio.getId()); // Utilizar el ID del registro que deseas actualizar

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

public SitiosTuristicos buscarSitios2(int id) {
    Connection cone = null;
    PreparedStatement sentencia = null;
    ResultSet resultado = null;
    SitiosTuristicos encontrada = null;

    try {
        cone = ConexionDB.getConexion();
        // Cambia la consulta para seleccionar todos los campos
        String selectQuery = "SELECT * FROM sitios_turisticos WHERE id = ?";
        sentencia = cone.prepareStatement(selectQuery);
        sentencia.setInt(1, id);
        resultado = sentencia.executeQuery();

        if (resultado.next()) {
            String name = resultado.getString("name");
            String direccion = resultado.getString("direccion");
            String descripcion = resultado.getString("descripcion");
            String hora_inicio = resultado.getString("hora_inicio");
            String hora_final = resultado.getString("hora_final");
            double precio = resultado.getDouble("precio");

            // Crea una instancia de SitiosTuristicos con los datos obtenidos de la base de datos
            encontrada = new SitiosTuristicos();
            encontrada.setId(id);
            encontrada.setName(name);
            encontrada.setDireccion(direccion);
            encontrada.setDescripcion(descripcion);
            encontrada.setHora_inicio(hora_inicio);
            encontrada.setHora_fin(hora_final);
            encontrada.setPrecio(precio);
        }
    } catch (SQLException e) {
        e.printStackTrace(System.out);
    } finally {
        try {
            ConexionDB.cerrar(resultado);
            ConexionDB.cerrar(sentencia);
            ConexionDB.Cerrar(cone);
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }
    return encontrada;
}

}