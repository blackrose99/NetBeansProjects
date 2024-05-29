package Controlador;

import Modelo.Ciudad;
import Modelo.CiudadDAO;
import Modelo.SitiosDAO;
import Modelo.SitiosTuristicos;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Sitios_Controlador")
public class Sitios_Controlador extends HttpServlet {

    CiudadDAO ciuDAO;
    SitiosDAO citiDAO;

    public Sitios_Controlador() {
        super();
        ciuDAO = new CiudadDAO();
        citiDAO = new SitiosDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String action = request.getParameter("action");
        String ruta = "";
        if (action.equalsIgnoreCase("eliminar")) {
            try {
                ruta = "/sitios/administracionSitios.jsp";
                int id = Integer.parseInt(request.getParameter("id"));
                int id2 = Integer.parseInt(request.getParameter("id2"));
                int id3 = citiDAO.obtenerCiudadIdPorId(id);

                int registrosEliminados = citiDAO.eliminar(id);
                if (registrosEliminados > 0) {
                    request.setAttribute("eliminacion", "Se Elimino Correcta mente");
                } else {
                    request.setAttribute("eliminacion", "No se Puede eliminar");
                }
                //request.setAttribute("id", id2);           
                request.setAttribute("sitios", citiDAO.busquePorId(id3));
              //  request.setAttribute("ciuadades", ciuDAO.buscarPorId(id2));

            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        } else if (action.equals("ver")) {
            try {
                int id = Integer.parseInt(request.getParameter("id"));
                request.setAttribute("ciuadades", ciuDAO.buscarPorId(id));
                request.setAttribute("sitios", citiDAO.busquePorId(id));
                ruta = "/sitios/registroSitios.jsp";
            } catch (Exception e) {
            }
        } else if (action.equals("ver2")) {
            try {
                int id = Integer.parseInt(request.getParameter("id"));
                request.setAttribute("sitios", citiDAO.buscarSitio(id));

                ruta = "/sitios/sitiosTuristicos.jsp";
            } catch (Exception e) {
            }
        } else if (action.equalsIgnoreCase("eliminar2")) {
            try {
                int id = Integer.parseInt(request.getParameter("id"));
                int registrosEliminados = citiDAO.eliminarTodos(id);
                if (registrosEliminados > 0) {
                    request.setAttribute("eliminacion", "Se Eliminaron Correcta mente los Registros");
                } else {
                    request.setAttribute("eliminacion", "No se Pueden eliminar losRegistros");
                }
                ruta = "/sitios/administracionSitios.jsp";
            } catch (Exception e) {
            }
        }
        request.getRequestDispatcher(ruta).forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ruta = "";

        int bandera = 0;

        String banderaParam = request.getParameter("bandera");
        if (banderaParam != null) {
            bandera = Integer.parseInt(banderaParam);
        }
        try {
            if (bandera == 1) {
                String name = request.getParameter("name");
                String direccion = request.getParameter("direccion");
                String descripcion = request.getParameter("descripcion");
                String hora_inicio = request.getParameter("hora_inicio");
                String hora_fin = request.getParameter("hora_fin");
                Double precio = Double.parseDouble(request.getParameter("precio"));
                int ciudad_id = Integer.parseInt(request.getParameter("id"));

                SitiosTuristicos sitio = new SitiosTuristicos();
                Ciudad ciudad = new Ciudad();
                sitio.setName(name);
                sitio.setDireccion(direccion);
                sitio.setDescripcion(descripcion);
                sitio.setHora_inicio(hora_inicio);
                sitio.setHora_fin(hora_fin);
                sitio.setPrecio(precio);
                ciudad.setId(ciudad_id);
                sitio.setCiudad(ciudad);

                int registrosInsertados = citiDAO.insertar(sitio);
                if (registrosInsertados > 0) {
                    request.setAttribute("insertar", "Se ha Registrado Correctamente");
                    ruta = "/sitios/administracionSitios.jsp";
                } else {
                    request.setAttribute("insertar", " No se puede Registrar ");
                    ruta = "/sitios/administracionSitios.jsp";
                }
                request.setAttribute("sitios", citiDAO.busquePorId(ciudad_id));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        request.getRequestDispatcher(ruta).forward(request, response);
    }
}
