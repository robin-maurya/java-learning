package PracticeQuestions.Day2.Conditions.IfElse;

import java.util.Scanner;

public class VotingEligibilityWithScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Age : ");
        int age = sc.nextInt();

        if (age >= 18 ) {
            System.out.println("Eligible For Vote");
        }
        else {
            System.out.println("Not Eligible For Vote");
        }
    }
}
