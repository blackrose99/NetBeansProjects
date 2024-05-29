
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro Estudiante</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="recursos/estilos.css"/>
    </head>
    <body class="uvh-100">
        <jsp:include page="plantillas/navegacion.jsp" />
        <% if (request.getAttribute("registroExitoso") != null) {%>
        <script>
            var registrosInsertados = <%= request.getAttribute("registroExitoso")%>;
            if (registrosInsertados > 0) {
                alert("Registro exitoso.");
            } else {
                alert("Error,No Se puede Registrar.");
            }
        </script>
        <% }%>

<div class="container-md ">
    <h1 class="text-center mb-4">Registrar Estudiantes</h1>        
    <form action="Estudiante_Controlador" method="POST">
         <input type="number" name="bandera" value="0" style="display: none;">
        <div class="mb-3">
            <label for="nombre" class="form-label"><i class="fas fa-id-card"></i> Cedula:</label>
            <input type="number" name="cc" id="cc" class="form-control" required>
        </div>

        <div class="mb-3">
            <label for="nombre" class="form-label"><i class="fas fa-user"></i> Nombre:</label>
            <input type="text" name="nombre" id="nombre" class="form-control" required>
        </div>

        <div class="mb-3">
            <label for="apellido" class="form-label"><i class="fas fa-user"></i> Apellido:</label>
            <input type="text" name="apellido" id="apellido" class="form-control" required>
        </div>

        <div class="mb-3">
            <label for="email" class="form-label"><i class="fas fa-envelope"></i> Email:</label>
            <input type="email" name="email" id="email" class="form-control" required>
        </div>

        <div class="mb-3">
            <label for="telefono" class="form-label"><i class="fas fa-phone"></i> Teléfono:</label>
            <input type="tel" name="telefono" id="telefono" class="form-control" required>
        </div>

        <div class="mb-3">
            <label for="saldo" class="form-label"><i class="fas fa-chart-line"></i> Promedio:</label>
            <input type="number" step="0.01" name="promedio" id="promedio" class="form-control" required>
        </div>

        <div class="text-center">
            <input class="btn btn-primary" type="submit" value="Registrar Estudiantes">
        </div>
    </form>
</div>

        <jsp:include page="plantillas/fotter.jsp" />

    </body>
</html>
