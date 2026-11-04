package day25.practice;

public class ExceptionChainingPractice2 {

    public static void main(String[] args) {

        try {
            try {
                int result = 10 / 0;

            } catch (ArithmeticException e) {

                throw new UserServiceException(
                        "Unable to fetch user details", e);
            }

        } catch (UserServiceException e) {

            System.out.println("Message: " + e.getMessage());

            System.out.println("Cause: " + e.getCause());

            System.out.println("Original Message: " +
                    e.getCause().getMessage());
        }
    }
}
