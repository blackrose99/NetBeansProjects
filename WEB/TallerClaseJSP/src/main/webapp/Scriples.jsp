<%-- 
    Document   : Scriples
    Created on : 28/03/2023, 08:36:35 AM
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
        <h1>Scriplest</h1>
        <% for (int i = 0; i < 10; i++) {
        %>
        <%= " <br> Este es el mesaje " + i%>

          <%   }%>
            <br>
            <a href="index.html">Volver</a>
    </body>
</html>
