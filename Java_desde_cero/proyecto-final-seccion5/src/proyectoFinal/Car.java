package proyectoFinal;

public class Car extends Vehicle {
    private CarType carType;

    public Car(String brand, int year, String model, CarType carType) {
        super(brand, year, model);
        this.carType = carType;
    }

    @Override
    void start() {
        System.out.println("El auto arrancó");
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                '}';
    }
}
