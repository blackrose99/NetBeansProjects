
package sqls;

import dominio.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class UsuarioDAO {
private static final String select = "SELECT * FROM usuarios";
private static final String insert = "INSERT INTO usuarios(nombre, apellido, direccion, telefono) VALUES (?, ?, ?, ?)";
private static final String update = "UPDATE usuarios SET nombre = ?, apellido = ?, direccion = ?, telefono = ? WHERE id = ?";
private static final String delete = "DELETE FROM usuarios WHERE id = ?";
private static final String buscarPorId = "SELECT nombre, apellido, direccion, telefono FROM usuarios WHERE id = ?";


/* método para insertar registros */
public int insertar(Usuarios usuario) {
    Connection conexion = null;
    PreparedStatement sentencia = null;
    int registro = 0;

    try {
        conexion = ConexionDB.getConexion();
        sentencia = conexion.prepareStatement(insert);
        sentencia.setString(1, usuario.getNombre());
        sentencia.setString(2, usuario.getApellido());
        sentencia.setString(3, usuario.getDireccion());
        sentencia.setString(4, usuario.getTelfono());
        registro = sentencia.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace(System.out);
    } finally {
        try {
            ConexionDB.Cerar(sentencia);
            ConexionDB.Cerrar(conexion);
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }
    return registro;
}
  public List<Usuarios> mostrar() {
    Connection conexion = null;
    PreparedStatement sentencia = null;
    ResultSet resultado = null;
    Usuarios usuario = null;
    List<Usuarios> usuarios = new ArrayList<>();

    try {
        conexion = ConexionDB.getConexion();
        sentencia = conexion.prepareStatement(select);
        resultado = sentencia.executeQuery();

        while (resultado.next()) {
            usuario = new Usuarios();
            usuario.setId(resultado.getInt("id"));
            usuario.setNombre(resultado.getString("nombre"));
            usuario.setApellido(resultado.getString("apellido"));
            usuario.setDireccion(resultado.getString("direccion"));
            usuario.setTelfono(resultado.getString("telefono"));
            usuarios.add(usuario);
        }
    } catch (SQLException e) {
        e.printStackTrace(System.out);
    } finally {
        try {
            ConexionDB.cerrar(resultado);
            ConexionDB.Cerar(sentencia);
            ConexionDB.Cerrar(conexion);
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }
    return usuarios;
}

public Usuarios buscarPorId(int id) {
    Connection conexion = null;
    PreparedStatement sentencia = null;
    ResultSet resultado = null;
    Usuarios encontrado = null;

    try {
        conexion = ConexionDB.getConexion();
        sentencia = conexion.prepareStatement(buscarPorId);
        sentencia.setInt(1, id);
        resultado = sentencia.executeQuery();

        if (resultado.next()) {

            String nombre = resultado.getString("nombre");
            String apellido = resultado.getString("apellido");
            String direccion = resultado.getString("direccion");
            String telefono = resultado.getString("telefono");

            encontrado = new Usuarios(nombre, apellido, direccion, telefono);
            encontrado.setId(id);
        }
    } catch (SQLException e) {
        e.printStackTrace(System.out);
    } finally {
        try {
            ConexionDB.cerrar(resultado);
            ConexionDB.Cerar(sentencia);
            ConexionDB.Cerrar(conexion);
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }

    return encontrado;
}

/* Método para eliminar un registro */
public int eliminar(int id) {
    Connection conexion = null;
    PreparedStatement sentencia = null;
    int registro = 0;

    try {
        conexion = ConexionDB.getConexion();
        sentencia = conexion.prepareStatement(delete);
        sentencia.setInt(1, id);
        registro = sentencia.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace(System.out);
    } finally {
        try {
            ConexionDB.cerrar(sentencia);
            ConexionDB.Cerrar(conexion);
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }
    return registro;
}

/* Método para actualizar los registros */
public int actualizar(Usuarios usuario) {
    Connection conexion = null;
    PreparedStatement sentencia = null;
    int registro = 0;

    try {
        conexion = ConexionDB.getConexion();
        sentencia = conexion.prepareStatement(update);
        sentencia.setString(1, usuario.getNombre());
        sentencia.setString(2, usuario.getApellido());
        sentencia.setString(3, usuario.getDireccion());
        sentencia.setString(4, usuario.getTelfono());
        sentencia.setInt(5, usuario.getId());
        registro = sentencia.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace(System.out);
    } finally {
        try {
            ConexionDB.cerrar(sentencia);
            ConexionDB.Cerrar(conexion);
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }
    return registro;
}

}
