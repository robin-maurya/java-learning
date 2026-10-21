package day22.concepts;

import java.util.Optional;

public class IfPresentOrElseExample {

    public static void main(String[] args) {

        Optional<String> name = Optional.of("Robin");

        name.ifPresentOrElse(
                value -> System.out.println("Welcome, " + value),
                () -> System.out.println("Name not available")
        );

        Optional<String> emptyName = Optional.empty();

        emptyName.ifPresentOrElse(
                value -> System.out.println("Welcome, " + value),
                () -> System.out.println("Name not available")
        );
    }

}
