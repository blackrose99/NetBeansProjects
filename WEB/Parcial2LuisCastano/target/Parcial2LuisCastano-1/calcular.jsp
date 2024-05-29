<%-- 
    Document   : calcular
    Created on : 25/04/2023, 08:50:59 AM
    Author     : mannu
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="clases.Persona"%>
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
            String ape= request.getParameter("ape");
            String cargo = request.getParameter("cargo");
            String cel = request.getParameter("cel");
            int sueldo = Integer.parseInt(request.getParameter("n1"));
           // double promedio = (nota1 + nota2 + nota3) / 3;
          //  promedio = Math.round(promedio);

            Persona estudiante = new Persona(name, ape, cel, cargo, sueldo);

       ArrayList<Persona> lista;
            if (request.getSession().getAttribute("lista") == null) {
                lista = new ArrayList<Persona>();
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
