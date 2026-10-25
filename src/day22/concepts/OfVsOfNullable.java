package day22.concepts;

import java.util.Optional;

public class OfVsOfNullable {

    public static void main(String[] args) {

        String firstName = "Robin";
        Optional<String> first = Optional.of(firstName);

        System.out.println("First: " + first);

        String secondName = null;
        Optional<String> second = Optional.ofNullable(secondName);

        System.out.println("Second: " + second);
    }
}
