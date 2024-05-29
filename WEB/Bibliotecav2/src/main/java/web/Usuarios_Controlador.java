package web;

import dominio.Usuarios;  // Importa la clase Usuarios del paquete dominio
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sqls.UsuarioDAO;  // Importa la clase UsuarioDAO del paquete sqls

@WebServlet("/Usuarios_Controlador")  // Anota la clase como un servlet con la URL de mapeo
public class Usuarios_Controlador extends HttpServlet {

    UsuarioDAO user;  // Declara una variable miembro de tipo UsuarioDAO llamada user

    public Usuarios_Controlador() {
        super();
        user = new UsuarioDAO();  // Inicializa la variable user con una nueva instancia de UsuarioDAO
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");  // Obtiene el parámetro "action" de la solicitud
        String ruta = "";

        if (action != null) {
            if (action.equals("inicio")) {  // Si action es "inicio"
                try {
                    ruta = "usuarios.jsp";  // Establece la ruta a "usuarios.jsp"
                    request.setAttribute("usuarios", user.mostrar());  // Configura el atributo "usuarios" en la solicitud con el resultado de user.mostrar()
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (action.equalsIgnoreCase("eliminar")) {  // Si action es "eliminar" (ignorando mayúsculas y minúsculas)
                try {
                    ruta = "usuarios.jsp";  // Establece la ruta a "usuarios.jsp"
                    int id = Integer.parseInt(request.getParameter("id"));  // Obtiene el parámetro "id" de la solicitud y lo convierte a entero
                    request.setAttribute("eliminado", user.eliminar(id));  // Configura el atributo "eliminado" en la solicitud con el resultado de user.eliminar(id)
                    request.setAttribute("usuarios", user.mostrar());  // Configura el atributo "usuarios" en la solicitud con el resultado de user.mostrar()
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (action.equals("editar")) {  // Si action es "editar"
                try {
                    ruta = "ActualizarUsuario.jsp";  // Establece la ruta a "ActualizarUsuario.jsp"
                    int iduser = Integer.parseInt(request.getParameter("id"));  // Obtiene el parámetro "id" de la solicitud y lo convierte a entero

                    Usuarios userito = user.buscarPorId(iduser);  // Obtiene un objeto Usuarios llamando a user.buscarPorId(iduser)
                    request.setAttribute("usuarios", userito);  // Configura el atributo "usuarios" en la solicitud con el objeto Usuarios obtenido

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        request.getRequestDispatcher(ruta).forward(request, response);  // Redirige la solicitud a la ruta especificada
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");  // Obtiene el parámetro "nombre" de la solicitud
        String apellido = request.getParameter("apellido");  // Obtiene el parámetro "apellido" de la solicitud
        String direccion = request.getParameter("direccion");  // Obtiene el parámetro "direccion" de la solicitud
        String teledono = request.getParameter("telefono");  // Obtiene el parámetro "telefono" de la solicitud

        int bandera = 0;  // Inicializa la variable bandera con el valor 0
        String banderaParam = request.getParameter("bandera");  // Obtiene el parámetro "bandera" de la solicitud
        if (banderaParam != null) {
            bandera = Integer.parseInt(banderaParam);  // Convierte el valor de banderaParam a entero y lo asigna a la variable bandera
        }
        Usuarios usuario = new Usuarios();  // Crea una nueva instancia de la clase Usuarios
        usuario.setNombre(nombre);  // Establece el nombre en el objeto usuario
        usuario.setApellido(apellido);  // Establece el apellido en el objeto usuario
        usuario.setDireccion(direccion);  // Establece la dirección en el objeto usuario
        usuario.setTelfono(teledono);  // Establece el teléfono en el objeto usuario
        try {
            if (bandera == 0) {  // Si la bandera es 0
                request.setAttribute("helo", user.insertar(usuario));  // Configura el atributo "helo" en la solicitud con el resultado de user.insertar(usuario)
                request.setAttribute("usuarios", user.mostrar());  // Configura el atributo "usuarios" en la solicitud con el resultado de user.mostrar()
            } else if (bandera == 1) {  // Si la bandera es 1
                int id = Integer.parseInt(request.getParameter("id"));  // Obtiene el parámetro "id" de la solicitud y lo convierte a entero
                usuario.setId(id);  // Establece el ID en el objeto usuario
                request.setAttribute("modificacion", user.actualizar(usuario));  // Configura el atributo "modificacion" en la solicitud con el resultado de user.actualizar(usuario)
                request.setAttribute("usuarios", user.mostrar());  // Configura el atributo "usuarios" en la solicitud con el resultado de user.mostrar()
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        request.getRequestDispatcher("usuarios.jsp").forward(request, response);  // Redirige la solicitud a "usuarios.jsp"
    }
}
