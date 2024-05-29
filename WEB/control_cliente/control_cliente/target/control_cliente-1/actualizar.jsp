<%@page import="java.util.List" %>
<%@page import="dominio.Clientes" %>

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
      
              <% if (request.getAttribute("BuscariID") != null) {%>
        <script>
            var buscador = <%= request.getAttribute("BuscariID")%>;
            var buscador2 = <%= request.getAttribute("errorcito")%>;
            if (buscador < 1) {
                alert("No existe el Codigo: " + buscador2);
            }
            
        </script>
        <% }%> 
        <div class="container-md ">
            <h1 class="text-center">Modificar Cliente</h1>
            <form action="/control_cliente/ServletBuscarID" method="get" >
                <div class="mb-3">
                    <label for="idModificar" class="form-label">ID:</label>
                    <input type="text" name="id" id="idModificar" class="form-control" required  placeholder="Digite el ID del cliente a modificar">
                </div>
                <div class="text-center">
                    <input class="btn btn-primary" type="submit" value="Buscar">
                </div>
            </form>

        </div>
        
        <%List<Clientes> clientes = (List<Clientes>) request.getAttribute("clientes");%>
        
                <% if (request.getAttribute("actualizacionExitosa") != null) {%>
        <script>
            var registrosActualizados = <%= request.getAttribute("actualizacionExitosa")%>;
            if (registrosActualizados > 0) {
                alert("Se edito Correctamente.");
            } else{
                alert("Error. No se puede Editar.");
            }
        </script>
        <% }%>
        
        
        <div class="container-md">
            <form action="/control_cliente/ServletActualizarCliente" method="POST">
                <div class="mb-3">
                    <label for="idModificar" class="form-label">ID:</label>
                    <input type="text" name="id" id="idModificar" class="form-control" required readonly value="${clientes.get(0).getId()}">
                </div>    
                <div class="mb-3">
                    <label for="nombreModificar" class="form-label">Nombre:</label>
                    <input type="text" name="nombre" id="nombreModificar" class="form-control" required value="${clientes.get(0).getNombre()}">
                </div>

                <div class="mb-3">
                    <label for="apellidoModificar" class="form-label">Apellido:</label>
                    <input type="text" name="apellido" id="apellidoModificar" class="form-control" required value="${clientes.get(0).getApellido()}">
                </div>
                <div class="mb-3">
                    <label for="emailModificar" class="form-label">Email:</label>
                    <input type="email" name="email" id="emailModificar" class="form-control" required value="${clientes.get(0).getEmail()}">
                </div>

                <div class="mb-3">
                    <label for="telefonoModificar" class="form-label">Teléfono:</label>
                    <input type="tel" name="telefono" id="telefonoModificar" class="form-control" required value="${clientes.get(0).getTelfono()}">
                </div>

                <div class="mb-3">
                    <label for="saldo" class="form-label">Saldo:</label>
                    <input type="number" step="0.01" name="saldo" id="saldo" class="form-control" required value="${clientes.get(0).getSueldo()}">
                </div>

                <div class="text-center">
                    <input class="btn btn-primary" type="submit" value="Editar Cliente">
                </div>
            </form>
        </div>

    </body>
</html>