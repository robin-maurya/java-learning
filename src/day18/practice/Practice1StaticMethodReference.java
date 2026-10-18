package day18.practice;

import java.util.function.Function;

public class Practice1StaticMethodReference {

    public static void main(String[] args) {

        Function<Integer, Integer> absValue = Math::abs;

        System.out.println("Absolute value of -15: " +(absValue.apply(-15)));
        System.out.println("Absolute value of 25: " +(absValue.apply(25)));
    }
}
