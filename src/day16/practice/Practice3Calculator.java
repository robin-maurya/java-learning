package day16.practice;

@FunctionalInterface
interface Calculator {
    int calculate (int a,  int b);
}

public class Practice3Calculator {

    public static void main(String[] args) {

        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;

        System.out.println("Addition : " +addition.calculate(20, 10) );
        System.out.println("Subtraction : " +subtraction.calculate(20, 10));
        System.out.println("Multiplication : " +multiplication.calculate(20, 10));
    }
}
