<%-- 
    Document   : calcular
    Created on : 2/04/2023, 04:39:32 PM
    Author     : mannu
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="web.Estudiantes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String direccion = request.getParameter("dir");
            String cel = request.getParameter("cel");
            double nota1 = Double.parseDouble(request.getParameter("n1"));
            double nota2 = Double.parseDouble(request.getParameter("n2"));
            double nota3 = Double.parseDouble(request.getParameter("n3"));
            double promedio = (nota1 + nota2 + nota3) / 3;
            promedio = Math.round(promedio);

            Estudiantes estudiante = new Estudiantes(name, email, direccion, cel, nota1, nota2, nota3, promedio);

       ArrayList<Estudiantes> lista;
            if (request.getSession().getAttribute("lista") == null) {
                lista = new ArrayList<Estudiantes>();
            } else {
                //crea una lista en session y la caste
                lista = (ArrayList) request.getSession().getAttribute("lista");
            }
            lista.add(estudiante);
            // cargar la lista en session
            request.getSession().setAttribute("lista", lista);

            //redireccionamos otra vez al index
            request.getRequestDispatcher("index.html").forward(request, response);
        %>
        
    </body>
</html>
