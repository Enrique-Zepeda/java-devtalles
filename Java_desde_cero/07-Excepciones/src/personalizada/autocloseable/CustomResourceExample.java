package personalizada.autocloseable;

public class CustomResourceExample {
    public static void main(String[] args) {

        // try-with-resources.
        //
        // Aquí se crea una conexión falsa a la base de datos.
        //
        // Como FakeDataBaseConnection implementa AutoCloseable,
        // Java sabe que debe llamar automáticamente a close()
        // cuando termine el bloque try.
        try (
                FakeDataBaseConnection connection = new FakeDataBaseConnection()
        ) {

            // Usamos la conexión.
            connection.fetchData();

            // Cuando termina este bloque,
            // Java llama automáticamente a:
            //
            // connection.close();

        } catch (Exception e) {

            // Captura cualquier error que ocurra:
            // - al crear la conexión
            // - al usar fetchData()
            // - al cerrar con close()
            System.out.println("Error: " + e.getMessage());
        }

        // No puedes hacer esto aquí:
        //
        // connection.close();
        //
        // porque connection solo existe dentro del try.
        // Además, no hace falta cerrarla manualmente:
        // try-with-resources ya la cierra automáticamente.
    }
}