package day14.practice;

import java.util.LinkedList;

public class LinkedListPractice {

    public static void main(String[] args) {

        LinkedList<String> students = new LinkedList<>();

        students.add("Rob");
        students.add("Rohan");
        students.add("Rahul");
        students.add("Ram");

        System.out.println(students);

        students.addFirst("Ravi");

        students.addLast("Sita");

        System.out.println(students);

        System.out.println(students.getFirst());
        System.out.println(students.getLast());

        students.removeFirst();
        students.removeLast();

        System.out.println(students);

    }
}
