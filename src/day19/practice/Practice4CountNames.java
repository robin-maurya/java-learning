package day19.practice;

import java.util.List;

public class Practice4CountNames {

    public static void main(String[] args) {

        List<String> names = List.of("Amit", "Robin", "Ankit", "Rahul", "Arjun");

        long count = names.stream()
                .filter(name -> name.startsWith("A"))
                .count();

        System.out.println(count);
    }
}
