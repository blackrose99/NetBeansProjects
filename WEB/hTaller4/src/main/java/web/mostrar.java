package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mostrar")
public class mostrar extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            ArrayList<Estudiante> lista = (ArrayList) request.getSession().getAttribute("lista");
            double mp = 0;
            double pp = 99999999;
            for (Estudiante estudiante : lista) {
                
                double promedio = estudiante.getPromedio(); // Obtener el promedio del estudiante
                // Actualizar el mejor promedio si el promedio del estudiante es mayor que mp
                if (promedio > mp) {
                    mp = promedio;
                }
                // Actualizar el peor promedio si el promedio del estudiante es menor que pp
                if (promedio < pp) {
                    pp = promedio;
                }
            }

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
                    + "Nota 1"
                    + "</th>"
                    + "<th>"
                    + "Nota 2"
                    + "</th>"
                    + "<th>"
                    + "Nota 3"
                    + "</th>"
                    + "<th>"
                    + "Promedio"
                    + "</th>"
                    + "</tr>";

            for (Estudiante estudiante : lista) {
                htmlTabla += "<tr>";
                htmlTabla += "<td>" + estudiante.getId() + "</td>";
                htmlTabla += "<td>" + estudiante.getNombre() + "</td>";
                htmlTabla += "<td>" + estudiante.getNota1() + "</td>";
                htmlTabla += "<td>" + estudiante.getNota2() + "</td>";
                htmlTabla += "<td>" + estudiante.getNota3() + "</td>";
                htmlTabla += "<td>" + estudiante.getPromedio() + "</td>";
                htmlTabla += "</tr>";
            }

            htmlTabla += "</table>";

            response.setContentType("text/html");
            // PrintWriter out = response.getWriter();

            out.print(htmlTabla);
            
            out.print("<br>");
            out.println("<tr> ");
            out.println("<td> Mejor Promedio </td>" + "<td>" + mp + " </td>");
            out.print("<br>");
            out.println("<td> Peor Promedio </td>" + "<td> " + pp + " </td>");
            out.println("<tr>");

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
