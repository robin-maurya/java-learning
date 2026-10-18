package day20.concepts;

import java.util.List;

public class LimitAndSkipExample {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(10, 20, 30, 40, 50);


        System.out.println("Using limit(3): ");
        numbers.stream()
                .limit(3)
                .forEach(System.out::println);

        System.out.println("Using skip(2): ");
        numbers.stream()
                .skip(2)
                .forEach(System.out::println);
    }
}
