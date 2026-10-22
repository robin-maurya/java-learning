package day22.practice;

import java.util.Optional;

public class Practice2FilterValidName {

    public static void main(String[] args) {

        Optional<String> name = Optional.of("Ram");

        String result = name
                .filter(value -> value.length() >3 )
                .map(value -> value.toUpperCase())
                .orElse("Invalid name");

        System.out.println(result);
    }
}
