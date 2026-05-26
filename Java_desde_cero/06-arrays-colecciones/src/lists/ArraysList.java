package lists;

import java.util.ArrayList;
import java.util.List;

public class ArraysList {
    public static void main(String[] args) {

        // Buena práctica:
        // Declaramos la variable como List, que es una interfaz.
        // Creamos el objeto real como ArrayList.
        //
        // Esto permite cambiar después la implementación si fuera necesario.
        // Por ejemplo: LinkedList, Vector, etc.
        List<String> students = new ArrayList<>();

        // add(elemento) agrega el elemento al final de la lista.
        // Cada elemento conserva el orden en el que fue agregado.
        students.add("Tonita");
        students.add("Alondra");
        students.add("Kike");
        students.add("Zepeda");

        // Estado actual:
        // [Tonita, Alondra, Kike, Zepeda]

        // add(index, elemento) inserta un elemento en una posición específica.
        // En este caso, "Adair" entra en la posición 2.
        //
        // Los elementos que estaban desde esa posición se recorren a la derecha.
        // Por eso esta operación puede costar O(n), porque tiene que mover elementos.
        students.add(2, "Adair");

        // Estado actual:
        // [Tonita, Alondra, Adair, Kike, Zepeda]

        System.out.println(students);
        // Imprime toda la lista.

        System.out.println(students.get(0));
        // get(index) obtiene el elemento en una posición específica.
        // La posición 0 contiene "Tonita".

        System.out.println(students.remove(2));
        // remove(index) elimina el elemento en esa posición.
        // En este caso elimina "Adair".
        //
        // Además, remove devuelve el elemento eliminado.
        // Por eso se imprime "Adair".

        System.out.println(students);
        // Estado después de eliminar:
        // [Tonita, Alondra, Kike, Zepeda]

        System.out.println(students.set(0, "Mi Novia"));
        // set(index, nuevoValor) reemplaza el valor en una posición.
        //
        // En este caso cambia "Tonita" por "Mi Novia".
        // set también devuelve el valor anterior.
        // Por eso se imprime "Tonita".

        System.out.println(students);
        // Estado final:
        // [Mi Novia, Alondra, Kike, Zepeda]
    }
}