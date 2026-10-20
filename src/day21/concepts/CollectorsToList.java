package day21.concepts;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsToList {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(10, 15, 20, 25, 30);

        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNumbers);
    }
}
