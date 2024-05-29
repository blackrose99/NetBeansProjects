<%-- 
    Document   : DeclaracionPoo
    Created on : 28/03/2023, 09:08:21 AM
    Author     : mannu
--%>
<%@page import="paquete.operaciones"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%=operaciones.Suma(5, 6)%>
        <br>
        <%=operaciones.Resta(5, 6)%>
         <br>
        <%=operaciones.Multiplicacion(5, 6)%>
         <br>
        <%=operaciones.Division(5, 6)%>
                
           <br>
        <a href="index.html">Volver</a>
        
       
    </body>
</html>