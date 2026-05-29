package exceptionBasic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("07-Excepciones/src/example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }catch (FileNotFoundException e) {
            System.out.println("El Archivo no fue encontrado");
        } catch (IOException e) {
            System.out.println("Error en la lectura del archivo");
        }
    }
}
