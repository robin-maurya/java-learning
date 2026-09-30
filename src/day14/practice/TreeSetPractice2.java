package day14.practice;

import java.util.TreeSet;

public class TreeSetPractice2 {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(30);

      System.out.println(numbers);

      System.out.println("First Number: " +numbers.first());

      System.out.println("Last Number: " +numbers.last());

      numbers.remove(40);

      System.out.println(numbers);

      System.out.println("HashSet unique elements store karta hai aur ordering guarantee nahi karta.");

      System.out.println("TreeSet unique elements ko sorted order mein maintain karta hai. TreeSet sorting maintain karne ke liye extra work karta hai, isliye typical operations HashSet ke comparison mein slower ho sakte hain.");

    }
}
