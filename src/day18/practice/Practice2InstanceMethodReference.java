package day18.practice;

import java.util.function.Consumer;

public class Practice2InstanceMethodReference {

    public static void main(String[] args) {

        Consumer<String> printer = System.out::println;

        printer.accept("Learning Java Method References");

        printer.accept("Method references make code shorter");
    }
}
