package day25.concepts;

public class InitCauseExample {

    public static void main(String[] args) {

        try {
            int result = 10 / 0;

        } catch (ArithmeticException e) {

            RuntimeException exception =
                    new RuntimeException("Calculation failed");

            exception.initCause(e);

            throw exception;
        }
    }
}
