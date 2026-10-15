package day17.practice;

import java.util.function.BiPredicate;

public class Practice5BiPredicateCompare {

    public static void main(String[] args) {

        BiPredicate<Integer, Integer> isGreater = (a, b) -> a>b;

        System.out.println("Is 20 greater than 10?" +isGreater.test(20, 10));
        System.out.println("Is 5 greater than 15?" +isGreater.test(10, 40));
    }
}
