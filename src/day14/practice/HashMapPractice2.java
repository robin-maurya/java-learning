package day14.practice;

import java.util.HashMap;

public class HashMapPractice2 {

    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();

        students.put("Robin", 85);
        students.put("Aman", 90);
        students.put("Raj", 75);
        students.put("Jeet", 80);

        System.out.println(students);

        students.put("Raj", 95);

        System.out.println(students);

        students.remove("Aman");

        System.out.println(students);

        System.out.println("Jeet is present: " +students.containsKey("Jeet"));

        for (String name : students.keySet()) {
            System.out.println(name + " : " +students.get(name) );
        }

    }
}
