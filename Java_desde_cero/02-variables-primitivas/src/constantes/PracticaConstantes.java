package constantes;

public class PracticaConstantes {
    public static void main(String[] args) {
        // --- VARIABLES (Pueden cambiar su valor) ---
        int workDays = 10;
        workDays = 20; // Reasignación válida
        workDays = 30;

        // --- CONSTANTES (Se usa la palabra 'final') ---

        // Convención de nombres: En Java, las constantes suelen ir en MAYÚSCULAS
        // y con guiones bajos (SNAKE_CASE) para diferenciarlas de las variables.

        final double ANNUAL_INTEREST_RATE = 0.05;

        // El compilador lanzará un error: "cannot assign a value to final variable"
        // ANNUAL_INTEREST_RATE = 0.10;

        // --- EJEMPLO DE USO PRÁCTICO ---

        final double TAX_RATE = 0.10; // 10% de impuestos
        int grossSalary = 3000;

        // Al usar constantes, tu código es más legible y seguro contra errores accidentales
        double netSalary = grossSalary * (1 - TAX_RATE);

        System.out.println("Salario Bruto: " + grossSalary);
        System.out.println("Tasa de Impuestos: " + (TAX_RATE * 100) + "%");
        System.out.println("Salario Neto: " + netSalary);

        // --- OTRO EJEMPLO ---
        final int MAX_LOGIN_ATTEMPTS = 3;
        final String API_URL = "https://api.ejemplo.com/v1";
    }
}
