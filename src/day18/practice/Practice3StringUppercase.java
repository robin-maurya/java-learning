package day18.practice;

import java.util.function.Function;

public class Practice3StringUppercase {

    public static void main(String[] args) {

        Function<String, String> convertToUpperCase = String::toUpperCase;

        System.out.println(convertToUpperCase.apply("java"));
        System.out.println(convertToUpperCase.apply("spring boot"));
    }
}
