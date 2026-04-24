package proyectoFinal;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Vehicle> vehicles;
    private int capacity;

    public Garage( int capacity) {
        this.capacity = capacity;
        this.vehicles = new ArrayList<>();
    }

    public boolean addVehicle(Vehicle v) {
        if (vehicles.size() < capacity) {
            return this.vehicles.add(v);
        }
        return false;
    }

    public boolean removeVehicle(Vehicle v) {
        return this.vehicles.remove(v);
    }

    // 7. Método listVehicles: imprime uno por uno
    public void listVehicles() {
        System.out.println("--- Lista de Vehículos en el Garaje ---");
        for (Vehicle v : vehicles) {
            System.out.println(v); // Llama al toString() automáticamente
        }
    }

    // 8. Método startAllVehicles
    public void startAllVehicles() {
        for (Vehicle v : vehicles) {
            v.start(); // Todos los Vehicle tienen start()
        }
    }

    // 9. Método chargeAllElectricCars (El del Casting)
    public void chargeAllElectricCars() {
        for (Vehicle v : vehicles) {
            if (v instanceof ElectricCar) {
                // Si es un auto eléctrico, hacemos el casting para cargar batería
                ((ElectricCar) v).chargeBattery();
            }
        }
    }
}
