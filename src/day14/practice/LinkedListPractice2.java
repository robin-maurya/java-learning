package day14.practice;

import java.util.LinkedList;

public class LinkedListPractice2 {

    public static void main(String[] args) {

        LinkedList<String>  city = new LinkedList<>();

        city.add("Delhi");
        city.add("Pune");
        city.add("Uttarakhand");
        city.add("Gurgaon");
        city.add("Hyd");

        System.out.println(city);

        city.addFirst("UP");
        city.addLast("MP");

        System.out.println(city);

        System.out.println(city.getFirst());
        System.out.println(city.getLast());

        city.removeFirst();
        city.removeLast();

        System.out.println(city);
    }
}
