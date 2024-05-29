<%-- 
    Document   : ver
    Created on : 25/04/2023, 08:45:58 AM
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
            //   ArrayList<Estudiantes> lista = (ArrayList) request.getSession().getAttribute("lista");
            ArrayList<Persona> lista = (ArrayList<Persona>) session.getAttribute("lista");
        %>
        <table class="tabla " border = 1>
            <tr>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Telefono</th>
                <th>Cargo</th>
                <th>Sueldo</th>
                <th>Transporte</th>
                <th>Salud</th>
                <th>Pension</th>
                 <th>Total Descuentos</th>
                <th>Total</th>
            </tr>

            <% for (Persona trabajador : lista) {
                    double sueldo = trabajador.getSueldo();
                    double pension = sueldo * 0.04;
                    double salud = sueldo * 0.04;
                    int trans = 0;
                    if (sueldo < 2320000) {
                        trans = 140600;
                    }
                    double total = sueldo + trans - pension - salud;
                     double totalD = pension + salud;
            %>
            <tr>      
                <td><%=trabajador.getNombre()%> </td>
                <td><%=trabajador.getApellido()%> </td>
                <td><%=trabajador.getTelefono()%> </td>
                <td><%=trabajador.getCargo()%> </td>
                <td><%=trabajador.getSueldo()%> </td>
                <td><%=trans%> </td>
                <td><%=salud%> </td>
                <td><%=pension%> </td>
                 <td><%=totalD%> </td>
                <td><%=total%> </td>
            </tr>

            <% }%>
        </table>
        <a href="index.html" class="btn">Volver</a>
    </body>
</html>
