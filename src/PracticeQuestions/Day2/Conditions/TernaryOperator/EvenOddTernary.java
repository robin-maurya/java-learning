package PracticeQuestions.Day2.Conditions.TernaryOperator;

import java.util.Scanner;

public class EvenOddTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
       int number = sc.nextInt();

        String result = (number % 2 == 0) ? "Even" : "Odd";

            System.out.println(result);
        sc.close();
    }
}
