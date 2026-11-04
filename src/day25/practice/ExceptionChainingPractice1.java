package day25.practice;

public class ExceptionChainingPractice1 {

    public static void main(String[] args) {

        try {
            int result = 10 / 0;

        } catch (ArithmeticException e) {

            throw new RuntimeException("Calculation failed", e);
        } catch (RuntimeException ex) {

            System.out.println("Message: " + ex.getMessage());
            System.out.println("Cause: " + ex.getCause());
        }
    }
}
