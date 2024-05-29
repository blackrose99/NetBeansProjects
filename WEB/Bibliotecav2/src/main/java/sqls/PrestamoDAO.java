package sqls;

import dominio.Libros;
import dominio.Usuarios;
import dominio.Prestamos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PrestamoDAO {

    private static final String select = "SELECT DISTINCT prestamos.id, prestamos.id_libro, libros.titulo,  prestamos.fechap_prestamo, prestamos.fecha_devolucion, prestamos.id_usuario, usuarios.nombre, usuarios.apellido FROM prestamos INNER JOIN libros ON prestamos.id_libro = libros.id INNER JOIN usuarios ON prestamos.id_usuario = usuarios.id ORDER BY prestamos.id";

    private static final String insert = "INSERT INTO prestamos (id_libro, id_usuario, fechap_prestamo, fecha_devolucion) VALUES (?, ?, ?, ?)";

    private static final String delete = "DELETE FROM prestamos WHERE id = ?";


       public List<Prestamos> mostrar() {
        Connection cone = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        List<Prestamos> prestamos = new ArrayList<>();

        try {
            cone = ConexionDB.getConexion();
            sentencia = cone.prepareStatement(select);
            resultado = sentencia.executeQuery();

            while (resultado.next()) {
                Prestamos p = new Prestamos();
                Usuarios u = new Usuarios();
                Libros l = new Libros();
                p.setId(resultado.getInt("id"));
                l.setId(resultado.getInt("id_libro"));
                l.setTitulo(resultado.getString("titulo"));
                p.setFechaPrestamo(resultado.getString("fechap_prestamo"));
                p.setFechaEntrega(resultado.getString("fecha_devolucion"));
                u.setId(resultado.getInt("id_usuario"));
                u.setNombre(resultado.getString("nombre"));                           
                p.setUser(u);
                p.setLibro(l);
                prestamos.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ConexionDB.cerrar(resultado);
                ConexionDB.cerrar(sentencia);
                ConexionDB.Cerrar(cone);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return prestamos;
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

    public int insertar(Prestamos prestamo) {
        Connection cone = null;
        PreparedStatement sentencia = null;
        int registro = 0;
        try {
            cone = ConexionDB.getConexion();
            sentencia = cone.prepareStatement(insert);
            sentencia.setInt(1, prestamo.getLibro().getId());
            sentencia.setInt(2, prestamo.getUser().getId());
            sentencia.setString(3, prestamo.getFechaPrestamo());
            sentencia.setString(4, prestamo.getFechaEntrega());
            registro = sentencia.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                ConexionDB.Cerar(sentencia);
                ConexionDB.Cerrar(cone);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }

        return registro;
    }

   
}
