package PracticeQuestions.Day2.Conditions.IfElse;

import java.util.Scanner;

public class EvenOddWithScanner {
    public  static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("This Number is Even Number");
        }
        else {
            System.out.println("This Number is Odd Number");
        }
    }
}
