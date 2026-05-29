package ejercicio;

public class ErrorSimulation {
    public static void main(String[] args) {
        try {
            simulateError();
        } catch (Exception e) {
            System.out.println("Error Detectado: " + e.getMessage());
            System.out.println("Detalles del error: ");
            e.printStackTrace();

        }
    }

    public static void simulateError() {
        causeError();
    }

    public static void causeError() {
        throw new RuntimeException("Se ha producido un error crítico");
    }


}
