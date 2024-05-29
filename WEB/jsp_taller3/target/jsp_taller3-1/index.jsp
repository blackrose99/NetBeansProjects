<%-- 
    Document   : index
    Created on : 26/03/2023, 09:04:50 AM
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
              <h1>Bucle For</h1>
        <% 
            for (int i=0;i<10;i++){
                out.println(" \n Este es el mensaje: "+i);
                %>
                <br>
        <%        
            }
        %>

    </body>
</html>
