package datos;

import dominio.empleado;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class empleadoDAO {

    private static final String select = "select *from persona";
    private static final String insert = "insert into persona(nombre,apellido,email,telefono) values(?, ?, ?, ?)";
    private static final String update = "update persona set nombre = ? , apellido = ? , email = ? , telefono = ? where id = ?";
    private static final String delete = "delete from persona where id = ?";
    private static final String buscarPorId = "SELECT nombre, apellido, email, telefono FROM empleados WHERE id = ?";


    /* Metodo para mostrar los datos en un array */
    public List<empleado> mostrar() {
        Connection cone = null;
        PreparedStatement sentancia = null;
        ResultSet resultado = null;
        empleado empleado = null;
        List<empleado> empleados = new ArrayList<>();
        try {
            cone = conexion.getConexion();
            sentancia = cone.prepareStatement(select);
            resultado = sentancia.executeQuery();

            while (resultado.next()) {
                empleado = new empleado();
                empleado.setId(resultado.getInt("id"));
                empleado.setName(resultado.getString("nombre"));
                empleado.setApellido(resultado.getString("apellido"));
                empleado.setEmail(resultado.getString("email"));
                empleado.setTelefono(resultado.getString("telefono"));
                empleados.add(empleado);

            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                conexion.cerrar(resultado);
                conexion.Cerar(sentancia);
                conexion.Cerrar(cone);

            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return empleados;

    }

    /* metodo para insertar los registros */
    public int insertar(empleado emple) {
        Connection cone = null;
        PreparedStatement sentancia = null;
        int registro = 0;
        try {
            cone = conexion.getConexion();
            sentancia = cone.prepareStatement(insert);
            sentancia.setString(1, emple.getName());
            sentancia.setString(2, emple.getApellido());
            sentancia.setString(3, emple.getEmail());
            sentancia.setString(4, emple.getTelefono());
            registro = sentancia.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                conexion.Cerar(sentancia);
                conexion.Cerrar(cone);

            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }

        return registro;
    }

    /* Método para actualizar los registros */
    public int actualizar(empleado emple) {
        Connection cone = null;
        PreparedStatement sentencia = null;
        int registro = 0;
        try {
            cone = conexion.getConexion();
            sentencia = cone.prepareStatement(update);
            sentencia.setString(1, emple.getName());
            sentencia.setString(2, emple.getApellido());
            sentencia.setString(3, emple.getEmail());
            sentencia.setString(4, emple.getTelefono());
            sentencia.setInt(5, emple.getId());
            registro = sentencia.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                conexion.cerrar(sentencia);
                conexion.Cerrar(cone);
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
            cone = conexion.getConexion();
            sentencia = cone.prepareStatement(delete);
            sentencia.setInt(1, id);
            registro = sentencia.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                conexion.cerrar(sentencia);
                conexion.Cerrar(cone);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return registro;
    }
    
    public empleado buscarEmpleadoPorId(int id) {
    Connection cone = null;
    PreparedStatement sentencia = null;
    ResultSet resultado = null;
    empleado empleadoEncontrado = null;

    try {
        cone = conexion.getConexion();
        sentencia = cone.prepareStatement(buscarPorId);
        sentencia.setInt(1, id);
        resultado = sentencia.executeQuery();

        if (resultado.next()) {
            String nombre = resultado.getString("nombre");
            String apellido = resultado.getString("apellido");
            String email = resultado.getString("email");
            String telefono = resultado.getString("telefono");

            empleadoEncontrado = new empleado(nombre, apellido, email, telefono);
            empleadoEncontrado.setId(id);
        }
    } catch (SQLException e) {
        e.printStackTrace(System.out);
    } finally {
        try {
            conexion.cerrar(resultado);
            conexion.Cerar(sentencia);
            conexion.Cerrar(cone);
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }

    return empleadoEncontrado;
}


}
