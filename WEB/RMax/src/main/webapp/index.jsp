

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
    </head>
    <body>
           
        <h1>Registro de Estudiantes</h1>
                <form action="guardado.jsp" method="post">
            <table cellspacing="3" cellpadding="3" border="1">
                <tr>
                    <td align="right">Nombre</td>
                    <td><input type="text" name="nombre"></td>
                </tr>
                <tr>
                    <td align="right">Documento</td>
                    <td><input type="text" name="documento"></td>
                </tr>
                <tr>
                    <td align="right">Materia</td>
                    <td>          
                        <select name="materia">
                            <option value="Bases de datos">Bases de datos</option>
                            <option value="Metodología">Metodología</option>
                            <option value="Cloud computing">Cloud computing</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td align="right">Nota 1</td>
                    <td><input type="text" name="nota1"></td>
                </tr>
                <tr>
                    <td align="right">Nota 2</td>
                    <td><input type="text" name="nota2"></td>
                </tr>
            </table>
            <br>
            <input type="reset" value="Borrar">
            <input type="submit" value="Guardar">
            
        </form>
        
        
        <form action="viewDatos.jsp" method="post">
            <input type="submit" value="Ver Estudiantes">
        </form>
    </body>
</html>
