function validarForma(forma){
    var usuario = forma.usuario;
        if (usuario === "" || usuario.value === "Escribir Usuario"){
            alert("Debe proporcionar un nombre de Usuario");
            usuario.focus;
            usuario.select();
        return false;
    }
    
    var password = forma.password;
        if(password === "" || password.value <3){
            alert("Debe proporcionar un password superior a tres(3) caracteres");
            password.focus;
            password.select;
        return false;
    }

    var tecnologias = forma.tecnologia;
    var checkSeleccionado = false;
    for (var i = 0;i < tecnologias.length;i++){
        if (tecnologias[i].checked){
            checkSeleccionado = true;
        }
    }

    if (checkSeleccionado === false){
        alert("Debe Seleccionar una Tecnologia");
        return false;
    }

    var generos = forma.genero;
    var radioSeleccionado = false;
    for ( var i = 0; i < generos.length; i++){
        if (generos[i].checked){
            radioSeleccionado = true;
        }
    }

    if (radioSeleccionado === false){
        alert("Debe selecioanar un Genero");
        return false;
    }

    var ocupacion = forma.ocupacion;
    if (ocupacion.value ===""){
        alert("Debe seleccioanar una ocupacion");
        return false;
    }

    //Formulario es Valido
    
    alert("Formulario Valido, Enviando Datos al Servidor");
    
    return true;
}