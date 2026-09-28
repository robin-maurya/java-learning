package day14.concepts;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Robin");
        students.put(102, "Aman");
        students.put(103, "Rahul");

        System.out.println(students);

        System.out.println("Students 101: " +students.get(101));

        students.put(102, "Raj");

        System.out.println(students);

         students.remove(103);

         System.out.println(students);

         System.out.println(students.values());

        System.out.println(students.keySet());
    }

}
