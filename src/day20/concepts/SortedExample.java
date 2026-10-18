package day20.concepts;

import java.util.List;

public class SortedExample {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(50, 10, 40, 20, 30);

        numbers.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
