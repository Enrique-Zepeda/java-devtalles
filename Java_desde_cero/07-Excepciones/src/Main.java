public class Main {

    public static void main(String[] args) {

        // ============================
        // EJEMPLO 1: ArithmeticException
        // ============================

        try {
            // Código que puede fallar.
            //
            // Dividir un número entero entre 0 en Java
            // provoca una ArithmeticException.
            int result = 10 / 0;

            // Esta línea NO se ejecuta,
            // porque la línea anterior lanza una excepción.
            System.out.println("result = " + result);

        } catch (ArithmeticException e) {
            // Este catch captura errores matemáticos.
            //
            // Ejemplo:
            // - división entre cero

            // Forma manual de mostrar mensaje:
            // System.out.println("Division por cero");

            // printStackTrace() imprime todo el error completo en consola.
            // Es útil para debug, pero no siempre se usa en mensajes al usuario.
            // e.printStackTrace();

            // getMessage() devuelve el mensaje interno de la excepción.
            //
            // En este caso normalmente imprime:
            // / by zero
            System.out.println("Error: " + e.getMessage());

        } finally {
            // finally se ejecuta siempre:
            // - si hubo error
            // - si no hubo error
            // - si el catch capturó la excepción
            System.out.println("Se ejecuta siempre");
        }


        // ============================
        // EJEMPLO 2: ArrayIndexOutOfBoundsException
        // ============================

        try {
            // Creamos un arreglo de tamaño 3.
            //
            // Índices válidos:
            // 0, 1, 2
            int[] numbers = new int[3];

            // Esto provoca un error porque el índice 5 no existe.
            //
            // El arreglo solo tiene posiciones:
            // numbers[0]
            // numbers[1]
            // numbers[2]
            System.out.println(numbers[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            // Este catch captura errores cuando intentas acceder
            // a una posición inexistente de un array.

            // getStackTrace() devuelve información técnica
            // sobre dónde ocurrió el error.
            //
            // Regresa un arreglo de StackTraceElement.
            StackTraceElement[] stack = e.getStackTrace();

            // Recorremos cada elemento del stack trace.
            //
            // Cada elemento representa una llamada de método
            // dentro del camino que llevó al error.
            for (StackTraceElement element : stack) {

                // Nombre completo de la clase donde ocurrió la llamada.
                System.out.println("Clase: " + element.getClassName());

                // Nombre del método donde ocurrió la llamada.
                System.out.println("Metodo: " + element.getMethodName());

                // Archivo donde ocurrió la llamada.
                System.out.println("Archivo: " + element.getFileName());

                // Línea exacta donde ocurrió la llamada.
                System.out.println("Linea: " + element.getLineNumber());
            }
        }

        // Como ambas excepciones fueron capturadas,
        // el programa puede continuar hasta el final.
        System.out.println("EL programa finaliza");
    }
}