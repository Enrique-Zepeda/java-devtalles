package sets.treeset;

import java.util.Set;
import java.util.TreeSet;

public class ExampleTreeSet {
    public static void main(String[] args) {

        // Set es una interfaz.
        // TreeSet es una implementación de Set basada en un árbol.
        //
        // Características de TreeSet:
        // 1. No permite duplicados.
        // 2. Mantiene los elementos ordenados.
        // 3. add, remove y contains cuestan O(log n).
        // 4. Para Integer, el orden natural es de menor a mayor.
        Set<Integer> numbers = new TreeSet<>();

        // Agregamos números en desorden.
        numbers.add(20);
        numbers.add(50);
        numbers.add(88);
        numbers.add(10);
        numbers.add(60);
        numbers.add(30);
        numbers.add(40);
        numbers.add(1);

        // Aunque los agregamos en desorden,
        // TreeSet los imprime ordenados de menor a mayor.
        System.out.println(numbers);
        // Resultado:
        // [1, 10, 20, 30, 40, 50, 60, 88]

        // remove elimina el elemento si existe.
        numbers.remove(20);

        System.out.println(numbers);
        // Resultado:
        // [1, 10, 30, 40, 50, 60, 88]

        // Eliminamos el número 60.
        numbers.remove(60);

        // Agregamos el número 90.
        numbers.add(90);

        // TreeSet vuelve a mantener todo ordenado automáticamente.
        System.out.println(numbers);
        // Resultado:
        // [1, 10, 30, 40, 50, 88, 90]

        // contains revisa si el elemento existe en el Set.
        System.out.println(numbers.contains(1));
        // true, porque 1 sí está en el TreeSet.

        System.out.println(numbers.contains(10));
        // true, porque 10 también está en el TreeSet.
    }
}