package sets.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExampleLinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> numbers = new LinkedHashSet<>(); // Mantiene el orden de los elementos y no permite duplicados

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(60);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        System.out.println(numbers);

        numbers.remove(20);
        System.out.println(numbers);

        numbers.remove(60);
        numbers.add(90);
        System.out.println(numbers);

        System.out.println(numbers.contains(1));
        System.out.println(numbers.contains(10));
    }
}
