package day21.practice;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Practice2CollectUniqueNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(10, 20, 10, 30, 20, 40, 30);

        Set<Integer> uniqueNumbers = numbers.stream()
                .collect(Collectors.toSet());

        System.out.println(uniqueNumbers);
    }
}
