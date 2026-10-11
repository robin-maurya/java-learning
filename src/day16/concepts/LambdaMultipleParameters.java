package day16.concepts;

@FunctionalInterface
interface Calculate {
    int calculate (int a, int b);
}


public class LambdaMultipleParameters {
    static void main(String[] args) {

        Calculate addition = (a, b) -> a + b;
        Calculate multiplication = (a, b ) -> a*b;

        System.out.println(addition.calculate(10, 20));
        System.out.println(multiplication.calculate(10, 20));
    }

}
