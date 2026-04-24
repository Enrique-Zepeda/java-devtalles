public class Motorcycle extends Vehicle{
    private boolean hasSideCar;
    private Engine engine;


    public Motorcycle(String brand, int year, String model, boolean hasSideCar) {
        super(brand, year, model);
        this.hasSideCar = hasSideCar;
        this.engine = new Engine();
    }

    public void popWheelie(){
        System.out.println("LA moto esta haciendo willy");
    }


    public void start() {
        System.out.println("La moto esta encendida");
        engine.start();
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "hasSideCar=" + hasSideCar +
                '}'+super.toString();
    }
}
