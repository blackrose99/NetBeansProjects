package web;

import dominio.Libros;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sqls.LibroDAO;

@WebServlet("/Libros_Controlador")
public class Libros_Controlador extends HttpServlet {

    private LibroDAO libroDAO;

    @Override
    public void init() throws ServletException {
        super.init();
        libroDAO = new LibroDAO();
    }

    @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String action = request.getParameter("action");
    String ruta = "";

    if (action != null) {
        if (action.equals("inicio")) {
            try {
                ruta = "libros.jsp";
                request.setAttribute("libros", libroDAO.mostrar());
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (action.equalsIgnoreCase("eliminar")) {
            try {
                ruta = "libros.jsp";
                int id = Integer.parseInt(request.getParameter("id"));
                request.setAttribute("eliminado", libroDAO.eliminar(id));
                request.setAttribute("libros", libroDAO.mostrar());
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (action.equals("editar")) {
            try {
                ruta = "Actualizar_libro.jsp";                 
                int idLibro = Integer.parseInt(request.getParameter("id"));
                
                Libros libro = libroDAO.buscarPorId(idLibro);
                request.setAttribute("libros", libro);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    request.getRequestDispatcher(ruta).forward(request, response);
}


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String titulo = request.getParameter("titulo");
        String autor = request.getParameter("autor");
        int fecha = Integer.parseInt(request.getParameter("fecha"));
        String genero = request.getParameter("genero");

        int bandera = 0;
        String banderaParam = request.getParameter("bandera");
        if (banderaParam != null) {
            bandera = Integer.parseInt(banderaParam);
        }
        Libros libro = new Libros();
        libro.setTitulo(titulo);
        libro.setAutor(autor);
        libro.setFecha(fecha);
        libro.setGenero(genero);
        try {
            if (bandera == 0) {
                request.setAttribute("helo", libroDAO.insertar(libro));
                request.setAttribute("libros", libroDAO.mostrar());
            } else if (bandera == 1) {
                int id = Integer.parseInt(request.getParameter("id"));
                libro.setId(id);
                request.setAttribute("modificacion", libroDAO.actualizar(libro));
                request.setAttribute("libros", libroDAO.mostrar());
            }
        } 
        catch (Exception e) {
            e.printStackTrace(System.out);
        }
        request.getRequestDispatcher("libros.jsp").forward(request, response);
    }
}
