package PracticeQuestions.Day2.Conditions.elseif;

import java.util.Scanner;

public class NegativeNumberWithScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int number = sc.nextInt();

        if (number < 0 ) {
            System.out.println("THis number is Negative : " +number);
        }
        else {
            System.out.println("THis number is not Negative : " +number);
        }
    }
}
