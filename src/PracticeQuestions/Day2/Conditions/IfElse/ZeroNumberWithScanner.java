package PracticeQuestions.Day2.Conditions.IfElse;

import java.util.Scanner;

public class ZeroNumberWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int number = sc.nextInt();

        if (number == 0) {
            System.out.println("This Number is Zero :" +number);
        }
        else {
            System.out.println("This Number is Not Zero : " +number);
        }
    }
}
