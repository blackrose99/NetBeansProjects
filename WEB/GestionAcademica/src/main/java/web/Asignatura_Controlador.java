package web;

import dominio.Asignaturas;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sqls.AsignaturaDAO;

@WebServlet("/Asignatura_Controlador")
public class Asignatura_Controlador extends HttpServlet {

    AsignaturaDAO asigDAO;

    public Asignatura_Controlador() {
        super();
        asigDAO = new AsignaturaDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String action = request.getParameter("action");
        String ruta = "";

        if (action.equals("inicio")) {
            try {
                ruta = "asignatura.jsp";
                request.setAttribute("asignaturas", asigDAO.mostrar());
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (action.equalsIgnoreCase("eliminar")) {
            try {
                int id = Integer.parseInt(request.getParameter("id"));
                int registrosEliminados = asigDAO.eliminar(id);

                if (registrosEliminados > 0) {
                    request.setAttribute("eliminacionExitosa", String.valueOf(registrosEliminados));
                } else {
                    request.setAttribute("eliminacionExitosa", String.valueOf(registrosEliminados));
                }
                ruta = "asignatura.jsp";
                request.setAttribute("asignaturas", asigDAO.mostrar());
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (action.equals("editar")) {
            try {
                ruta = "ActualizarAsignatura.jsp";
                int idAsignatura = Integer.parseInt(request.getParameter("id"));
                Asignaturas asignatura = asigDAO.buscarPorId(idAsignatura);
                request.setAttribute("asignatura", asignatura);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        request.getRequestDispatcher(ruta).forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener los parámetros del formulario
        String ruta = "";
        String codigo = request.getParameter("codigo");
        String nombre = request.getParameter("nombre");
        int creditos = Integer.parseInt(request.getParameter("creditos"));
        
        int bandera = 0;
        String banderaParam = request.getParameter("bandera");
        if (banderaParam != null) {
            bandera = Integer.parseInt(banderaParam);
        }

        // Crear un objeto Asignaturas con los datos del formulario
        Asignaturas asignatura = new Asignaturas();
        asignatura.setCodigo(codigo);
        asignatura.setNombre(nombre);
        asignatura.setCreditos(creditos);

        try {
            if (bandera == 0) {
                int registrosInsertados = asigDAO.insertar(asignatura);
                if (registrosInsertados > 0) {
                    request.setAttribute("registroExitoso", String.valueOf(registrosInsertados));
                } else {
                    // Error en la inserción
                    request.setAttribute("registroExitoso", registrosInsertados);
                }
                ruta = "RegistroAsignatura.jsp";
            } else if (bandera == 1) {
                
                int id = Integer.parseInt(request.getParameter("id"));
                asignatura.setId(id);

                request.setAttribute("modificacion", asigDAO.actualizar(asignatura));           
                request.setAttribute("asignaturas", asigDAO.mostrar());
                int registrosActualizados = asigDAO.actualizar(asignatura);
                
                if (registrosActualizados > 0) {
                    request.setAttribute("alerta", "Modificación exitosa");
                } else {
                    request.setAttribute("alerta", "Error al actualizar los datos");
                }
                ruta = "asignatura.jsp";
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
            request.setAttribute("registroExitoso", "Error en el servidor");
        }

        request.getRequestDispatcher(ruta).forward(request, response);
    }

}
