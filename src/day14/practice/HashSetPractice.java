package day14.practice;

import java.util.HashSet;

public class HashSetPractice {

    public static void main(String[] args) {

        HashSet<String> students = new HashSet<>();

        students.add("Robin");
        students.add("Aman");
        students.add("Rahul");
        students.add("Raj");
        students.add("Sita");
        students.add("Raj");

        System.out.println(students);

        System.out.println("Total unique Count: " +students.size());

        System.out.println(students.contains("Robin"));

        students.remove("Sita");

        System.out.println(students);


    }
}
