package excepciones;

/**
 * Excepcion lanzada cuando una contraseña no cumple los requisitos
 */

public class PasswordDebilException extends Exception {
    public PasswordDebilException(String mensaje) {
        super("Error al crear la contraseña: \n" + mensaje);
        System.err.println(super.fillInStackTrace());
    }
}
