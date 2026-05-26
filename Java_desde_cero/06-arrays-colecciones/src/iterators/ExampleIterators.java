package iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleIterators {
    public static void main(String[] args) {

        // Creamos una lista de nombres.
        // Usamos List como interfaz y ArrayList como implementación.
        List<String> names = new ArrayList<>();

        // Agregamos elementos a la lista.
        names.add("Ana");
        names.add("Tonita");
        names.add("Kike");

        // Lista inicial:
        // [Ana, Tonita, Kike]


        // =====================================================
        // FOR-EACH: NO ES BUENA IDEA ELIMINAR ASÍ
        // =====================================================

        /*
        for (String name : names) {
            if (name.startsWith("A") || name.startsWith("K")) {
                names.remove(name);
            }
        }
        */

        // Este código está comentado porque puede causar error.
        //
        // El problema es que el for-each está recorriendo la lista,
        // pero dentro del recorrido intentas modificar la misma lista
        // usando names.remove(name).
        //
        // Eso puede provocar:
        //
        // ConcurrentModificationException
        //
        // En Java, no debes modificar directamente una colección
        // mientras la estás recorriendo con for-each.


        // =====================================================
        // ITERATOR
        // =====================================================

        // Creamos un Iterator para recorrer la lista.
        //
        // Un Iterator es un objeto que permite recorrer una colección
        // elemento por elemento de forma controlada.
        Iterator<String> iterator = names.iterator();

        // hasNext() pregunta:
        // ¿Todavía hay otro elemento por recorrer?
        while (iterator.hasNext()) {

            // next() obtiene el siguiente elemento de la lista.
            String name = iterator.next();

            // Revisamos si el nombre empieza con "A".
            if (name.startsWith("A")) {

                // remove() elimina el elemento actual de forma segura.
                //
                // Esta es la forma correcta de eliminar mientras recorres
                // usando Iterator.
                iterator.remove();
            }
        }

        // Después de eliminar los nombres que empiezan con "A",
        // la lista queda:
        // [Tonita, Kike]
        System.out.println(names);
    }
}