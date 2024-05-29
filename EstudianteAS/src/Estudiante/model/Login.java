package Estudiante.model;

public class Login {

    private static Login instance;
    private boolean autenticado = false;
    private final String USUARIO_CORRECTO = "andres";
    private final String CONTRASEÑA_CORRECTA = "andres";

    private Login() {
        // Constructor privado para evitar la instanciación fuera de la clase
    }

    public static Login getInstance() {
        if (instance == null) {
            instance = new Login();
        }
        return instance;
    }

    public boolean autenticar(String usuario, String contraseña) {
        // Verificar si las credenciales coinciden
        if (usuario.equals(USUARIO_CORRECTO) && contraseña.equals(CONTRASEÑA_CORRECTA)) {
            autenticado = true;
        } else {
            autenticado = false;
        }
        return autenticado;
    }

    public boolean isAutenticado() {
        return autenticado;
    }
}
