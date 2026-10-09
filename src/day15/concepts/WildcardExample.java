
package day15.concepts;

import java.util.Arrays;
import java.util.List;

public class WildcardExample {

    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Robin", "Rahul");
        List<Integer> numbers = Arrays.asList(10, 20, 30);

        System.out.println("Names:");
        printList(names);

        System.out.println("Numbers:");
        printList(numbers);
    }
}
