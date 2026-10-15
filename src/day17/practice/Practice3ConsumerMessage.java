package day17.practice;

import java.util.function.Consumer;

public class Practice3ConsumerMessage {

    public static void main(String[] args) {

        Consumer<String> printMsg = msg -> System.out.println(msg);

        printMsg.accept("Welcome to Java");
        printMsg.accept("I am learning Functional Interfaces");
    }
}
