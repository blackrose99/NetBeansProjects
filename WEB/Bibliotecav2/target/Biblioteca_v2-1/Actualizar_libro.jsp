<%@ page import="dominio.Libros" %>
<%@ page import="java.util.List" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    
    <body>
        <%
            Libros libro = (Libros) request.getAttribute("libros");
        %>
        
        <form action="Libros_Controlador" method="POST">
             <input type="number" name="bandera" value="1" style="display: none;">
             <input type="number" name="id" value="<%=libro.getId()%>" style="display: none;">
            <div>
                <label for="titulo">Título:</label>
                <input type="text" name="titulo" id="titulo" required value="<%=libro.getTitulo() %>">
            </div>
            <div>
                <label for="autor">Autor:</label>
                <input type="text" name="autor" id="autor" required value="<%=libro.getAutor() %>">
            </div>
            <div>
                <label for="fechaPublicacion">Fecha de publicación:</label>
                <input type="number" name="fecha" id="fechaPublicacion" required value="<%=libro.getFecha() %>">
            </div>
            <div>
                <label for="genero">Género:</label>
                <input type="text" name="genero" id="genero" required value="<%= libro.getGenero() %>">
                <input type="submit" value="Actualizar">
            </div>
        </form>
    </body>
</html>
