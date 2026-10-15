package day17.practice;

import java.util.function.BiFunction;

public class Practice6BiFunctionAddition {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> addition = (a, b) -> a + b;

        int result = addition.apply(20, 30);
        int result2 = addition.apply(15, 25);

        System.out.println(result);
        System.out.println(result2);
    }
}
