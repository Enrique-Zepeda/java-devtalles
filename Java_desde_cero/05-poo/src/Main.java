//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//      Vehicle vehicle = new Vehicle("Ford",2026,"Mustang");
//
//      vehicle.setYear(2010);
//        System.out.println("vehicle = " + vehicle.toString());

        Vehicle myCar = new Car("Ford",2026,"Mustang",2);
        Vehicle motorcycle = new Motorcycle("Honda",2012,"CBR",false);

        ((Car)myCar).start();
        ((Motorcycle)motorcycle).start();

        printVehicle(myCar);
        printVehicle(motorcycle);

        ((Car)myCar).setDoors(5);

        printVehicle(myCar);
    }


    public static void  printVehicle(Vehicle vehicle){
        System.out.println(vehicle.toString());
    }
}