<%-- 
    Document   : Expresiones
    Created on : 28/03/2023, 08:20:56 AM
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
        <h1>Expresiones</h1>
        <ul>
            <li>Convertir a Mayuscula <%= new String("luis manuel castaño").toUpperCase() %></li>
            <li>La Suma de 5 y 7 es: <%= 5+7%></li>
            <li>El 10 es mayor que 100 <%= 10 > 100%></li>
        </ul>
 <a href="index.html">Volver</a>
    </body>
</html>
