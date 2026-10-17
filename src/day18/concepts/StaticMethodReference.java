package day18.concepts;

import java.util.function.Function;

public class StaticMethodReference {
    public static void main(String[] args) {
        Function<Integer, Integer> absoluteValue = Math::abs;

        System.out.println(absoluteValue.apply(-10));
        System.out.println(absoluteValue.apply(25));
    }
}