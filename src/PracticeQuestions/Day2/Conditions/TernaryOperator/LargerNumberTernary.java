package PracticeQuestions.Day2.Conditions.TernaryOperator;

import java.util.Scanner;

public class LargerNumberTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number a : ");
        int a = sc.nextInt();

        System.out.print("Enter Number b : ");
        int b = sc.nextInt();

        int largest = (a > b) ? a : b ;

        System.out.println("Largest = " +largest);

        sc.close();
    }
}
