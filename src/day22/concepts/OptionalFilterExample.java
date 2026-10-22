package day22.concepts;

import java.util.Optional;

public class OptionalFilterExample {

    public static void main(String[] args) {

        Optional<String> name = Optional.of("Robin");

        Optional<String> result = name.filter(
                value -> value.length() > 3
        );

        System.out.println(result);

        Optional<String> shortName = Optional.of("Ram");

        Optional<String> filteredName = shortName.filter(
                value -> value.length() > 3
        );

        System.out.println(filteredName);

        Optional<String> startName = Optional.of("Java");

        Optional<String> filterName = startName.filter(
                value -> value.startsWith("J")
        );

        System.out.println(filterName);
    }
}
