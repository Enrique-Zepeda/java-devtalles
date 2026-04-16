package bucles;

public class Bucle {
    public static void main(String[] args) {
        // Ejemplo: Hacer 4 series de un ejercicio
        System.out.println("--- Inicio de entrenamiento ---");

        for (int serie = 1; serie <= 4; serie++) {
            System.out.println("Realizando serie número: " + serie);
        }
        // 1. Inicialización: int serie = 1
        // 2. Condición: mientras serie sea <= 4
        // 3. Actualización: serie++ después de cada vuelta


        // Ejemplo: Descansar mientras tu frecuencia cardíaca sea alta
        int frecuenciaCardiaca = 120;
        while (frecuenciaCardiaca > 90) {
            System.out.println("Frecuencia en " + frecuenciaCardiaca + ". Sigue descansando...");

            // Simulamos que baja el ritmo
            frecuenciaCardiaca -= 10;
        }
        System.out.println("Ritmo normal. ¡A darle de nuevo!");


        // Ejemplo: Intentar levantar un peso máximo (PR)
        boolean levantadoExitosamente = false;

        do {
            System.out.println("Intentando levantar el peso...");
            // Intentamos una vez y luego verificamos
        } while (levantadoExitosamente);

        System.out.println("Fin del intento.");
    }
}
