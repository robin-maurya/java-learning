package day17.concepts;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {

        Function<String, Integer> getLength = text -> text.length();

        int result = getLength.apply("Java");

        System.out.println(result);
    }
}
