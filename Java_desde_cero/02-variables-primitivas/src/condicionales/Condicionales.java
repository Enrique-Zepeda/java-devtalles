package condicionales;

public class Condicionales {
    public static void main(String[] args) {
        // --- ESTRUCTURA IF / ELSE IF / ELSE ---
        int age = 17;

        // Regla: La condición DEBE ser un boolean (no se permiten enteros como en C++)
        if (age >= 18) {
            System.out.println("Es mayor de edad");
        } else if (age <= 0) {
            System.out.println("Edad no válida");
        } else {
            System.out.println("Es menor de edad");
        }

        // --- ESTRUCTURA SWITCH ---
        int day = 3;

        // El switch en Java acepta: byte, short, char, int, Enums y Strings (desde Java 7)
        switch (day) {
            case 1:
                System.out.println("Lunes");
                break; // El break es vital para no ejecutar los siguientes casos
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default: // Caso por defecto si nada coincide
                System.out.println("Día no válido");
                break;
        }

        // OPERADOR TERNARIO
        // ideal para asignaciones rápidas
        String status = (age >= 18) ? "Adulto" : "Menor";
        System.out.println("Status: " + status);

        double average = 7.5;

        // Buenas prácticas: nombres descriptivos y booleanos directos
        boolean isAdult = age >= 18; // En México la mayoría es a los 18, ajustado.
        boolean hasPassingGrade = average >= 7.0;

        // 1. Uso de operadores lógicos (AND)
        if (isAdult && hasPassingGrade) {
            System.out.println("El estudiante cumple con todos los requisitos.");
        }

        // 2. Corrigiendo la lógica de negación (NOT)
        // Si quieres imprimir que ES adulto, usa la variable directamente:
        if (isAdult) {
            System.out.println("Es un adulto.");
        }

        // 3. Si quisieras verificar que NO es adulto:
        if (!isAdult) {
            System.out.println("Es menor de edad.");
        }

    }
}
