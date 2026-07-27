package day08.practice;

public class Student2 {
    String name;
    int age;

    Student2(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}
