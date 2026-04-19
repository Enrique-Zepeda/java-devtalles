package HouseExample;

public class HouseMain {
    public static void main(String[] args) {
    House myHouse = new House(2,4,3);
    myHouse.setDoors(2);;
    myHouse.setWindows(4);
    myHouse.setSize(10);

    House myHouse2 = new House();
    myHouse2.setDoors(4);
    myHouse2.setWindows(6);
    myHouse2.setSize(20);

    System.out.println("La cantidad de puertas de la casa es: " + myHouse2.getDoors());
    myHouse2.openDoor();
    myHouse2.calculateArea();
    }
}
