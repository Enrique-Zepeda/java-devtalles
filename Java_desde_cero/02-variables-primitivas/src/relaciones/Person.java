package relaciones;

public class Person {
    public void calculateSum(Calculator calculator) {
        int result = calculator.add(5, 7);
        System.out.println("result = " + result);
    }
}
