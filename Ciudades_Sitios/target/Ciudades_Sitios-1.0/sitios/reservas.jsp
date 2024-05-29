<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Reservas</title>

        <!--         <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
        -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
        <link rel="stylesheet" type="text/css" href="recursos/estilos.css"/>
        <style>

        a {
            text-decoration: none;
            color: #007bff;
        }

        .site-details {
            background-color: #fff;
            border: 1px solid #ccc;
            margin: 20px;
            padding: 20px;
            border-radius: 5px;
        }
        .site-icon {
            width: 30px;
            height: 30px;
            font-size: 20px;
            background-color: #007bff;
            color: #fff;
            text-align: center;
            border-radius: 50%;
            margin-right: 10px;
            display: inline-flex;
            align-items: center;
            justify-content: center;
        }
        .site-info {
            display: inline-flex;
            flex-direction: column;
        }
        .site-info h4 {
            font-size: 18px;
            margin: 0;
        }
        .site-info p {
            margin: 5px 0;
        }
        
    </style>
    </head>
    <body>
        <div class="container">
            <a class="btn btn-primary mt-3 mb-4 btn-back" href="javascript:history.back()"><i class="bi bi-arrow-left"></i> Volver</a>

            <h2 class="mt-3">Reservas</h2>
            <p>Fecha de Visita: ${fechaVisita}</p>

            <h3 class="mt-3">Detalles de los Sitios Seleccionados:</h3>
            <c:forEach var="sitio" items="${sitiosSeleccionados}" varStatus="loop">
                <div class="sitio-card">
                    <div class="row">
                        <div class="col-md-2">
                        </div>
                        <div class="col-md-10">
                            <h4>${sitio.name}</h4>
                            <p><strong>Dirección:</strong> ${sitio.direccion}</p>
                            <p><strong>Descripción:</strong> ${sitio.descripcion}</p>
                            <p><strong>Horario:</strong> ${sitio.hora_inicio} - ${sitio.hora_fin}</p>
                            <p><strong>Precio:</strong> ${sitio.precio}</p>

                        </div>
                    </div>
                </div>
            </c:forEach>

        </div>
    </body>
</html>
