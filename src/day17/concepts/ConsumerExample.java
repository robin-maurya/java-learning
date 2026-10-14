package day17.concepts;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        Consumer<String> printMessage = message -> System.out.println(message);

        printMessage.accept("Learning Java Functional Interface");
    }
}
