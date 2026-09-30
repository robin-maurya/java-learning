package day14.concepts;

import day08.practice.Student;

import java.util.ArrayList;
import java.util.Comparator;

class  StudentData {

    int age;
    String name;

    StudentData(int age, String name) {
        this.age =age;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " - " +age;
    }
}

public class ComparableDemo {

    public static void main(String[] args) {

        ArrayList<StudentData> students = new ArrayList<>();

        students.add(new StudentData(25, "Robin"));
        students.add(new StudentData(22, "Aman"));
        students.add(new StudentData(24, "Rahul"));

        students.sort(Comparator.comparing(student -> student.name));

        System.out.println(students);
    }
}
