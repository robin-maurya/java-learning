package day13.concepts;
public class ErrorVsException {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }
        // Errors are generally serious JVM/system problems, e.g. OutOfMemoryError.
    }
}
