package day14.concepts;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Robin");
        students.add("Aman");
        students.add("Rahul");

        Iterator<String> interator = students.iterator();

        while (interator.hasNext()) {
            System.out.println(interator.next());
        }
    }
}
