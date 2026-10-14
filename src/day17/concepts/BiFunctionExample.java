package day17.concepts;

import java.util.function.BiFunction;

public class BiFunctionExample {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> addition = (a, b) ->a + b;

        int result = addition.apply(20, 30);

        System.out.println(result);
    }
}
