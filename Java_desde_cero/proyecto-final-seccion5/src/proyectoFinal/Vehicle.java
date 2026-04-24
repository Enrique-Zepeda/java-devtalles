package proyectoFinal;

abstract class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, int year, String model) {
        this.brand = brand;
        this.year = year;
        this.model = model;
    }

    abstract void start();

    public void stop(){
        System.out.println("El vehículo está detenido");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
