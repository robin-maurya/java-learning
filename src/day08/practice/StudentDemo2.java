package day08.practice;

public class StudentDemo2 {

    public static void main(String[] args) {

        Student2 s1 = new Student2("Robin", 25);
        Student2 s2 = new Student2("Amit", 23);

        System.out.println("Student 1");
        s1.display();

        System.out.println();

        System.out.println("Student 2");
        s2.display();
    }
}
