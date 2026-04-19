package scannerExample;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        // System.in representa la entrada estándar (teclado)
        Scanner scanner = new Scanner(System.in);

        // Reutilización de código: llamamos al mismo método para obtener dos valores distintos
        int first = getNumbers(scanner, "Ingrese el primer número: ");
        int second = getNumbers(scanner, "Ingrese el segundo número: ");

        // Delegamos la lógica a métodos especializados
        printArithmeticOperations(first, second);
        compareNumber(first, second);

        // Buena práctica: cerrar el scanner libera el flujo de datos (stream)
        scanner.close();
    }

    /**
     * Método para capturar entrada del usuario.
     * Recibe el scanner por parámetro para no crear múltiples instancias en memoria.
     */
    public static int getNumbers(Scanner scanner, String message) {
        System.out.print(message);
        // El hilo de ejecución se detiene aquí hasta que el usuario presiona Enter
        return scanner.nextInt();
    }

    public static void printArithmeticOperations(int firstNumber, int secondNumber) {
        // Variables locales (viven en el Stack)
        int suma = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;

        System.out.println("Suma: " + suma);
        System.out.println("Diferencia: " + difference);
    }

    public static void compareNumber(int firstNumber, int secondNumber) {
        // Lógica de control de flujo
        if (firstNumber > secondNumber) {
            System.out.println("El primer número es mayor");
        } else if (secondNumber > firstNumber) {
            System.out.println("El segundo número es mayor");
        } else {
            System.out.println("Ambos números son iguales");
        }
    }
}