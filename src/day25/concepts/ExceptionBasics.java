package day25.concepts;

public class ExceptionBasics {

    public static void main(String[] args) {

        int  a = 10;
        int b = 0;

        try{
            int result = a / b;
            System.out.println("Result: " +result);
        } catch (ArithmeticException e ) {
            System.out.println("Exception handled: " + e.getMessage());
        }

        System.out.println("Application continues...");

    }
}
