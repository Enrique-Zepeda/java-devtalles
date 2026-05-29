package exceptionBasic;

public class Main {

    // Método recursivo infinito.
    // Este método se llama a sí mismo una y otra vez sin detenerse.
    public static void recursive() {
        recursive();
    }

    public static void main(String[] args) {

        // Si descomentas esta línea, el programa entrará en recursión infinita.
        // Eso puede provocar un StackOverflowError.
        //
        // OJO:
        // StackOverflowError no es exactamente una Exception normal.
        // Es un Error, porque ocurre cuando se llena la pila de llamadas.
        // recursive();

        try {
            // ============================
            // TRY
            // ============================
            // Aquí colocamos código que puede fallar.
            //
            // En este caso, dividir entre 0 provoca un ArithmeticException.
            int result = 10 / 0;

            // Esta línea NO se ejecuta porque la línea anterior falla.
            System.out.println("result = " + result);

        } catch (ArithmeticException e) {
            // ============================
            // CATCH
            // ============================
            // catch captura el error específico que ocurrió en el try.
            //
            // ArithmeticException ocurre en errores matemáticos,
            // por ejemplo dividir entre cero.
            System.out.println("Division por cero");

        } finally {
            // ============================
            // FINALLY
            // ============================
            // finally se ejecuta siempre:
            // - si hubo error
            // - si no hubo error
            // - incluso si el catch se ejecutó
            //
            // Se suele usar para cerrar archivos, conexiones,
            // liberar recursos, etc.
            System.out.println("Se ejecuta siempre");
        }

        // Como la excepción fue capturada por el catch,
        // el programa puede continuar normalmente.
        System.out.println("EL programa finaliza");
    }
}