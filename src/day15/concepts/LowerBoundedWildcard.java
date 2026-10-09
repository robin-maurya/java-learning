
package day15.concepts;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcard {

    public static void addNumbers(List<? super Integer> numbers) {
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
    }

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        List<Number> numbers = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        addNumbers(integers);
        addNumbers(numbers);
        addNumbers(objects);

        System.out.println("Integer list: " + integers);
        System.out.println("Number list: " + numbers);
        System.out.println("Object list: " + objects);
    }
}
