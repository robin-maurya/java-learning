package day19.concepts;

import java.util.List;

public class CountExample {

    public static void main(String[] args) {
        List<String> names = List.of("Robin", "Amit", "Rahul", "Rohit");

        long count = names.stream()
                .filter(name -> name.startsWith("R"))
                .count();

        System.out.println("Names strting with R: " +count);
    }
}
