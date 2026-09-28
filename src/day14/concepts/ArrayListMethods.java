package day14.concepts;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Robin");
        students.add("Aman");
        students.add("Rahul");

        System.out.println(students.get(0));

        students.set(1, "Rohit");

        students.remove("Rahul");

        System.out.println(students);

        System.out.println("Total students: " +students.size());
    }
}
