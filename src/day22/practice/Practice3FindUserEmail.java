package day22.practice;

import java.util.Optional;

public class Practice3FindUserEmail {

    public static void main(String[] args) {
        String email = "ROBIN@EXAMPLE.COM";

//        Optional<String> result = Optional.ofNullable(email)
//                .map(value -> value.toLowerCase());

        String result = Optional.ofNullable(email)
                .map(value -> value.toLowerCase())
                .orElse("Email not available");

        System.out.println(result);
    }
}
