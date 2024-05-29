<%-- 
    Document   : ver
    Created on : 2/04/2023, 04:48:32 PM
    Author     : mannu
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="web.Estudiantes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="recursos/estilos.css"/>

    </head>
    <body class="ver">
        <%
         //   ArrayList<Estudiantes> lista = (ArrayList) request.getSession().getAttribute("lista");
             ArrayList<Estudiantes> lista = (ArrayList<Estudiantes>)session.getAttribute("lista");
        %>
        <table class="tabla " border = 1>
            <tr>
                <th>Nombre</th>
                <th>Correo</th>
                <th>Dirrecion</th>
                <th>Telefono</th>
                <th>Nota 1</th>
                <th>Nota 2</th>
                <th>Nota 3</th>
                <th>Promedio</th>
                <th>Estado</th>
            </tr>

            <% for (Estudiantes estudiante : lista) {%>
            <tr>
                <td><%=estudiante.getName()%> </td>
                <td><%=estudiante.getEmail()%> </td>
                <td><%=estudiante.getDireccion()%> </td>
                <td><%=estudiante.getCel()%> </td>
                <td><%=estudiante.getNota1()%> </td>
                <td><%=estudiante.getNota2()%> </td>
                <td><%=estudiante.getNota3()%> </td>
                <td><%=estudiante.getPromedio()%> </td>
                <td><%if (estudiante.getPromedio() >= 3 && estudiante.getPromedio() <= 4) {
                        out.print("Aprobado");
                    } else if (estudiante.getPromedio() > 4 && estudiante.getPromedio() <= 5) {
                        out.print("Exelente Nota");
                    } else {
                        out.print("Es hora de Estudiar ");
                    }
                    %>
                </td>
            </tr>
            <%
                }
            %>
        </table>
        <a href="index.html" class="btn">Volver</a>
    </body>
</html>
