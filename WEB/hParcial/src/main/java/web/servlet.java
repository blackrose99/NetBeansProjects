//Lius Manuel Castaño Grueso 
//B191
package web;

import com.sun.net.httpserver.HttpsServer;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet")
public class servlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            //Resivir los datos del formulario
            String id = request.getParameter("id");
            String name = request.getParameter("name");
            String apellido = request.getParameter("apellido");
            double ventas = Double.parseDouble(request.getParameter("venta"));
            double comision = 0;
            double aux = 0;
            double bono;
            double total;
            if (ventas < 5000000) {
                comision = ventas * 0.05;
                total = comision;
                bono = 0;

            } else if (ventas >= 5000000 && ventas <= 10000000) {
                comision = ventas * 0.07;
                total = comision;
                bono = 0;
            } else {

                comision = ventas * 0.1;
                bono = (ventas / 1000000) * 10000;
                total = comision + bono;

            }

            Vendedor venta = new Vendedor(id, name, apellido, ventas);

            String htmlTabla = "";
            htmlTabla += "<table border 2 >";
            htmlTabla += "<tr>"
                    + "<th>"
                    + "ID"
                    + "</th>"
                    + "<th>"
                    + "Nombre"
                    + "</th>"
                    + "<th>"
                    + "Apellido"
                    + "</th>"
                    + "<th>"
                    + "Venta total"
                    + "</th>"
                    + "<th>"
                    + ""
                    + "Comison"
                    + "</th>"
                    + "<th>"
                    + "Bono"
                    + "</th>"
                     + "<th>"
                    + "Total"
                    + "</th>"
                    + "</tr>";

            htmlTabla += "<tr>";
            htmlTabla += "<td>" + venta.getId() + "</td>";
            htmlTabla += "<td>" + venta.getName() + "</td>";
            htmlTabla += "<td>" + venta.getApellido() + "</td>";
            htmlTabla += "<td>" + venta.getVentas() + "</td>";
         
            htmlTabla += "<td>" + comision + "</td>";
            htmlTabla += "<td>" + bono + "</td>";
             htmlTabla += "<td>" + total + "</td>";
            htmlTabla += "</tr>";

            htmlTabla += "</table>";
            response.setContentType("text/html");
            // PrintWriter out = response.getWriter();

            out.print(htmlTabla);
             out.print("<head>");
            out.print("<br>");
            out.print(" <link rel=\"stylesheet\" type=\"text/css\" href=\"folder/estilos.css\"/>");
            out.print("</head>");

            out.print("<body>");
            out.print("<br>");
            out.print(" <a href=\"index.html\">Volver</a>");
            out.print("</body>");
            out.close();


        }
    }
}
