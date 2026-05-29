package exceptionBasic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {

        // Declaramos el reader afuera del try porque también lo necesitamos
        // en el finally para poder cerrarlo.
        BufferedReader reader = null;

        try {
            // ============================
            // ABRIR ARCHIVO
            // ============================

            // FileReader sirve para leer archivos de texto.
            //
            // BufferedReader envuelve a FileReader para leer el archivo
            // de forma más eficiente, línea por línea.
            reader = new BufferedReader(
                    new FileReader("07-Excepciones/src/example.txt")
            );

            // Variable donde vamos a guardar cada línea del archivo.
            String line;

            // readLine() lee una línea del archivo.
            //
            // Cuando ya no hay más líneas, readLine() devuelve null.
            //
            // Por eso este while significa:
            // "Mientras todavía exista una línea, imprímela".
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            // ============================
            // MANEJO DE ERRORES
            // ============================

            // IOException captura errores relacionados con entrada/salida.
            //
            // Ejemplos:
            // - El archivo no existe.
            // - No tienes permisos.
            // - Ocurrió un problema al leer.
            //
            // FileNotFoundException también queda cubierta aquí,
            // porque FileNotFoundException hereda de IOException.
            System.out.println("Error en la lectura del archivo");

        } finally {
            // ============================
            // CERRAR ARCHIVO
            // ============================

            // finally se ejecuta siempre:
            // - si el archivo se leyó bien
            // - si hubo error
            //
            // Se usa mucho para cerrar recursos como archivos,
            // conexiones a bases de datos, sockets, etc.

            try {
                // Validamos que reader no sea null.
                //
                // Si el archivo nunca se pudo abrir,
                // reader seguiría siendo null.
                //
                // Si intentamos hacer reader.close() cuando reader es null,
                // tendríamos un NullPointerException.
                if (reader != null) {
                    reader.close();
                    System.out.println("El archivo fue cerrado correctamente");
                }

            } catch (IOException e) {
                // close() también puede lanzar IOException.
                // Por eso necesita su propio try-catch.
                System.out.println("Error al cerrar el archivo");
            }
        }
    }
}