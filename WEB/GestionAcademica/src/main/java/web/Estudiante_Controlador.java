package web;

import dominio.Estudiantes;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sqls.EstudianteDAO;

@WebServlet("/Estudiante_Controlador")
public class Estudiante_Controlador extends HttpServlet {

    EstudianteDAO estuDAO;

    public Estudiante_Controlador() {
        super();
        estuDAO = new EstudianteDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String action = request.getParameter("action");
        String ruta = "";
        if (action.equals("inicio")) {
            try {
                request.setAttribute("estudiantes", estuDAO.mostrar());
                request.setAttribute("promedios", Math.round(estuDAO.promedio() * 100.0) / 100.0);
                ruta = "estudiante.jsp";
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        } else if (action.equalsIgnoreCase("eliminar")) {
            try {
                int id = Integer.parseInt(request.getParameter("id"));
                int registrosEliminados = estuDAO.eliminar(id);

                if (registrosEliminados > 0) {
                    request.setAttribute("eliminacionExitosa", String.valueOf(registrosEliminados));
                } else {
                    request.setAttribute("eliminacionExitosa", String.valueOf(registrosEliminados));
                }
                request.setAttribute("estudiantes", estuDAO.mostrar());
                request.setAttribute("promedios", Math.round(estuDAO.promedio() * 100.0) / 100.0);
                ruta = "estudiante.jsp";
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        } else if (action.equals("editar")) {
            try {
                int id = Integer.parseInt(request.getParameter("id"));
                Estudiantes estu = estuDAO.buscarPorId(id);

                request.setAttribute("estudiante", estu);
                ruta = "ActualizarEstudiante.jsp";
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        request.getRequestDispatcher(ruta).forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener los parámetros del formulario
        String ruta = "";
        int cc = Integer.parseInt(request.getParameter("cc"));
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String email = request.getParameter("email");
        String telefono = request.getParameter("telefono");
        double promedio = Double.parseDouble(request.getParameter("promedio"));

        int bandera = 0;
        String banderaParam = request.getParameter("bandera");
        if (banderaParam != null) {
            bandera = Integer.parseInt(banderaParam);
        }

        Estudiantes estu = new Estudiantes();
        estu.setCc(cc);
        estu.setNombre(nombre);
        estu.setApellido(apellido);
        estu.setEmail(email);
        estu.setTelfono(telefono);
        estu.setPromedio(promedio);

        try {
            if (bandera == 0) {
                int registrosInsertados = estuDAO.insertar(estu);
                if (registrosInsertados > 0) {
                    request.setAttribute("registroExitoso", String.valueOf(registrosInsertados));
                } else {
                    // Error en la inserción
                    request.setAttribute("registroExitoso", registrosInsertados);
                }
                ruta = "RegistroEstudiante.jsp";
            } else if (bandera == 1) {

                int id = Integer.parseInt(request.getParameter("id"));
                estu.setId(id);

                request.setAttribute("modificacion", estuDAO.actualizar(estu));
                request.setAttribute("estudiantes", estuDAO.mostrar());
                request.setAttribute("promedios", Math.round(estuDAO.promedio() * 100.0) / 100.0);
                int registrosActualizados = estuDAO.actualizar(estu);

                if (registrosActualizados > 0) {
                    // Actualización exitosa
                    request.setAttribute("alerta", "Modificación exitosa");
                } else {
                    // Error en la actualización
                    request.setAttribute("alerta", "Error al actualizar los datos");
                }

                ruta = "estudiante.jsp";
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
            request.setAttribute("registroExitoso", "Error en el servidor");
        }

        request.getRequestDispatcher(ruta).forward(request, response);
    }

}
