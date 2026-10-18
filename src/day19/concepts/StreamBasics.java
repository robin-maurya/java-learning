package day19.concepts;

import java.util.List;

public class StreamBasics {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(10, 20, 30, 40, 50, 60);

        numbers.stream().forEach(System.out::println);
    }
}
