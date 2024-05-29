package Controlador;

import Modelo.SitiosDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelo.CiudadDAO;
import Modelo.Ciudad;

@WebServlet("/Ciudad_Controlador")
public class Ciudad_Controlador extends HttpServlet {

    CiudadDAO ciuDAO;
    SitiosDAO citiDAO;

    public Ciudad_Controlador() {
        super();
        ciuDAO = new CiudadDAO();
        citiDAO = new SitiosDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String action = request.getParameter("action");
        String ruta = "";

        if (action.equals("inicio")) {
            ruta = "/ciuadades/principal.jsp";
            try {
                request.setAttribute("ciudades", ciuDAO.mostrar());
                //aqui iba
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        } else if (action.equals("ver")) {
            try {
                int id = Integer.parseInt(request.getParameter("id"));
                request.setAttribute("ciuadades", ciuDAO.buscarPorId(id));
                request.setAttribute("sitios", citiDAO.busquePorId(id));
                //aqui va
                ruta = "/ciuadades/ciudades.jsp";

            } catch (Exception e) {
            }
        } else if (action.equalsIgnoreCase("eliminar")) {
            try {
                int id = Integer.parseInt(request.getParameter("id"));
                int registrosEliminados = ciuDAO.eliminar(id);
                if (registrosEliminados > 0) {
                    request.setAttribute("eliminacion", "Se Elimino Correcta mente");
                    request.setAttribute("ciudades", ciuDAO.mostrar());

                    ruta = "/ciuadades/administracion.jsp";
                } else {
                    request.setAttribute("eliminacion", "No se Puede eliminar por que la tabla esta relacionada si de sea borrarla primero tienes que eliminar todos los sitios turisticos de esa Ciudad");
                    ruta = "/ciuadades/ActualizarCiudad.jsp";
                    request.setAttribute("ciuadades", ciuDAO.buscarPorId(id));

                }

            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        } else if (action.equalsIgnoreCase("admin")) {
            request.setAttribute("ciudades", ciuDAO.mostrar());

            ruta = "/ciuadades/administracion.jsp";
        } else if (action.equals("ver2")) {
            try {
                int id = Integer.parseInt(request.getParameter("id"));
                request.setAttribute("ciuadades", ciuDAO.buscarPorId(id));
                request.setAttribute("sitios", citiDAO.busquePorId(id));
                ruta = "/sitios/administracionSitios.jsp";
            } catch (Exception e) {
            }
        } else if (action.equals("ver3")) {
            try {
                int id = Integer.parseInt(request.getParameter("id"));
                request.setAttribute("ciuadades", ciuDAO.buscarPorId(id));
                request.setAttribute("sitios", citiDAO.busquePorId(id));
                ruta = "registroSitios.jsp";
            } catch (Exception e) {
            }
        } else if (action.equals("editar")) {
            try {
                int id = Integer.parseInt(request.getParameter("id"));
                request.setAttribute("ciuadades", ciuDAO.buscarPorId(id));
                request.setAttribute("sitios", citiDAO.busquePorId(id));
                ruta = "/ciuadades/ActualizarCiudad.jsp";
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
            if (bandera == 0) {
                String user = request.getParameter("username");
                String pass = request.getParameter("password");

                if (user.equals("admin") && pass.equals("admin")) {
                    request.setAttribute("ciudades", ciuDAO.mostrar());
                    ruta = "/ciuadades/administracion.jsp";
                } else if (!user.equals("admin") && !pass.equals("admin")) {
                    request.setAttribute("alerta", "Usuario y Contraseña Incorrectos");
                    ruta = "login.jsp";
                } else if (!user.equals("admin")) {
                    request.setAttribute("alerta", "Usuario Incorrecto");
                    ruta = "login.jsp";
                } else if (!pass.equals("admin")) {
                    request.setAttribute("alerta", "Contraseña Incorrecta");
                    ruta = "login.jsp";
                }
            } else if (bandera == 1) {
                String name = request.getParameter("name");
                String depto = request.getParameter("depto");
                String pais = request.getParameter("pais");
                double area = Double.parseDouble(request.getParameter("area"));
                int poblacion = Integer.parseInt(request.getParameter("poblacion"));
                double latitud = Double.parseDouble(request.getParameter("latitud"));
                double longitud = Double.parseDouble(request.getParameter("longitud"));

                Ciudad ciudad = new Ciudad();
                ciudad.setName(name);
                ciudad.setDepto(depto);
                ciudad.setPais(pais);
                ciudad.setArea(area);
                ciudad.setPoblacion(poblacion);
                ciudad.setLatitud(latitud);
                ciudad.setLongitud(longitud);

                int registrosInsertados = ciuDAO.insertar(ciudad);
                if (registrosInsertados > 0) {
                    request.setAttribute("insertar", "Se ha Registrado Correctamente");
                    ruta = "registro.jsp";

                } else {
                    request.setAttribute("insertar", " No se puede Registrar ");
                    ruta = "registro.jsp";

                }

            } else if (bandera == 2) {
                String name = request.getParameter("name");
                String depto = request.getParameter("depto");
                String pais = request.getParameter("pais");
                double area = Double.parseDouble(request.getParameter("area"));
                int poblacion = Integer.parseInt(request.getParameter("poblacion"));
                double latitud = Double.parseDouble(request.getParameter("latitud"));
                double longitud = Double.parseDouble(request.getParameter("longitud"));

                Ciudad ciudad = new Ciudad();
                ciudad.setName(name);
                ciudad.setDepto(depto);
                ciudad.setPais(pais);
                ciudad.setArea(area);
                ciudad.setPoblacion(poblacion);
                ciudad.setLatitud(latitud);
                ciudad.setLongitud(longitud);
                int id = Integer.parseInt(request.getParameter("id"));
                ciudad.setId(id);

                request.setAttribute("modificacion", ciuDAO.actualizar(ciudad));
                request.setAttribute("ciudades", ciuDAO.mostrar());
                int registrosActualizados = ciuDAO.actualizar(ciudad);

                if (registrosActualizados > 0) {
                    request.setAttribute("alerta", "Modificación exitosa");
                } else {
                    request.setAttribute("alerta", "Error al actualizar los datos");
                }

                ruta = "/ciuadades/administracion.jsp";
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
            request.setAttribute("registroExitoso", "Error en el servidor");
        }
        request.getRequestDispatcher(ruta).forward(request, response);
    }
}
