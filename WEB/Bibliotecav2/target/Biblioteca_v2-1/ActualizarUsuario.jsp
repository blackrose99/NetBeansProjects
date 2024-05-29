<%@ page import="dominio.Usuarios" %>
<%@ page import="java.util.List" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>

    <body>
        <%
            Usuarios user = (Usuarios) request.getAttribute("usuarios"); // Obtiene el objeto Usuarios de los atributos de la solicitud
        %>

        <form action="Usuarios_Controlador" method="POST">
            <input type="number" name="bandera" value="1" style="display: none;"> <!-- Campo oculto para indicar la bandera -->

            <input type="number" name="id" value="<%=user.getId()%>" style="display: none;"> <!-- Campo oculto para enviar el ID del usuario -->

            <div>
                <label for="nombre">Nombre:</label>
                <input type="text" name="nombre" id="nombre" required value="<%=user.getNombre()%>" > <!-- Campo de entrada para el nombre con valor predefinido del usuario actual -->
            </div>

            <div>
                <label for="apellido">Apellido:</label>
                <input type="text" name="apellido" id="apellido" required value="<%=user.getApellido()%>" > <!-- Campo de entrada para el apellido con valor predefinido del usuario actual -->
            </div>

            <div>
                <label for="direccion">Direccion:</label>
                <input type="text" name="direccion" id="direccion" required value="<%=user.getDireccion()%>" > <!-- Campo de entrada para la dirección con valor predefinido del usuario actual -->
            </div>

            <div>
                <label for="telefono">Teléfono:</label>
                <input type="tel" name="telefono" id="telefono" required value="<%=user.getTelfono()%>" > <!-- Campo de entrada para el teléfono con valor predefinido del usuario actual -->
            </div> 
            <input type="submit" value="Actualizar"> <!-- Botón para enviar el formulario -->

        </form>

    </body>
</html>
