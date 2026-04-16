//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // --- 1. ENTEROS (Números sin decimales) ---

        // byte: 8 bits. Rango: -128 a 127.
        byte edad = 23;

        // short: 16 bits. Rango: -32,768 a 32,767.
        short usuariosConectados = 1500;

        // int: 32 bits. El estándar. Rango: aprox. -2 mil millones a 2 mil millones.
        int xAxis = 10, yAxis = 20;

        // long: 64 bits. Para números astronómicos.
        // Obligatorio usar la 'L' al final porque Java asume 'int' por defecto.
        long distanciaEstelar = 9460730472580L;


        // --- 2. PUNTO FLOTANTE (Números con decimales) ---

        // float: 32 bits. Precisión simple.
        // Obligatorio usar la 'F' al final.
        float precio = 19.99F;

        // double: 64 bits. Precisión doble. El estándar para decimales.
        // Se puede usar la 'D' al final, pero no es obligatoria.
        double pi = 3.141592653589793;


        // --- 3. CARÁCTER ---

        // char: 16 bits. Almacena UN solo carácter Unicode.
        // Siempre con comillas simples ('').
        char inicial = 'G';


        // --- 4. LÓGICO ---

        // boolean: Representa un bit de información (aunque su tamaño no está definido).
        // Solo acepta true o false.
        boolean esDesarrollador = true;


        // --- IMPRESIÓN DE TODOS LOS TIPOS ---
        System.out.println("--- Enteros ---");
        System.out.println("Byte: " + edad);
        System.out.println("Short: " + usuariosConectados);
        System.out.println("Int: " + xAxis);
        System.out.println("Long: " + distanciaEstelar);

        System.out.println("\n--- Decimales ---");
        System.out.println("Float: " + precio);
        System.out.println("Double: " + pi);

        System.out.println("\n--- Otros ---");
        System.out.println("Char: " + inicial);
        System.out.println("Boolean: " + esDesarrollador);
    }
}