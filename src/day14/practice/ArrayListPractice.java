package day14.practice;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<String>  students = new ArrayList<>();

        students.add("Robin");
        students.add("Ram");
        students.add("Ravi");
        students.add("Rakesh");
        students.add("Sita");

        System.out.println(students.get(0));

        students.set(1, "Raj");

        students.remove("Sita");


        System.out.println(students);
        System.out.println("Total Students: " +students.size());
    }
}
