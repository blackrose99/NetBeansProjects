<%-- 
    Document   : encuesta
    Created on : 2/04/2023, 11:49:46 AM
    Author     : mannu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="recursos/estilos.css"/>
    </head>
    <body>
  

        <%
            String name = "";
            name = request.getParameter("name");
            String[] campo = request.getParameterValues("campo");

        %>
        
        <div>
            <h1>Respuesta  </h1>
            <table border = 2>

            <th>Nombre </th>
            <th>Lenguajes Familiarizados</th>

            <tr border = 1>
                <td border = 1><%=name%></td>
                <td>     
                    <% if (campo != null && campo.length > 0) { %>
                    <% for (String dato : campo) {%>
                    <%= "[ " + dato + " ]"%>
                    <% } %>
                    <% } else {%>
                    <%= "[ Null ]"%>
                    <%}%>
                </td>
            </tr>

        </table>
               
                 <a href="index.html" class="boton">Volver</a>
        </div>
        

    </body>
</html>
