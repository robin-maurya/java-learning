package day18.concepts;

import java.util.function.Consumer;

public class InstanceMethodReference {
    public static void main(String[] args) {
        Consumer<String> printer = System.out::println;

        printer.accept("Java");
        printer.accept("Spring Boot");
    }
}