package day04.practice;

public class SumOfEvenNumbers {
    public static void main(String[] args) {

    // Approach 1
        int number = 10;
        int sum = 0;

        for (int i = 2; i<=number; i+= 2) {
            System.out.println(i);   // Print even number
            sum = sum + i;
        }

        System.out.println("Sum = " +sum);

// Approach 2
        int numbers = 20;
        int add = 0;

        for (int i = 1; i <= numbers; i++) {
            if (i % 2 == 0) {
                add += i;
            }
            System.out.println(i);   // Print even number
        }
        System.out.println("Sum = " +add);
    }
}
