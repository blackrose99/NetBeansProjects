<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="recursos/estilos.css"/>

    </head>
    <body class="uvh-100">
        <nav>
            <div class="logo">
                <img src="img/ruta_del_logo.png.png" alt="Logo" width="50" height="50">
            </div>
            <ul>
                <li><a href="index.jsp">Inicio</a></li>
                <li><a href="clientes.jsp">Listar Clientes</a></li>
                <li><a href="Formulario.jsp">Registrar Clientes</a></li>
                <li><a href="eliminar.jsp">Eliminar Clientes</a></li>
                <li><a href="actualizar.jsp">Actualizar Clientes</a></li>
            </ul>
        </nav>

        <% if (request.getAttribute("registroExitoso") != null) {%>
        <script>
            var registrosInsertados = <%= request.getAttribute("registroExitoso")%>;
            if (registrosInsertados > 0) {
                alert("Registro exitoso.");
            } else{
                alert("Error,No Se puede Registrar.");
            }
        </script>
        <% }%>


        <div class="container-md ">
            <h1 class="text-center mb-4">Registrar Clientes</h1>        
            <form action="/control_cliente/InsertarServlet" method="POST">
                <div class="mb-3">
                    <label for="nombre" class="form-label">Nombre:</label>
                    <input type="text" name="nombre" id="nombre" class="form-control" required>
                </div>

                <div class="mb-3">
                    <label for="apellido" class="form-label">Apellido:</label>
                    <input type="text" name="apellido" id="apellido" class="form-control" required>
                </div>

                <div class="mb-3">
                    <label for="email" class="form-label">Email:</label>
                    <input type="email" name="email" id="email" class="form-control" required>
                </div>

                <div class="mb-3">
                    <label for="telefono" class="form-label">Teléfono:</label>
                    <input type="tel" name="telefono" id="telefono" class="form-control" required>
                </div>

                <div class="mb-3">
                    <label for="saldo" class="form-label">Saldo:</label>
                    <input type="number" step="0.01" name="saldo" id="saldo" class="form-control" required>
                </div>

                <div class="text-center">
                    <input class="btn btn-primary" type="submit" value="Registar Clientes">
                </div>

            </form>

        </div>

    </body>
</html>
