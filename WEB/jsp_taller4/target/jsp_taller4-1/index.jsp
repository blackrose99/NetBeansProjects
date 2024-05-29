<%-- 
    Document   : index
    Created on : 26/03/2023, 09:10:30 AM
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
              <h1>Declaraciones</h1>
        <%!
        private int suma,r;
        public int metodosuma(int num1, int num2){
            suma = num1+num2;
            return suma;   
        }
        %>
        <% 
            r=metodosuma(5,8);
            out.println("La suma es: "+r);
        %>

    </body>
</html>
