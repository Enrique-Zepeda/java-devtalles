public class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, int year, String model) {
        this.brand = brand;
        this.year = year;
        this.model = model;
    }



    public void stop(){
        System.out.println("EL vehiculo esta parado");
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
        int currentYear = java.time.Year.now().getValue();
        if (year < 1886 || year > currentYear + 2 ) {
            throw new IllegalArgumentException("Año invalido!!!");
        }
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
