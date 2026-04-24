import ejemploAbsInterfaces.Color;
import ejemploAbsInterfaces.ElectricCar;
import ejemploAbsInterfaces.Vehicle;
import ejemploAbsInterfaces.VehicleStatus;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle("Ford",2026,"Mustang") {
//            @Override
//            public void drive() {
//                System.out.println("EStoy conduciendo");
//            }
//        };

//        System.out.println(vehicle.toString());

        Vehicle electric = new ElectricCar(
                "Fiat",
                VehicleStatus.AVAILABLE,
                Color.RED,
                2025,
                "Duna",
                80
        );

        System.out.println(electric.toString());

    }
}