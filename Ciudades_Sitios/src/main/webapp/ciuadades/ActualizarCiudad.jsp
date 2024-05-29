<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page import="Modelo.Ciudad"%>
<%@page import="Modelo.SitiosTuristicos"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="recursos/estilos.css">
       <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css"><
       
        </head>
    <body>
        <%
            int id_ciudad = Integer.parseInt(request.getParameter("id"));
            Ciudad ciu = (Ciudad) request.getAttribute("ciuadades");
            List<SitiosTuristicos> sitios = (List<SitiosTuristicos>) request.getAttribute("sitios");
        %>
            
        
      <div class="d-flex justify-content-center mb-3">
    <div>
        <h2 class="text-center">Ciudad ${ciuadades.name} ${ciuadades.pais}</h2>
    </div>
</div>

        <div class=" container d-flex justify-content-between">
            <a class="btn btn-back  mb-2" href="Ciudad_Controlador?action=admin"> ← Volver</a>
            <a href="Ciudad_Controlador?action=eliminar&id=<%=id_ciudad%>" class=" btn btn-danger  mb-2"><i class="fas fa-timese"></i>Eliminar Ciudad </a>
            <a href="Ciudad_Controlador?action=ver2&id=<%=id_ciudad%>" class="btn btn-primary mb-2"><i class="fas fa-eye"></i> Ver Sitios Turisticos</a>
        </div>

        <form class="p-3 ml-4 mr-4" action="Ciudad_Controlador" method="post">
    <div class="container mt-3">
        <div class="alert alert-danger text-center" id="alerta" style="display: none;">
            <p>${requestScope.eliminacion}</p>
        </div>
    </div>
    <input type="number" name="bandera" value="2" style="display: none;">
    <input type="number" name="id" value="<%=id_ciudad%>" style="display: none; ">

    <div class="mb-2">
        <label for="name" class="form-label">Nombre:</label>
        <input type="text" class="form-control" name="name" required value="${ciuadades.name}">
    </div>

    <div class="mb-2">
        <label for="depto" class="form-label">Departamento:</label>
        <input type="text" class="form-control" name="depto" required value="${ciuadades.depto}">
    </div>

    <div class="mb-2">
        <label for="pais" class="form-label">País:</label>
        <input type="text" class="form-control" name="pais" required value="${ciuadades.pais}">
    </div>

    <div class="mb-2">
        <label for="area" class="form-label">Área:</label>
        <input type="number" step="any" class="form-control" name="area" required value="${ciuadades.area}">
    </div>

    <div class="mb-2">
        <label for="poblacion" class="form-label">Población:</label>
        <input type="number" class="form-control" name="poblacion" required value="${ciuadades.poblacion}">
    </div>

    <div class="mb-2">
        <label for="latitud" class="form-label">Latitud:</label>
        <input type="number" step="any" class="form-control" name="latitud" required value="${ciuadades.latitud}">
    </div>

    <div class="mb-3">
        <label for="longitud" class="form-label">Longitud:</label>
        <input type="number" step="any" class="form-control" name="longitud" required value="${ciuadades.longitud}">
    </div>

    <button type="submit" class="btn btn-primary mb-5"><i class="fas fa-save me-2"></i> Modificar Ciudad</button>
</form>

    </div>

    <script>
    var eliminacionMessage = "${requestScope.eliminacion}";
    if (eliminacionMessage) {
        var alerta = document.getElementById("alerta");
        alerta.style.display = "block"; // Muestra la alerta

        // Establece un temporizador para ocultar la alerta después de 2 segundos (2000 milisegundos)
        setTimeout(function() {
            alerta.style.display = "none"; // Oculta la alerta después de 2 segundos
        }, 2000); // 2000 milisegundos = 2 segundos
    }
</script>

</body>

</body>
</html>
