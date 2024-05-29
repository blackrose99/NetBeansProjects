<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Reservas</title>
</head>
<body>
    <div class="container">
        <a class="btn btn-primary mt-3 mb-4" href="javascript:history.back()"><i class="bi bi-arrow-left"></i> Volver</a>

        <h2 class="mt-3">Reservas</h2>
        <p>Fecha de Visita: ${fechaVisita}</p>

        <h3 class="mt-3">Detalles de los Sitios Seleccionados:</h3>
        <c:forEach var="sitio" items="${sitiosSeleccionados}" varStatus="loop">
            <div class="sitio-card">
                <div class="row">
                    <div class="col-md-2">
                        <!-- Aquí puedes agregar un icono si lo deseas -->
                    </div>
                    <div class="col-md-10">
                        <h4>${sitio.name}</h4>
                        <p><strong>Dirección:</strong> ${sitio.direccion}</p>
                        <p><strong>Descripción:</strong> ${sitio.descripcion}</p>
                        <p><strong>Horario:</strong> ${sitio.hora_inicio} - ${sitio.hora_fin}</p>
                        <p><strong>Precio:</strong> ${sitio.precio}</p>
                        <!-- Puedes personalizar más el estilo aquí según tus necesidades -->
                    </div>
                </div>
            </div>
        </c:forEach>

        <!-- Botones para volver e imprimir folleto -->
      
    </div>
</body>
</html>
