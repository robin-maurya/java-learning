package day19.concepts;

import java.util.List;

public class FilterExample {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(10, 15, 20, 25, 30);

        numbers.stream()
                .filter(number -> number >= 20)
                .forEach(System.out::println);
    }
}
