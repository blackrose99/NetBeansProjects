<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
                <ul>
            <li><a href="Usuarios_Controlador?action=inicio"> Usuarios</a></li>
            <li><a href="Libros_Controlador?action=inicio">Libros</a></li>
            <li><a href="Prestamos_Controlador?action=inicio"></i> Prestamos</a></li>
        </ul>
        <h2>Tabla </h2>

        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th>Direccion</th>
                    <th>Telefono</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>

                <c:forEach var="usuario" items="${usuarios}">
                    <tr>
                        <td>${usuario.id}</td> <!-- Muestra el ID del usuario actual -->
                        <td>${usuario.nombre}</td> <!-- Muestra el nombre del usuario actual -->
                        <td>${usuario.apellido}</td> <!-- Muestra el apellido del usuario actual -->
                        <td>${usuario.direccion}</td> <!-- Muestra la dirección del usuario actual -->
                        <td>${usuario.telfono}</td> <!-- Muestra el teléfono del usuario actual -->
                        <td> <a href="Usuarios_Controlador?action=editar&id=${usuario.id}">Editar</a> </td> <!-- Crea un enlace para editar el usuario actual -->
                        <td> <a href="Usuarios_Controlador?action=eliminar&id=${usuario.id}">Eliminar</a> </td> <!-- Crea un enlace para eliminar el usuario actual -->
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        
        <h1>Registrar</h1>
        <form action="Usuarios_Controlador" method="POST">
            <input type="number" name="bandera" value="0" style="display: none;"> <!-- Campo oculto para indicar la bandera -->

            <div>
                <label for="nombre">Nombre:</label>
                <input type="text" name="nombre" id="nombre" required> <!-- Campo de entrada para el nombre -->
            </div>

            <div>
                <label for="apellido">Apellido:</label>
                <input type="text" name="apellido" id="apellido" required> <!-- Campo de entrada para el apellido -->
            </div>

            <div>
                <label for="email">Direccion:</label>
                <input type="text" name="direccion" id="direccion" required> <!-- Campo de entrada para la dirección -->
            </div>

            <div>
                <label for="telefono">Teléfono:</label>
                <input type="tel" name="telefono" id="telefono" required> <!-- Campo de entrada para el teléfono -->
            </div>
            <br>        
            <div>
                <input type="submit" value="Registrar Estudiantes"> <!-- Botón para enviar el formulario -->
            </div>
        </form>

    </body>
</html>
