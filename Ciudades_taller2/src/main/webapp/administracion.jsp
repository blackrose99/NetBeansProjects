<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Entidad Ciudades</title>
    </head>
    <body class="">
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container">
                <a class="navbar-brand" href="index.jsp"><h2>Ciudades</h2></a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item">
                            <a class="nav-link" href="index.jsp"><i class="fas fa-home"></i> Inicio</a>
                        </li>    
                        <li class="nav-item">
                            <a class="nav-link" href="#"><i class="fas fa-sign-out-alt"></i> Cerrar Sesi�n</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <header class="container d-flex justify-content-between">       
            <div class="container mt-5">
                <a class="btn btn-success mb-2" href="registro.jsp"><i class="fas fa-plus"></i> Agregar Nueva Ciudad</a>
                <div class="alert alert-info text-center" id="alerta" style="display: none;">
                    <p>${requestScope.eliminacion}</p>
                </div>
            </div>
            <div class="text-light p-3 text-center">
            </div>
        </header>
        <div class="row mt-3">
            <div class="col-lg-6 offset-lg-3 ">
                <%
                String alerta = (String) request.getAttribute("alerta");
                if (alerta != null) {
                %>
                <div class="alert alert-success alert-dismissible fade show" role="alert" id="alerta">
                    <%= alerta%>
                    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                </div>
                <script>
                    // Establece un temporizador para ocultar la alerta despu�s de 2 segundos (2000 milisegundos)
                    setTimeout(function () {
                        var alertaElement = document.getElementById("alerta");
                        alertaElement.style.display = "none"; // Oculta la alerta despu�s de 2 segundos
                    }, 2000); // 2000 milisegundos = 2 segundos
                </script>
                <%
                }
                %>
                <div class="col-lg-9 col-md-4 col-sm-10 offset-sm-1 col-12 mt-4">
                    <div class="input-group mb-4">                        
                        <input id="buscar" type="text" class="form-control" placeholder="Buscar ciudad..." onkeyup="doSearch()">
                    </div>
                    <table id="datos" class="table">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Ciudad</th>
                                <th>Estado</th>
                                <th>Pais</th>
                                <th>_________</th>
                            </tr>
                        </thead>
                        <tbody id="">
                            <c:forEach var="ciudad" items="${ciudades}">
                                <tr>
                                    <td>${ciudad.id}</td>
                                    <td>${ciudad.name}</td>
                                    <td>${ciudad.depto}</td>
                                    <td>${ciudad.pais}</td>
                                    <td><a href="Ciudad_Controlador?action=editar&id=${ciudad.id}" class="btn btn-primary"><i class="fas fa-timese"></i>Editar</a></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>         
        </div>
        <script>
            var eliminacionMessage = "${requestScope.eliminacion}";
            if (eliminacionMessage) {
                var alerta = document.getElementById("alerta");
                alerta.style.display = "block"; // Muestra la alerta
                // Establece un temporizador para ocultar la alerta despu�s de 2 segundos (2000 milisegundos)
                setTimeout(function () {
                    alerta.style.display = "none"; // Oculta la alerta despu�s de 2 segundos
                }, 2000); // 2000 milisegundos = 2 segundos
            }
        </script>
    </body>
</html>
