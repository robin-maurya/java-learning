package day19.practice;

import java.util.List;

public class Practice1FilterEven {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(10, 15, 20, 25, 30, 35);

        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }
}
