package day22.concepts;

import java.util.Optional;

public class OptionalMapAndFilter {

    public static void main(String[] args) {

        Optional<String> name = Optional.of("Robin");

        Optional<String> result = name
                .filter(value -> value.length() > 3)
                .map(value -> value.toUpperCase());

        System.out.println(result);

        Optional<String> shortName = Optional.of("Ram");

        Optional<String> secondResult = shortName
                .filter(value -> value.length() > 3)
                .map(value -> value.toUpperCase());

        System.out.println(secondResult);

        Optional<String> startName = Optional.of("Java");

        Optional<String> thirdResult = startName
                .filter(value -> value.startsWith("J"))
                .map(value -> value.toUpperCase());

        System.out.println(thirdResult);
    }
}
