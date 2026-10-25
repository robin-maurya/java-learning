package day21.practice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Practice4GroupNamesByFirstLetter {

    public static void main(String[] args) {

        List<String> names = List.of("Amit", "Ankit", "Rahul", "Arjun", "Rohit");

        Map<Character, List<String>> groupNames = names.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0)));

        System.out.println(groupNames);
    }
}
