package Controlador;

import Modelo.SitiosDAO;
import Modelo.SitiosTuristicos;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProgramarVisita_Controlador")
public class ProgramarVisita_Controlador extends HttpServlet {

    SitiosDAO citiDAO;

    public ProgramarVisita_Controlador() {
        super();
        citiDAO = new SitiosDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] sitioIds = request.getParameterValues("sitioId");
        ArrayList<SitiosTuristicos> sitiosSeleccionados = new ArrayList<>();

        if (sitioIds != null) {
            for (String sitioId : sitioIds) {
                // Aquí debes implementar la lógica para obtener los detalles del sitio por su ID
                SitiosTuristicos sitio = citiDAO.buscarSitios2(Integer.parseInt(sitioId)); // Reemplaza con tu lógica
                if (sitio != null) {
                    sitiosSeleccionados.add(sitio);
                }
            }
        }

        // Obtener la fecha de visita
        String fechaVisita = request.getParameter("fecha");

        // Guardar los sitios seleccionados y la fecha en el objeto request
        request.setAttribute("sitiosSeleccionados", sitiosSeleccionados);
        request.setAttribute("fechaVisita", fechaVisita);

        // Redireccionar a reserva.jsp
        request.getRequestDispatcher("reservas.jsp").forward(request, response);
    }
}
