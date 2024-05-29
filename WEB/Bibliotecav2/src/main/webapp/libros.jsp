<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>  
    <body >   
                <ul>
            <li><a href="Usuarios_Controlador?action=inicio"> Usuarios</a></li>
            <li><a href="Libros_Controlador?action=inicio">Libros</a></li>
            <li><a href="Prestamos_Controlador?action=inicio"></i> Prestamos</a></li>
        </ul>
        <h1 >Tabla</h1>
            <table >
                <thead>
                    <tr>
                        <th >ID</th>
                        <th >Titulo</th>
                        <th >Autor</th>
                        <th >Año de Publicacion</th>
                        <th>Genero</th>
                        <th></th>
                        <th></th>

                    </tr>
                </thead>
                <tbody>

                <c:forEach var="libro" items="${libros}">
                    <tr>
                        <td >${libro.id}</td>
                        <td >${libro.titulo}</td>
                        <td >${libro.autor}</td>
                        <td >${libro.fecha}</td>
                        <td >${libro.genero}</td>
                        <td > <a href="Libros_Controlador?action=editar&id=${libro.id}"> Editar</a> </td>
                        <td > <a href="Libros_Controlador?action=eliminar&id=${libro.id}" > Eliminar</a> </td>
                    </tr>
                </c:forEach>
                    
                </tbody>
            </table>
        
        <form action="Libros_Controlador" method="POST">
            <h1>Registrar</h1>
            <div>
                <input type="hidden" name="bandera" value="0">
                <label for="titulo">Título:</label>
                <input type="text" name="titulo" id="titulo" required>
            </div>
            <div>
                <label for="autor">Autor:</label>
                <input type="text" name="autor" id="autor" required>
            </div>
            <div>
                <label for="fechaPublicacion">Fecha de publicación:</label>
                <input type="number" name="fecha" id="fechaPublicacion" required>
            </div>
            <div>
                <label for="genero">Género:</label>
                <input type="text" name="genero" id="genero" required>
            </div>

            <div>
                <input type="submit" value="Registrar Libro">
            </div>
        </form>
        
        
    </body>
</html>

</html>
