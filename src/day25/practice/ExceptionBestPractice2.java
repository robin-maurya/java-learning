package day25.practice;

public class ExceptionBestPractice2 {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        try {
            // Index 5 access karne ki koshish (Array size sirf 3 hai)
            int value = numbers[5];
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            // 1. User-friendly message (System.out ka use karke)
            System.out.println("Oops! Aapne ek galat index access kiya hai jo array mein exist nahi karta.");

            // 2. Technical error log (System.err ka use karke)
            System.err.println("Exception Log: " + e.toString());
        }
    }
}
