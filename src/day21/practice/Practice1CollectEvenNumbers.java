package day21.practice;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Practice1CollectEvenNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(10, 15, 20, 25, 30, 35);

        List<Integer> evenNumbers =numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even numbers: " +evenNumbers);
    }
}
