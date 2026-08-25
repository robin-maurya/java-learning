package PracticeQuestions.Day1.MiniProblems;

import java.util.Scanner;

public class CalculatorWithScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Number = ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd Number = ");
        int b = sc.nextInt();

        System.out.println("Addition of a + b = " +(a + b));
        System.out.println("Subtraction of a - b = " +(a - b));
        System.out.println("Multipication of a * b = " +(a * b));
        System.out.println("Division of a / b = " +(a / b));
        System.out.println("Modulus of a 5 b = " +(a % b));

    }
}
