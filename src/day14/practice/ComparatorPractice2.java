package day14.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employees {
    int salary;
    String name;


    Employees(int salary, String name) {
        this.salary= salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " - " +salary;
    }
}


public class ComparatorPractice2 {

    public static void main(String[] args) {
        List<Employees> employees = new ArrayList<>();

        employees.add(new Employees(35000, "Robin"));
        employees.add(new Employees(40000, "Aman"));
        employees.add(new Employees(75000, "Jeet"));
        employees.add(new Employees(90000, "Raj"));
        employees.add(new Employees(150000, "Marshal"));

        employees.sort(
                Comparator.comparingInt((Employees e) -> e.salary).reversed()
        );

        System.out.println(employees);
    }

}
