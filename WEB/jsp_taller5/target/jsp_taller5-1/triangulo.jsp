<%-- 
    Document   : triangulo
    Created on : 26/03/2023, 05:16:57 PM
    Author     : mannu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    int base = Integer.parseInt(request.getParameter("base"));
    int altura = Integer.parseInt(request.getParameter("altura"));
    double area;
    //proceso 
    area = (base * altura) / 2;
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Calculara Area de un Triangulo </h1>

        <table border ="1">
            <tbody>
                <tr>
                    <th>Base</th>
                    <td><%=base%></th>
                </tr>
                <tr>
                    <th>Altura</td>
                    <td><%=altura%></td>
                </tr>
                <tr>
                    <th>Area</td>
                    <td><%=area%></td>
                </tr>
            </tbody>
        </table>
                <p><a href="index.jsp">Regresar</a></p>

    </body>
</html>
