package metodoStatic;

public class MainMath {
    public static void main(String[] args) {
    // MÉTODOS ESTÁTICOS: Se acceden directamente con la Clase.
        // No necesitamos crear un objeto (new) porque el método le pertenece a la clase, no a una instancia.
        int result = MathExample.add(2, 2);
        System.out.println("result = " + result);

        // Si los métodos rest y add NO fueran estáticos, tendríamos que hacer esto:
        // MathExample mathExample = new MathExample(); // Crear espacio en el Heap
        // int resta = mathExample.rest(5, 3);          // Usar la instancia

        // Como son estáticos, los llamamos así. Es más eficiente para clases de "Utilidad".
        int resta = MathExample.rest(20, 7);
        System.out.println("resta = " + resta);
    }
}
