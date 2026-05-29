package personalizada.checked;

// Creamos nuestra propia excepción personalizada.
//
// extends Exception significa que esta será una checked exception.
// Eso obliga a manejarla con try-catch o declararla con throws.
public class AgeValidationException extends Exception {

    // Constructor de la excepción.
    //
    // Recibe un mensaje personalizado, por ejemplo:
    // "Debes ser mayor de edad"
    public AgeValidationException(String message) {

        // super(message) manda el mensaje a la clase padre Exception.
        //
        // Gracias a esto después podemos usar:
        // e.getMessage()
        super(message);
    }
}