package sqls;

import dominio.Libros;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LibroDAO {

    private static final String select = "select *from libros";
    private static final String insert = "insert into libros(titulo, autor, fecha_publicacion, genero) values(?, ?, ?, ?)";
    private static final String update = "UPDATE libros SET titulo = ?, autor = ?, fecha_publicacion = ?, genero = ? WHERE id = ?";
    private static final String delete = "delete from libros where id = ?";
    private static final String buscarPorId = "SELECT titulo, autor, fecha_publicacion, genero FROM libros WHERE id = ?";

    public List<Libros> mostrar() {
        Connection conexion = null;
        PreparedStatement sentancia = null;
        ResultSet resultado = null;
        Libros asignatura = null;
        List<Libros> asignaturas = new ArrayList<>();
        try {
            conexion = ConexionDB.getConexion();
            sentancia = conexion.prepareStatement(select);
            resultado = sentancia.executeQuery();

            while (resultado.next()) {
                asignatura = new Libros();
                asignatura.setId(resultado.getInt(1));
                asignatura.setTitulo(resultado.getString(2));
                asignatura.setAutor(resultado.getString(3));
                asignatura.setFecha(resultado.getInt(4));
                asignatura.setGenero(resultado.getString(5));
                asignaturas.add(asignatura);

            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                ConexionDB.cerrar(resultado);
                ConexionDB.Cerar(sentancia);
                ConexionDB.Cerrar(conexion);

            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return asignaturas;

    }

  public Libros buscarPorId(int id) {
    Connection conexion = null;
    PreparedStatement sentencia = null;
    ResultSet resultado = null;
    Libros encontrado = null;

    try {
        conexion = ConexionDB.getConexion();
        sentencia = conexion.prepareStatement(buscarPorId);
        sentencia.setInt(1, id);
        resultado = sentencia.executeQuery();
        if (resultado.next()) {
            String titulo = resultado.getString("titulo");
            String autor = resultado.getString("autor");
            int fecha = resultado.getInt("fecha_publicacion");
            String genero = resultado.getString("genero");
            encontrado = new Libros(titulo, autor, genero, fecha);
            encontrado.setId(id);
        }
    } catch (SQLException e) {
        e.printStackTrace(System.out);
    } finally {
        try {
            ConexionDB.cerrar(resultado);
            ConexionDB.cerrar(sentencia);
            ConexionDB.Cerrar(conexion);
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }

    return encontrado;
}


    /* metodo para insertar los registros */
    public int insertar(Libros libro) {
        Connection conexion = null;
        PreparedStatement sentencia = null;
        int registro = 0;
        try {
            conexion = ConexionDB.getConexion();
            sentencia = conexion.prepareStatement(insert);
            sentencia.setString(1, libro.getTitulo());
            sentencia.setString(2, libro.getAutor());
            sentencia.setInt(3, libro.getFecha());
            sentencia.setString(4, libro.getGenero());
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
    public int actualizar(Libros libro) {
        Connection conexion = null;
        PreparedStatement sentencia = null;
        int registro = 0;
        try {
            conexion = ConexionDB.getConexion();
            sentencia = conexion.prepareStatement(update);
            sentencia.setString(1, libro.getTitulo());
            sentencia.setString(2, libro.getAutor());
            sentencia.setInt(3, libro.getFecha());
            sentencia.setString(4, libro.getGenero());
            sentencia.setInt(5, libro.getId());

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
