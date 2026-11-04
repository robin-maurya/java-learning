package day25.concepts;

public class getCauseException {

    public static void main(String[] args) {
        try {
            try {
                int result = 10 / 0;

            } catch (ArithmeticException e) {
                throw new RuntimeException("Calculation failed", e);
            }

        } catch (RuntimeException e) {

            System.out.println("Message: " + e.getMessage());

            System.out.println("Original cause: " + e.getCause());
        }
    }
}
