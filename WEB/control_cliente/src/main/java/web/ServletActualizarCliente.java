package web;

import datos.clienteDAO;
import dominio.Clientes;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletActualizarCliente")
public class ServletActualizarCliente extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener los parámetros del formulario
        int id = Integer.parseInt(request.getParameter("id"));
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String email = request.getParameter("email");
        String telefono = request.getParameter("telefono");
        double saldo = Double.parseDouble(request.getParameter("saldo"));
        // Crear un objeto Clientes con los datos del formulario
        Clientes cliente = new Clientes();
        cliente.setId(id);
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setEmail(email);
        cliente.setTelfono(telefono);
        cliente.setSueldo(saldo);

        // Llamar al método actualizar de la clase clienteDAO
        clienteDAO clienteDAO = new clienteDAO(); // Se corrige el nombre de la clase clienteDAO a ClienteDAO (inicial en mayúscula)
        int registrosActualizados = clienteDAO.actualizar(cliente);
        // Verificar el resultado de la actualización
        if (registrosActualizados > 0) {
            request.setAttribute("actualizacionExitosa", String.valueOf(registrosActualizados));
            request.getRequestDispatcher("actualizar.jsp").forward(request, response);
        } else if (registrosActualizados < 1) {
            request.setAttribute("actualizacionExitosa", registrosActualizados);
            request.getRequestDispatcher("actualizar.jsp").forward(request, response);

        }
    }

}
