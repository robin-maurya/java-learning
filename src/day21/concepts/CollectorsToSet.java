package day21.concepts;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsToSet {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 10, 30, 20, 40);

        Set<Integer> uniqueNumbers = numbers.stream()
                .collect(Collectors.toSet());

        System.out.println(uniqueNumbers);
    }
}
