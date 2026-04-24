public class Engine {
    public void start(){
        System.out.println("Motor encendido");
    }

    public void start(boolean silentMode){
        if (silentMode) {
            System.out.println("Encendido en modo silencio");
        }else {
            System.out.println("Encendido el vehiculo");
        }
    }

}
