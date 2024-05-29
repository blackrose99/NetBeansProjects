<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login</title>
</head>
<body class="bg-light">
    <div class="container mt-3 mb-5">
        <div class="row justify-content-center mb-3">
            <div class="col-md-6 col-lg-4">
                <div class="card mb-5">
                    <div class="card-header bg-primary text-white text-center">
                        <h4>Iniciar Sesión</h4>
                    </div>
                    <div class="card-body mb-5">
                        <form action="Ciudad_Controlador" method="post">                 
                            <input type="number" name="bandera" value="0" style="display: none;">
                            <div class="mb-3">
                                <div class="text-center mb-3">
                                    <img src="img/login.png" class="img-fluid" alt="Imagen de inicio de sesión" width="300">
                                </div>
                                <div class="text-center mb-3">
                                    <h6>Digita el Usuario y Contraseña para validar que eres el administrador</h6>
                                </div>
                                <% String alerta = (String) request.getAttribute("alerta");
                                if (alerta != null) {%>
                                    <div class="alert alert-danger mt-3" role="alert">
                                        <%= alerta%>
                                    </div>
                                <% }%>
                                <label for="username" class="form-label">Nombre de usuario</label>
                                <input type="text" class="form-control" id="username" name="username" required>
                            </div>

                            <div class="mb-3">
                                <label for="password" class="form-label">Contraseña</label>
                                <div class="input-group">
                                    <input type="password" class="form-control" id="password" name="password" required>
                                    <button type="button" id="togglePassword">
                                        Mostrar Contraseña
                                    </button>
                                </div>
                            </div>

                            <input class="btn btn-primary w-100 mb-3" type="submit" value="Iniciar Sesión">
                            <a class="btn btn-primary w-100" href="index.jsp">Volver</a>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script>
        const togglePassword = document.querySelector('#togglePassword');
        const password = document.querySelector('#password');

        togglePassword.addEventListener('click', function () {
            const type = password.getAttribute('type') === 'password' ? 'text' : 'password';
            password.setAttribute('type', type);
        });
    </script>
</body>
</html>
