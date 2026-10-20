package day21.practice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Practice3NamesToLengthMap {

    public static void main(String[] args) {

        List<String> names = List.of("Amit", "Rahul", "Rohit", "Neha");


        Map<String, Integer> nameLenghts = names.stream()
                .collect(Collectors.toMap(name -> name, name -> name.length()));

        System.out.println(nameLenghts);


    }
}
