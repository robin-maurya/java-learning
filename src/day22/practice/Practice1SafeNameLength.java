package day22.practice;

import java.util.Optional;

public class Practice1SafeNameLength {

    public static void main(String[] args) {

        String name = "Robin";

        int nameLength = Optional.ofNullable(name)
                .map(value -> value.length())
                .orElse(0);

        System.out.println("Name length: " + nameLength);

    }
}
