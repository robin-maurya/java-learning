package day17.concepts;

import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {

        BiConsumer<String, Integer> printDetails = (name, age) -> System.out.println(name+ " is " +age + " Years old");

        printDetails.accept("Robin", 28);
    }
}
