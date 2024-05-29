package datos;

import dominio.Clientes;
import java.sql.Connection;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class clienteDAO {

    private static final String select = "select *from clientes";
    private static final String insert = "insert into clientes(nombre,apellido,email,telefono,saldo) values(?, ?, ?, ? ,?)";
    private static final String update = "update clientes set nombre = ? , apellido = ? , email = ? , telefono = ? , saldo = ? where id = ?";
    private static final String delete = "delete from clientes where id = ?";
    private static final String buscarPorId = "SELECT nombre, apellido, email, telefono , saldo FROM clientes WHERE id = ?";

    public List<Clientes> mostrar() {
        Connection cone = null;
        PreparedStatement sentancia = null;
        ResultSet resultado = null;
        Clientes cliente = null;
        List<Clientes> clientes = new ArrayList<>();
        try {
            cone = ConexionDB.getConexion();
            sentancia = cone.prepareStatement(select);
            resultado = sentancia.executeQuery();

            while (resultado.next()) {
                cliente = new Clientes();
                cliente.setId(resultado.getInt("id"));
                cliente.setNombre(resultado.getString("nombre"));
                cliente.setApellido(resultado.getString("apellido"));
                cliente.setEmail(resultado.getString("email"));
                cliente.setTelfono(resultado.getString("telefono"));
                cliente.setSueldo(resultado.getDouble("saldo"));
                clientes.add(cliente);

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
        return clientes;

    }

    public Clientes buscarPorId(int id) {
        Connection cone = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        Clientes clienteEncontrado = null;

        try {
            cone = ConexionDB.getConexion();
            sentencia = cone.prepareStatement(buscarPorId);
            sentencia.setInt(1, id);
            resultado = sentencia.executeQuery();

            if (resultado.next()) {
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                String email = resultado.getString("email");
                String telefono = resultado.getString("telefono");
                double saldo = resultado.getDouble("saldo");

                clienteEncontrado = new Clientes(nombre, apellido, email, telefono, saldo);
                clienteEncontrado.setId(id);
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

        return clienteEncontrado;
    }

    /* metodo para insertar los registros */
    public int insertar(Clientes client) {
        Connection cone = null;
        PreparedStatement sentancia = null;
        int registro = 0;
        try {
            cone = ConexionDB.getConexion();
            sentancia = cone.prepareStatement(insert);
            sentancia.setString(1, client.getNombre());
            sentancia.setString(2, client.getApellido());
            sentancia.setString(3, client.getEmail());
            sentancia.setString(4, client.getTelfono());
            sentancia.setDouble(5, client.getSueldo());
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
    public int actualizar(Clientes client) {
        Connection cone = null;
        PreparedStatement sentencia = null;
        int registro = 0;
        try {
            cone = ConexionDB.getConexion();
            sentencia = cone.prepareStatement(update);
            sentencia.setString(1,client.getNombre());
            sentencia.setString(2,client.getApellido());
            sentencia.setString(3,client.getEmail());
            sentencia.setString(4,client.getTelfono());
            sentencia.setDouble(5,client.getSueldo());
            sentencia.setInt(6,client.getId());
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
