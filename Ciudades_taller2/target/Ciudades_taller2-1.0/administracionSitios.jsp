<%@page import="Modelo.SitiosTuristicos"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Ciudad"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <nav>
        <div>
        </div>
    </nav>

    <div>
        <%
            int id_ciudad = Integer.parseInt(request.getParameter("id"));
            Ciudad ciu = (Ciudad) request.getAttribute("ciuadades");
            List<SitiosTuristicos> sitios = (List<SitiosTuristicos>) request.getAttribute("sitios");     
        %>
        <div>
            <h2>Ciudad ${ciuadades.name} ${ciuadades.pais}</h2>
        </div>
        <header>
            <a href="Ciudad_Controlador?action=editar&id=<%=id_ciudad%>"><i class="fas fa-arrow-left"></i> Volver</a>
            <div>

                <a href="Sitios_Controlador?action=ver&id=<%=id_ciudad%>"><i class="fas fa-plus"></i> Agregar Nuevos Sitios</a>
            </div>
            <div>
                <a href="Sitios_Controlador?action=eliminar2&id=<%=id_ciudad%>"><i class="fas fa-plus"></i> Eliminar Todo</a>
            </div>
        </header>
        <div>
            <div>
                <div>                        
                    <input id="buscar" type="text" placeholder="Buscar ciudad..." onkeyup="doSearch()">
                </div>

                <div>
                    <div id="alerta" style="display: none;">
                        <p>${requestScope.eliminacion}</p>
                    </div>
                </div>

                <div>
                    <table id="datos">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Nombre</th>
                                <th>Dirección del Sitio</th>
                                <th>Descripción</th>
                                <th>Precio</th>
                                <th>Hora Inicio</th>
                                <th>Hora Cierre</th>
                                <th>____________</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="sitio" items="${sitios}">
                                <tr>
                                    <td>${sitio.id}</td>
                                    <td>${sitio.name}</td>
                                    <td>${sitio.direccion}</td>
                                    <td>${sitio.descripcion}</td>
                                    <td>${sitio.precio}</td>
                                    <td>${sitio.hora_inicio}</td>
                                    <td>${sitio.hora_fin}</td>
                                    <td><a href="Sitios_Controlador?action=eliminar&id=${sitio.id}&id2=<%=id_ciudad%>">Eliminar</a></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
                <script>
                    var eliminacionMessage = "${requestScope.eliminacion}";
                    if (eliminacionMessage) {
                        var alerta = document.getElementById("alerta");
                        alerta.style.display = "block";
                    }
                </script>
            </div>
        </div>
    </div>
</body>
</html>
