package web;

import datos.clienteDAO;
import dominio.Clientes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletBuscarID")
public class ServletBuscarID extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        Clientes cliente = new clienteDAO().buscarPorId(id);
        List<Clientes> clientes = new ArrayList<>();
        if (cliente != null) {
            clientes.add(cliente);
            request.setAttribute("clientes", clientes);
            request.getRequestDispatcher("actualizar.jsp").forward(request, response);
        } else {
            request.setAttribute("BuscariID", 0);
            request.setAttribute("errorcito", id);
            request.getRequestDispatcher("actualizar.jsp").forward(request, response);
        }

    }

}
