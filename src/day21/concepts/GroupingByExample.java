package day21.concepts;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
    public static void main(String[] args) {
        List<String> names = List.of(
                "Amit", "Ankit", "Rahul", "Arjun", "Rohit"
        );

        Map<Character, List<String>> groupedNames = names.stream()
                .collect(Collectors.groupingBy(
                        name -> name.charAt(0)
                ));

        System.out.println(groupedNames);
    }
}