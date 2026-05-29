package personalizada.checked;

public class Person {

    // Atributos de la clase Person.
    private Integer age;
    private String name;

    // Constructor.
    // Sirve para crear objetos Person con edad y nombre.
    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    // Método estático tipo factory.
    //
    // En lugar de crear la persona directamente con:
    // new Person(13, "Kike")
    //
    // usamos:
    // Person.createPerson("Kike", 13)
    //
    // Esto permite validar datos antes de crear el objeto.
    public static Person createPerson(String name, Integer age) throws AgeValidationException {

        // Validamos si la edad es menor a 18.
        if (age < 18) {

            // throw lanza una excepción manualmente.
            //
            // En este caso lanzamos nuestra excepción personalizada.
            throw new AgeValidationException("Debes ser mayor de edad");
        }

        // Si la edad es válida, ahora sí creamos y retornamos la persona.
        return new Person(age, name);
    }

    // toString sirve para imprimir el objeto de forma legible.
    //
    // Sin este método, Java imprimiría algo como:
    // personalizada.Person@1a2b3c
    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}