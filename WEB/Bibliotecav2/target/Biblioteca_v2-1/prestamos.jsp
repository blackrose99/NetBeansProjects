<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
                <ul>
            <li><a href="Usuarios_Controlador?action=inicio"> Usuarios</a></li>
            <li><a href="Libros_Controlador?action=inicio">Libros</a></li>
            <li><a href="Prestamos_Controlador?action=inicio"></i> Prestamos</a></li>
        </ul>
        <h1>Tabla de Prestamos</h1>
        <table>
            <thead>
                <tr>
                    <th>ID Prestamo</th>
                    <th>ID Libro</th>
                    <th>Código Libro</th>
                    <th>Fecha Prestamo</th>
                    <th>Fecha Entrega</th>
                    <th>ID Usuario</th>
                    <th>Nombre Usuario</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="prestamo" items="${prestamos}">
                    <tr>
                        <td>${prestamo.id}</td>
                        <td>${prestamo.libro.id}</td>
                        <td>${prestamo.libro.titulo}</td>
                        <td>${prestamo.fechaPrestamo}</td>
                        <td>${prestamo.fechaEntrega}</td>
                        <td>${prestamo.user.id}</td>
                        <td>${prestamo.user.nombre}</td>
                        <td><a href="Prestamos_Controlador?action=eliminar&amp;id=${prestamo.id}">Eliminar</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

        <h2>Formulario de Préstamo</h2>
        <form action="Prestamos_Controlador" method="POST">
            <label for="libro">ID del Libro:</label>
            <br>
            <input type="number" name="id_libro" required="">
            <br><br>
            <label for="usuario">ID del Usuario:</label>
            <br>
            <input type="number" name="id_usuario" required="">
            <br><br>
            <label for="fecha_prestamo">Fecha de Préstamo:</label>
            <br>
            <input type="date" name="fecha_prestamo" id="fecha_prestamo" required>
            <br><br>
            <label for="fecha_devolucion">Fecha de Devolución:</label>
            <br>
            <input type="date" name="fecha_devolucion" id="fecha_devolucion" >
            <br><br>
            <input type="submit" value="Guardar Préstamo">
        </form>
    </body>
</html>
