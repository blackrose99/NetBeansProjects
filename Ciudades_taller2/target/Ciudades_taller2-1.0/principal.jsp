<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Entidad Ciudades</title>
</head>
<body class="">
    <nav>
        <div>
            <a href="#"><h2>Ciudades</h2></a>
            <button type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span></span>
            </button>
            <div>
                <ul>
                    <li>
                        <a href="#"><i></i> Inicio</a>
                    </li>
                    <li>
                        <a href="login.jsp"><i></i> Administrar</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <div>
        <div>
            <div>                        
                <input id="buscar" type="text" placeholder="Buscar ciudad..." onkeyup="doSearch()">
            </div>
            <table>
                <thead>
                    <tr>
                        <th>Ciudad</th>
                        <th>Estado</th>
                        <th>Pais</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="ciudad" items="${ciudades}">
                        <tr>
                            <td>${ciudad.name}</td>
                            <td>${ciudad.depto}</td>
                            <td>${ciudad.pais}</td>
                            <td><a href="Ciudad_Controlador?action=ver&id=${ciudad.id}"><i></i> Visitar</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <div>
                <a href="#"><i></i> Subir</a>
            </div>
        </div>
    </div>
</body>
<footer>
    <div>
        <p>&copy; 2023 Ciudades. Todos los derechos reservados.</p>
        <p>Manuel Castaño & Yeison Duarte</p>
        <p>Contáctanos: <a href="mailto:info@ciudadesturisticas.com">info@ciudadesturisticas.com</a></p>
    </div>
</footer>
</html>
