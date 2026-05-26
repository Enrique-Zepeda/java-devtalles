package sets.treeset;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Person implements Comparable<Person>{
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

    // esto sirve para poder decirle al Treeset que vamos a ordenar por el DNI
    @Override
    public int compareTo(Person o) {
        return this.dni.compareTo(o.dni);
    }

    public static void main(String[] args) {
        Set<Person> persons = new TreeSet<>(); // mantiene el orden de insercion
        // esta ordenando por dni pero puede haber un problema de orden porque el dni es un String y no un numero
        Person person1 = new Person("123", "Tonita");
        Person person2 = new Person("117", "Kike");
//        Person person3 = null; no acepta nulos
        Person person4 = new Person("117", "Kike"); // Duplicado de person2 por DNI
        Person person5 = new Person("3651", "Adair");

        // Create
        // treemap requiere que los objetos implemento la interfaz comparable
        persons.add(person1);
        persons.add(person2);


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