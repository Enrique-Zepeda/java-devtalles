package finalProject;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion; // Solo declaramos lo necesario fuera del bucle

        do {
            System.out.print("Ingresa tu edad: ");
            int edad = sc.nextInt(); // Declarada al momento de usarla

            System.out.print("Ingresa la primera calificación: ");
            int cal1 = sc.nextInt();

            System.out.print("Ingresa la segunda calificación: ");
            int cal2 = sc.nextInt();

            System.out.print("Ingresa la tercera calificación: ");
            int cal3 = sc.nextInt();

            // Usamos 3.0 para forzar que el resultado sea decimal (double)
            double promedio = (cal1 + cal2 + cal3) / 3.0;

            if (promedio >= 6) {
                // printf permite limitar los decimales a 2 para que se vea pro
                System.out.printf("Aprobaste con un promedio de: %.2f%n", promedio);
            } else {
                System.out.printf("Reprobaste con un promedio de: %.2f%n", promedio);
            }

            System.out.println("\n¿Quieres repetir el programa? Sí(1) No(0)");
            opcion = sc.nextInt();

        } while (opcion != 0);

        System.out.println("¡Gracias por usar el sistema!");
        sc.close();
    }
}
