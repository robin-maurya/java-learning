package day20.practice;

import java.util.Comparator;
import java.util.List;

public class Practice5MinMax {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(45, 12, 78, 23, 56, 9);

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
