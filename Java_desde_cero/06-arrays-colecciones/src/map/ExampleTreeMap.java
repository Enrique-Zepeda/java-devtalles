package map;

import java.util.Map;
import java.util.TreeMap;

public class ExampleTreeMap {
    public static void main(String[] args) {

        // ============================
        // ¿QUÉ ES UN TREEMAP?
        // ============================
        //
        // TreeMap es una estructura de datos que guarda información
        // en pares clave-valor, igual que HashMap.
        //
        // Diferencia principal:
        //
        // HashMap  -> no garantiza orden.
        // TreeMap  -> mantiene las claves ordenadas automáticamente.
        //
        // En este caso:
        // Map<String, Integer>
        //
        // String  -> tipo de la clave.
        // Integer -> tipo del valor.
        //
        // Ejemplo:
        // "Laptop" -> 1000
        //
        // Como la clave es String, TreeMap ordena alfabéticamente por la clave.

        Map<String, Integer> productPrices = new TreeMap<>();

        // ============================
        // CREATE / INSERTAR
        // ============================

        // put(clave, valor) agrega un par clave-valor al mapa.
        productPrices.put("Laptop", 1000);
        productPrices.put("SmarthPhone", 5900);
        productPrices.put("Ps5", 9899);
        productPrices.put("Mouse", 3000);
        productPrices.put("Teclado", 4356);

        // Aunque los agregaste en este orden:
        // Laptop, SmarthPhone, Ps5, Mouse, Teclado
        //
        // TreeMap los ordena por clave de forma automática.
        //
        // El orden será alfabético:
        // Laptop, Mouse, Ps5, SmarthPhone, Teclado

        System.out.println(productPrices);
        // Imprime todo el TreeMap.
        //
        // Resultado aproximado:
        // {Laptop=1000, Mouse=3000, Ps5=9899, SmarthPhone=5900, Teclado=4356}


        // ============================
        // READ / LEER
        // ============================

        System.out.println(productPrices.get("Laptop"));
        // get(clave) obtiene el valor asociado a esa clave.
        //
        // "Laptop" tiene valor 1000.
        // Imprime:
        // 1000


        // ============================
        // UPDATE / ACTUALIZAR
        // ============================

        productPrices.put("Laptop", 1234);
        // Si la clave ya existe, put NO agrega otra Laptop.
        // En lugar de eso, actualiza el valor.
        //
        // Antes:
        // "Laptop" -> 1000
        //
        // Después:
        // "Laptop" -> 1234

        System.out.println(productPrices.get("Laptop"));
        // Ahora imprime:
        // 1234


        // ============================
        // DELETE / ELIMINAR
        // ============================

        productPrices.remove("Laptop");
        // remove(clave) elimina el par clave-valor usando la clave.
        //
        // Elimina:
        // "Laptop" -> 1234

        System.out.println(productPrices);
        // Imprime el mapa sin Laptop.
        //
        // Resultado aproximado:
        // {Mouse=3000, Ps5=9899, SmarthPhone=5900, Teclado=4356}
    }
}