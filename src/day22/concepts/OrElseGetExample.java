package day22.concepts;

import java.util.Optional;

public class OrElseGetExample {

    public static void main(String[] args) {

        Optional<String> name = Optional.empty();

        String result = name.orElseGet(() -> "Guest");

        System.out.println(result);
    }
}
