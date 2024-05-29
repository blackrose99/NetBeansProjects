<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="Modelo.Ciudad"%>
<%@page import="Modelo.SitiosTuristicos"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <header>
        <h1>JSP Page</h1>
    </header>
    <div>
        <%
            int id_ciudad = Integer.parseInt(request.getParameter("id"));
            Ciudad ciu = (Ciudad) request.getAttribute("ciuadades");
            List<SitiosTuristicos> sitios = (List<SitiosTuristicos>) request.getAttribute("sitios");
        %>
        <div>
            <h2>Ciudad ${ciuadades.name} ${ciuadades.pais}</h2>
        </div>
        <div>
            <a href="Ciudad_Controlador?action=admin">← Volver</a>
            <a href="Ciudad_Controlador?action=eliminar&id=<%=id_ciudad%>">Eliminar Ciudad</a>
            <a href="Ciudad_Controlador?action=ver2&id=<%=id_ciudad%>">Ver Sitios Turisticos</a>
        </div>
        <form action="Ciudad_Controlador" method="post">
            <div>
                <div id="alerta" style="display: none;">
                    <p>${requestScope.eliminacion}</p>
                </div>
            </div>
            <input type="number" name="bandera" value="2" style="display: none;">
            <input type="number" name="id" value="<%=id_ciudad%>" style="display: none; ">
            <div>
                <label for="name">Nombre:</label>
                <input type="text" name="name" required value="${ciuadades.name}">
            </div>
            <div>
                <label for="depto">Departamento:</label>
                <input type="text" name="depto" required value="${ciuadades.depto}">
            </div>
            <div>
                <label for="pais">País:</label>
                <input type="text" name="pais" required value="${ciuadades.pais}">
            </div>
            <div>
                <label for="area">Área:</label>
                <input type="number" step="any" name="area" required value="${ciuadades.area}">
            </div>
            <div>
                <label for="poblacion">Población:</label>
                <input type="number" name="poblacion" required value="${ciuadades.poblacion}">
            </div>
            <div>
                <label for="latitud">Latitud:</label>
                <input type="number" step="any" name="latitud" required value="${ciuadades.latitud}">
            </div>
            <div>
                <label for="longitud">Longitud:</label>
                <input type="number" step="any" name="longitud" required value="${ciuadades.longitud}">
            </div>
            <button type="submit">Modificar Ciudad</button>
        </form>
    </div>
    <script>
        var eliminacionMessage = "${requestScope.eliminacion}";
        if (eliminacionMessage) {
            var alerta = document.getElementById("alerta");
            alerta.style.display = "block";

            setTimeout(function() {
                alerta.style.display = "none";
            }, 2000);
        }
    </script>
</body>
</html>
