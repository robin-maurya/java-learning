package day14.concepts;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(40);
        numbers.add(60);
        numbers.add(70);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10);

        System.out.println(numbers);

        System.out.println("First: " +numbers.first());
        System.out.println("Last: " +numbers.last());

        numbers.remove(30);

        System.out.println(numbers);
    }
}
