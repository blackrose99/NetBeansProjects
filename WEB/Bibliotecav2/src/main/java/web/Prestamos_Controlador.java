package web;

import dominio.Libros;
import dominio.Usuarios;
import dominio.Prestamos;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sqls.LibroDAO;
import sqls.UsuarioDAO;
import sqls.PrestamoDAO;

@WebServlet("/Prestamos_Controlador")
public class Prestamos_Controlador extends HttpServlet {

    PrestamoDAO prestamoDAO;
    UsuarioDAO usuarioDAO;
    LibroDAO libroDAO;

    public Prestamos_Controlador() {
        super();
        prestamoDAO = new PrestamoDAO();
        usuarioDAO = new UsuarioDAO();
        libroDAO = new LibroDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String action = request.getParameter("action");
        if (action.equals("inicio")) {
            try {
                request.setAttribute("prestamos", prestamoDAO.mostrar());
                request.setAttribute("usuarios", usuarioDAO.mostrar());
                request.setAttribute("libros", libroDAO.mostrar());
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        } else if (action.equalsIgnoreCase("eliminar")) {
            int id = Integer.parseInt(request.getParameter("id"));
            request.setAttribute("eliminado", prestamoDAO.eliminar(id));
            request.setAttribute("prestamos", prestamoDAO.mostrar());
            request.setAttribute("usuarios", usuarioDAO.mostrar());
            request.setAttribute("libros", libroDAO.mostrar());

        }

        request.getRequestDispatcher("prestamos.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    int id_libro = Integer.parseInt(request.getParameter("id_libro"));
    int id_usuario = Integer.parseInt(request.getParameter("id_usuario"));
    String fecha_prestamo = request.getParameter("fecha_prestamo");
    String fecha_devolucion = request.getParameter("fecha_devolucion");

    Usuarios usuario = new Usuarios();
    Libros libro = new Libros();
    Prestamos prestamo = new Prestamos();

    usuario.setId(id_usuario);
    libro.setId(id_libro);
    prestamo.setUser(usuario);
    prestamo.setLibro(libro);
    prestamo.setFechaPrestamo(fecha_prestamo);
    prestamo.setFechaEntrega(fecha_devolucion);

    request.setAttribute("insertar", prestamoDAO.insertar(prestamo));
    request.setAttribute("prestamos", prestamoDAO.mostrar());
    request.getRequestDispatcher("prestamos.jsp").forward(request, response);
}


}
