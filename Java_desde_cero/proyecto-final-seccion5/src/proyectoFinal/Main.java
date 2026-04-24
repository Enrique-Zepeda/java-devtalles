package proyectoFinal;

public class Main {
    public static void main(String[] args) {

        Vehicle myCar = new Car( "Ford",2026,  "Mustang", CarType.SPORTS);
        Vehicle myElectricCar = new ElectricCar( "Geely",2026,  "CoolRay", CarType.SEDAN,80);

        myCar.start();
        myElectricCar.start();

        // Esto es el CASTING:
        ((ElectricCar) myElectricCar).chargeBattery();

        System.out.println(myCar.toString());
        System.out.println(myElectricCar.toString());


        Garage miGaraje = new Garage(5);
        miGaraje.addVehicle(myCar);
        miGaraje.addVehicle(myElectricCar);

        miGaraje.listVehicles();
        miGaraje.chargeAllElectricCars();

    }
}
