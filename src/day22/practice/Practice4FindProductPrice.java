package day22.practice;

import java.util.Optional;

public class Practice4FindProductPrice {

    public static void main(String[] args) {

        Integer price = 1500;

        String number = Optional.ofNullable(price)
                .map(value -> value > 1000 ? "Expensive" : "Affordable")
                .orElse("Price not available");

        System.out.println(number);
    }
}
