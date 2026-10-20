package day21.concepts;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsToMap {
    public static void main(String[] args) {
        List<String> names = List.of("Robin", "Amit", "Rahul");

        Map<String, Integer> nameLengths = names.stream()
                .collect(Collectors.toMap(
                        name -> name,
                        name -> name.length()
                ));

        System.out.println(nameLengths);
    }
}
