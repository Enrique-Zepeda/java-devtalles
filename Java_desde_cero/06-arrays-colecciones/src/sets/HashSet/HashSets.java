package sets.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSets {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(); // no respeta el orden de insercion y no permite duplicados, no usa indices

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(60);

        System.out.println(numbers);

        numbers.remove(20);
        System.out.println(numbers);

        numbers.remove(60);
        numbers.add(90);
        System.out.println(numbers);

    }
}
