package day14.concepts;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> students = new LinkedList<>();

        students.add("Robin");
        students.add("Marshal");
        students.add("Rahul");

        System.out.println(students);

        students.addFirst("Ravi");
        students.addLast("Sita");

        System.out.println(students);

        students.removeFirst();
        students.removeLast();

        System.out.println(students);
    }
}

