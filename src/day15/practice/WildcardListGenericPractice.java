package day15.practice;

import java.util.List;

public class WildcardListGenericPractice {
    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<String> names = List.of("Robin", "Aman", "Raj");
        List<Integer> numbers = List.of(10, 20, 30);

        printList(names);
        printList(numbers);
    }
}
