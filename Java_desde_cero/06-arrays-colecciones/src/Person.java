import java.util.Objects;
// Importamos Objects para poder usar Objects.equals() y Objects.hash().
// Objects.equals() compara de forma segura aunque algún valor sea null.

public class Person {

    // Atributo privado de la clase.
    // Cada objeto Person tendrá su propio name.
    private String name;

    // Constructor de la clase.
    // Se ejecuta cuando haces: new Person("Juan");
    public Person(String name) {
        this.name = name;
        // this.name se refiere al atributo de la clase.
        // name se refiere al parámetro que llega al constructor.
    }

    // Sobrescribimos el método equals que viene de la clase Object.
    // Esto sirve para definir cuándo dos objetos Person son "iguales".
    @Override
    public boolean equals(Object o) {

        // Caso 1:
        // Si this y o apuntan al mismo objeto en memoria,
        // entonces son iguales automáticamente.
        if (this == o) return true;

        // Caso 2:
        // Si o es null, no puede ser igual.
        // Si o no es exactamente de la misma clase que this,
        // tampoco puede ser igual.
        if (o == null || getClass() != o.getClass()) return false;

        // Como ya verificamos que o sí es de tipo Person,
        // hacemos casting de Object a Person.
        Person person = (Person) o;

        // Aquí comparamos el contenido real.
        // En este caso decimos:
        // dos personas son iguales si tienen el mismo name.
        return Objects.equals(name, person.name);
    }

    // Buena práctica:
    // Si sobrescribes equals(), también debes sobrescribir hashCode().
    // Esto es importante cuando usas objetos en HashSet, HashMap, etc.
    @Override
    public int hashCode() {
        return Objects.hash(name);
        // Genera un hash basado en el atributo name.
        // Si dos objetos son iguales según equals(),
        // deben tener el mismo hashCode().
    }

    public static void main(String[] args) {

        // Creamos un objeto Person con name = "Juan".
        Person person1 = new Person("Juan");

        // Creamos otro objeto Person con name = "María".
        Person person2 = new Person("María");

        // Aquí llamamos al método equals que nosotros sobrescribimos.
        // Compara person2 contra person1.
        //
        // person2.name = "María"
        // person1.name = "Juan"
        //
        // Como los nombres son diferentes, imprime false.
        System.out.println(person2.equals(person1));
    }
}