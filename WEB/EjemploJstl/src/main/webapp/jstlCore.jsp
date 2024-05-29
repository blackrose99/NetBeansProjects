<%-- 
    Document   : jstlCore
    Created on : 18/04/2023, 09:03:03 AM
    Author     : mannu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:set var="nombre" value="Luis Manuel Castaño"/>
        <c:out value="${nombre}"/>
        <br>
        <c:out value="<h3> Hola. Bienvenidos al curso </h3>" escapeXml="false"/>

        <c:set var="bandera" value="true" />
        <c:if test="${bandera}">
            la bandera es verdadera
        </c:if>

        <c:if test="${param.opcion!=null}">
            <c:choose>
                <c:when test="${param.opcion==1}">
                    <br>
                    opcion 1 selecionada 
                </c:when>

                <c:when test="${param.opcion==2}">
                    <br>
                    opcion 2 selecionada 
                </c:when>
                <c:otherwise >
                    <br>
                    No se ha seleccionado ninguna opción
                </c:otherwise>    
            </c:choose>                   
        </c:if>

        <%
            String nombres[] = {"Claudia", "Laura", "Juan Carlos", "Elver Galarga", "Alma Marcela Gozo","Ledezma Madaz"};
            request.setAttribute("vNombres", nombres);

        %>
        <ul>
            <c:forEach var="persona" items="${vNombres}">
                   <li>${persona}</li>
            </c:forEach>
         
         
        </ul>

        <a href="index.jsp">Volver</a>
    </body>
</html>
