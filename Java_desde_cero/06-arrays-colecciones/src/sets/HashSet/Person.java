package sets.HashSet;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Person {

    // Atributos de la clase Person.
    // name representa el nombre de la persona.
    // dni representa un identificador único, como una cédula, ID, CURP, etc.
    private String name;
    private String dni;

    // Constructor.
    // Sirve para crear objetos Person con dni y name.
    public Person(String dni, String name) {
        this.dni = dni;
        this.name = name;
    }

    // Sobrescribimos equals para decirle a Java
    // cuándo dos objetos Person deben considerarse iguales.
    @Override
    public boolean equals(Object o) {

        // Buena práctica:
        // Si ambos apuntan al mismo objeto en memoria,
        // entonces son iguales automáticamente.
        if (this == o) return true;

        // Si el objeto recibido es null, no puede ser igual.
        // Si no pertenece exactamente a la clase Person, tampoco es igual.
        if (o == null || getClass() != o.getClass()) return false;

        // Convertimos el objeto recibido de Object a Person.
        Person person = (Person) o;

        // Aquí decides qué hace única a una persona.
        // En este caso, dos personas son iguales si tienen el mismo dni.
        // No importa si tienen diferente name.
        return Objects.equals(dni, person.dni);
    }

    // hashCode trabaja junto con equals.
    // HashSet usa hashCode para saber en qué "grupo" guardar/buscar el objeto.
    // Luego usa equals para confirmar si realmente es duplicado.
    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
        // Como equals compara por dni,
        // hashCode también debe generarse usando dni.
    }

    // toString sirve para imprimir el objeto de forma legible.
    // Si no sobrescribes toString, Java imprimiría algo como:
    // sets.Person@7a81197d
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

    public static void main(String[] args) {

        // Set es una interfaz.
        // HashSet es la implementación real.
        // Un Set no permite elementos duplicados.
        Set<Person> persons = new HashSet<>();

        // Creamos objetos Person.
        Person person1 = new Person("123", "Tonita");
        Person person2 = new Person("117", "Kike");

        // HashSet permite guardar null, pero solo un null.
        Person person3 = null;

        // Esta persona tiene el mismo dni que person2.
        // Según tu equals, person4 sería considerada igual a person2.
        Person person4 = new Person("117", "Kike");

        // ======================
        // CREATE
        // ======================

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        // Si haces esto:
        // persons.add(person4);
        //
        // No se agregaría como nuevo elemento,
        // porque person4 tiene el mismo dni que person2.
        // Para el HashSet, serían duplicados.

        // ======================
        // READ
        // ======================

        System.out.println(persons);
        // Imprime todo el Set.
        // Usa toString() para imprimir person1 y person2 de forma bonita.
        //
        // OJO:
        // HashSet no garantiza el orden.
        // Puede imprimir los elementos en diferente orden.

        for (Person person : persons) {
            // Como agregaste un null al Set,
            // debes validar que person no sea null antes de usar person.name.
            if (person != null) {
                System.out.println(person.name);
            }
        }

        // ======================
        // DELETE
        // ======================

        persons.remove(person2);
        // Elimina person2 del Set.
        //
        // remove también usa hashCode y equals para encontrar el objeto.
        // No elimina el objeto de memoria completamente.
        // Solo lo quita del Set.

        System.out.println(persons);

        // ======================
        // UPDATE / ADD AGAIN
        // ======================

        persons.add(person2);
        // Se puede volver a agregar person2 porque el objeto todavía existe.
        // remove solo lo quitó del Set, no destruyó la variable person2.

        System.out.println(persons);
    }
}