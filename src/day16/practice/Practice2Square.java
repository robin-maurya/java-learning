package day16.practice;

@FunctionalInterface
interface Square {
    int square (int number);
}

public class Practice2Square {

    public static void main(String[] args) {

        Square square = (number) -> number * number;

        System.out.println("Square : " +square.square(10));
    }
}
