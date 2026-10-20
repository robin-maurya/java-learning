package day21.concepts;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        Map<Boolean, List<Integer>> result = numbers.stream()
                .collect(Collectors.partitioningBy(
                        number -> number % 2 == 0
                ));

        System.out.println("Even: " + result.get(true));
        System.out.println("Odd: " + result.get(false));
    }
}