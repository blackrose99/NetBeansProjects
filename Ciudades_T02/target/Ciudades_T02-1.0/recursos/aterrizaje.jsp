
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Búsqueda de Ciudades - Bienvenida</title>
        <link rel="stylesheet" href="ruta-a-tu-archivo/bootstrap.min.css">
        <link rel="stylesheet" href="ruta-a-tu-archivo/fontawesome.min.css"> 
        <link rel="stylesheet" type="text/css" href="recursos/estilos.css"/>

    </head>
    <body class="uvh-100">

        <div class="container">
            <div class="row mt-5">
                <div class="col-md-6 offset-md-3">

                    <h1 class="text-center">Bienvenidos</h1>
                    <p class="text-center">Encuentra información sobre ciudades y sus sitios turísticos</p>
                    <div class="container-sm bg-dark text-light mt-5 p-3 ">        
                        <table class="">
                            <div class="input-group mb-3">
                                <input type="text" class="form-control" placeholder="Buscar ciudad..." aria-label="Buscar ciudad" aria-describedby="btn-buscar">
                                <div class="input-group-append">
                                    <button class="btn btn-primary" type="button" id="btn-buscar">Buscar</button>
                                </div>
                                <thead>
                                    <tr>
                                        <th class="">ID</th>
                                        <th class="">Nombre</th>
                                        <th class=""></th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="ciudad" items="${ciudades}">
                                        <tr>
                                            <td class="">${ciudad.id}</td>
                                            <td class="">${ciudad.name}</td>
                                            <td class=""> <a href="Ciudad_Controlador?action=ver&id=${ciudad.id}" class="btn btn-info"><i class="fas fa-edit"></i> Ver</a> </td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                        </table>
                    </div>

                </div>

                <h4>¿Cómo funciona?</h4>
                <p>Ingresa el nombre de una ciudad en la barra de búsqueda para encontrar información sobre sus sitios turísticos.</p>

                <h4>Creadores:</h4>
                <ul>
                    <li>Manuel Castaño</li>
                    <li>Yeison Duarte</li>
                </ul>
            </div>
        </div>
    </div>
</body>
</html>
