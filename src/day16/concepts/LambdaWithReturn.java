package day16.concepts;

@FunctionalInterface
interface Square {
    int calculate(int number);
}

public class LambdaWithReturn {
    public static void main(String[] args) {
        Square square = number -> number * number;

        System.out.println(square.calculate(5));
    }
}
