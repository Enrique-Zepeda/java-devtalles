package personalizada.checked;

public class AgeValidator {
    public static void main(String[] args) {

        // Declaramos una variable Person.
        // Aquí inicia como null porque todavía no sabemos
        // si la persona se podrá crear correctamente.
        Person person = null;

        try {
            // Intentamos crear una persona usando el método createPerson.
            //
            // Este método puede lanzar una AgeValidationException
            // si la edad es menor a 18.
            person = Person.createPerson("Kike", 13);

            // Si la persona se crea correctamente,
            // imprimimos su información.
            //
            // En este caso NO se ejecuta porque la edad es 13.
            System.out.println(person.toString());

        } catch (AgeValidationException e) {
            // Si createPerson lanza AgeValidationException,
            // el programa entra aquí.
            //
            // e.getMessage() obtiene el mensaje que mandamos
            // cuando lanzamos la excepción.
            System.out.println("Error: " + e.getMessage());
        }
    }
}