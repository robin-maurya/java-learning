package day14.practice;

import java.util.HashMap;

public class HashMapPractice {

    public static void main (String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(1, "Robin");
        students.put(2, "Raj");
        students.put(3, "Rahul");
        students.put(4, "Ram");
        students.put(5, "Ravi");

        System.out.println(students);

        System.out.println(students.get(1));

        students.put(2, "Rob");

        System.out.println(students);

        System.out.println("Roll Number 3 Present: " +students.containsKey(3));

        students.remove(5);

        System.out.println("Total Student Count: " +students.size());

        for (Integer rollNo : students.keySet()) {
            System.out.println(rollNo+ " : " +students.get(rollNo));
        }

    }
}
