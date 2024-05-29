package web;

import dominio.Asignaturas;
import dominio.Estudiantes;
import dominio.Matriculas;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sqls.AsignaturaDAO;
import sqls.EstudianteDAO;
import sqls.MatriculaDAO;

@WebServlet("/Matricula_Controlador")
public class Matricula_Controlador extends HttpServlet {

    MatriculaDAO maDAO;
    EstudianteDAO estu;
    AsignaturaDAO asig;

    public Matricula_Controlador() {
        super();
        maDAO = new MatriculaDAO();
        estu = new EstudianteDAO();
        asig = new AsignaturaDAO();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String action = request.getParameter("action");
        String ruta = "";
        String cmbAlumno = request.getParameter("cmbAlumno");
        String cmbAsignatura = request.getParameter("cmbAsignatura");
        if (action.equals("inicio")) {
            try {
                request.setAttribute("matriculas", maDAO.mostrar());
                ruta = "matricula.jsp";
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        } else if (action.equalsIgnoreCase("eliminar")) {
            try {
                int id = Integer.parseInt(request.getParameter("id"));
                int registrosEliminados = maDAO.eliminar(id);
                if (registrosEliminados > 0) {
                    request.setAttribute("eliminacionExitosa", String.valueOf(registrosEliminados));
                } else {
                    request.setAttribute("eliminacionExitosa", String.valueOf(registrosEliminados));
                }
                request.setAttribute("matriculas", maDAO.mostrar());
                ruta = "matricula.jsp";
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        } else if (action.equals("lista")) {
            try {
                request.setAttribute("estudiantes", estu.mostrar());
                request.setAttribute("asignaturas", asig.mostrar());
                ruta = "RegistroMatricula.jsp";
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        }
        else if (action.equalsIgnoreCase("editar")) {      
                     ruta = "RegistroMatricula.jsp";
             try {
                   int id = Integer.parseInt(request.getParameter("id"));
                   request.setAttribute("matriculas", maDAO.buscarPorId(id));
                   request.setAttribute("estudiantes", estu.mostrar());
                   request.setAttribute("asignaturas", asig.mostrar());          
            } catch (Exception e) {
            }
                               
        }
        request.getRequestDispatcher(ruta).forward(request, response);
    }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String action = request.getParameter("action");
    String ruta = "";
    int id_estu = Integer.parseInt(request.getParameter("cmbAlumno"));
    int id_asig = Integer.parseInt(request.getParameter("cmbAsignatura"));        
    String id = request.getParameter("id");
    Estudiantes alu = new Estudiantes();
    Asignaturas asi = new Asignaturas();
    Matriculas ma = new Matriculas();
    alu.setId(id_estu);
    asi.setId(id_asig);
    ma.setEstudiante(alu);
    ma.setAsignatura(asi);
    
    if (id == null || id.isEmpty()) {
        try {
            int registrosInsertados = maDAO.insertar(ma);   
            if (registrosInsertados > 0) {
                request.setAttribute("registroExitoso", String.valueOf(registrosInsertados));
                try {
                    request.setAttribute("estudiantes", estu.mostrar());
                    request.setAttribute("asignaturas", asig.mostrar());
                    ruta = "RegistroMatricula.jsp";
                } catch (Exception e) {
                    e.printStackTrace(System.out);
                }
            } else {
                // Error en la inserción
                request.setAttribute("registroExitoso", String.valueOf(registrosInsertados));
                ruta = "RegistroMatricula.jsp";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    } else {
        ma.setId(Integer.parseInt(id));
        
        int registrosActualizados = maDAO.actualizar(ma);
        request.setAttribute("matriculas", maDAO.mostrar());
        if (registrosActualizados > 0) {
            // Actualización exitosa
            request.setAttribute("alerta", "Modificación exitosa");
        } else {
            // Error en la actualización
            request.setAttribute("alerta", "Error al actualizar los datos");
        }
        ruta = "matricula.jsp";
    }
    
    request.getRequestDispatcher(ruta).forward(request, response);
}


}
