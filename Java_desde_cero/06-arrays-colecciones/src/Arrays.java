import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {

        // ============================
        // ARRAY DE TIPO Integer
        // ============================

        Integer[] numbers = {1, 2, 3};
        // Un array tiene tamaño fijo.
        // Puedes modificar valores existentes, pero no agregar más posiciones.
        // Como es Integer, es un tipo wrapper/clase, no primitivo.

        numbers[0] = 100;
        // Cambiamos el valor de la posición 0.
        // Antes era 1, ahora es 100.

        System.out.println(numbers[1]);
        // Imprime el valor en la posición 1.
        // Recuerda: los índices empiezan en 0.
        // numbers[1] es 2.


        // ============================
        // ARRAY PRIMITIVO CON TAMAÑO FIJO
        // ============================

        int[] fixedArray = new int[100];
        // Crea un array de tipo int con 100 espacios.
        // Como int es primitivo, todos los espacios se inicializan con 0.

        System.out.println("Longitud: " + fixedArray.length);
        // .length devuelve el tamaño total del array.


        // ============================
        // ARRAYLIST
        // ============================

        ArrayList<Integer> numbers2 = new ArrayList<>();
        // ArrayList es dinámico: puede crecer o reducirse.
        // No acepta tipos primitivos directamente, por eso usamos Integer y no int.
        // Java convierte automáticamente int a Integer con autoboxing.

        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(3);
        // .add() agrega elementos al final del ArrayList.

        System.out.println(numbers2);
        // ArrayList se imprime de forma más amigable: [1, 2, 3]


        // ============================
        // ARRAY int CON VALORES POR DEFECTO
        // ============================

        int[] numbersPrimitive = new int[5];
        // Crea un array de 5 elementos.
        // Como es int, los valores por defecto son 0.
        // Resultado inicial: [0, 0, 0, 0, 0]

        numbersPrimitive[0] = 10;
        numbersPrimitive[1] = 20;
        // Agregamos valores manualmente en las primeras posiciones.
        // Resultado: [10, 20, 0, 0, 0]

        // numbersPrimitive[5] = 100;
        // Esto daría error porque el array tiene tamaño 5.
        // Los índices válidos son: 0, 1, 2, 3, 4.
        // El índice 5 está fuera del array.


        // ============================
        // CREAR UN NUEVO ARRAY MÁS GRANDE
        // ============================

        int[] newNumbers = new int[numbersPrimitive.length + 1];
        // Como un array no puede crecer, creamos uno nuevo con una posición extra.
        // Si numbersPrimitive mide 5, newNumbers mide 6.

        System.arraycopy(
                numbersPrimitive, // array original
                0,                // desde qué posición copiamos del original
                newNumbers,       // array destino
                0,                // desde qué posición pegamos en el destino
                numbersPrimitive.length // cuántos elementos copiamos
        );

        newNumbers[5] = 500;
        // Como newNumbers tiene tamaño 6, el índice 5 sí existe.
        // Resultado: [10, 20, 0, 0, 0, 500]

        System.out.println("Tipo int");

        for (int number : newNumbers) {
            System.out.println(number);
        }
        // for-each recorre todos los elementos del array.


        // ============================
        // ARRAY Integer CON VALORES POR DEFECTO
        // ============================

        Integer[] numbersWrapper = new Integer[5];
        // Crea un array de 5 elementos tipo Integer.
        // Como Integer es una clase, los valores por defecto son null.
        // Resultado inicial: [null, null, null, null, null]

        numbersWrapper[0] = 30;
        numbersWrapper[1] = 40;
        // Resultado: [30, 40, null, null, null]

        System.out.println("Tipo Integer");

        for (Integer number : numbersWrapper) {
            System.out.println(number);
        }
        // Aquí puede imprimir valores null porque Integer permite null.


        // ============================
        // ELIMINAR UN ELEMENTO MANUALMENTE
        // ============================

        Integer[] nums = {1, 2, 3, 4, 5, 6, 0, 9};
        // Array original.

        int deletePosition = 2;
        // Queremos eliminar el elemento en la posición 2.
        // En este caso nums[2] es 3.

        for (int i = deletePosition; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        // Este for mueve todos los elementos una posición hacia la izquierda.
        // El elemento en deletePosition queda sobrescrito.
        //
        // Antes:
        // [1, 2, 3, 4, 5, 6, 0, 9]
        //
        // Después del recorrido:
        // [1, 2, 4, 5, 6, 0, 9, 9]

        nums[nums.length - 1] = 0;
        // Como el último valor quedó duplicado, lo reemplazamos con 0.
        // Resultado final:
        // [1, 2, 4, 5, 6, 0, 9, 0]

        System.out.println("===========");

        for (int num : nums) {
            System.out.println(num);
        }
        // Aquí Java convierte Integer a int automáticamente.
        // Esto se llama unboxing.
    }
}