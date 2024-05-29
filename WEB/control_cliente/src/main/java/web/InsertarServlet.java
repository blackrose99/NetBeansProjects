
package web;

import datos.clienteDAO;
import dominio.Clientes;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InsertarServlet")
public class InsertarServlet extends HttpServlet {
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener los parámetros del formulario
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String email = request.getParameter("email");
        String telefono = request.getParameter("telefono");
        double saldo = Double.parseDouble(request.getParameter("saldo"));
        
        // Crear un objeto Clientes con los datos del formulario
        Clientes cliente = new Clientes();
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setEmail(email);
        cliente.setTelfono(telefono);
        cliente.setSueldo(saldo);

        // Llamar al método insertar de la clase ClienteDAO
        clienteDAO clienteDAO = new clienteDAO();
        int registrosInsertados = clienteDAO.insertar(cliente);

        // Verificar el resultado de la inserción
        if (registrosInsertados > 0) {
            request.setAttribute("registroExitoso", String.valueOf(registrosInsertados));
            request.getRequestDispatcher("Formulario.jsp").forward(request, response);
        } else if (registrosInsertados < 1 ){
            // Error en la inserción
            request.setAttribute("registroExitoso", String.valueOf(registrosInsertados));
            request.getRequestDispatcher("Formulario.jsp").forward(request, response);
        }

    }
}
