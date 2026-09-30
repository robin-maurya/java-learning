package day14.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee {
    int salary;
    String name;

    Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " - " +salary;
    }
}

public class ComparatorPractice {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(35000, "Rohan"));
        employees.add(new Employee(40000, "Aman"));
        employees.add(new Employee(150000, "Marshal"));
        employees.add(new Employee(90000, "Raj"));

        employees.sort(
                Comparator.comparingInt((Employee e) -> e.salary).reversed()
        );

        System.out.println(employees);
    }

}
