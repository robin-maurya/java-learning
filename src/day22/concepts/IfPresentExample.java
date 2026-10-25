package day22.concepts;

import java.util.Optional;

public class IfPresentExample {

    public static void main(String[] args) {

        Optional<String> name = Optional.of("Robin");

        name.ifPresent(value ->
                System.out.println("Welcome, " + value)
        );

        Optional<String> emptyName = Optional.empty();

        emptyName.ifPresent(value ->
                System.out.println("Welcome, " + value)
        );
    }
}
