package day14.practice;

import java.util.ArrayList;

public class ArrayListPractice2 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        System.out.println(numbers);

        numbers.set(2, 70);
        numbers.remove(3);

        System.out.println(numbers);
        System.out.println("Total number Counts: " +numbers.size());

    }

}
