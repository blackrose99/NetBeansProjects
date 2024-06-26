<!-- <%@page import="java.util.Calendar"%>
<%@page import="Modelo.SitiosTuristicos"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Ciudad"%> -->
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ciudad y Sitios Tur�sticos</title>
        <link rel="stylesheet" type="text/css" href="recursos/estilos.css">    
        <script type="text/javascript" src="recursos/validaciones.js"></script>

    </head>
    <!-- <%
        Ciudad ciu = (Ciudad) request.getAttribute("ciuadades");
        List<SitiosTuristicos> sitios = (List<SitiosTuristicos>) request.getAttribute("sitios");
    %> -->
    <body>
        <div class="container mt-5">
            <div class="row justify-content-center">
                <div class="col-md-8 info-box">

                    <div id="bannerInicioCiudades"><a class="btn btn-back mt-3 mb-4" href="Ciudad_Controlador?action=inicio"><i class="fas fa-arrow-left"></i> Volver</a></div>
                    <div id="bannerInicioCiudades"><img class="imagenBaner" src="img/ciudades/img_c1.jpg" alt="Logo del evento" width="1200"></div>

                    <h1 class="">
                        <i class="fas fa-city"></i> Ciudad de Barranquilla Colombia <!-- Agregamos un icono de ciudad al t�tulo -->
                    </h1>
                    <div class="container mt-5 card">

                        <div class="container mt-5 card">
                            <div class="row">
                                <!-- Columna de la lista de informaci�n de la ciudad (izquierda) -->
                                <div class="col-md-4 custom-column">
                                    <ul class="list-unstyled">
                                        <li><i class="fas fa-map-marker-alt"></i> <strong>Departamento:</strong> Atlantico</li>
                                        <li><i class="fas fa-globe-americas"></i> <strong>Pa�s:</strong> Colombia</li>
                                        <li><i class="fas fa-map"></i> <strong>�rea:</strong> 152.9 km�</li>
                                        <li><i class="fas fa-users"></i> <strong>Poblaci�n:</strong> 152.9 km�</li>
                                        <li><i class="fas fa-map-marker-alt"></i> <strong>Latitud:</strong> 10.963889</li>
                                        <li><i class="fas fa-map-marker-alt"></i> <strong>Longitud:</strong> -74.796389</li>
                                        <img src="img/gif simpson.gif" alt="alt" width="270" height="300"/>
                                    </ul>
                                </div>

                                <!-- Columna del formulario para programar la visita (derecha) -->
                                <div class="col-md-8 custom-column">
                                    <form action="ProgramarVisita_Controlador" method="post">
                                        <h2 class="text-success"><i class="fas fa-map-marked-alt"></i> Seleciona y Programar Tour</h2> <!-- Agregamos un icono de marcador en el t�tulo -->

                                        <input type="hidden" name="ciudadId" value="<%= ciu.getId()%>">

                                        <table>
                                            <thead>
                                                <tr>
                                                    <th>Nombre</th>
                                                    <th>Direcci�n</th>
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

                                        <button type="submit">Programar Visitas</button>
                                    </form>
                                </div>
                            </div>
                        </div>




                        <h1><i class="fas fa-binoculars"></i> Todos los Sitios Tur�sticos de Barranquilla</h1>


                        <div class="search-bar">
                            <input id="buscar" type="text" class="form-control" placeholder="Buscar Sitios..." onkeyup="doSearch()">
                        </div>

                        <table id="datos">
                            <thead>
                                <tr>
                                    <th>Foto</th>
                                    <th>Nombre</th>
                                    <th>Direcci�n del Sitio</th>
                                    <th>Descripci�n</th>
                                    <th>Precio</th>
                                    <th>Estado</th>
                                </tr>
                            </thead>
                            <tbody>
                                <!-- <%
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
                                %> -->
                                <tr>
                                    <td><img class="img-fluid mb-3" src="<%=sitio.getFoto()%>" alt="Logo del evento" width="200"></td>
                                    <td><%= sitio.getName()%></td>
                                    <td><%= sitio.getDireccion()%></td>
                                    <td><%= sitio.getDescripcion()%></td>
                                    <td class="">$ <%=sitio.getPrecio()%></td>
                                          
                                    <td>
                                        <a href="Sitios_Controlador?action=ver2&id=<%=sitio.getId()%>&id2=<%=valor%>&name=<%=ciu.getName()%>&pais=<%=ciu.getPais()%>&id2=<%=valor%>&url=<%=sitio.getFoto()%>">
                                            <div class="estado-card <%= (estado.equals("Abierto")) ? "estado-abierto" : "estado-cerrado"%>">
                                                <%= estado%>
                                            </div>
                                        </a>
                                    </td>
                            
                                </tr>
                                <!-- <% }%> -->
                            </tbody>
                        </table>

                    </div>
                </div>
            </div>

            <script src="https://maps.googleapis.com/maps/api/js?key=TU_CLAVE_DE_API&callback=initMap" async defer></script>

    </body>
</html>