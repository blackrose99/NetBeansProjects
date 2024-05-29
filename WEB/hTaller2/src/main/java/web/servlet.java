package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet")
public class servlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");

        System.out.println("el usuario es " + user);
        System.out.println("La contraseña es" + pass);

        PrintWriter salida = response.getWriter();
        salida.print("<html>");
        salida.print("<body");
        salida.print("<br>");
         salida.print("el parametro del usuario es" + user);
         salida.print("<br>");
        salida.print("el parametro de la contraseña es " + pass);
        salida.print("</body>");
        salida.print("</html>");
        salida.close();
    }

}
