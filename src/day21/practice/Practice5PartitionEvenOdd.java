package day21.practice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Practice5PartitionEvenOdd {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(11, 20, 31, 40, 51, 60, 71, 80);

        Map<Boolean, List<Integer>> result = numbers.stream()
                .collect(Collectors.partitioningBy(number -> number %2 ==0));

        System.out.println("Even: " +result.get(true));

        System.out.println("Odd: " +result.get(false));
    }
}
