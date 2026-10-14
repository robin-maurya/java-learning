package day17.concepts;

import java.util.function.BiPredicate;

public class BiPredicateExample {

    public static void main(String[] args) {

        BiPredicate<Integer, Integer> isGreater = (a, b ) -> a> b;

        System.out.println(isGreater.test(20, 10));
        System.out.println(isGreater.test(5, 15));
    }
}
