
package sqls;

import dominio.Estudiantes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EstudianteDAO {
    private static final String select = "select * from estudiantes";
    private static final String insert = "insert into estudiantes(cc,nombre,apellido,email,telefono,promedio) values(?, ?, ?, ? ,?, ?)";
    private static final String update = "update estudiantes set cc = ? , nombre = ? , apellido = ? , email = ? , telefono = ? , promedio = ? where id = ?";
    private static final String delete = "delete from estudiantes where id = ?";
    private static final String buscarPorId = "SELECT cc, nombre, apellido, email, telefono , promedio FROM estudiantes WHERE id = ?";
       private static final String promedio = "SELECT AVG(promedio) AS promedio_grupo FROM estudiantes";

    public List<Estudiantes> mostrar() {
        Connection cone = null;
        PreparedStatement sentancia = null;
        ResultSet resultado = null;
        Estudiantes estudiante = null;
        List<Estudiantes> estudiantes = new ArrayList<>();
        try {
            cone = ConexionDB.getConexion();
            sentancia = cone.prepareStatement(select);
            resultado = sentancia.executeQuery();

            while (resultado.next()) {
                estudiante = new Estudiantes();
                estudiante.setId(resultado.getInt("id"));
                estudiante.setCc(resultado.getInt("cc"));
                estudiante.setNombre(resultado.getString("nombre"));
                estudiante.setApellido(resultado.getString("apellido"));
                estudiante.setEmail(resultado.getString("email"));
                estudiante.setTelfono(resultado.getString("telefono"));
                estudiante.setPromedio(resultado.getDouble("promedio"));
                estudiantes.add(estudiante);

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
        return estudiantes;

    }

    public Estudiantes buscarPorId(int id) {
        Connection cone = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        Estudiantes Encontrado = null;

        try {
            cone = ConexionDB.getConexion();
            sentencia = cone.prepareStatement(buscarPorId);
            sentencia.setInt(1, id);
            resultado = sentencia.executeQuery();

            if (resultado.next()) {
                int cc = resultado.getInt("cc");
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                String email = resultado.getString("email");
                String telefono = resultado.getString("telefono");
                double promedio = resultado.getDouble("promedio");

                Encontrado = new Estudiantes(cc, nombre, apellido, email, telefono, promedio);
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
    public int insertar(Estudiantes estudiante) {
        Connection cone = null;
        PreparedStatement sentancia = null;
        int registro = 0;
        try {
            cone = ConexionDB.getConexion();
            sentancia = cone.prepareStatement(insert);
            sentancia.setInt(1, estudiante.getCc());
            sentancia.setString(2, estudiante.getNombre());
            sentancia.setString(3, estudiante.getApellido());
            sentancia.setString(4, estudiante.getEmail());
            sentancia.setString(5, estudiante.getTelfono());
            sentancia.setDouble(6, estudiante.getPromedio());
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
    public int actualizar(Estudiantes estudiante) {
        Connection cone = null;
        PreparedStatement sentencia = null;
        int registro = 0;
        try {
            cone = ConexionDB.getConexion();
            sentencia = cone.prepareStatement(update);
            sentencia.setInt(1, estudiante.getCc());
            sentencia.setString(2,estudiante.getNombre());
            sentencia.setString(3,estudiante.getApellido());
            sentencia.setString(4,estudiante.getEmail());
            sentencia.setString(5,estudiante.getTelfono());
            sentencia.setDouble(6,estudiante.getPromedio());
            sentencia.setInt(7,estudiante.getId());
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

        public double promedio() {
        Connection cone = null;
        PreparedStatement sentencia = null;
        ResultSet resultSet = null;
        double promedio = 0;

        try {
            cone = ConexionDB.getConexion();
            sentencia = cone.prepareStatement(EstudianteDAO.promedio);
            resultSet = sentencia.executeQuery();

            if (resultSet.next()) {
                promedio = resultSet.getDouble(1);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (sentencia != null) {
                    sentencia.close();
                }
                if (cone != null) {
                    cone.close();
                }
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return promedio;
    }
}
