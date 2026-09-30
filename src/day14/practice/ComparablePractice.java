package day14.practice;

import java.util.ArrayList;
import java.util.Collections;

class EmployeeData implements Comparable<EmployeeData> {

    int salary;
    String name;

    EmployeeData(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    @Override
    public int compareTo(EmployeeData other) {
        return Integer.compare(this.salary, other.salary);
    }

    @Override
    public String toString() {
        return name + " - " + salary;
    }
}


public class ComparablePractice {

    public static void main(String[] args) {

        ArrayList<EmployeeData> employees = new ArrayList<>();

        employees.add(new EmployeeData(35000, "Robin"));
        employees.add(new EmployeeData(40000, "Aman"));
        employees.add(new EmployeeData(150000, "Marshal"));
        employees.add(new EmployeeData(100000, "Raj"));

        Collections.sort(employees);

        System.out.println(employees);
    }
}
