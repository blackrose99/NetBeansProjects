<%-- 
    Document   : Declaraciones
    Created on : 28/03/2023, 08:23:06 AM
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
            private int resultado;

            public int Suma(int n1, int n2) {
                resultado = n1 + n2;
                return resultado;
            }

            public int Resta(int n1, int n2) {
                resultado = n1 - n2;
                return resultado;
            }

            public int Multiplicacion(int n1, int n2) {
                resultado = n1 * n2;
                return resultado;
            }

            public int Division(int n1, int n2) {
                if (n2 != 0) {
                    resultado = n1 / n2;

                }
                return resultado;
            }


        %>
        <ul>
            <li>La suma es <%= Suma(5, 6)%></li>
            <li>La Resta es <%= Resta(5, 6)%></li>
            <li>La Multiplicacion es <%= Multiplicacion(5, 6)%></li>
            <li>La La Division es <%= Division(5, 6)%></li>
        </ul>


        <a href="index.html">Volver</a>
    </body>
</html>
