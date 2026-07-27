package day08.practice;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        // Student 1
        s1.name = "Robin";
        s1.age = 25;

        // Student 2
        s2.name = "Amit";
        s2.age = 23;



        // Print Student 1
        System.out.println("Student 1");
//        System.out.println("Name : " + s1.name);
//        System.out.println("Age : " + s1.age);
        s1.display();

        System.out.println();

        // Print Student 2
        System.out.println("Student 2");
//        System.out.println("Name : " + s2.name);
//        System.out.println("Age : " + s2.age);
        s2.display();
    }
}
