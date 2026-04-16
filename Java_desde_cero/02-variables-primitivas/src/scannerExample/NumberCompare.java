package scannerExample;

import java.util.Scanner;

public class NumberCompare {
    public static void main(String[] args) {
        // Crear la instancia del scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        // Tip: usa .print() o .printf() para que el usuario escriba en la misma línea
        int firstNumber = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int secondNumber = scanner.nextInt();

        // Operaciones
        int suma = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;

        System.out.println("Suma: " + suma);
        System.out.println("Diferencia: " + difference); // Corregido el texto

        // Lógica de comparación
        if (firstNumber > secondNumber) {
            System.out.println("El primer número es mayor");
        } else if (secondNumber > firstNumber) {
            System.out.println("El segundo número es mayor");
        } else {
            System.out.println("Ambos números son iguales"); // Caso extra por buena práctica
        }

        System.out.println("Fin de la app");

        // Buena práctica: cerrar el recurso
        scanner.close();
    }
}
