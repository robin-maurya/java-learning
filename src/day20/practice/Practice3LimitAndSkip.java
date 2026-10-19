package day20.practice;

import java.util.List;

public class Practice3LimitAndSkip {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(10, 20, 30, 40, 50, 60, 70);

        System.out.println("Using limit(4): ");
        numbers.stream()
                .limit(4)
                .forEach(System.out::println);

        System.out.println("Using skip(3): ");

        numbers.stream()
                .skip(3)
                .forEach(System.out::println);
    }
}
