package day20.practice;

import java.util.List;

public class Practice2DistinctNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(10, 20, 10, 30, 20, 40, 30);

        numbers.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
