
package sqls;

import dominio.Asignaturas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AsignaturaDAO {
    private static final String select = "select *from asignaturas";
    private static final String insert = "insert into asignaturas(codigo, nombre, creditos) values(?, ?, ?)";
    private static final String update = "update asignaturas set codigo = ? , nombre = ? , creditos = ? where id = ?";
    private static final String delete = "delete from asignaturas where id = ?";
    private static final String buscarPorId = "SELECT codigo, nombre, creditos FROM asignaturas WHERE id = ?";

    public List<Asignaturas> mostrar() {
        Connection cone = null;
        PreparedStatement sentancia = null;
        ResultSet resultado = null;
        Asignaturas asignatura = null;
        List<Asignaturas> asignaturas = new ArrayList<>();
        try {
            cone = ConexionDB.getConexion();
            sentancia = cone.prepareStatement(select);
            resultado = sentancia.executeQuery();

            while (resultado.next()) {
                asignatura = new Asignaturas();
                asignatura.setId(resultado.getInt("id"));
                asignatura.setCodigo(resultado.getString("codigo"));
                asignatura.setNombre(resultado.getString("nombre"));
                asignatura.setCreditos(resultado.getInt("creditos"));
                asignaturas.add(asignatura);

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
        return asignaturas;

    }

    public Asignaturas buscarPorId(int id) {
        Connection cone = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        Asignaturas Encontrado = null;

        try {
            cone = ConexionDB.getConexion();
            sentencia = cone.prepareStatement(buscarPorId);
            sentencia.setInt(1, id);
            resultado = sentencia.executeQuery();
            if (resultado.next()) {
                String codigo = resultado.getString("codigo");
                String nombre = resultado.getString("nombre");
                int creditos = resultado.getInt("creditos");            
                Encontrado = new Asignaturas(codigo, nombre, creditos);
                Encontrado.setId(id);
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

        return Encontrado;
    }

    /* metodo para insertar los registros */
    public int insertar(Asignaturas asignatura) {
        Connection cone = null;
        PreparedStatement sentancia = null;
        int registro = 0;
        try {
            cone = ConexionDB.getConexion();
            sentancia = cone.prepareStatement(insert);
            sentancia.setString(1, asignatura.getCodigo());
            sentancia.setString(2, asignatura.getNombre());
            sentancia.setInt(3, asignatura.getCreditos());
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

    /* Método para eliminar un registro */
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

    /* Método para actualizar los registros */
    public int actualizar(Asignaturas asignatura) {
        Connection cone = null;
        PreparedStatement sentencia = null;
        int registro = 0;
        try {
            cone = ConexionDB.getConexion();
            sentencia = cone.prepareStatement(update);
             sentencia.setString(1,asignatura.getCodigo());
            sentencia.setString(2,asignatura.getNombre());
            sentencia.setInt(3, asignatura.getCreditos());
                sentencia.setInt(4, asignatura.getId());

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
