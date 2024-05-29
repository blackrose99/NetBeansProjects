<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Entidad Ciudades</title>
    <link rel="stylesheet" type="text/css" href="recursos/estilos.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <script type="text/javascript" src="recursos/validaciones.js"></script>


</head>
<body>
    <header class="navbar">
        <div class="icon-container">
            <!-- Agregar una imagen como icono -->
            <img src="img/login.png" alt="Icono" class="icon-img">
        </div>
        <h2>Bienvenios</h2>
        <h2 class="">Ciudades Con Sus Principales Sitios Turisticos </h2>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="" id="navbarNav">
            <ul class="">
                <li class="nav-item">
                    <a class="nav-link" href="#"><i class="fas fa-home"></i> Inicio</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="login.jsp"><i class="fas fa-cog"></i> Administrar</a>
                </li>
            </ul>
        </div>
    </header>

    <div class="container">
        <div class="row">
            <div class="col-lg-6 offset-lg-3">
                <div class="search-bar">
                    <input id="buscar" type="text" class="form-control" placeholder="Buscar ciudad..." onkeyup="doSearch()">
                </div>
                <!-- Agregar la clase "card" al contenedor de la tabla -->
                <div class="card">
                    <table id="datos" class="data-table">
                        <thead>
                            <tr>
                                <th>Ciudad</th>
                                <th>Departamento</th>
                                <th>Pais</th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="ciudad" items="${ciudades}">
                                <tr>
                                    <td>${ciudad.name}</td>
                                    <td>${ciudad.depto}</td>
                                    <td>${ciudad.pais}</td>
                                    <td><a href="Ciudad_Controlador?action=ver&id=${ciudad.id}" class="btn-ver"><i class="fas fa-eye"></i> Visitar</a></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
                <div class="button-container">
                    <a class="btn btn-back mt-3 mb-4" href="#"><i class="fas fa-arrow-up"></i> Subir</a>
                </div>
            </div>
        </div>
    </div>
    
    
    
    

<footer class="footer">
    <div class="container">
        <span>&copy; 2023 Ciudades. Todos los derechos reservados.</span>
        <span>Manuel Castaño & Yeison Duarte</span>
        <span>Contáctanos: <a href="mailto:info@ciudadesturisticas.com">info@ciudadesturisticas.com</a></span>
    </div>
</footer>


    
</body>
</html>
