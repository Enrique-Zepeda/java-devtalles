package Strings;

public class ExampleString {
    public static void main(String[] args) {
        // Literales de String: Java los guarda en el "String Pool" para ahorrar memoria
        String name = "Kike";
        String name2 = "Kike";

        // Compara si apuntan al mismo espacio de memoria (mismas referencias)
        // Como ambos son literales iguales, Java los hace apuntar al mismo objeto en el Pool
        System.out.println(name == name2); // true

        // Uso de 'new': Obliga a Java a crear un NUEVO objeto en el Heap,
        // fuera del String Pool, aunque el contenido sea idéntico.
        String name3 = new String("Kike");

        // False porque 'name3' tiene una dirección de memoria distinta a 'name'
        System.out.println(name3 == name); // false

        // Inmutabilidad: toUpperCase() crea un NUEVO String, no modifica el original
        System.out.println(name.toUpperCase()); // Imprime "KIKE"
        System.out.println(name); // Sigue imprimiendo "Kike" (el original no cambió)

        // Instanciación de objeto personalizado
        Person person = new Person("Kike","Zepeda");

        // Uso del método toString() sobreescrito para mostrar los datos del objeto
        System.out.println(person.toString());
    }
}
