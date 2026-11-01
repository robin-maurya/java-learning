package day24.practice;

import java.util.ArrayList;

public class Practice4AutoboxingUnboxing {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int sum = 0;

        for (int number : numbers) {
            System.out.println("Numbers: " +number);
            sum += number;
        }

        System.out.println();
        System.out.println("Total Sum: " + sum);
    }
}
