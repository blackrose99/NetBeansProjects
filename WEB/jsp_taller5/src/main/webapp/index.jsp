<%-- 
    Document   : index
    Created on : 26/03/2023, 09:15:20 AM
    Author     : mannu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Calcular el area de un Triangulo </h1>
        <form action="triangulo.jsp">
            <table border ="1">
                <tr>
                    <td>Base</td>
                    <td><input type="number"step="0.01" name="base"></td>
                </tr>
                <tr>
                    <td>Altura</td>
                    <td><input type="number"step="0.01" name="altura"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Calcular"></td>
                    <td><input type="reset" value="Limpiar"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
