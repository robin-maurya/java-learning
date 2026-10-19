package day20.practice;

import java.lang.foreign.SymbolLookup;
import java.util.List;

public class Practice4ReduceSum {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(5, 10, 15, 20, 25);

        int sum = numbers.stream()
                .reduce(0, (a, b) ->a+b);

        System.out.println("Sum: " +sum);
    }
}
