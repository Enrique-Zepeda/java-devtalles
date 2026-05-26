package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Person {

    // Atributos de la clase Person.
    // name = nombre de la persona.
    // dni = identificador único de la persona.
    private String name;
    private String dni;

    // Constructor.
    // Sirve para crear objetos Person con dni y name.
    public Person(String dni, String name) {
        this.dni = dni;
        this.name = name;
    }

    // equals define cuándo dos objetos Person son considerados iguales.
    //
    // En este caso, dos personas son iguales si tienen el mismo dni.
    @Override
    public boolean equals(Object o) {

        // Si this y o apuntan al mismo objeto en memoria,
        // son iguales automáticamente.
        if (this == o) return true;

        // Si o es null, no puede ser igual.
        // Si o no pertenece exactamente a la clase Person, tampoco es igual.
        if (o == null || getClass() != o.getClass()) return false;

        // Convertimos el objeto recibido de Object a Person.
        Person person = (Person) o;

        // Comparamos por dni.
        return Objects.equals(dni, person.dni);
    }

    // hashCode trabaja junto con equals.
    //
    // Si dos objetos son iguales según equals,
    // deben tener el mismo hashCode.
    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    // toString sirve para imprimir el objeto de forma legible.
    //
    // Sin este método, Java imprimiría algo como:
    // map.Person@1a2b3c
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

    public static void main(String[] args) {

        // ============================
        // ¿QUÉ ES UN HASHMAP?
        // ============================
        //
        // Un HashMap es una estructura de datos que guarda información
        // usando pares clave-valor.
        //
        // Ejemplo:
        // clave -> valor
        // "123" -> Person("123", "Tonita")
        //
        // Es parecido a un objeto en JavaScript:
        //
        // const persons = {
        //   "123": { dni: "123", name: "Tonita" }
        // }
        //
        // En Java:
        // Map<Clave, Valor>
        //
        // En este caso:
        // Map<String, Person>
        //
        // String = tipo de la clave.
        // Person = tipo del valor.

        Map<String, Person> persons = new HashMap<>();

        // Buena práctica:
        // Se declara como Map porque Map es la interfaz.
        // Se crea como HashMap porque HashMap es la implementación real.
        //
        // NO uses:
        // Map<String, Person> persons = new HashMap();
        //
        // Mejor usa:
        // Map<String, Person> persons = new HashMap<>();


        // ============================
        // CREAR OBJETOS PERSON
        // ============================

        Person person1 = new Person("123", "Tonita");
        Person person2 = new Person("117", "Kike");
        Person person3 = new Person("1171", "Kike1");
        Person person4 = new Person("1172", "Kike2");


        // ============================
        // CREATE / INSERTAR EN HASHMAP
        // ============================

        // put(clave, valor) agrega un elemento al HashMap.
        //
        // Aquí usamos el dni como clave.
        // Eso significa que podremos buscar una persona usando su dni.
        persons.put(person1.dni, person1);
        persons.put(person2.dni, person2);
        persons.put(person3.dni, person3);
        persons.put(person4.dni, person4);

        // El mapa queda más o menos así:
        //
        // "123"  -> person1
        // "117"  -> person2
        // "1171" -> person3
        // "1172" -> person4

        System.out.println(persons);
        // Imprime todo el HashMap.
        //
        // OJO:
        // HashMap no garantiza orden.
        // Puede imprimir los elementos en un orden diferente
        // al orden en que los agregaste.


        // ============================
        // DELETE / ELIMINAR
        // ============================

        persons.remove(person2.dni);
        // remove(clave) elimina el elemento que tenga esa clave.
        //
        // person2.dni es "117".
        // Entonces elimina la entrada:
        //
        // "117" -> person2

        System.out.println(persons);


        // ============================
        // UPDATE / ACTUALIZAR
        // ============================

        persons.put(person2.dni, new Person("999", "Pepe"));
        // Aquí estás usando la clave "117",
        // pero el objeto nuevo tiene dni "999".
        //
        // El mapa queda así:
        //
        // clave "117" -> Person{dni="999", name="Pepe"}
        //
        // Esto funciona, pero puede ser confuso porque la clave
        // ya no coincide con el dni interno del objeto.

        System.out.println(persons);
    }
}