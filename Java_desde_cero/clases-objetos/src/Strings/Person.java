package Strings;

public class Person {
    // Atributos privados: Aplicando el principio de Encapsulamiento
    private String name;
    private String lastName;

    // Constructor vacío: Necesario para frameworks (como Spring) o flexibilidad
    public Person() {
    }

    // Constructor con parámetros: Inicializa el objeto con valores específicos
    public Person(String name, String lastName) {
        this.name = name;     // 'this' diferencia el atributo de la clase del parámetro
        this.lastName = lastName;
    }

    // Getters y Setters: Métodos públicos para acceder y modificar atributos privados
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Sobreescritura del método toString de la clase Object
    // Permite representar el objeto como una cadena de texto legible
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
