package day22.concepts;

import java.util.Optional;

public class OptionalBasics {

    public static void main(String[] args) {

        Optional<String> name = Optional.of("Robin");

        System.out.println(name);
        System.out.println(name.isPresent());
        System.out.println(name.get());

        Optional<String> emptyName = Optional.empty();

        System.out.println(emptyName.isPresent());
    }
}
