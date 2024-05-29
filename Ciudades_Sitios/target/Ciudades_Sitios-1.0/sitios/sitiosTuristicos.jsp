<%@page import="Modelo.Ciudad"%>
<%@page import="Modelo.SitiosTuristicos"%>
<!DOCTYPE html>
<html>
        <%
        SitiosTuristicos sitio = (SitiosTuristicos) request.getAttribute("sitios");
        int id = Integer.parseInt(request.getParameter("id2"));
        String name = request.getParameter("name");
        String pais = request.getParameter("pais");
        String foto = request.getParameter("url");
        String estado = "Cerrado";
        if (id == 1) {
            estado = "Abierto";
        }
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   
        <title>Información del Sitio Turístico</title>
    <!--         <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
 -->        
 <link rel="stylesheet" type="text/css" href="recursos/estilos.css">    
        <title>Sitios Turisticos de <%=name%>  </title>
    </head>

    <body>
        <div class="container mt-5">
            <div class="row justify-content-center mb-5">
                <div class="col-md-8 info-box mt-5">
                    <a class="btn btn-primary mt-3 mb-4 btn-back" href="javascript:history.back()"><i class="bi bi-arrow-left"></i> Volver</a>
                     <h2><%=name%>  <%=pais%></h2>
                     <img class="img-fluid mb-3" src="<%=foto%>" alt="Logo del evento" width="1200">                
            
                    <div class="text-center">
                      
                        <div class="estado-card <%= (estado.equals("Abierto")) ? "estado-abierto" : "estado-cerrado"%>">
                            <%= estado%>
                        </div>
                         
                    </div>

                    <h1 class="display-4"><%= sitio.getName()%></h1>

                    <div class="container">
                        <div class="row">
                            <div class="col-md-6">
                                <ul class="list-unstyled">
                                    <li><i class="bi bi-geo-alt"></i> <strong>Dirección:</strong> <%= sitio.getDireccion()%></li>
                                    <li><i class="bi bi-globe"></i> <strong>Descripción:</strong> <%= sitio.getDescripcion()%></li>
                                </ul>
                            </div>
                            <div class="col-md-6 mb-5">
                                <ul class="list-unstyled">
                                    <li class="precio-animated"><h2>Precio: $ <%=sitio.getPrecio()%></h2></li>
                                    <li><i class="bi bi-clock"></i> <strong>Hora de Apertura:</strong> <%= sitio.getHora_inicio()%></li>
                                    <li><i class="bi bi-clock"></i> <strong>Hora de Cierre:</strong> <%= sitio.getHora_fin()%></li>

                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

                                    <!-- Agrega esta sección de JavaScript justo antes de cerrar la etiqueta </body> -->
<script>
    var eliminacionMessage = "${requestScope.eliminacion}";
    if (eliminacionMessage) {
        alert(eliminacionMessage); // Muestra una alerta con el mensaje de eliminación
    }
</script>

    </body>
</html>
