package puntoDeEntrada;

public class MainApp {

    /**
     * El Punto de Entrada (Entry Point).
     * La JVM busca exactamente esta firma: public static void main(String[] args).
     * Es 'static' porque debe existir antes de que cualquier objeto sea creado.
     */
    public static void main(String[] args) {
        System.out.println("Hola mundo");

        // ERROR DE COMPILACIÓN:
        // No puedes llamar a un método de instancia directamente desde un contexto estático.
        // Es como intentar usar una televisión que todavía no has comprado (instanciado).
        // sayHello();

        // SOLUCIÓN 1: Crear el objeto (instanciar)
        // Ahora el método 'sayHello' vive en el HEAP dentro del objeto 'mainApp'.
        MainApp mainApp = new MainApp();
        mainApp.sayHello();

        // SOLUCIÓN 2: Que el método también sea estático
        // No necesita objeto porque vive en la clase (Metaspace).
        sayHello1();
    }

    // Método de Instancia: Le pertenece a los OBJETOS de la clase.
    public void sayHello() {
        System.out.println("Hola, soy la app principal (Método de Instancia)");
    }

    // Método Estático: Le pertenece a la CLASE.
    public static void sayHello1() {
        System.out.println("Hola, soy sayhello1 (Método Estático)");
    }
}