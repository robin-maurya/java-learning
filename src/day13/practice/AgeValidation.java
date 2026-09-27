package day13.practice;

public class AgeValidation {

    static void validateAge(int age) {

        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above");
        }
        System.out.println("Eligible");
    }

    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (IllegalArgumentException e ) {
            System.out.println(e.getMessage());
        }
    }
}
