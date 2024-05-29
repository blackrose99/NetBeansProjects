<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Información de la Ciudad</title>
    <!-- Agrega aquí los enlaces a los archivos de Bootstrap CSS y los archivos de iconos -->
    <link rel="stylesheet" href="ruta/a/bootstrap.css">
    <link rel="stylesheet" href="ruta-a-fontawesome/fontawesome.min.css"> <!-- Enlace a FontAwesome -->
    <link rel="stylesheet" type="text/css" href="recursos/estilos.css"/>
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col-md-12 text-center">
                <img src="img/img_ciudad01.jpg" alt="Portada de la Ciudad" class="ciudad-portada">
            </div>
        </div>
        <div class="row">
            <div class="col-md-12 text-center">
                <h2>Información de la Ciudad</h2>
            </div>
        </div>
        <div class="row ciudad-info">
            <div class="col-md-12">
                <h3><span class="fas fa-building icono"></span> <%= request.getAttribute("name") %></h3>
                <p><span class="fas fa-map-marker-alt icono"></span> Departamento: <%= request.getAttribute("depto") %></p>
                <p><span class="fas fa-globe icono"></span> País: <%= request.getAttribute("pais") %></p>
                <p><span class="fas fa-expand icono"></span> Área: <%= request.getAttribute("area") %> km²</p>
                <p><span class="fas fa-users icono"></span> Población: <%= request.getAttribute("poblacion") %></p>
                <p><span class="fas fa-map-marked-alt icono"></span> Latitud: <%= request.getAttribute("latitud") %></p>
                <p><span class="fas fa-map-pin icono"></span> Longitud: <%= request.getAttribute("longitud") %></p>
            </div>
        </div>
    </div>
</body>
</html>
