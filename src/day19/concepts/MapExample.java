package day19.concepts;

import java.util.List;

public class MapExample {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);


        numbers.stream()
                .map(number -> number * 2)
                .forEach(System.out::println);

    }
}
