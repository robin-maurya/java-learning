package day08.practice;

public class Student {
    String name;
    int age;

    Student() {
        System.out.println("Student Object Created");
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}
