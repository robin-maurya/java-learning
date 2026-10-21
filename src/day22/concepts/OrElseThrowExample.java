package day22.concepts;

import java.util.Optional;

public class OrElseThrowExample {

    public static void main(String[] args) {

        Optional<String> name = Optional.of("Robin");

        String result = name.orElseThrow();

        System.out.println(result);

        //Custom exception message

//        Optional<String> name = Optional.empty();
//
//        String result = name.orElseThrow(
//                () -> new IllegalArgumentException("Name not found")
//        );
    }
}
