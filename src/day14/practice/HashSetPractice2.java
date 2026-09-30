package day14.practice;

import java.util.HashSet;

public class HashSetPractice2 {

    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(50);

        System.out.println(numbers);

        System.out.println(numbers.contains(30));

        numbers.remove(20);

        System.out.println("HashSet ek Collection hai jo sirf unique elements store karta hai.");


    }
}
