package web;
import datos.clienteDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletEliminarCliente")

public class ServletEliminarCliente extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idCliente = Integer.parseInt(request.getParameter("id"));
        // Llamar al método insertar de la clase ClienteDAO
        clienteDAO clienteDAO = new clienteDAO();
        int registrosEliminados = clienteDAO.eliminar(idCliente);

        if (registrosEliminados > 0) {
            // Eliminación exitosa
            request.setAttribute("eliminacionExitosa", String.valueOf(registrosEliminados));
            request.getRequestDispatcher("eliminar.jsp").forward(request, response);
        } else if(registrosEliminados == 0) {
            // Error en la eliminación
            request.setAttribute("eliminacionExitosa", String.valueOf(registrosEliminados));  
            request.getRequestDispatcher("eliminar.jsp").forward(request, response);
        }

    }
}
