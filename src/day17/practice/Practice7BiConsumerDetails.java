package day17.practice;

import java.util.function.BiConsumer;

public class Practice7BiConsumerDetails {

    public static void main(String[] args) {

        BiConsumer<String, Integer> printDetails = (name, age) -> System.out.println(name+ " is " +age+ " year old");

        printDetails.accept("Robin", 28);
        printDetails.accept("Amit", 25);
    }
}
