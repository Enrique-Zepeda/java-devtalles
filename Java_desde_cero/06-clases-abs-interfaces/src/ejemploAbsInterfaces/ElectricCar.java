package ejemploAbsInterfaces;

public class ElectricCar extends Vehicle implements Electric, SelfDriving{
    private  int bateryLevel;

    public ElectricCar(String brand, VehicleStatus vehicleStatus, Color color, int year, String model, int bateryLevel) {
        super(brand, vehicleStatus, color, year, model);
        this.bateryLevel = bateryLevel;
    }

    public ElectricCar(String brand, int year, String model, int bateryLevel) {
        super(brand, year, model);
        this.bateryLevel = bateryLevel;
    }

    @Override
    public void drive() {
        System.out.println("El auto electrico esta en marcha");
    }

    @Override
    public void chargeBattery() {
        bateryLevel = MAX_BATTERY_CAPACITY;
        System.out.println("LA bateria esta cargada al 100%");
    }

    @Override
    public void activateAutoPilot() {
        System.out.println("Modo piloto automatico activado");
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "bateryLevel=" + bateryLevel +
                '}' + super.toString();
    }
}
