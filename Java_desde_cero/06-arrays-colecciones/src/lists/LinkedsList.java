package lists;

import java.util.LinkedList;

public class LinkedsList {
    public static void main(String[] args) {

        // LinkedList es una lista enlazada.
        // A diferencia de ArrayList, es muy buena para agregar o eliminar
        // elementos al inicio o al final.
        LinkedList<String> cities = new LinkedList<>();

        // add() agrega elementos al final de la lista.
        cities.add("Manzanillo");
        cities.add("Guadalajara");
        cities.add("Barcelona");

        // Estado actual:
        // [Manzanillo, Guadalajara, Barcelona]

        // addFirst() agrega un elemento al inicio.
        cities.addFirst("New York");

        // Estado:
        // [New York, Manzanillo, Guadalajara, Barcelona]

        // addLast() agrega un elemento al final.
        cities.addLast("Roma");

        // Estado:
        // [New York, Manzanillo, Guadalajara, Barcelona, Roma]

        System.out.println(cities.get(2));
        // get(index) obtiene el elemento en una posición.
        // Posición 0: New York
        // Posición 1: Manzanillo
        // Posición 2: Guadalajara
        // Imprime: Guadalajara
        //
        // OJO: en LinkedList, get(index) no es tan eficiente como en ArrayList,
        // porque tiene que recorrer nodos hasta llegar a esa posición.

        System.out.println(cities);
        // Imprime toda la lista.

        System.out.println(cities.set(1, "Madrid"));
        // set(index, nuevoValor) reemplaza el elemento en esa posición.
        //
        // En la posición 1 estaba "Manzanillo".
        // Ahora se cambia por "Madrid".
        //
        // set() devuelve el valor anterior.
        // Por eso imprime: Manzanillo

        System.out.println(cities.remove("Barcelona"));
        // remove(elemento) elimina ese elemento si existe.
        //
        // Si lo encuentra y lo elimina, devuelve true.
        // Si no lo encuentra, devuelve false.
        //
        // En este caso imprime: true

        // Esto sirve mucho para pilas y colas.
        // Pila: último en entrar, primero en salir.
        // Cola: primero en entrar, primero en salir.

        cities.removeFirst();
        // Elimina el primer elemento.
        // En este caso elimina "New York".

        cities.removeLast();
        // Elimina el último elemento.
        // En este caso elimina "Roma".

        String searchCity = "Manzanillo";

        if (cities.contains(searchCity)) {
            System.out.println("Esta en la lista");
        } else {
            System.out.println("No esta en la lista");
        }
        // contains() revisa si un elemento existe en la lista.
        //
        // OJO: después de hacer set(1, "Madrid"),
        // "Manzanillo" ya no existe en la lista.
        // Por eso imprime: "No esta en la lista".

        for (String city : cities) {
            System.out.println("-" + city);
        }
        // Recorre la lista elemento por elemento.
    }
}