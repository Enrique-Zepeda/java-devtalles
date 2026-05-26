package iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {

        // Creamos una lista mutable de nombres.
        //
        // Arrays.asList(...) crea una lista basada en un array,
        // pero al envolverla con new ArrayList<>(...)
        // ahora sí podemos agregar, eliminar y actualizar elementos sin problema.
        List<String> names = new ArrayList<>(Arrays.asList("Kike", "Tonita", "AMLO"));

        System.out.println("Names = " + names);
        // Imprime:
        // Names = [Kike, Tonita, AMLO]

        // Agrega "Pepe" después de encontrar "AMLO".
        addName(names, "Pepe");

        // Lee e imprime todos los nombres.
        readName(names);

        // Cambia "AMLO" por "Ana".
        updateName(names, "Ana", "AMLO");

        // Elimina "Kike" de la lista.
        removeName(names, "Kike");

        System.out.println("Names = " + names);
        // Resultado final:
        // Names = [Tonita, Ana, Pepe]
    }

    public static void addName(List<String> names, String newName) {

        // ListIterator permite recorrer una lista y modificarla
        // de forma segura mientras la recorres.
        ListIterator<String> iterator = names.listIterator();

        while (iterator.hasNext()) {

            // next() obtiene el siguiente elemento.
            String name = iterator.next();

            // Buscamos el nombre "AMLO".
            if (name.equals("AMLO")) {

                // add() agrega el nuevo elemento en la posición actual del iterator.
                //
                // Como acabamos de leer "AMLO" con next(),
                // el cursor queda después de "AMLO".
                //
                // Por eso "Pepe" se agrega después de "AMLO".
                iterator.add(newName);

                // Cortamos el ciclo porque ya agregamos el nombre.
                break;
            }
        }
    }

    public static void updateName(List<String> names, String newName, String oldName) {

        // Creamos un ListIterator para recorrer y modificar la lista.
        ListIterator<String> iterator = names.listIterator();

        while (iterator.hasNext()) {

            // next() obtiene el siguiente nombre.
            // Si ese nombre es igual a oldName, lo reemplazamos.
            if (iterator.next().equals(oldName)) {

                // set() reemplaza el último elemento que fue leído por next().
                //
                // Ejemplo:
                // Si next() leyó "AMLO",
                // set("Ana") cambia "AMLO" por "Ana".
                iterator.set(newName);

                // Cortamos el ciclo porque ya actualizamos el nombre.
                break;
            }
        }
    }

    public static void removeName(List<String> names, String nameToDelete) {

        // Creamos un ListIterator para eliminar de forma segura.
        ListIterator<String> iterator = names.listIterator();

        while (iterator.hasNext()) {

            // next() obtiene el siguiente nombre.
            // Si coincide con el nombre que queremos eliminar,
            // lo borramos.
            if (iterator.next().equals(nameToDelete)) {

                // remove() elimina el último elemento leído por next().
                //
                // Es seguro usarlo aquí porque estamos eliminando
                // desde el propio iterator.
                iterator.remove();

                // Cortamos el ciclo porque ya eliminamos el nombre.
                break;
            }
        }
    }

    public static void readName(List<String> names) {

        // Creamos un ListIterator para recorrer la lista.
        ListIterator<String> iterator = names.listIterator();

        while (iterator.hasNext()) {

            // Imprime cada nombre.
            System.out.println(iterator.next() + " ");
        }

        // Salto de línea extra para separar visualmente.
        System.out.println();
    }
}