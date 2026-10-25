package day22.practice;

import java.util.Optional;

public class Practice5FindValidName {

    public static void main(String[] args) {

        String name = "Robin";

        String result = Optional.ofNullable(name)
                .filter(value -> value.length() > 3)
                .map(value -> value.toUpperCase())
                .orElse("Invalid name");

        System.out.println(result);
    }
}
