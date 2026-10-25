package day22.concepts;

import java.util.Optional;

public class OptionalMapExample {

    public static void main(String[] args) {

        Optional<String> name = Optional.of("robin");


        Optional<String> upperName = name.map(
                value -> value.toUpperCase()
        );

        System.out.println(upperName);

        //Optional.empty()

        System.out.println("Optional.empty() try");

        Optional<String> names = Optional.empty();

        Optional<String> upperNames = names.map(
                value -> value.toUpperCase()
        );

        System.out.println(upperNames);
    }
}
