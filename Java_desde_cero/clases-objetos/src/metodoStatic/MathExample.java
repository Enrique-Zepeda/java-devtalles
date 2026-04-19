package metodoStatic;
/**
 * Esta es una clase de utilidad (Utility Class).
 * Al usar 'static', indicamos que estos métodos pueden ser usados sin crear objetos.
 */
public class MathExample {
    // Los métodos estáticos viven en el "Metaspace" (o Method Area) de la memoria.
    // Solo existe UNA copia de este método para toda la aplicación.
    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static int rest(int number1, int number2) {
        return number1 - number2;
    }
}
