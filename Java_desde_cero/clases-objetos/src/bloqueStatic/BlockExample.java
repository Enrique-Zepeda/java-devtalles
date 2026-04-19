package bloqueStatic;

public class BlockExample {
    // El orden en el archivo no importa: el bloque static SIEMPRE le gana al main.
    static {
        System.out.println("1. Bloque estatico ejecutando (Carga de clase)");
    }

    public static void main(String[] args) {
        System.out.println("2. Hola mundo (Ejecución del método main)");
    }
}
