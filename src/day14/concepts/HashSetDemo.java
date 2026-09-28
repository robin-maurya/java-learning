package day14.concepts;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> students = new HashSet<>();

        students.add("Robin");
        students.add("Aman");
        students.add("Rahul");
        students.add("Robin");

        System.out.println(students);

        System.out.println("Total Students: " +students.size());

        students.remove("Aman");

        System.out.println(students);
    }
}
