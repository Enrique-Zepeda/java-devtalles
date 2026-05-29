package exceptionBasic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {
    public static void main(String[] args) {

        try {
            // Llamamos al método readFile.
            //
            // Como readFile puede lanzar IOException,
            // estamos obligados a manejar esa excepción con try-catch
            // o volver a lanzarla con throws.
            readFile("07-Excepciones/src/example.txt");

        } catch (FileNotFoundException e) {
            // FileNotFoundException ocurre cuando el archivo no existe
            // o la ruta está mal escrita.
            //
            // Este catch debe ir antes de IOException,
            // porque FileNotFoundException es más específica.
            System.out.println("El archivo no existe");

        } catch (IOException e) {
            // IOException es más general.
            //
            // Captura errores relacionados con entrada/salida,
            // por ejemplo:
            // - error al leer
            // - error al cerrar
            // - permisos
            // - archivo dañado
            System.out.println(e.getMessage());
        }

        // Si la excepción fue manejada correctamente,
        // el programa continúa y llega aquí.
        System.out.println("Fin");
    }

    // Este método recibe el nombre/ruta del archivo.
    //
    // throws IOException significa:
    // "Este método puede fallar con IOException,
    // pero no la voy a manejar aquí.
    // Quien llame a este método debe manejarla."
    public static void readFile(String fileName) throws IOException {

        // FileReader abre el archivo para lectura.
        //
        // BufferedReader envuelve a FileReader para leer de forma más eficiente.
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        // Si el archivo se abrió correctamente,
        // esta línea se ejecuta.
        System.out.println("El archivo fue abierto con exito");

        // Cerramos el archivo.
        //
        // Esto es importante para liberar recursos del sistema.
        reader.close();
    }
}