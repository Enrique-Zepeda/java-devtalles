package exceptionBasic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MultiResourcesExample {
    public static void main(String[] args) {

        // =====================================================
        // TRY-WITH-RESOURCES CON VARIOS RECURSOS
        // =====================================================
        //
        // try-with-resources sirve para abrir recursos que deben cerrarse,
        // por ejemplo:
        //
        // - archivos
        // - conexiones a bases de datos
        // - sockets
        //
        // La ventaja es que Java los cierra automáticamente.
        //
        // En este caso estamos abriendo dos archivos:
        // 1. example.txt
        // 2. example2.txt
        try (
                // Primer recurso:
                // reader lee el archivo example.txt.
                BufferedReader reader = new BufferedReader(
                        new FileReader("07-Excepciones/src/example.txt")
                );

                // Segundo recurso:
                // reader2 lee el archivo example2.txt.
                BufferedReader reader2 = new BufferedReader(
                        new FileReader("07-Excepciones/src/example2.txt")
                );
        ) {

            // Variable para guardar cada línea leída del primer archivo.
            String line;

            // readLine() lee una línea del archivo.
            //
            // Cuando ya no hay más líneas, devuelve null.
            //
            // Este while significa:
            // "Mientras el archivo tenga líneas, imprímelas".
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Aquí leemos solo la primera línea del segundo archivo.
            //
            // OJO:
            // Esto no lee todo example2.txt,
            // solamente lee una línea.
            System.out.println("Reader 2: " + reader2.readLine());

        } catch (FileNotFoundException e) {

            // FileNotFoundException ocurre si alguno de los archivos no existe
            // o si la ruta está mal escrita.
            //
            // Este catch debe ir antes de IOException,
            // porque FileNotFoundException es más específica.
            System.out.println("El Archivo no fue encontrado");

        } catch (IOException e) {

            // IOException es más general.
            //
            // Puede ocurrir por errores al abrir, leer o cerrar el archivo.
            System.out.println("Error en la lectura del archivo");
        }

        // Al salir del try, Java cierra automáticamente:
        //
        // reader2
        // reader
        //
        // Normalmente los recursos se cierran en orden inverso
        // al que fueron abiertos.
    }
}