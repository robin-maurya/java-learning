package day19.practice;

import java.util.List;

public class Practice2SquareNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(2, 3, 4, 5);

        numbers.stream()
                .map(number -> number * number)
                .forEach(System.out::println);
    }
}
