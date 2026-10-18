package day20.concepts;

import java.util.List;

public class DistinctExample {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(10, 20, 10, 30, 20, 40);

        numbers.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
