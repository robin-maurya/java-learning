package day20.concepts;

import java.util.List;
import java.util.Comparator;

public class MinMaxExample {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(50, 10, 40, 20, 30);

        int min = numbers.stream()
                .min(Comparator.naturalOrder())
                .orElseThrow();

        int max = numbers.stream()
                .max(Comparator.naturalOrder())
                .orElseThrow();

        System.out.println("Minimum: " +min);
        System.out.println("Maximum: " +max);
    }
}
