package bloqueStatic;

public class ConfigurationDB {
    // 'static final' define una CONSTANTE de clase.
    // Al no inicializarse aquí, DEBEN inicializarse obligatoriamente en un bloque static.
    static final String URL;
    static final String USER;

    // Bloque Estático: Se usa para lógica de inicialización compleja
    // (Ej: leer archivos de configuración, conectar a una DB, etc.)
    static {
        URL = "https://www.com";
        USER = "admin";
        System.out.println("Configuracion Cargada en el Static Block");
    }

    public static void main(String[] args) {
        System.out.println("Ejecutando Main...");
        System.out.println("URL: " + URL);
        System.out.println("Usuario: " + USER);
    }
}
