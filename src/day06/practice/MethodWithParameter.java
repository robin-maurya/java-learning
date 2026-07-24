package day06.practice;

public class MethodWithParameter {
    static void greet(String name) {
        System.out.println("Hello " +name);
    }

    public static void main(String[] args) {
        greet("Robin");
        greet("Amit");
        greet("Rahul");
    }
}
