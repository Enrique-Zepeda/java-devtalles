package map;

import java.util.Map;
import java.util.TreeMap;

// Product implementa Comparable<Product>
// porque vamos a usar Product como clave en un TreeMap.
//
// TreeMap necesita poder ordenar sus claves.
// Como Product es una clase creada por nosotros,
// debemos decirle cómo comparar un Product con otro.
public class Product implements Comparable<Product> {

    // Atributos del producto.
    private int id;
    private String name;

    // Constructor.
    // Sirve para crear productos con name e id.
    public Product(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // toString sirve para imprimir el objeto de forma legible.
    //
    // Sin este método, Java imprimiría algo como:
    // map.Product@1a2b3c
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    // compareTo le dice al TreeMap cómo ordenar los productos.
    //
    // En este caso, los productos se ordenan por id.
    //
    // Si devuelve:
    // negativo -> this va antes que o
    // cero     -> TreeMap considera que son la misma clave
    // positivo -> this va después que o
    @Override
    public int compareTo(Product o) {
        return Integer.compare(this.id, o.id);
    }

    public static void main(String[] args) {

        // ============================
        // ¿QUÉ ES ESTE TREEMAP?
        // ============================
        //
        // TreeMap guarda pares clave-valor.
        //
        // En este caso:
        //
        // Product -> clave
        // Double  -> valor
        //
        // Ejemplo:
        // Product("Laptop", 123) -> 16000.0
        //
        // Como es TreeMap, las claves se mantienen ordenadas.
        // El orden lo define el método compareTo de Product.
        Map<Product, Double> priceMap = new TreeMap<>();

        // ============================
        // CREATE / INSERTAR
        // ============================

        priceMap.put(new Product("Laptop", 123), 16000.0);
        priceMap.put(new Product("Table", 117), 4999.0);
        priceMap.put(new Product("PC", 121), 18970.2);

        // Aunque los agregaste en este orden:
        //
        // Laptop -> id 123
        // Table  -> id 117
        // PC     -> id 121
        //
        // TreeMap los ordena por id:
        //
        // 117, 121, 123

        System.out.println(priceMap);
        // Resultado aproximado:
        //
        // {
        //   Product{id=117, name='Table'}=4999.0,
        //   Product{id=121, name='PC'}=18970.2,
        //   Product{id=123, name='Laptop'}=16000.0
        // }


        // ============================
        // DELETE / ELIMINAR
        // ============================

        priceMap.remove(new Product("Laptop", 123), 16000.0);

        // remove(key, value) elimina solamente si:
        //
        // 1. Encuentra la clave.
        // 2. El valor asociado coincide.
        //
        // Aquí estás creando un nuevo Product:
        //
        // new Product("Laptop", 123)
        //
        // Aunque no es el mismo objeto en memoria que el original,
        // TreeMap lo encuentra porque compareTo compara por id.
        //
        // Como el id es 123, encuentra la Laptop.
        // Como el precio es 16000.0, también coincide.
        // Entonces elimina esa entrada.

        System.out.println(priceMap);
        // Ahora imprime el mapa sin Laptop.
    }
}