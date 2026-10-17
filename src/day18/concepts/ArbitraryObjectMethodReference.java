package day18.concepts;

import java.util.function.Function;

public class ArbitraryObjectMethodReference {
    public static void main(String[] args) {
        Function<String, String> convertToUpperCase =
                String::toUpperCase;

        System.out.println(convertToUpperCase.apply("java"));
        System.out.println(convertToUpperCase.apply("spring"));
    }
}