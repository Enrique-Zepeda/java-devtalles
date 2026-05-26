package sets.LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Person {
    private String name;
    private String dni;

    public Person(String dni, String name) {
        this.dni = dni;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Buena práctica: optimiza si es el mismo objeto en memoria
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(dni, person.dni);
    }

    // Es el método que se utiliza cuando queremos agregar un elemento al HashSet
    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Set<Person> persons = new LinkedHashSet<>(); // mantiene el orden de insercion
        Person person1 = new Person("123", "Tonita");
        Person person2 = new Person("117", "Kike");
        Person person3 = null;
        Person person4 = new Person("117", "Kike"); // Duplicado de person2 por DNI
        Person person5 = new Person("3651", "Adair");

        // Create
        persons.add(person1);
        persons.add(person2);
        persons.add(person3); // Los HashSet permiten un elemento null

        // Read list
        System.out.println(persons); // Uso de toString para evitar loop

        for (Person person : persons) {
            if (person != null) {
                System.out.println(person.name);
            }
        }

        // Delete
        persons.remove(person2);
        System.out.println(persons);

        // Update
        persons.add(person2); // Se puede volver a agregar persona2 porque sigue en memoria
        System.out.println(persons);

        System.out.println(persons.contains(new Person("118","Kike"))); //false
        System.out.println(persons.contains(new Person("117","Kike"))); //true
    }
}