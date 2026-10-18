package day19.concepts;

import java.util.List;

public class FilterAndMap {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);

        numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .forEach(System.out::println);
    }
}
