package sqls;

import dominio.Asignaturas;
import dominio.Estudiantes;
import dominio.Matriculas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MatriculaDAO {

    private static final String select = "SELECT DISTINCT  matriculas.id, estudiantes.id, estudiantes.cc, estudiantes.nombre, estudiantes.apellido , asignaturas.id, asignaturas.codigo, asignaturas.nombre,asignaturas.creditos FROM matriculas INNER JOIN estudiantes ON matriculas.id_estudiante = estudiantes.id  INNER JOIN asignaturas ON matriculas.id_asignatura = asignaturas.id ORDER BY matriculas.id";
    private static final String insert = "insert into matriculas(id_estudiante, id_asignatura) values(?, ?)";
    private static final String update = "update matriculas set id_estudiante = ? , id_asignatura = ? where id = ?";
    private static final String delete = "delete from matriculas where id = ?";
    private static final String buscarPorId = "SELECT * FROM matriculas WHERE id = ?";

    public List<Matriculas> mostrar() {
        Connection cone = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        List<Matriculas> matriculas = new ArrayList<>();

        try {
            cone = ConexionDB.getConexion();
            sentencia = cone.prepareStatement(select);
            resultado = sentencia.executeQuery();

            while (resultado.next()) {
                Matriculas m = new Matriculas();
                Estudiantes e = new Estudiantes();
                Asignaturas a = new Asignaturas();
                m.setId(resultado.getInt("matriculas.id"));
                e.setId(resultado.getInt("estudiantes.id"));
                e.setCc(resultado.getInt("estudiantes.cc"));
                e.setNombre(resultado.getString("estudiantes.nombre"));
                e.setApellido(resultado.getString("estudiantes.apellido"));
                a.setId(resultado.getInt("asignaturas.id"));
                a.setCodigo(resultado.getString("asignaturas.codigo"));
                a.setNombre(resultado.getString("asignaturas.nombre"));
                a.setCreditos(resultado.getInt("asignaturas.creditos"));
                m.setEstudiante(e);
                m.setAsignatura(a);
                matriculas.add(m);
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

        return matriculas;
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

    public int insertar(Matriculas matricula) {

        Connection cone = null;
        PreparedStatement sentancia = null;
        int registro = 0;
        try {
            cone = ConexionDB.getConexion();
            sentancia = cone.prepareStatement(insert);
            sentancia.setInt(1, matricula.estudiante.getId());
            sentancia.setInt(2, matricula.asignatura.getId());
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

    public Matriculas buscarPorId(int id){
        Connection cone = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        Matriculas m = new Matriculas();

        try {
            cone = ConexionDB.getConexion();
            sentencia = cone.prepareStatement(buscarPorId);
            sentencia.setInt(1, id);
            resultado = sentencia.executeQuery();

            if (resultado.next()) {
                Estudiantes e = new Estudiantes();
                Asignaturas a = new Asignaturas();
                m.setId(resultado.getInt(1));
                e.setId(resultado.getInt(2));
                a.setId(resultado.getInt(3));             
                m.setEstudiante(e);
                m.setAsignatura(a);
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

        return m;
    }
   public int actualizar(Matriculas matricula) {
        Connection cone = null;
        PreparedStatement sentencia = null;
        int registro = 0;
        try {
            cone = ConexionDB.getConexion();
            sentencia = cone.prepareStatement(update);
            sentencia.setInt(1, matricula.estudiante.getId());
            sentencia.setInt(2, matricula.asignatura.getId());
            sentencia.setInt(3,matricula.getId());
            
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
