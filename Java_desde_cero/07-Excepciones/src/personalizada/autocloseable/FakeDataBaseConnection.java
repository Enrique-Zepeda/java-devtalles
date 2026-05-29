package personalizada.autocloseable;

// AutoCloseable es una interfaz de Java.
// Sirve para crear recursos que se pueden cerrar automáticamente.
//
// Ejemplos reales de recursos:
// - conexión a base de datos
// - archivo
// - socket
// - conexión de red
//
// Si una clase implementa AutoCloseable,
// puede usarse dentro de try-with-resources.
public class FakeDataBaseConnection implements AutoCloseable {

    // Constructor.
    // Se ejecuta cuando hacemos:
    // new FakeDataBaseConnection()
    public FakeDataBaseConnection() {
        System.out.println("Conexion a la base de datos");
    }

    // Método normal de la clase.
    // Simula obtener información de una base de datos.
    public void fetchData() {
        System.out.println("Obteniendo informacion de la base de datos");
    }

    // Método obligatorio cuando implementamos AutoCloseable.
    //
    // Java llama automáticamente a close()
    // cuando termina el try-with-resources.
    @Override
    public void close() throws Exception {
        System.out.println("Conexion cerrada correctamente");
    }
}