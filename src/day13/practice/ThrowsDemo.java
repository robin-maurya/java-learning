package day13.practice;

public class ThrowsDemo {

    static void checkAge(int age) throws IllegalArgumentException {

        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above");
        }

        System.out.println("Eligible");
    }

    public static void main(String[] args) {

        try {
            checkAge(17);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
