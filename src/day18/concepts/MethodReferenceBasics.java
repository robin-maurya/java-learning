package day18.concepts;

import java.util.function.Consumer;

public class MethodReferenceBasics {
    public static void main(String[] args) {
        // Lambda expression
        Consumer<String> lambda =
                message -> System.out.println(message);

        // Method reference
        Consumer<String> reference = System.out::println;

        lambda.accept("Hello from Lambda");
        reference.accept("Hello from Method Reference");
    }
}