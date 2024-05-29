<%@page import="java.util.Calendar"%>
<%@page import="Modelo.SitiosTuristicos"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Ciudad"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ciudad y Sitios Turísticos</title>
</head>
<%
    Ciudad ciu = (Ciudad) request.getAttribute("ciuadades");
    List<SitiosTuristicos> sitios = (List<SitiosTuristicos>) request.getAttribute("sitios");
%>
<body>
    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-8 info-box">
                <a class="btn btn-back mt-3 mb-4" href="Ciudad_Controlador?action=inicio"><i class="fas fa-arrow-left"></i> Volver</a>
                <img class="img-fluid mb-3" src="img/img_ciudad01.jpg" alt="Logo del evento">
                <h1 class="">
                    <i class="fas fa-city"></i> Ciudad de <%= ciu.getName()%>  <%= ciu.getPais()%> <!-- Agregamos un icono de ciudad al título -->
                </h1>
                <div class="container mt-5">
                    <div class="row">
                        <!-- Columna de la lista de información de la ciudad (izquierda) -->
                        <div class="col-md-4">
                            <ul class="list-unstyled">
                                <li><i class="fas fa-map-marker-alt"></i> <strong>Departamento:</strong> <%= ciu.getDepto()%></li>
                                <li><i class="fas fa-globe-americas"></i> <strong>País:</strong> <%= ciu.getPais()%></li>
                                <li><i class="fas fa-map"></i> <strong>Área:</strong> <%= ciu.getArea()%> km²</li>
                                <li><i class="fas fa-users"></i> <strong>Población:</strong> <%= ciu.getPoblacion()%></li>
                                <li><i class="fas fa-map-marker-alt"></i> <strong>Latitud:</strong> <%= ciu.getLatitud()%></li>
                                <li><i class="fas fa-map-marker-alt"></i> <strong>Longitud:</strong> <%= ciu.getLongitud()%></li>
                                <li><img src="img/gif simpson.gif" alt="alt" width="270" height="300"/></li>
                            </ul>
                        </div>

                        <!-- Columna del formulario para programar la visita (derecha) -->
                        <div class="col-md-8">
                            <form action="ProgramarVisita_Controlador" method="post">
                                <h2 class="text-success"><i class="fas fa-map-marked-alt"></i> Seleciona y Programar Tour</h2> <!-- Agregamos un icono de marcador en el título -->

                                <input type="hidden" name="ciudadId" value="<%= ciu.getId()%>">

                                <table>
                                    <thead>
                                        <tr>
                                            <th>Nombre</th>
                                            <th>Dirección</th>
                                            <th>Horario</th>
                                            <th>Seleccionar</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="sitio" items="${sitios}">
                                            <tr>
                                                <td>${sitio.getName()}</td>
                                                <td>${sitio.getDireccion()}</td>
                                                <td>${sitio.getHora_inicio()} - ${sitio.getHora_fin()}</td>
                                                <td><input type="checkbox" name="sitioId" value="${sitio.getId()}"></td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>

                                <div class="form-group">
                                    <label for="fecha">Fecha de Visita:</label>
                                    <input type="date" id="fecha" name="fecha" required>
                                </div>
                        </div>
                        <button type="submit">Programar Visitas</button>
                        </form>
                    </div>
                </div>


                <h1><i class="fas fa-binoculars"></i> Todos los Sitios Turísticos de <%= ciu.getName()%></h1>
                <img src="img/google-maps-trucos-1200x675.jpg" alt="alt" width="840" height="220"/>

                <div class="input-group">                        
                    <input id="buscar" type="text" placeholder="Buscar Un Sitio..." onkeyup="doSearch()">
                </div>
                <table id="datos">
                    <thead>
                        <tr>
                            <th>Nombre</th>
                            <th>Dirección del Sitio</th>
                            <th>Descripción</th>
                            <<th>Precio</th>
                            <th>Estado</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                            Date horaActual = new Date();
                            String horaActualStr = sdf.format(horaActual);

                            for (SitiosTuristicos sitio : sitios) {
                                String horaInicioStr = sitio.getHora_inicio();
                                String horaFinStr = sitio.getHora_fin();
                                String estado = "Cerrado";
                                int valor = 0;

                                Date horaInicio = sdf.parse(horaInicioStr);
                                Date horaFin = sdf.parse(horaFinStr);
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTime(horaActual);

                                int horaActualSegundos = calendar.get(Calendar.HOUR_OF_DAY) * 3600
                                        + calendar.get(Calendar.MINUTE) * 60
                                        + calendar.get(Calendar.SECOND);

                                int horaInicioSegundos = Integer.parseInt(horaInicioStr.substring(0, 2)) * 3600
                                        + Integer.parseInt(horaInicioStr.substring(3, 5)) * 60
                                        + Integer.parseInt(horaInicioStr.substring(6));

                                int horaFinSegundos = Integer.parseInt(horaFinStr.substring(0, 2)) * 3600
                                        + Integer.parseInt(horaFinStr.substring(3, 5)) * 60
                                        + Integer.parseInt(horaFinStr.substring(6));

                                if (horaActualSegundos >= horaInicioSegundos && horaActualSegundos <= horaFinSegundos) {
                                    estado = "Abierto";
                                    valor = 1;
                                } else {
                                    estado = "Cerrado";
                                    valor = 0;
                                }
                        %>
                        <tr>
                            <td><%= sitio.getName()%></td>
                            <td><%= sitio.getDireccion()%></td>
                            <td><%= sitio.getDescripcion()%></td>
                            <td class="">$ <%=sitio.getPrecio()%></td>
                            <td>
                                <a href="Sitios_Controlador?action=ver2&id=<%=sitio.getId()%>&id2=<%=valor%>&name=<%=ciu.getName()%>&pais=<%=ciu.getPais()%>&id2=<%=valor%>">
                                    <div class="estado-card <%= (estado.equals("Abierto")) ? "estado-abierto" : "estado-cerrado"%>">
                                        <%= estado%>
                                    </div>
                                </a>
                            </td>
                        </tr>
                        <% }%>
                    </tbody>
                </table>
            </div>
        </div>
    </div>

    <script src="https://maps.googleapis.com/maps/api/js?key=TU_CLAVE_DE_API&callback=initMap" async defer></script>

</body>
</html>
