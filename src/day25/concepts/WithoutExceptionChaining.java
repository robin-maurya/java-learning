package day25.concepts;

public class WithoutExceptionChaining {

    public static void main(String[] args) {

        try {
            int result = 10 / 0;

        } catch (ArithmeticException e) {

            throw new RuntimeException("Something went wrong");
        }
    }
}
