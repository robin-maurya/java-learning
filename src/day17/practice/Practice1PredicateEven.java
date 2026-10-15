package day17.practice;

import java.util.function.Predicate;

public class Practice1PredicateEven {

    public static void main(String[] args) {

        Predicate<Integer> isEven = number -> number % 2 == 0;

        System.out.println("12 is Even : " + isEven.test( 12));
        System.out.println("9 is Even : " +isEven.test(9));
    }
}
