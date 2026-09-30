package day14.practice;


import java.util.ArrayList;
import java.util.Collections;

class Emp implements Comparable<Emp> {

    int salary;
    String name;

    Emp(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    @Override
    public int compareTo(Emp other) {
        return Integer.compare(this.salary, other.salary);
    }

    @Override
    public String toString() {
        return name + " - " + salary;
    }
}

public class ComparablePractice2 {

    public static void main(String[] args) {

        ArrayList<Emp> employees = new ArrayList<>();

        employees.add(new Emp(35000, "Robin"));
        employees.add(new Emp(40000, "Aman"));
        employees.add(new Emp(75000, "Jeet"));
        employees.add(new Emp(90000, "Raj"));
        employees.add(new Emp(150000, "Marshal"));

        Collections.sort(employees);

        System.out.println(employees);
    }
}