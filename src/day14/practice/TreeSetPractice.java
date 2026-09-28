package day14.practice;

import java.util.TreeSet;

public class TreeSetPractice {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(70);
        numbers.add(60);
        numbers.add(40);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);

        System.out.println(numbers);

        System.out.println("Total Unique Number count: " +numbers.size());

        System.out.println("Smallest Number: " +numbers.first());

        System.out.println("Largest Number: " +numbers.last());

        numbers.remove(20);

        System.out.println(numbers);
    }
}
