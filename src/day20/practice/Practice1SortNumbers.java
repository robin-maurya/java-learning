package day20.practice;

import java.util.List;

public class Practice1SortNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(45, 12, 78, 23, 12, 56);

        numbers.stream()
                .sorted()
                .forEach(System.out::println);
    }

}
