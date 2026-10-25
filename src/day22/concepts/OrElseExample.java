package day22.concepts;

import java.util.Optional;

public class OrElseExample {

    public static void main(String[] args) {

        Optional<String> name = Optional.empty();

        String result = name.orElse("Guest");

        System.out.println(result);
    }
}
