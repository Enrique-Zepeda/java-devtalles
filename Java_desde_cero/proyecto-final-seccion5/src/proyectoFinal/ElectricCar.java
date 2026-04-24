package proyectoFinal;

public class ElectricCar extends Car implements Electric{
    private int batteryLevel;

    public ElectricCar(String brand, int year, String model, CarType carType, int batteryLevel) {
        super(brand, year, model, carType);
        this.batteryLevel = batteryLevel;
    }

    @Override
    void start() {
        System.out.println("El auto eléctrico está encendido...");
    }

    @Override
    public void chargeBattery() {
        System.out.println("La batería está cargada al 100%");
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryLevel=" + batteryLevel +
                '}';
    }
}
